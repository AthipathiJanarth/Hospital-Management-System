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
public class HouseDirectory {

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHospitalList(ArrayList<House> hosuseList) {
        this.houseList = houseList;
    }
     private ArrayList<House> houseList= new ArrayList<House>();
     public boolean addHouse(House house) {
        return houseList.add(house);
    }
     public void updateHouse(House house) {
        int index = houseList.indexOf(house);
        houseList.set(index, house);
    }
}
