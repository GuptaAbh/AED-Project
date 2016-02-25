/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExtendedClasses;

public class OrderItem {
    
private SupplierMachine product;
private int quantity;
private int salesPrice;

    public SupplierMachine getProduct() {
        return product;
    }

    public void setProduct(SupplierMachine product) {
        this.product = product;
    }

    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Override
    public String toString() {
        return  product.getMachineName();
    }


    
}
