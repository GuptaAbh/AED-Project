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
public class ProcurementProductCatlog {
    
    private ArrayList<ProcurementProduct> procurementProductList;

    public ProcurementProductCatlog() {
        
        procurementProductList = new ArrayList<>();
    }

    public ArrayList<ProcurementProduct> getProcurementProductList() {
        return procurementProductList;
    }

    public void setProcurementProductList(ArrayList<ProcurementProduct> procurementProductList) {
        this.procurementProductList = procurementProductList;
    }
    
    public ProcurementProduct addProduct(){
        ProcurementProduct p = new ProcurementProduct();
        procurementProductList.add(p);
        return p;
    }
    
    
    
    
}
