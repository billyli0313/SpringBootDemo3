package com.example.springbootdemo3.controller;

import com.example.springbootdemo3.entity.Student;
import com.example.springbootdemo3.entity.Teacher;
import com.example.springbootdemo3.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
/*Dependency Injection*/
    @Autowired
    private TeacherService service ;
    /*Show all the teachers*/
    @GetMapping(value = "/teachers")
    public List<Teacher> listAllTeachers(){
        return  service.listAllTeachers();
    }
    /*Create a new teacher*/
    @PostMapping(value = "/create/teacher")
    public void createTeacher(@RequestBody Teacher teacher){
        service.saveTeacher(teacher);
    }
    /*Show the teacher by ID*/
    @GetMapping(value = "/teacher")
    @ResponseBody
    public Teacher getTeacher(@RequestParam(value = "id")String id){
        return service.getTeacherById(id);
    }

}
