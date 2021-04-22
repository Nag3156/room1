package com.rms.model;

import java.util.List;

public class Room {
	
	private List<RoomDetails>roomDetails;
	private List<RoomType>roomType;
	
	public Room() {
		
	}
	public Room(List<RoomDetails> roomDetails, List<RoomType> roomType) {
		super();
		this.roomDetails = roomDetails;
		this.roomType = roomType;
	}
	public List<RoomDetails> getRoomDetails() {
		return roomDetails;
	}
	public void setRoomDetails(List<RoomDetails> roomDetails) {
		this.roomDetails = roomDetails;
	}
	public List<RoomType> getRoomType() {
		return roomType;
	}
	public void setRoomtype(List<RoomType> roomType) {
		this.roomType = roomType;
	}
	
}
