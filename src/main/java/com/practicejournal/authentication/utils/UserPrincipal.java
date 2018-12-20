package com.practicejournal.authentication.utils;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.practicejournal.authentication.model.User;

public class UserPrincipal implements UserDetails 
{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private User user;
    

    public UserPrincipal(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public static long getSerialversionuid() {
        return serialVersionUID;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }


    @Override
    public String getPassword() {
        return user.getPassword();
    }


    @Override
    public String getUsername() {
        return user.getEmailAddress();
    }


    @Override
    public boolean isEnabled() {
        return user.isEnabled();
    }


}
