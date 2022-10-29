/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author athipathi
 */
public class Doctor extends Person {
    private int DoctorID;
    private Hospital hospital;

    public int getDoctorID() {
        return DoctorID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getPersonID() {
        return personID;
    }

    public String getPassword() {
        return password;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getRole() {
        return role;
    }

    public Hospital getHospital() {
        return hospital;
    }
    public void createDoctor(String name, int age, String gender, int personID, String password, long phoneNo,String role,int doctorID, Hospital hospital) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.personID = personID;
        this.password = password;
        this.phoneNo = phoneNo;
        this.role= role;
        this.DoctorID=doctorID;
        this.hospital=hospital;
    }
}
