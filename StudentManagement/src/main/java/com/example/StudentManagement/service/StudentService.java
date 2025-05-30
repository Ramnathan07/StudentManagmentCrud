package com.example.StudentManagement.service;

import com.example.StudentManagement.model.Student;
import com.example.StudentManagement.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public Student saveStudent(Student student){
       return repo.save(student);
    }

    public Optional<Student> getstudentbyrollno(Long rollno){
        return repo.findById(rollno);
    }

    public List<Student> getallstudent(){
        return repo.findAll();
    }


    public void deleteStudent (Long rollno){
        repo.deleteById(rollno);
    }





}
