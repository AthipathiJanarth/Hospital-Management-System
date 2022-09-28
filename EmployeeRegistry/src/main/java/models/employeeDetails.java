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
    private Date startDate;
    private String level;
    private String teamInfo;
    private String positionTitle;
    private Image profilePhoto; 
    private contactInfo contact;
    
    
    public void setEmployeeDetails(String name,String empID,int empAge,String empGender,Date date,String empLevel,String empTeam,String empPosition, String empPhone, String empEmail){
        Name=name;
        employeeID=empID;
        age=empAge;
        gender=empGender;
        startDate=date;
        level=empLevel;
        teamInfo=empTeam;
        positionTitle=empPosition;
        contactInfo contactDetails=new contactInfo();
        contactDetails.setContactDetails(empPhone, empEmail);
    }
}
