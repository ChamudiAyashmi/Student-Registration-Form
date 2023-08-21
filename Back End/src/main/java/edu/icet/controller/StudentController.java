package edu.icet.controller;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping
    public void saveStudent(@RequestBody Student student){

        studentService.registerStudent(student);
    }
    @GetMapping
    public List<StudentEntity> getAllStudents(){

        return studentService.getAllStudents();
    }
}
