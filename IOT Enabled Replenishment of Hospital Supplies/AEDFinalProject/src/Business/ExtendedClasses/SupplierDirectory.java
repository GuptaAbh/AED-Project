/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExtendedClasses;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class SupplierDirectory {
    
    private ArrayList<Supplier> suppplierList;

    public SupplierDirectory() {
    
       suppplierList = new ArrayList<>();
    }
    
    public Supplier addSupplier()
    {
        Supplier s = new Supplier();
        suppplierList.add(s);
        return s;
    }
    public boolean IsSupplierPresent(String SupplierName)
    {
        for (Supplier s : suppplierList){
            if(s.getSupplierName().equalsIgnoreCase(SupplierName))
                return false;}
            
           return true;
    }

    public ArrayList<Supplier> getSuppplierList() {
        return suppplierList;
    }

    public void setSuppplierList(ArrayList<Supplier> suppplierList) {
        this.suppplierList = suppplierList;
    }

    
    
    
    
    
}
