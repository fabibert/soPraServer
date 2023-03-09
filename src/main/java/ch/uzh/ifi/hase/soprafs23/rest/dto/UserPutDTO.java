package ch.uzh.ifi.hase.soprafs23.rest.dto;

import java.time.LocalDateTime;

public class UserPutDTO {
    private String username;
    private LocalDateTime birthDay;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDateTime birthDay) {
        this.birthDay = birthDay;
    }




}
