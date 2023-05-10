//package com.thesis.universityapp.controller;
//
//import java.security.Principal;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
//import com.thesis.universityapp.model.*;
//import com.thesis.universityapp.service.*;
//import org.keycloak.KeycloakSecurityContext;
//import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
//import org.keycloak.representations.AccessToken;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.security.oauth2.jwt.Jwt;
//
//@RestController
//@RequestMapping("/api/")
//public class AppController {
//
//    private final StudentService studentService;
//    private final MasterService masterService;
//    private final ApplicationService applicationService;
//    private final UniversityService universityService;
//    private final DepartmentService departmentService;
//    private final StreamService streamService;
////    private final CallService callService;
//
//    public AppController(StudentService studentService, MasterService masterService, ApplicationService applicationService, UniversityService universityService, DepartmentService departmentService, StreamService streamService) {
//        super();
//        this.studentService = studentService;
//        this.masterService = masterService;
//        this.applicationService = applicationService;
//        this.departmentService = departmentService;
//        this.universityService = universityService;
//        this.streamService = streamService;
//    }
//
////    public boolean saveUserIfDoesNotExists(String firstName, String lastName, String email, String id){
////        Student new_student = new Student();
////        new_student.setEmail(email);
////        new_student.setId(id);
////        new_student.setFirstName(firstName);
////        new_student.setLastName(lastName);
////        for (Student student:studentService.getAllStudents()) {
////            if (Objects.equals(student.getId(), new_student.getId())) {
////                return false;
////            }
////        }
////        studentService.saveStudent(new_student);
////        return true;
////    }
////    @GetMapping("/user-info")
////    public ResponseEntity<String> getUserInfo() {
////        KeycloakAuthenticationToken authentication =
////                (KeycloakAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
////
////        System.out.println(authentication.getName());
////        System.out.println(authentication.getPrincipal());
////        System.out.println(authentication.getCredentials());
////        System.out.println(authentication.getAccount());
////        return ResponseEntity.ok("ok");
////    }
//@GetMapping("/user-info")
//public String userInfoController(Principal principal) {
//
//    KeycloakAuthenticationToken keycloakAuthenticationToken = (KeycloakAuthenticationToken) principal;
//    AccessToken accessToken = keycloakAuthenticationToken.getAccount().getKeycloakSecurityContext().getToken();
//    KeycloakSecurityContext session = ((KeycloakAuthenticationToken) principal).getAccount().getKeycloakSecurityContext();
//    System.out.println(accessToken.getPreferredUsername());
//    System.out.println(accessToken);
//    System.out.println(accessToken.getEmail());
//    System.out.println(accessToken.getId());
//    System.out.println(accessToken.getFamilyName());
//    System.out.println(accessToken.getGivenName());
//    System.out.println(accessToken.getIssuer());
//    AccessToken.Access realmAccess = accessToken.getRealmAccess();
//    System.out.println(realmAccess.getRoles());
//        return "ok";
//    }
//
//    @PostMapping("/student")
//    public KeycloakUser createStudent(@RequestBody KeycloakUser student) {
//        return studentService.saveStudent(student);
//    }
//    @GetMapping("/students")
//    public List<KeycloakUser> getAllStudents() {
//        return studentService.getAllStudents();
//    }
//    @GetMapping("/student/applications")
//    public List<Application> getApplicationsByStudentId(Principal principal) {
//        KeycloakAuthenticationToken keycloakAuthenticationToken = (KeycloakAuthenticationToken) principal;
//        AccessToken accessToken = keycloakAuthenticationToken.getAccount().getKeycloakSecurityContext().getToken();
////        if (this.saveUserIfDoesNotExists(accessToken.getGivenName(),accessToken.getFamilyName(),accessToken.getEmail(),accessToken.getId())) {
////            System.out.print("New user " + accessToken.getGivenName());
////        } else {
////            System.out.print("User exists");
////
////        }
////        Student student = studentService.getStudentById(accessToken.getId());
////
////        KeycloakUser keycloakUser = studentService.getStudentById(accessToken.getId());
////        return applicationService.findByKeycloakUser(keycloakUser);
//        System.out.print(keycloakAuthenticationToken.getPrincipal().toString());
//        System.out.print(keycloakAuthenticationToken.getAccount().getRoles());
////        System.out.print(keycloakAuthenticationToken.getPrincipal().toString());
////        System.out.print(keycloakAuthenticationToken.getPrincipal().toString());
////        System.out.print(keycloakAuthenticationToken.getPrincipal().toString());
////        System.out.print(keycloakAuthenticationToken.getPrincipal().toString());
////        System.out.print(keycloakAuthenticationToken.getPrincipal().toString());
////        System.out.print(keycloakAuthenticationToken.getPrincipal().toString());
//        return new ArrayList<>();
//    }
//
//    @PostMapping("/department")
//    public Department createDepartment(@RequestBody Department department) {
//        return departmentService.saveDepartment(department);
//    }
//    @GetMapping("/departments")
//    public List<Department> getAllDepartments() {
////        List<Department> departments = departmentService.getAllDepartments();
////        List<Department> unproxiedDepartments = departments.stream()
////                .map(d -> {
////                    d.setUniversity((University) Hibernate.unproxy(d.getUniversity()));
////                    return d;
////                })
////                .collect(Collectors.toList());
////        return unproxiedDepartments;
//        return  departmentService.getAllDepartments();
//    }
//    @PostMapping("/master")
//    public Master createMaster(@RequestBody Master master) {
//        return masterService.saveMaster(master);
//    }
//    @GetMapping("/masters")
//    public List<Master> getAllMasters() {
//        return masterService.getAllMasters();
//    }
//    @PostMapping("/stream")
//    public Stream createStream(@RequestBody Stream stream) {
//        return streamService.saveStream(stream);
//    }
//    @GetMapping("/streams")
//    public List<Stream> getAllStreams() {
//        return streamService.getAllStreams();
//    }
//    @PostMapping("/application")
//    public Application createApplication(@RequestBody Application application) {
//        return applicationService.saveApplication(application);
//    }
//    @GetMapping("/applications")
//    public List<Application> getAllApplications() {
//        return applicationService.getAllApplications();
//    }
//
//    // handler method to handle list students and return mode and view
////    @CrossOrigin(origins = "http://localhost:8080")
////    @GetMapping("/students")
////    public List<Student> listStudents() {
////       return studentService.getAllStudents();
////    }
//
////    @PutMapping("/students")
////    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
////        System.out.println(student.toString());
////        studentService.saveStudent(student);
////        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.OK);
////    }
//
//
////    @GetMapping("/applications")
////    public List<Application> listApplications() {
////        return applicationService.getAllApplications();
////    }
////    @PutMapping("/application")
////    public ResponseEntity<Application> createApplication(@RequestBody Application application) {
////        applicationService.saveApplication(application);
////        return new ResponseEntity<>(applicationService.saveApplication(application), HttpStatus.OK);
////    }
//    @PostMapping("/university")
//    public ResponseEntity<University> createUniversity(@RequestBody University university) {
//        universityService.saveUniversity(university);
//        return new ResponseEntity<>(universityService.saveUniversity(university), HttpStatus.OK);
//    }
//
//    @GetMapping("/universities")
//    public List<University> listUniversities() {
//        return universityService.getAllUniversities();
//    }
//
////    @PutMapping("/call")
////    public ResponseEntity<Call> createUniversity(@RequestBody Call call) {
////        return new ResponseEntity<>(callService.saveCall(call), HttpStatus.OK);
////    }
//
//
////    @GetMapping("/students/new")
////    public String createStudentForm(Model model) {
////        System.out.println();
////        // create student object to hold student form data
////        Student student = new Student();
////        model.addAttribute("student", student);
////        return "create_student";
////
////    }
////
////
////
////    @GetMapping("/students/edit/{id}")
////    public String editStudentForm(@PathVariable Long id, Model model) {
////        model.addAttribute("student", studentService.getStudentById(id));
////        return "edit_student";
////    }
////
////    @PostMapping("/students/{id}")
////    public String updateStudent(@PathVariable Long id,
////                                @ModelAttribute("student") Student student,
////                                Model model) {
////
////        // get student from database by id
////        Student existingStudent = studentService.getStudentById(id);
////        existingStudent.setId(id);
////        existingStudent.setFirstName(student.getFirstName());
////        existingStudent.setLastName(student.getLastName());
////        existingStudent.setEmail(student.getEmail());
////
////        // save updated student object
////        studentService.updateStudent(existingStudent);
////        return "redirect:/students";
////    }
////
////    // handler method to handle delete student request
////
////    @GetMapping("/students/{id}")
////    public String deleteStudent(@PathVariable Long id) {
////        studentService.deleteStudentById(id);
////        return "redirect:/students";
////    }
//}
