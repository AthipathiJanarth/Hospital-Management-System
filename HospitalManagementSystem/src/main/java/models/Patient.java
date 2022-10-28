/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author athipathi
 */
public class Patient extends Person {

    public int getPatientID() {
        return patientID;
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
    private int patientID;
    public void createPatient(String name, int age, String gender, int personID, String password, long phoneNo,String role,int patientID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.personID = personID;
        this.password = password;
        this.phoneNo = phoneNo;
        this.role= role;
        this.patientID=patientID;
    }
    public void updatePatient(String name, int age, String password, long phoneNo) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.phoneNo = phoneNo;
    }
}
