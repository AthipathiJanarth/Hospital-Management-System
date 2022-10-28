/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author athipathi
 */
public class VitalSigns {

    
    private float temperature;
    private int pulse;
    private int respirationRate;
    private String bloodPressure;
    
    public boolean createVitalSigns(float temperature, int pulse, int respirationRate, String bloodPressure) {
        this.temperature = temperature;
        this.pulse = pulse;
        this.respirationRate = respirationRate;
        this.bloodPressure = bloodPressure;
        return true;
    }
    public void updateVitalSigns(float temperature, int pulse, int respirationRate, String bloodPressure) {
        this.temperature = temperature;
        this.pulse = pulse;
        this.respirationRate = respirationRate;
        this.bloodPressure = bloodPressure;
    }
    public float getTemperature() {
        return temperature;
    }

    public int getPulse() {
        return pulse;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    
}
