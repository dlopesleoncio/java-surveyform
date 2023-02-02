package com.Diogo.form.FormSubmission;

public class SurveySub{
    private String name, gender;
    private String email;

    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    public String getEmail(){
        return this.email;
    }
}