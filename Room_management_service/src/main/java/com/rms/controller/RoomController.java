package com.rms.controller;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rms.roomrepository.RoomRepository;
import com.rms.exception.ResourceNotFoundException;
import com.rms.model.Room;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/api/v1")
public class RoomController {
	@Autowired
	private RoomRepository roomRepository;

	@GetMapping("/rooms")
	public List<Room> getAllRooms() {
		return roomRepository.findAll();
	}


	@PostMapping("/rooms")
	public Room createRoom(@RequestBody Room room) {
		return roomRepository.save(room);
	}

	@PutMapping("/rooms/{id}")
	public ResponseEntity<Room> updateRoom(@PathVariable(value = "id") Long roomId,
			@RequestBody Room roomDetails) throws ResourceNotFoundException {
		Room room = roomRepository.findById(roomId)
				.orElseThrow(() -> new ResourceNotFoundException(" Room number not found :: " + roomId));

		room.setRoomDetails(roomDetails.getRoomDetails());
		final Room updatedRoom = roomRepository.save(room);
		return ResponseEntity.ok(updatedRoom);
	}

	@DeleteMapping("/rooms/{id}")
	public Map<String, Boolean> deleteRoom(@PathVariable(value = "id") Long roomId)
			throws ResourceNotFoundException {
		Room room = roomRepository.findById(roomId)
				.orElseThrow(() -> new ResourceNotFoundException("Room number not found :: " + roomId));

		roomRepository.delete(room);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}