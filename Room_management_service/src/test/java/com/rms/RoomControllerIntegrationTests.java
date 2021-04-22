package com.rms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import com.rms.model.Room;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = RoomManagementServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RoomControllerIntegrationTests {
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port;
	}

	@Test
	public void contextLoads() {

	}

	@Test
	public void testGetAllRooms() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/rooms",
				HttpMethod.GET, entity, String.class);
		
		assertNotNull(response.getBody());
	}

	
	@Test
	public void testCreateRoom() {
		Room room = new Room();
	    room.setRoomDetails(null);
	    room.setRoomtype(null);
		ResponseEntity<Room> postResponse = restTemplate.postForEntity(getRootUrl() + "/rooms", room, Room.class);
		assertNotNull(postResponse);
		assertNotNull(postResponse.getBody());
	}

	

	@Test
	public void testDeleteEmployee() {
		int id = 2;
		Room room = restTemplate.getForObject(getRootUrl() + "/rooms/" + id, Room.class);
		assertNotNull(room);

		restTemplate.delete(getRootUrl() + "/rooms/" + id);

		try {
			room = restTemplate.getForObject(getRootUrl() + "/rooms/" + id, Room.class);
		} catch (final HttpClientErrorException e) {
			assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
		}
	}
}