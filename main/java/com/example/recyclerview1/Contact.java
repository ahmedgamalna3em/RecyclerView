package com.example.recyclerview1;

public class Contact {
/*
    سنقوم بانشا كلاس فقط يحمل الداتا
*/


    String id;
    String name;
    String status;
    int profileImage;

    public Contact(String id,String name,String status,int profileImage){
        this.id = id;
        this.name = name;
        this.status = status;
        this.profileImage = profileImage;

    }
    //======================================
    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
    //======================================
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //======================================

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    //======================================

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public int getProfileImage() {
        return profileImage;
    }
    //======================================//





}
