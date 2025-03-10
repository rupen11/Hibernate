package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	private String projectName;
	
	@ManyToMany
	private List<Employee> employee_;

	
	public Project(int pid, String projectName, List<Employee> employee_) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.employee_ = employee_;
	}

	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployee_() {
		return employee_;
	}

	public void setEmployee_(List<Employee> employee_) {
		this.employee_ = employee_;
	}
	
	
	
}
