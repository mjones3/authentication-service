package com.practicejournal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.practicejournal.authentication.model.User;
import com.practicejournal.authentication.repository.UserRepository;
import com.practicejournal.authentication.utils.UserPrincipal;

@Service
public class PracticeJournalUserDetailsService implements UserDetailsService {
 
    @Autowired
    private UserRepository userRepository;
 
    @Override
    public UserDetails loadUserByUsername(String emailAddress) {
        User user = userRepository.findByEmailAddress(emailAddress);
        if (user == null) {
            throw new UsernameNotFoundException(emailAddress);
        }
        return new UserPrincipal(user);
        
    }
    

}
