package edu.mum.cs.cs425.studentmgmt.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classroom {
	@Id
	Long classroomId;
	String buildingName;
	String roomNumber;
	
	@OneToMany(cascade=CascadeType.ALL)
    private List<Student> student = new ArrayList<>();
	
	public List<Student> getSt() {
		return student;
	}
	public void setSt(List<Student> st) {
		this.student = student;
	}
	public Classroom() {
		
	}
	
	
	@Override
	public String toString() {
		return "Classroom [classroomId=" + classroomId + ", buildingName=" + buildingName + ", roomNumber=" + roomNumber
				+ ", student=" + student + "]";
	}
	public void addStudent(Student student) {
		this.student.add(student);
	}
	
	public Classroom(Long classroomId, String buildingName, String roomNumber) {

		this.classroomId = classroomId;
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}
	
	public Long getClassroomId() {
		return classroomId;
	}
	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	
	
}
