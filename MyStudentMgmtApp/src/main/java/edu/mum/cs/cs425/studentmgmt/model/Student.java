package edu.mum.cs.cs425.studentmgmt.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.lang.NonNull;



@Entity
public class Student {
     @Id
	private long studentId;
     
     @OneToOne(cascade=CascadeType.ALL)
     Transcript transcript;
     @NonNull
	private String studentNumber;
     
     
     @OneToMany(cascade=CascadeType.ALL)
     private List<Classroom> classroom = new ArrayList<>();
     
     @NonNull
	private String firstName;
     

	private String middleName;
	public long getStudentId() {
		return studentId;
	}


	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}


	public Transcript getTranscript() {
		return transcript;
	}


	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}


	@NonNull
	private String	lastName;
	private double cgpa;
	private LocalDate dateOfEnrollment;
	public Student() {
		
	}
	
	
	public Student(long studentId, String studentNumber, String firstName, String middleName, String lastName,
			double cgpa, LocalDate dateOfEnrollment) {
		super();
		this.studentId = studentId;
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
	}
	
	public void addClassroom(Classroom classroom) {
		this.classroom.add(classroom);
	}
	
	public List<Classroom> getClassroom() {
		return classroom;
	}


	public void setClassroom(List<Classroom> classroom) {
		this.classroom = classroom;
	}


	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}
	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentNumber=" + studentNumber + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", cgpa=" + cgpa + ", dateOfEnrollment="
				+ dateOfEnrollment + "]";
	}
	
	
	
	
	
}
