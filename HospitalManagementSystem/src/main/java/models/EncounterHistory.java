/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import static ui.MainJFrame.defaultencounterID;

/**
 *
 * @author athipathi
 */
public class EncounterHistory {

    public EncounterHistory() {
        this.encounterHistory = new ArrayList<Encounter>();
    }
    private ArrayList<Encounter> encounterHistory;

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    public boolean addEncounter(Encounter encounter){
        defaultencounterID++;
        return encounterHistory.add(encounter);
    }
    public boolean selectEncounter(Encounter encounter){
        return encounterHistory.add(encounter);
    }
    public void updateEncounter(Encounter oldencounter,Encounter newencounter){
    int index=encounterHistory.indexOf(oldencounter);
    System.out.println(index);
    encounterHistory.set(index,newencounter);
    }
}
