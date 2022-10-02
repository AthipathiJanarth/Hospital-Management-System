/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import static ui.MainJFrame.defaultemployeeID;

/**
 *
 * @author athipathi
 */
public class employeeDirectory {
    
    private ArrayList<employeeDetails> employeeList;
    
    public boolean addEmployee(employeeDetails employee) {
        defaultemployeeID++;
        return employeeList.add(employee);
    }
    public void deleteEmployee(int empid) {
        int index=0;
        for(int i = 0;i < employeeList.size() ;i++){
            System.out.println(empid);
            if(employeeList.get(i).getEmployeeID() == empid) {
                index=i;
            }
        }
         employeeList.remove(index);
    }
    
    public employeeDirectory() {
        employeeList = new ArrayList<employeeDetails>();
    }

    public ArrayList<employeeDetails> getEmployeeList() {
        return employeeList;
    }
    public void updateEmployee(employeeDetails employee){
    for(employeeDetails emp : employeeList) {
        System.out.println(employee.getEmployeeID());
    if(emp!=null && employee.getEmployeeID() == emp.getEmployeeID()) {
        emp.updateEmployeeDetails(employee.getName(), employee.getLevel(), employee.getTeamInfo(), employee.getPositionTitle());
        contactInfo contact =new contactInfo();
        contact.setContactDetails(employee.getContact().getPhoneNumber(), employee.getContact().getEmailID());
        emp.setContact(contact);
        break;
    }
    }
    }
}
