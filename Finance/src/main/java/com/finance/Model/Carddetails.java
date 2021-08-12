package com.finance.Model;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//package com.finance.mapping;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="carddet")
public class Carddetails {
	@Id
	private int regid;
	private long cardno ;
	private String cardtype;
	private Date validity;
	private int initialbal;
	private int availbal;
	public Carddetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carddetails(int regid, long cardno, String cardtype, Date validity, int initialbal, int availbal) {
		super();
		this.regid = regid;
		this.cardno = cardno;
		this.cardtype = cardtype;
		this.validity = validity;
		this.initialbal = initialbal;
		this.availbal = availbal;
	}
	
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public long getCardno() {
		return cardno;
	}
	public void setCardno(long cardno) {
		this.cardno = cardno;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public Date getValidity() {
		return validity;
	}
	public void setValidity(Date validity) {
		this.validity = validity;
	}
	public int getInitialbal() {
		return initialbal;
	}
	public void setInitialbal(int initialbal) {
		this.initialbal = initialbal;
	}
	public int getAvailbal() {
		return availbal;
	}
	public void setAvailbal(int availbal) {
		this.availbal = availbal;
	}
	
}
//@Entity
//
//@Table(name="dummycarddetails")
//
//public class Carddetails {
//	@Id
//	//@OneToOne(fetch = FetchType.LAZY)
//   // @JoinColumn(name = "regid")
//	private long regid;
//	
//	private long cardno ;
//	private String cardtype;
//	private LocalDate validity; 
//	private long initialbal ;
//	 private long availbal ;
//	public long getRegid() {
//		return regid;
//	}
//	public void setRegid(long regid) {
//		this.regid = regid;
//	}
//	public long getCardno() {
//		return cardno;
//	}
//	public void setCardno(long cardno) {
//		this.cardno = cardno;
//	}
//	public String getCardtype() {
//		return cardtype;
//	}
//	public void setCardtype(String cardtype) {
//		this.cardtype = cardtype;
//	}
//	
//	public LocalDate getValidity() {
//		return validity;
//	}
//	public void setValidity(LocalDate validity) {
//		this.validity = validity;
//	}
//	public long getInitialbal() {
//		return initialbal;
//	}
//	public void setInitialbal(long initialbal) {
//		this.initialbal = initialbal;
//	}
//	public long getAvailbal() {
//		return availbal;
//	}
//	public void setAvailbal(long availbal) {
//		this.availbal = availbal;
//	}
//	
//	public Carddetails(long regid, long cardno, String cardtype, LocalDate validity, long initialbal, long availbal) {
//		super();
//		this.regid = regid;
//		this.cardno = cardno;
//		this.cardtype = cardtype;
//		this.validity = validity;
//		this.initialbal = initialbal;
//		this.availbal = availbal;
//	}
//	public Carddetails() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	 
//	 
//	 
//
//}
