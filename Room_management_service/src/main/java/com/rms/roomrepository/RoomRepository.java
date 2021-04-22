package com.rms.roomrepository;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.rms.model.Room;

@Repository
public interface RoomRepository extends MongoRepository<Room, Long> {

}
