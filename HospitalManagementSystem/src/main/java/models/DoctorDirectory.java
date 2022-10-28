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

    public boolean addDoctor(Doctor doctor) {
        defaultdoctorID++;
        return doctorList.add(doctor);
    }

    public Doctor getDoctor(int id) {
        Doctor doctor = new Doctor();
        for (Doctor doc : this.doctorList) {
            if (doc.getPersonID() == id) {
                doctor = doc;
            }
        }
        return doctor;
    }

    public void updatePatient(Doctor old, Doctor newDoctor) {
        int index = doctorList.indexOf(old);
        System.out.println(index);
        doctorList.set(index, newDoctor);
    }
    public void removeDoctor(Doctor d) {
        doctorList.remove(d);
    }
}
