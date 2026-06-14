package com.przemekb.sms;

import com.przemekb.sms.entity.Student;
import com.przemekb.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student("Joe", "Doe", "doe@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("John", "Cena", "cena@luv2code.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Tony", "Stark", "stark@gmail.com");
//		studentRepository.save(student3);
//		Student student4 = new Student("Mary", "Jane", "jane@gmail.com");
//		studentRepository.save(student4);
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

}
