package com.thesis.universityapp.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.thesis.universityapp.model.Application;
import com.thesis.universityapp.model.Department;
import com.thesis.universityapp.model.University;
import com.thesis.universityapp.service.*;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import com.thesis.universityapp.model.Student;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class StudentController {

    private final StudentService studentService;
//    private final ApplicationService applicationService;
    private final UniversityService universityService;
    private final DepartmentService departmentService;
//    private final CallService callService;

    public StudentController(StudentService studentService, UniversityService universityService, DepartmentService departmentService) {
        super();
        this.studentService = studentService;
        this.departmentService = departmentService;
        this.universityService = universityService;
    }
    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/department")
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        List<Department> departments = departmentService.getAllDepartments();
        List<Department> unproxiedDepartments = departments.stream()
                .map(d -> {
                    d.setUniversity((University) Hibernate.unproxy(d.getUniversity()));
                    return d;
                })
                .collect(Collectors.toList());
        return unproxiedDepartments;
    }


    // handler method to handle list students and return mode and view
//    @CrossOrigin(origins = "http://localhost:8080")
//    @GetMapping("/students")
//    public List<Student> listStudents() {
//       return studentService.getAllStudents();
//    }

//    @PutMapping("/students")
//    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
//        System.out.println(student.toString());
//        studentService.saveStudent(student);
//        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.OK);
//    }


//    @GetMapping("/applications")
//    public List<Application> listApplications() {
//        return applicationService.getAllApplications();
//    }
//    @PutMapping("/application")
//    public ResponseEntity<Application> createApplication(@RequestBody Application application) {
//        applicationService.saveApplication(application);
//        return new ResponseEntity<>(applicationService.saveApplication(application), HttpStatus.OK);
//    }
    @PostMapping("/university")
    public ResponseEntity<University> createUniversity(@RequestBody University university) {
        universityService.saveUniversity(university);
        return new ResponseEntity<>(universityService.saveUniversity(university), HttpStatus.OK);
    }

    @GetMapping("/universities")
    public List<University> listUniversities() {
        return universityService.getAllUniversities();
    }

//    @PutMapping("/call")
//    public ResponseEntity<Call> createUniversity(@RequestBody Call call) {
//        return new ResponseEntity<>(callService.saveCall(call), HttpStatus.OK);
//    }


//    @GetMapping("/students/new")
//    public String createStudentForm(Model model) {
//        System.out.println();
//        // create student object to hold student form data
//        Student student = new Student();
//        model.addAttribute("student", student);
//        return "create_student";
//
//    }
//
//
//
//    @GetMapping("/students/edit/{id}")
//    public String editStudentForm(@PathVariable Long id, Model model) {
//        model.addAttribute("student", studentService.getStudentById(id));
//        return "edit_student";
//    }
//
//    @PostMapping("/students/{id}")
//    public String updateStudent(@PathVariable Long id,
//                                @ModelAttribute("student") Student student,
//                                Model model) {
//
//        // get student from database by id
//        Student existingStudent = studentService.getStudentById(id);
//        existingStudent.setId(id);
//        existingStudent.setFirstName(student.getFirstName());
//        existingStudent.setLastName(student.getLastName());
//        existingStudent.setEmail(student.getEmail());
//
//        // save updated student object
//        studentService.updateStudent(existingStudent);
//        return "redirect:/students";
//    }
//
//    // handler method to handle delete student request
//
//    @GetMapping("/students/{id}")
//    public String deleteStudent(@PathVariable Long id) {
//        studentService.deleteStudentById(id);
//        return "redirect:/students";
//    }
}
