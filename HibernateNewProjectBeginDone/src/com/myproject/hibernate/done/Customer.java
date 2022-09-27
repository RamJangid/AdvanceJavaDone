package com.myproject.hibernate.done;

public class Customer 
{
	private int cid;
	private String name;
	private String email;
	private long phone;
	private String city;
	private double bal;
	
	public Customer()
	{
		super();
	}
	
	//Let Hibernate initialize the Primary Key cid;
	public Customer(String name, String email, long phone, String city, double bal) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.bal = bal;
	}
	
	//But Hibernate is itself creating the primary key and increasing automatically hence this Constrctr is not required
//	public Customer(int cid, String name, String email, long phone, String city, double balance) {
//		super();
//		this.cid = cid;
//		this.name = name;
//		this.email = email;
//		this.phone = phone;
//		this.city = city;
//		this.balance = balance;
//	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
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

	public double getBalance() {
		return bal;
	}

	public void setBalance(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() 
	{
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ ", bal=" + bal + "]";
	}
	
	

}
