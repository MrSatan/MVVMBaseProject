package com.srp.carwash.data.model.api;

import com.google.gson.annotations.Expose;

import java.util.List;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String avatarUrl;
    private String credit;
    private List<Integer> carId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public List<Integer> getCarId() {
        return carId;
    }

    public void setCarId(List<Integer> carId) {
        this.carId = carId;
    }

    public void addCar(int carId){
        this.carId.add(carId);
    }


}
