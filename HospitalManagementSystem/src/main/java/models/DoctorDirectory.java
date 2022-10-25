/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import static ui.MainJFrame.defaultdoctorID;

/**
 *
 * @author athipathi
 */
public class DoctorDirectory {

    public DoctorDirectory() {
        this.doctorList = new ArrayList<Doctor>();
    }
     private ArrayList<Doctor> doctorList;

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    public boolean addDoctor(Doctor doctor){
        defaultdoctorID++;
        return doctorList.add(doctor);
    }

}
