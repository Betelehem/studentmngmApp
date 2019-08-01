package edu.mum.cs.cs425.studentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepostory;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {
	@Autowired
	StudentRepostory studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
		Student s1 = new Student(1L, " 000-61-0001", "Anna", " Lynn", "Smith", 3.45, LocalDate.of(2019, 5, 24));
		Transcript t1= new Transcript (1L, "BS Computer Science");
		Classroom c1= new Classroom(1L, "McLaughlin building", "M105");
		s1.setTranscript(t1);
		s1.addClassroom(c1);
		saveStudent(s1);

	}

	public void saveStudent(Student student) {

		System.out.println("studentRepository obj value " + studentRepository);
		studentRepository.save(student);
	}

}
