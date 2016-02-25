/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExtendedClasses;

import java.util.Random;

/**
 *
 * @author Abhishek
 */
public class Sensor {
    private int sensorId;
    private String sensorVlaue;
    private String sensorName;
    private static int count=1;
    private int machineTemp;
    
    Random randomGenerator = new Random();

    public Sensor() {
    sensorId = randomGenerator.nextInt(100);
    
    }

    public int getMachineTemp() {
        return machineTemp;
    }

    public void setMachineTemp(int machineTemp) {
        this.machineTemp = machineTemp;
    }
    
    
    
    

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }
    

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorVlaue() {
        return sensorVlaue;
    }

    public void setSensorVlaue(String sensorVlaue) {
        this.sensorVlaue = sensorVlaue;
    }

    @Override
    public String toString() {
        return sensorName;
    }
    
    
    
}
