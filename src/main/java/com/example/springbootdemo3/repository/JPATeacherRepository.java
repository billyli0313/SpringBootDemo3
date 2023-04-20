package com.example.springbootdemo3.repository;

import com.example.springbootdemo3.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPATeacherRepository extends JpaRepository<Teacher,String> {

}
