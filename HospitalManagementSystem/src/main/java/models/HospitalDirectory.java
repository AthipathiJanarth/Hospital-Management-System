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
public class HospitalDirectory {

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }
    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
     private ArrayList<Hospital> hospitalList;

    public HospitalDirectory() {
        this.hospitalList = new ArrayList<Hospital>();
    }
     
      public boolean addHospital(Hospital hospital) {
        return hospitalList.add(hospital);
    }
     public void updateHospital(Hospital hospital) {
        int index = hospitalList.indexOf(hospital);
        hospitalList.set(index, hospital);
    }

}
