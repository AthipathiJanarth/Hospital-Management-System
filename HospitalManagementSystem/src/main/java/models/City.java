/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author athipathi
 */
public class City {
    protected String cityName;
    protected String state;

    public boolean createCity(String cityName, String state) {
        this.cityName = cityName;
        this.state = state;
        return true;
    }

    public String getCityName() {
        return cityName;
    }

    public String getState() {
        return state;
    }
    
}
