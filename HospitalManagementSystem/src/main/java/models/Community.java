/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author athipathi
 */
public class Community {
    protected String communityName;
    protected int zipCode;
    private City city;

    public void createCommunity(String communityName, int zipCode, City city) {
        this.communityName = communityName;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getCommunityName() {
        return communityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public City getCity() {
        return city;
    }
}
