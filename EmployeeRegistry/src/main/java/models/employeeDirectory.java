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
public class employeeDirectory {
    
    private ArrayList<employeeDetails> employeeList;
    
    public boolean addEmployee(employeeDetails employee) {
        return employeeList.add(employee);
    }
    public void deleteEmployee(int index) {
         employeeList.remove(index);
    }
    
    public employeeDirectory() {
        employeeList = new ArrayList<employeeDetails>();
    }

    public ArrayList<employeeDetails> getEmployeeList() {
        return employeeList;
    }   
}
