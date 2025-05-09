package com.zane.demo;

import com.zane.demo.dao.StudentDao;
import com.zane.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDao studentDao) {
        return runner -> {
//            createStudent(studentDao);

            readStudent(studentDao);
        };
    }

    private void readStudent(StudentDao studentDao) {
        // create student
        System.out.println("Creating new student object...");
        Student student = new Student("Hi", "There", "HiThere@example.com");

        // save the student
        System.out.println("Saving the student...");
        studentDao.save(student);

        // display the student id
        System.out.println("Saved student. Generated id: " + student.getId());

        // retrieve student based on the id: primary key
        System.out.println("Retrieving student with id: " + student.getId());
        Student myStudent = studentDao.findById(student.getId());

        // display the retrieved student
        System.out.println("Found student: " + myStudent);
    }

    private void createStudent(StudentDao studentDao) {
        System.out.println("Creating new student object...");
        Student student = new Student("John", "Doe", "john_doe@email.com");

        System.out.println("Saving the student...");
        studentDao.save(student);

        System.out.println("Saved student. Generated id: " + student.getId());
    }
}
