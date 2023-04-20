package com.example.springbootdemo3.service;

import com.example.springbootdemo3.entity.Student;
import com.example.springbootdemo3.repository.JPAStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class StudentService {
/*Dependency Injection*/
    @Autowired
    private JPAStudentRepository jpaStudentRepository;
/*Show all the students*/
    public List<Student> listAllStudents(){
        return jpaStudentRepository.findAll();
    }

/*Get the student by ID*/
    public Student getStudentById(String id){
        Optional<Student> loadStudent = jpaStudentRepository.findById(id);
        if(loadStudent.isPresent()){
            return loadStudent.get();
        }
        return null ;
    }
/*Save a new student*/
    public void saveStudent(Student student){
        jpaStudentRepository.save(student);
    }
/*Delete the student*/
    public void deleteStudent(Student student){
        jpaStudentRepository.delete(student);
    }
    /*Get the student by name & Pagination*/
//    public List<Student> findStudentByName(String name,int page, int sizePerPage){
//
////        return jpaStudentRepository.findStudentByName(name);
//        Pageable pageable =  PageRequest.of(page,sizePerPage, Sort.by("id"));
//        return jpaStudentRepository.findlistByName(name,pageable);
//
//    }
}
