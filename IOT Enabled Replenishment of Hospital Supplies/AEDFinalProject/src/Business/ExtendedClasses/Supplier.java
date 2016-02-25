/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExtendedClasses;

/**
 *
 * @author Abhishek
 */
public class Supplier {
    
    private String SupplierName;
    private static int counter=1;
    private int supplierID;
    private SupplierMachineDir suppMachineList;

    public Supplier() {
    suppMachineList = new SupplierMachineDir();
    supplierID= counter;
    counter++;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public SupplierMachineDir getSuppMachineList() {
        return suppMachineList;
    }

    public void setSuppMachineList(SupplierMachineDir suppMachineList) {
        this.suppMachineList = suppMachineList;
    }

    @Override
    public String toString() {
        return SupplierName;
    }
    
    
    
    
    
    
    
    
    
}