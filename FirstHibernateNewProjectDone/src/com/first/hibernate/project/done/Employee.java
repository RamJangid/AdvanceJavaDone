package com.first.hibernate.project.done;

public class Employee 
{
	private int eid;
	private String name;
	private String email;
	private long phone;
	private String city;
	private double bal;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, String email, long phone, String city, double bal) {
		super();
		
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.bal = bal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ ", bal=" + bal + "]";
	}	
}
