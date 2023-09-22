package com.personal.RestApiProjects;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class StudentController {
    @GetMapping("/api/v1/student")
    public Student getStudent(){
        return new Student("Opeoluwa","Ayoade",30,"Masters");
    }

    @GetMapping("/api/v1/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Femi","Ayoade",26,"Masters"));
        students.add(new Student("Maxwell","Nkewokeneme",32,"Masters"));
        students.add(new Student("Oluwatobi","Oloyede",26,"Masters"));
        students.add(new Student("Oluwaseyi","Agoro",29,"Masters"));
        students.add(new Student("Olamide","Sobowale",28,"Masters"));
        students.add(new Student("Oladotun","Lawal",28,"Masters"));
        students.add(new Student("Quadri","Aminu",29,"Masters"));
        return students;
    }
    @GetMapping("/api/v1/student/{firstName}/{lastName}/{age}/{level}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName,
                                       @PathVariable("age") int age,
                                       @PathVariable("level") String level){
        return new Student(firstName,lastName,age,level);
    }

}
