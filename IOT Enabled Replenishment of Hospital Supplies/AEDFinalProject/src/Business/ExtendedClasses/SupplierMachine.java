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
public class SupplierMachine {
    
    private int machineID;
    private String machineName;
    private int quantity;
    private int machinePrice;
    private static int counter=1;
    private String MachinePurpose;
    private int totalQuantitySold;
    Random randomGenerator = new Random();

    public SupplierMachine() {
        int counter = randomGenerator.nextInt(100);
        machineID = counter;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalQuantitySold() {
        return totalQuantitySold;
    }

    public void setTotalQuantitySold(int totalQuantitySold) {
        this.totalQuantitySold = totalQuantitySold;
    }

    
    
    public int getMachinePrice() {
        return machinePrice;
    }

    public void setMachinePrice(int machinePrice) {
        this.machinePrice = machinePrice;
    }

    
    public int getMachineID() {
        return machineID;
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

    public String getMachinePurpose() {
        return MachinePurpose;
    }

    public void setMachinePurpose(String MachinePurpose) {
        this.MachinePurpose = MachinePurpose;
    }

    
    @Override
    public String toString() {
        return machineName;
    }
    
    
    
    
    
    
}
