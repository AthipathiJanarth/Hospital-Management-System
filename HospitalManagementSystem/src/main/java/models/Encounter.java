/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.Date;
/**
 *
 * @author athipathi
 */
public class Encounter {

    public int getEncounterID() {
        return encounterID;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public boolean createEncounter(int encounterID, Date visitDate, Patient patient, Doctor doctor, VitalSigns vitalSigns) {
        this.encounterID = encounterID;
        this.visitDate = visitDate;
        this.patient = patient;
        this.doctor = doctor;
        this.vitalSigns = vitalSigns;
        return true;
    }
    public boolean updateEncounter(int encounterID,Date visitDate, Patient patient, Doctor doctor, VitalSigns vitalSigns) {
        this.encounterID = encounterID;
        this.visitDate = visitDate;
        this.patient = patient;
        this.doctor = doctor;
        this.vitalSigns = vitalSigns;
        return true;
    }
    private int encounterID;
    private Date visitDate;
    private Patient patient;
    private Doctor doctor;
    private VitalSigns vitalSigns;    
}
