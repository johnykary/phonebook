package com.example.phonebook.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "phonebook")
public class Phone {
	
	  @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name="phonebook_id")
          private Long id;
      
      @Column(name="first_name")
      @NotNull(message = "Please provide First Name")
      private String firstName;
      
      @Column(name="last_name")
      @NotNull(message = "Please provide Last Name")
      private String lastName;
      
      @Column(name="email")
      @NotNull(message = "Please provide Email")
      private String email;
      
      @Column(name="mobile_phone")
      @NotNull(message = "Please provide Mobile Phone")
      private String mobilePhone;
      
      @Column(name="home_phone")
      private String homePhone;
      
      @Column(name="work_phone")
      private String workPhone;
	
      @Column(name="created_at")
      private LocalDateTime createdAt;

		public Long getId() {
			return id;
		}
	
		public void setId(Long id) {
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
	
		public String getEmail() {
			return email;
		}
	
		public void setEmail(String email) {
			this.email = email;
		}
	
		public String getMobilePhone() {
			return mobilePhone;
		}
	
		public void setMobilePhone(String mobilePhone) {
			this.mobilePhone = mobilePhone;
		}
	
		public String getHomePhone() {
			return homePhone;
		}
	
		public void setHomePhone(String homePhone) {
			this.homePhone = homePhone;
		}
	
		public String getWorkPhone() {
			return workPhone;
		}
	
		public void setWorkPhone(String workPhone) {
			this.workPhone = workPhone;
		}
	
		public LocalDateTime getCreatedAt() {
			return createdAt;
		}
	
		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}
}
