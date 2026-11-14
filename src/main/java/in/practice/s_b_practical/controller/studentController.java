package in.practice.s_b_practical.controller;


import in.practice.s_b_practical.DTO.reqDto;
import in.practice.s_b_practical.DTO.resDto;
import in.practice.s_b_practical.entity.Student;
import in.practice.s_b_practical.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class studentController {

    @Autowired
    private StudentService service;

    //create student
    @PostMapping("/")
    public ResponseEntity<resDto> createStudent( @Valid @RequestBody reqDto reqDto){
        resDto student = service.createStud(reqDto);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> students = service.getAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @GetMapping("/{studentId}")
    public ResponseEntity<Optional<Student>> getStudent(@PathVariable Long studentId){
        Optional<Student> students = service.getstudent(studentId);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @PutMapping("/{studentId}")
    public ResponseEntity<Student> updateStudent( @PathVariable Long studentId, @RequestBody Student student){
        Student student1 = service.updateStud(studentId, student);
        return new ResponseEntity<>(student1, HttpStatus.CREATED);
    }
    @DeleteMapping("/{studentId}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long studentId){
        String String = service.delstudent(studentId);
        return new ResponseEntity<>(String, HttpStatus.OK);
    }
}
