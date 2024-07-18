package com.example.spring_mvc.repository;

import com.example.spring_mvc.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
//    @Query(value = "call SP_GET_ALL_STUDENTS()", nativeQuery = true)
////    @Procedure("SP_GET_ALL_STUDENTS")
//    List<Student> getAllStudent();
}
