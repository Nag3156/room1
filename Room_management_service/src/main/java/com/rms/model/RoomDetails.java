package com.rms.model;

public class RoomDetails {

	private long roomid;
	private String currentstatus;
	
	public RoomDetails() {
		
	}
	public RoomDetails(long roomid, String currentstatus) {
		super();
		this.roomid = roomid;
		this.currentstatus = currentstatus;
	}
	public long getRoomid() {
		return roomid;
	}
	public void setRoomid(long roomid) {
		this.roomid = roomid;
	}
	public String getCurrentstatus() {
		return currentstatus;
	}
	public void setCurrentstatus(String currentstatus) {
		this.currentstatus = currentstatus;
	}
	
}
