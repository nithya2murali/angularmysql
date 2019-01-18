package com.usecase.entity.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

	@Id
	@Column(name = "user_id")
	private String user_id;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCec_id() {
		return cec_id;
	}

	public void setCec_id(String cec_id) {
		this.cec_id = cec_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public long getRegion() {
		return region;
	}

	public void setRegion(int region) {
		this.region = region;
	}

	public long getTheatre() {
		return theatre;
	}

	public void setTheatre(int theatre) {
		this.theatre = theatre;
	}

	public Date getCreated_dt() {
		return created_dt;
	}

	public void setCreated_dt(Date created_dt) {
		this.created_dt = created_dt;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getUpdated_dt() {
		return updated_dt;
	}

	public void setUpdated_dt(String updated_dt) {
		this.updated_dt = updated_dt;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String active;
	private String cec_id;
	private String first_name;
	private String last_name;
	private long region;
	private long theatre;
	private Date created_dt;
	private String created_by;
	private String updated_dt;
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public String toString() {
		return id + " | " + first_name + " | " + last_name;
	}

}
