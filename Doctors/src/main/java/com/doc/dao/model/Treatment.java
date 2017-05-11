package com.doc.dao.model;

public class Treatment {
	private int id;
	private int doctor_id;
	private int patient_id;
	private String diaginfo;
	private String grade;
	public Treatment() {

	}

	public Treatment(int id, int doctor_id, int patient_id, String diaginfo, String grade) {
		super();
		this.id = id;
		this.doctor_id = doctor_id;
		this.patient_id = patient_id;
		this.diaginfo= diaginfo;
		this.grade= grade;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getDiaginfo() {
		return diaginfo;
	}

	public void setDiaginfo(String diaginfo) {
		this.diaginfo = diaginfo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
