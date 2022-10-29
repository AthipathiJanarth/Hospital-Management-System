/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author athipathi
 */
public class Hospital {
    private String hospitalName;
    private Community community;

    public void createHospital(String hospitalName, Community community) {
        this.hospitalName = hospitalName;
        this.community = community;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public Community getCommunity() {
        return community;
    }
    
    
}
