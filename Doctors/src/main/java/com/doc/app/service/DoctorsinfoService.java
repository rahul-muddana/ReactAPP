package com.doc.app.service;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.*;

import com.doc.database.AccessManager;

import com.doc.dao.model.Doctorsinfo;
import com.doc.dao.model.Treatment;

@Path("/doctorsinfoService")
public class DoctorsinfoService {
	@GET
	@Path("/doctorsinfo")
	@Produces(MediaType.APPLICATION_JSON)
	public String doctorinfo() {
		String doctorinfo = null;
		ArrayList<Doctorsinfo> doctorinfoList = new ArrayList<Doctorsinfo>();
		try {
			doctorinfoList = new AccessManager().getDoctorsinfo();
			Gson gson = new Gson();
			doctorinfo = gson.toJson(doctorinfoList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doctorinfo;
	}
	@GET
	@Path("/doctorsinfo/id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String doctorinfo1(@PathParam("id") Integer id) {
		String doctorinfo = null;
		ArrayList<Doctorsinfo> doctorinfoList = new ArrayList<Doctorsinfo>();
		try {
			System.out.println("id is " +id);
			doctorinfoList = new AccessManager().getDoctorsInfoById(id);
			Gson gson = new Gson();
			doctorinfo = gson.toJson(doctorinfoList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doctorinfo;
	}
	@GET
	@Path("/doctorsinfo/name/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public String doctorinfo2(@PathParam("name") String name) {
		String doctorinfo = null;
		ArrayList<Doctorsinfo> doctorinfoList = new ArrayList<Doctorsinfo>();
		try {
			System.out.println("name is " + name);
			doctorinfoList = new AccessManager().getDoctorsInfoByName(name);
			Gson gson = new Gson();
			doctorinfo = gson.toJson(doctorinfoList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doctorinfo;
	}
	@GET
	@Path("/treatment")
	@Produces(MediaType.APPLICATION_JSON)
	public String treatment() {
		String treatment = null;
		ArrayList<Treatment> treatmentList = new ArrayList<Treatment>();
		try {
			treatmentList = new AccessManager().getTreatment();
			Gson gson = new Gson();
			treatment = gson.toJson(treatmentList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return treatment;
	}
	@GET
	@Path("/treatment/id/{doctor_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String treatment1(@PathParam("doctor_id") Integer doctor_id) {
		String treatment = null;
		ArrayList<Treatment> treatmentList = new ArrayList<Treatment>();
		try {
			System.out.println("id is new " + doctor_id);
			treatmentList = new AccessManager().getTreatmentById(doctor_id);
			Gson gson = new Gson();
			treatment = gson.toJson(treatmentList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return treatment;
	}
}