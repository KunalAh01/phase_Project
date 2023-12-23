package com.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vitals {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SNo;
	private int BPHigh;
	private int BPLow;
	private int SPO2;
	private String RecordedOn;
	private Integer pid;
	
	public Vitals() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vitals(int sNo, int bPHigh, int bPLow, int sPO2, String recordedOn, Integer pid) {
		super();
		SNo = sNo;
		BPHigh = bPHigh;
		BPLow = bPLow;
		SPO2 = sPO2;
		RecordedOn = recordedOn;
		this.pid = pid;
	}
	public int getSNo() {
		return SNo;
	}
	public void setSNo(int sNo) {
		SNo = sNo;
	}
	public int getBPHigh() {
		return BPHigh;
	}
	public void setBPHigh(int bPHigh) {
		BPHigh = bPHigh;
	}
	public int getBPLow() {
		return BPLow;
	}
	public void setBPLow(int bPLow) {
		BPLow = bPLow;
	}
	public int getSPO2() {
		return SPO2;
	}
	public void setSPO2(int sPO2) {
		SPO2 = sPO2;
	}
	public String getRecordedOn() {
		return RecordedOn;
	}
	public void setRecordedOn(String recordedOn) {
		RecordedOn = recordedOn;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Vitals [SNo=" + SNo + ", BPHigh=" + BPHigh + ", BPLow=" + BPLow + ", SPO2=" + SPO2 + ", RecordedOn="
				+ RecordedOn + ", pid=" + pid + "]";
	}
	
	

}
