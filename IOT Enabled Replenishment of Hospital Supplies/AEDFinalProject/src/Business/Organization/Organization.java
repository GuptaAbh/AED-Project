/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.ExtendedClasses.MachineDirectory;
import Business.ExtendedClasses.MasterOrderCatalog;
import Business.ExtendedClasses.Order;
import Business.ExtendedClasses.ProcurementProductCatlog;

import Business.ExtendedClasses.SupplierDirectory;
import Business.ExtendedClasses.SupplierMachineDir;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Abhishek
 */
public abstract class Organization {
    
    private String name;
    
    private int organizationID;
    private static int counter=1;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    private MachineDirectory machineDirectory;
    private WorkQueue workQueue;
    private SupplierDirectory supplierDirectory;
    private SupplierMachineDir supplierMachineDir;
    Random randomGenerator = new Random();
    private MasterOrderCatalog moc;
    private ProcurementProductCatlog ppc;
    

    public Organization(String name) {
        this.name = name;
        supplierDirectory = new SupplierDirectory();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        machineDirectory = new MachineDirectory();
        supplierMachineDir = new SupplierMachineDir();
        workQueue = new WorkQueue();
         int counter = randomGenerator.nextInt(100);
        organizationID = counter;
        moc = new  MasterOrderCatalog();
        ppc = new ProcurementProductCatlog();
        
       // ++counter;
    }

    public ProcurementProductCatlog getPpc() {
        return ppc;
    }

    public void setPpc(ProcurementProductCatlog ppc) {
        this.ppc = ppc;
    }

    
    
    
    
    
    //note a single Random object is reused here
    public enum Type{
        Admin("Admin Organization"), Department("Department Organization"), 
        Procurement("Procurement Organization"), Finance("Finance Organization"),
        Delivery("Delivery Organization"),Supplier("Supplier Organization"),
        Servicing("Servicing Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public SupplierMachineDir getSupplierMachineDir() {
        return supplierMachineDir;
    }

    public void setSupplierMachineDir(SupplierMachineDir supplierMachineDir) {
        this.supplierMachineDir = supplierMachineDir;
    }
    
    
    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }
    
    
    

    public abstract ArrayList<Role> getSupportedRole();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public MachineDirectory getMachineDirectory() {
        return machineDirectory;
    }

    public void setMachineDirectory(MachineDirectory machineDirectory) {
        this.machineDirectory = machineDirectory;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }

    public MasterOrderCatalog getMoc() {
        return moc;
    }

    public void setMoc(MasterOrderCatalog moc) {
        this.moc = moc;
    }
    
    
    
    
    
}
