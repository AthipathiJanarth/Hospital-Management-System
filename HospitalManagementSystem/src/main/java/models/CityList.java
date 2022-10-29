/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author athipathi
 */
public class CityList {
    private ArrayList<City> cityList=new ArrayList<City>();

    public ArrayList<City> getCityList() {
        return cityList;
    }
     public boolean addCity(City city) {
        return cityList.add(city);
    }
     public void updateCity(City city) {
        int index = cityList.indexOf(city);
        cityList.set(index, city);
    }
}
