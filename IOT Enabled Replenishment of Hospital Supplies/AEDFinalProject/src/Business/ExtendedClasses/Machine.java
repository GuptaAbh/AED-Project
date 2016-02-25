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
public class Machine {
    private int machineID;
    private String machineName;
    private String machineDetails;
    private Sensor sensorData;
    private String MachinePurpose;
    private boolean isMachineActive=true;
    private static int counter=1;
    Random randomGenerator = new Random();
    private boolean  isRequestSent = false;

    public Machine() {
    
    sensorData = new Sensor();
    int counter = randomGenerator.nextInt(100);
    machineID = counter;
    }

    public boolean isIsMachineActive() {
        return isMachineActive;
    }

    public void setIsMachineActive(boolean isMachineActive) {
        this.isMachineActive = isMachineActive;
    }

    
    public String getMachinePurpose() {
        return MachinePurpose;
    }

    public void setMachinePurpose(String MachinePurpose) {
        this.MachinePurpose = MachinePurpose;
    }

    
    
    public int getMachineID() {
        return machineID;
    }

    public boolean isIsRequestSent() {
        return isRequestSent;
    }

    public void setIsRequestSent(boolean isRequestSent) {
        this.isRequestSent = isRequestSent;
    }

    
    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getMachineDetails() {
        return machineDetails;
    }

    public void setMachineDetails(String machineDetails) {
        this.machineDetails = machineDetails;
    }

    public Sensor getSensorData() {
        return sensorData;
    }

    public void setSensorData(Sensor sensorData) {
        this.sensorData = sensorData;
    }

    

    @Override
    public String toString() {
        return machineName;
    }
    
    
    
    
}
