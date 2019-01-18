package com.usecase.demo.service;

import java.util.Date;

public class UserDto {

	public String user_id;

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

	public void setRegion(long region) {
		this.region = region;
	}

	public long getTheatre() {
		return theatre;
	}

	public void setTheatre(long theatre) {
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

	public void setId(long id) {
		this.id = id;
	}

	public String active;
	public String cec_id;
	public String first_name;
	public String last_name;
	public long region;
	public long theatre;
	public Date created_dt;
	public String created_by;
	public String updated_dt;
	public long id;

	public UserDto(String userId, String firstName, long id) {
		this.user_id = userId;
		this.first_name = firstName;
		this.id = id;
	}

}
