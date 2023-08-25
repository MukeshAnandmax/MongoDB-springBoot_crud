package com.practice.mongodbspring;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {

    @Query("{age:{$gt:?0,$lt:?1}}")
    public List<User> getUserByAge(int min,int max);
}
