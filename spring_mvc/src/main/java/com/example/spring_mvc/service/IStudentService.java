package com.example.spring_mvc.service;


import com.example.spring_mvc.entity.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> findAll();
    public Student findById(Long id);
    public Student save(Student student);
    public void update(Student student);
    public void delete(Long id);

}
