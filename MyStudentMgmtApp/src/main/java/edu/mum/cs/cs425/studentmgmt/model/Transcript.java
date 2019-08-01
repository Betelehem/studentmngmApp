package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transcript {
	@Id
	Long transcriptId;
	String degreeTitle;
	
	public Transcript() {}
	public Transcript(Long transcriptId, String degreeTitle) {
		
		this.transcriptId = transcriptId;
		this.degreeTitle = degreeTitle;
	}
	public Long getTranscriptId() {
		return transcriptId;
	}
	
	@Override
	public String toString() {
		return "Transcript [transcriptId=" + transcriptId + ", degreeTitle=" + degreeTitle + "]";
	}
	public void setTranscriptId(Long transcriptId) {
		this.transcriptId = transcriptId;
	}
	public String getDegreeTitle() {
		return degreeTitle;
	}
	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	

}
