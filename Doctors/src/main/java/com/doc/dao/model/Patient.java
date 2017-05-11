package com.doc.dao.model;

public class Patient {
	private int patient_id;
	private int patient_age;
	private String patient_name;
	private String patient_sex;
	private String patient_disease;

	public Patient() {

	}

	public Patient(int patient_id, int patient_age, String patient_name, String patient_sex, String patient_disease) {
		super();
		this.patient_id = patient_id;
		this.patient_age = patient_age;
		this.patient_name = patient_name;
		this.patient_sex = patient_sex;
		this.patient_disease = patient_disease;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public int getPatient_age() {
		return patient_age;
	}

	public void setPatient_age(int patient_age) {
		this.patient_age = patient_age;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getPatient_sex() {
		return patient_sex;
	}

	public void setPatient_sex(String patient_sex) {
		this.patient_sex = patient_sex;
	}

	public String getPatient_disease() {
		return patient_disease;
	}

	public void setPatient_disease(String patient_disease) {
		this.patient_disease = patient_disease;
	}

}
