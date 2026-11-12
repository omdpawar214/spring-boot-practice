package in.practice.s_b_practical.service;

import in.practice.s_b_practical.entity.Student;
import in.practice.s_b_practical.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student createStud(Student student) {
        return  repository.save(student);
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

    public String delstudent(Long studentId) {
        Optional<Student> stud = repository.findById(studentId);
        if(stud ==null) return "student not found";
        Student student = stud.get();
        repository.delete(student);
        return "deleted";
    }
}
