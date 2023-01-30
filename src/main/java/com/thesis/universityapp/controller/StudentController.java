package com.thesis.universityapp.controller;

import java.util.List;

import com.thesis.universityapp.model.Application;
import com.thesis.universityapp.service.ApplicationService;
import org.springframework.ui.Model;

import com.thesis.universityapp.model.Student;
import com.thesis.universityapp.service.StudentService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class StudentController {

    private final StudentService studentService;
    private final ApplicationService applicationService;

    public StudentController(StudentService studentService, ApplicationService applicationService) {
        super();
        this.studentService = studentService;
        this.applicationService = applicationService;
    }

    // handler method to handle list students and return mode and view
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/students")
    public List<Student> listStudents() {
       return studentService.getAllStudents();
    }
    @GetMapping("/applications")
    public List<Application> listApplications() {
        return applicationService.getAllApplications();
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {

        // create student object to hold student form data
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";

    }
    @PostMapping("/students")
    public String saveStudent(@RequestBody Student student) {
        System.out.println(student.toString());
        studentService.saveStudent(student);
        return "redirect:/students";
    }



    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student,
                                Model model) {

        // get student from database by id
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        // save updated student object
        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    // handler method to handle delete student request

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
