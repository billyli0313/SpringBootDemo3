package com.example.springbootdemo3.controller;

import com.example.springbootdemo3.entity.Student;
import com.example.springbootdemo3.entity.Teacher;
import com.example.springbootdemo3.service.SignUpService;
import com.example.springbootdemo3.service.StudentService;
import com.example.springbootdemo3.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class SignUpController {
    @Autowired
    private SignUpService signupService ;
    /*Sign up connection*/
    @PostMapping(value = "/signup")
    public String signupTeacherAndStudent(@RequestParam(value = "studentId")String studentId,
                                        @RequestParam(value = "teacherId")String teacherId){

        return signupService.signupTeacherAndStudent(studentId,teacherId);
    }
    /*Delete connection*/
    @DeleteMapping(value = "delete/signup")
    public String deleteSignup(@RequestParam(value = "studentId")String studentId){

        return signupService.deleteSignup(studentId);
    }
}
