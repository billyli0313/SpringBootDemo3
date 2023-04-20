package com.example.springbootdemo3.repository;

import com.example.springbootdemo3.entity.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JPAStudentRepository extends JpaRepository <Student,String>{

//    List<Student> findStudentByName(String name,Pageable page);

//    @Query(value = "SELECT s from Student s where s.name = ?1")
//    List<Student> findByName(String name,Pageable page);
//
//    @Query(value = "SELECT s.* from Student s where s.name = :name", nativeQuery = true)
//    List<Student> findlistByName(@Param("name")String name, Pageable page);
}
