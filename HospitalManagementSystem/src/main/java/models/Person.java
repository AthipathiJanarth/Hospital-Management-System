/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author athipathi
 */
public class Person {

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getPersonID() {
        return personID;
    }

    public String getPassword() {
        return password;
    }

    public void createPerson(String name, int age, String gender, int personID, String password, long phoneNo,String role) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.personID = personID;
        this.password = password;
        this.phoneNo = phoneNo;
        this.role= role;
    }
    
    protected String name;
    protected int age;
    protected String gender;
    protected int personID;
    protected String password;
    protected long phoneNo;
    protected String role;
    
}
