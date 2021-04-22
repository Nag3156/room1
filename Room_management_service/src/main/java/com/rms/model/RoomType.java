package com.rms.model;

public class RoomType {

	private String SINGLE;
	private String DOUBLE;
	private String TRIPLE;
	private String QUAD;
	private String KING;
	private String QUEEN;
	private String SUITE;
	private String MASTERSUITE;
	private String MINISUITE;
	
	public RoomType() {
		
	}
	public RoomType(String sINGLE, String dOUBLE, String tRIPLE, String qUAD, String kING, String qUEEN, String sUITE,
			String mASTERSUITE, String mINISUITE) {
		super();
		SINGLE = sINGLE;
		DOUBLE = dOUBLE;
		TRIPLE = tRIPLE;
		QUAD = qUAD;
		KING = kING;
		QUEEN = qUEEN;
		SUITE = sUITE;
		MASTERSUITE = mASTERSUITE;
		MINISUITE = mINISUITE;
	}
	public String getSINGLE() {
		return SINGLE;
	}
	public void setSINGLE(String sINGLE) {
		SINGLE = sINGLE;
	}
	public String getDOUBLE() {
		return DOUBLE;
	}
	public void setDOUBLE(String dOUBLE) {
		DOUBLE = dOUBLE;
	}
	public String getTRIPLE() {
		return TRIPLE;
	}
	public void setTRIPLE(String tRIPLE) {
		TRIPLE = tRIPLE;
	}
	public String getQUAD() {
		return QUAD;
	}
	public void setQUAD(String qUAD) {
		QUAD = qUAD;
	}
	public String getKING() {
		return KING;
	}
	public void setKING(String kING) {
		KING = kING;
	}
	public String getQUEEN() {
		return QUEEN;
	}
	public void setQUEEN(String qUEEN) {
		QUEEN = qUEEN;
	}
	public String getSUITE() {
		return SUITE;
	}
	public void setSUITE(String sUITE) {
		SUITE = sUITE;
	}
	public String getMASTERSUITE() {
		return MASTERSUITE;
	}
	public void setMASTERSUITE(String mASTERSUITE) {
		MASTERSUITE = mASTERSUITE;
	}
	public String getMINISUITE() {
		return MINISUITE;
	}
	public void setMINISUITE(String mINISUITE) {
		MINISUITE = mINISUITE;
	}
	
}
