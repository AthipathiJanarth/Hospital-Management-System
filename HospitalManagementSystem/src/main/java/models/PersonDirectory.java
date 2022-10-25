/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import static ui.MainJFrame.defaultpersonID;

/**
 *
 * @author athipathi
 */
public class PersonDirectory {

    public PersonDirectory() {
        this.personList = new ArrayList<Person>();
    }

    private ArrayList<Person> personList;
  
    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    public boolean addPerson(Person person){
        defaultpersonID++;
        return personList.add(person);
    }
}
