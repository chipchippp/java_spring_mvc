package com.example.spring_mvc.service;


import com.example.spring_mvc.entity.Student;
import com.example.spring_mvc.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService implements IStudentService{
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void update(Student student) {
        Student student1 = studentRepository.findById(student.getId()).orElse(null);
        if (student1 != null) {
            student1.setUsername(student.getUsername());
            student1.setEmail(student.getEmail());
            student1.setPassword(student.getPassword());
            studentRepository.save(student1);
        }
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
