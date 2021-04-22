package com.rms.model;

public class Show {

	private String roomId;
	private String message;
	
	public Show() {
		
	}
	public Show(String roomId, String message) {
		super();
		this.roomId = roomId;
		this.message = message;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
