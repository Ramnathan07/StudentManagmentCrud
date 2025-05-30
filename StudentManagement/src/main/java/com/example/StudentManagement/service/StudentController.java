package com.example.StudentManagement.service;

import com.example.StudentManagement.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String home(Model model){
        List<Student> students = service.getallstudent();
        model.addAttribute("students", students);
        return "index"; // remove ".html" here
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "form";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        service.saveStudent(student);
        return "redirect:/";
    }

    @GetMapping("/students")
    @ResponseBody
    public List<Student> getAllstudents(){
        return service.getallstudent();
    }

    @GetMapping("/{rollno}")
    @ResponseBody
    public Student getstudent(@PathVariable Long rollno){
        return service.getstudentbyrollno(rollno).orElse(null);
    }

    @GetMapping("/edit/{rollno}")
    public String editStudent(@PathVariable Long rollno, Model model) {
        Student student = service.getstudentbyrollno(rollno).orElse(new Student());
        model.addAttribute("student", student);
        return "form"; // NOT form.html
    }

    @GetMapping("/delete/{rollno}")
    public String deleteStudent(@PathVariable Long rollno, Model model) {
        System.out.println("Deleting student with roll no: " + rollno);
        service.deleteStudent(rollno);
        return "redirect:/";
    }

}
