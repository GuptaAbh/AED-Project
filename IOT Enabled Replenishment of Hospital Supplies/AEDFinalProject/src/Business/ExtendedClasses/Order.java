/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExtendedClasses;

import java.util.ArrayList;


public class Order {
    
    private  static int count=0;
    private int orderId;
    private ArrayList<OrderItem> orderItemList;
    private int OrderTotal;
    
    
    public Order()
    {
        count++;
        orderId = count;
        orderItemList = new ArrayList<OrderItem>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItemList;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItemList = orderItems;
    }

    public int getOrderTotal() {
        return OrderTotal;
    }

    public void setOrderTotal(int OrderTotal) {
        this.OrderTotal = OrderTotal;
    }
 
    public OrderItem addOrderItem(SupplierMachine p, int quantity,int salesprice)
    {
        OrderItem oi = new OrderItem();
        oi.setProduct(p);
        oi.setSalesPrice(salesprice);
        oi.setQuantity(quantity);
        orderItemList.add(oi);
        return oi;
    }
    
    
    public void removeOrderItem(OrderItem oi)
    {
        orderItemList.remove(oi);
    }
    
    
}
