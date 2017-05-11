package com.doc.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.doc.dao.model.*;

public class Access {
	public ArrayList<Doctorsinfo> getDoctorsinfo(Connection con) throws SQLException {
		ArrayList<Doctorsinfo> doctorsinfoList = new ArrayList<Doctorsinfo>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM doctorsinfo");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Doctorsinfo doctorsinfoObj = new Doctorsinfo();
				doctorsinfoObj.setId(rs.getInt("id"));
				doctorsinfoObj.setName(rs.getString("name"));
				doctorsinfoObj.setPatientname(rs.getString("patientname"));
				doctorsinfoObj.setUsername(rs.getString("username"));
				doctorsinfoObj.setPassword(rs.getString("password"));
				doctorsinfoObj.setNoofpatients(rs.getInt("noofpatients"));
				doctorsinfoObj.setSpeciality(rs.getString("speciality"));

				doctorsinfoList.add(doctorsinfoObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return doctorsinfoList;

	}
	public ArrayList<Doctorsinfo> getDoctorsInfoById(Connection con,Integer id) throws SQLException {
		ArrayList<Doctorsinfo> doctorsinfoList = new ArrayList<Doctorsinfo>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM doctorsinfo where id =" +id);
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Doctorsinfo doctorsinfoObj = new Doctorsinfo();
				doctorsinfoObj.setId(rs.getInt("id"));
				doctorsinfoObj.setName(rs.getString("name"));
				doctorsinfoObj.setPatientname(rs.getString("patientname"));
				doctorsinfoObj.setUsername(rs.getString("username"));
				doctorsinfoObj.setPassword(rs.getString("password"));
				doctorsinfoObj.setNoofpatients(rs.getInt("noofpatients"));
				doctorsinfoObj.setSpeciality(rs.getString("speciality"));
				doctorsinfoList.add(doctorsinfoObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return doctorsinfoList;

	}
	public ArrayList<Doctorsinfo> getDoctorsInfoByName(Connection con, String name) throws SQLException {
		ArrayList<Doctorsinfo> doctorsinfoList = new ArrayList<Doctorsinfo>();
		
		System.out.println("name is " +name);
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM doctorsinfo where name =" + name);
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Doctorsinfo doctorsinfoObj = new Doctorsinfo();
				doctorsinfoObj.setId(rs.getInt("id"));
				doctorsinfoObj.setName(rs.getString("name"));
				doctorsinfoObj.setPatientname(rs.getString("patientname"));
				doctorsinfoObj.setUsername(rs.getString("username"));
				doctorsinfoObj.setPassword(rs.getString("password"));
				doctorsinfoObj.setNoofpatients(rs.getInt("noofpatients"));
				doctorsinfoObj.setSpeciality(rs.getString("speciality"));
				doctorsinfoList.add(doctorsinfoObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return doctorsinfoList;
	}

	public ArrayList<Treatment> getTreatment(Connection con) throws SQLException {
		ArrayList<Treatment> treatmentList = new ArrayList<Treatment>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM treatment");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Treatment treatmentObj = new Treatment();
				treatmentObj.setId(rs.getInt("id"));
				treatmentObj.setDoctor_id(rs.getInt("doctor_id"));
				treatmentObj.setPatient_id(rs.getInt("patient_id"));
				treatmentObj.setDiaginfo(rs.getString("diaginfo"));
				treatmentObj.setGrade(rs.getString("grade"));
				

				treatmentList.add(treatmentObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return treatmentList;

	}
	
	public ArrayList<Treatment> getTreatmentById(Connection con, Integer doctor_id) throws SQLException {
		ArrayList<Treatment> treatmentList = new ArrayList<Treatment>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM treatment where doctor_id =" +doctor_id);
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Treatment treatmentObj = new Treatment();
				treatmentObj.setId(rs.getInt("id"));
				treatmentObj.setDoctor_id(rs.getInt("doctor_id"));
				treatmentObj.setPatient_id(rs.getInt("patient_id"));
				treatmentObj.setDiaginfo(rs.getString("diaginfo"));
				treatmentObj.setGrade(rs.getString("grade"));
				

				treatmentList.add(treatmentObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return treatmentList;

	}
	
	
	public ArrayList<Provider> getProvider(Connection con) throws SQLException {
		ArrayList<Provider> providerList = new ArrayList<Provider>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM provider");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Provider providerObj = new Provider();
				providerObj.setDoctor_id(rs.getInt("doctor_id"));
				providerObj.setDoctor_name(rs.getString("doctor_name"));
				providerObj.setDoctor_quali(rs.getString("doctor_quali"));
				providerObj.setUsername(rs.getString("username"));
				providerObj.setPassword(rs.getString("password"));
				

				providerList.add(providerObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return providerList;

	}
	
	public ArrayList<Patient> getPatient(Connection con) throws SQLException {
		ArrayList<Patient> patientList = new ArrayList<Patient>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM patient");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Patient patientObj = new Patient();
				patientObj.setPatient_id(rs.getInt("patient_id"));
				patientObj.setPatient_age(rs.getInt("patient_age"));
				patientObj.setPatient_name(rs.getString("patient_name"));
				patientObj.setPatient_sex(rs.getString("patient_sex"));
				patientObj.setPatient_disease(rs.getString("patient_disease"));
				

				patientList.add(patientObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return patientList;

	}
	
	
	
}