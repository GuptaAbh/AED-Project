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
public class ProcurementProduct {
    
    private String productNName;
    private int ProductPrice;
    private int ProductNumber;
    private int ProductAvail;
    private static int count =0;

    public ProcurementProduct() {
    count ++;
    ProductNumber = count;
    }

    @Override
    public String toString() {
        return  productNName ;
    }

    public String getProductNName() {
        return productNName;
    }

    public void setProductNName(String productNName) {
        this.productNName = productNName;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public int getProductAvail() {
        return ProductAvail;
    }

    public void setProductAvail(int ProductAvail) {
        this.ProductAvail = ProductAvail;
    }
    
    
    
    
    
    
    
}
