package com.example.phonebook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "business_phones")
public class BusinessPhone {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="business_phone_id")
        private Long id;
    
    @Column(name="business_name")
    @NotNull(message = "Please provide Business Name")
    private String businessName;
    
    @Column(name="business_title")
    @NotNull(message = "Please provide Business Title")
    private String businessTitle;
    
    @Column(name="business_url")
    @NotNull(message = "Please provide Business Url")
    private String businessUrl;
    

    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getBusinessName() {
		return businessName;
	}


	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}


	public String getBusinessTitle() {
		return businessTitle;
	}


	public void setBusinessTitle(String businessTitle) {
		this.businessTitle = businessTitle;
	}


	public String getBusinessUrl() {
		return businessUrl;
	}


	public void setBusinessUrl(String businessUrl) {
		this.businessUrl = businessUrl;
	}


	public String getPhoneId() {
		return phoneId;
	}


	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}


	@Column(name="phone_id")
    private String phoneId;
    
}
