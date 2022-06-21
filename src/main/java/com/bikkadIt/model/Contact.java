package com.bikkadIt.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
@Table(name="CONTACT_DTLS")
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CONTACT_ID")
	private Integer contact_id;
	@Column(name="CONTACT_NAME")
	private String contact_name;
	@Column(name="CONTACT_NUMBER")
	private long contact_number ;
	@Column(name="CONTACT_EMAIL")
	private String contact_email;
	@Column(name="ACTIVE_SW")
	private Character active_sw;
	@Column(name="CREATE_DATE" ,updatable=false)
	
	@CreationTimestamp
    private LocalDate createdate;
	@Column(name="UPDATED_DATE" ,insertable=false)
	@UpdateTimestamp
    private LocalDate updatedate;
	public Integer getContact_id() {
		return contact_id;
	}
	public void setContact_id(Integer contact_id) {
		this.contact_id = contact_id;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public long getContact_number() {
		return contact_number;
	}
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	public String getContact_email() {
		return contact_email;
	}
	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}
	public Character getActive_sw() {
		return active_sw;
	}
	public void setActive_sw(Character active_sw) {
		this.active_sw = active_sw;
	}
	public LocalDate getCreatedate() {
		return createdate;
	}
	public void setCreatedate(LocalDate createdate) {
		this.createdate = createdate;
	}
	public LocalDate getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(LocalDate updatedate) {
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "Contact [contact_id=" + contact_id + ", contact_name=" + contact_name + ", contact_number="
				+ contact_number + ", contact_email=" + contact_email + ", active_sw=" + active_sw + ", createdate="
				+ createdate + ", updatedate=" + updatedate + "]";
	}
	
	
	

}
