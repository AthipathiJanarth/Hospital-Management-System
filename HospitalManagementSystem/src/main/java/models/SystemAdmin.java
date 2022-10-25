/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author athipathi
 */
public class SystemAdmin {
    private int UserID;

    public int getUserID() {
        return UserID;
    }

    public String getPassword() {
        return password;
    }
    private String password;

    public SystemAdmin(int UserID, String password) {
        this.UserID = UserID;
        this.password = password;
    }
}
