package com.practicejournal.authentication.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practicejournal.authentication.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,String>  {
    
//    public User findByUserName(String userName);
    public User findByEmailAddress(String emailAddress);
}
