package in.practice.s_b_practical.service;

import in.practice.s_b_practical.DTO.reqDto;
import in.practice.s_b_practical.DTO.resDto;
import in.practice.s_b_practical.ExceptionHandler.ResourceNotFoundException;
import in.practice.s_b_practical.entity.Student;
import in.practice.s_b_practical.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public resDto createStud(reqDto reqDto) {

        Student student1 = modelMapper.map(reqDto,Student.class);;
        Student stud = repository.save(student1);
        return maptores(stud);
    }

    private resDto maptores(Student stud) {
        resDto res = new resDto();
        res.setAge(stud.getAge());
        res.setId(stud.getId());
        res.setCreatedAt(LocalDateTime.now());
        res.setName(stud.getName());
        res.setEmail(stud.getEmail());
        res.setRollno(stud.getRollno());
        res.setUpdatedAt(LocalDateTime.now());
        return res;
    }

    private Student map(reqDto reqDto) {
        Student student = new Student();
        student.setAge(reqDto.getAge());
        student.setEmail(reqDto.getEmail());
        student.setName(reqDto.getName());
        student.setRollno(reqDto.getRollno());
        return student;
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public Optional<Student> getstudent(Long studentId) {
        return repository.findById(studentId);
    }

    public Student updateStud(Long studentId, Student student) {
        Optional<Student> stud = repository.findById(studentId);

        if(stud == null) return null;
        //setting fields

        return //repository.save(stud);
        null;

    }

    public String delstudent(Long studentId){
        Student stud = repository.findById(studentId).orElseThrow(()->new ResourceNotFoundException("Student not found with Id- "+studentId));
        repository.delete(stud);
        return "deleted";
    }
}
