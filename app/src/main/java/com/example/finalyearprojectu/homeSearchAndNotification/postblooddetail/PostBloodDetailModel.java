package com.example.finalyearprojectu.homeSearchAndNotification.postblooddetail;

import java.util.HashMap;
import java.util.Map;

public class PostBloodDetailModel {
   public String age;
   public String blood_for;
    public String blood_group;
    public String full_address;
    public String gender;
    public String phone_number;
    public String refer_city;
    public  String request_key;
    public  String request_type;
    public String user_key;

    public PostBloodDetailModel() {
    }

    public PostBloodDetailModel(String age, String blood_for,
                                String blood_group, String full_address,
                                String gender, String phone_number,
                                String refer_city, String request_key,
                                String request_type, String user_key) {
        this.age = age;
        this.blood_for = blood_for;
        this.blood_group = blood_group;
        this.full_address = full_address;
        this.gender = gender;
        this.phone_number = phone_number;
        this.refer_city = refer_city;
        this.request_key = request_key;
        this.request_type = request_type;
        this.user_key = user_key;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBlood_for() {
        return blood_for;
    }

    public void setBlood_for(String blood_for) {
        this.blood_for = blood_for;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public String getFull_address() {
        return full_address;
    }

    public void setFull_address(String full_address) {
        this.full_address = full_address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getRefer_city() {
        return refer_city;
    }

    public void setRefer_city(String refer_city) {
        this.refer_city = refer_city;
    }

    public String getRequest_key() {
        return request_key;
    }

    public void setRequest_key(String request_key) {
        this.request_key = request_key;
    }

    public String getRequest_type() {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }

    public String getUser_key() {
        return user_key;
    }

    public void setUser_key(String user_key) {
        this.user_key = user_key;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("age",age);
        result.put("blood_for",blood_for);
        result.put("blood_group",blood_group);
        result.put("full_address",full_address);
        result.put("gender",gender);
        result.put("phone_number",phone_number);
        result.put("refer_city",refer_city);
        result.put("request_key",request_key);
        result.put("request_type",request_type);
        result.put("user_key",user_key);
        return result;
    }
}
