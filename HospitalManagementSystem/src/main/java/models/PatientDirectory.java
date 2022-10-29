 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import static ui.MainJFrame.defaultpatientID;
/**
 *
 * @author athipathi
 */
public class PatientDirectory {

    public PatientDirectory() {
        this.patientList = new ArrayList<Patient>();
    }
    private ArrayList<Patient> patientList;

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    public boolean addPatient(Patient patient){
        defaultpatientID++;
        return patientList.add(patient);
    }
    public Patient getPatient(int id){
        Patient patient= new Patient();
        for(Patient pt: this.patientList) { 
            if(pt.getPersonID()==id) { 
                patient=pt;
            }
            }
        return patient;
    }
    public void updatePatient(Patient old,Patient newPatient){
    int index=patientList.indexOf(old);
    System.out.println(index);
    patientList.set(index,newPatient);
    }

    public void removePatient(Patient pt) {
        patientList.remove(pt);
    }
}
