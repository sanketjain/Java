package com.aitacs.jee.jpademo.entities;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user_info")
@SecondaryTable(name="password_details", pkJoinColumns=@PrimaryKeyJoinColumn(name="user_id"))
public class User {

	@Column(name="user_id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="user_seq")
	@SequenceGenerator(sequenceName="user_seq", name="user_seq", initialValue=1, allocationSize=1)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;

	@Column(name="user_name")
	private String userName;

	@Column
	private int age;

	@Column
	private String gender;

	@Column
	private String email;

	@Column
	private String phone;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date createdDate;	
	
	@Lob
	private char[] xmlText;
	
	@Lob
	private byte[] imageData;
	
	@Column(table="password_details")
	private String password;
	
	@Column(name="sec_ques_1", table="password_details")
	private String secQues1;

	@Column(name="sec_ques_2", table="password_details")
	private String secQues2;

	@Column(name="sec_ans_1", table="password_details")
	private String secAns1;

	@Column(name="sec_ans_2", table="password_details")
	private String secAns2;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="city", column=@Column(name="user_city")),
		@AttributeOverride(name="state", column=@Column(name="user_state"))
	})
	private Address address;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="car_id")
	private Car car;
	
	public User(){}

	public User(String firstName, String lastName, String userName, int age, String gender, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public char[] getXmlText() {
		return xmlText;
	}
	public void setXmlText(char[] xmlText) {
		this.xmlText = xmlText;
	}
	public byte[] getImageData() {
		return imageData;
	}
	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecQues1() {
		return secQues1;
	}
	public void setSecQues1(String secQues1) {
		this.secQues1 = secQues1;
	}
	public String getSecQues2() {
		return secQues2;
	}
	public void setSecQues2(String secQues2) {
		this.secQues2 = secQues2;
	}
	public String getSecAns1() {
		return secAns1;
	}
	public void setSecAns1(String secAns1) {
		this.secAns1 = secAns1;
	}
	public String getSecAns2() {
		return secAns2;
	}
	public void setSecAns2(String secAns2) {
		this.secAns2 = secAns2;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
}
