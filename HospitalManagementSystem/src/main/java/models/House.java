/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author athipathi
 */
public class House {
    private String streetName;
    private int doorNo;
    private Community community;

    public void createHouse(String streetName, int doorNo, Community community) {
        this.streetName = streetName;
        this.doorNo = doorNo;
        this.community = community;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public Community getCommunity() {
        return community;
    }
    
    
}
