/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.awt.Image;
import java.util.Date;

/**
 *
 * @author athipathi
 */
public class employeeDetails {
    private String Name;
    private String employeeID;
    private int age;
    private String gender;
    private String startDate;
    private String level;
    private String teamInfo;
    private String positionTitle;
    private String profilePhoto; 
    private contactInfo contact;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public contactInfo getContact() {
        return contact;
    }

    public void setContact(contactInfo contact) {
        this.contact = contact;
    }
    
    
    public void setEmployeeDetails(String name,String empID,int empAge,String empGender,String date,String empLevel,String empTeam,String empPosition,String photoPath){
        Name=name;
        employeeID=empID;
        age=empAge;
        gender=empGender;
        startDate=date;
        level=empLevel;
        teamInfo=empTeam;
        positionTitle=empPosition;
        profilePhoto = photoPath;
    }
}
