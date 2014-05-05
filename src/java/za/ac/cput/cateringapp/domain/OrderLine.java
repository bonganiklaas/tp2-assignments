/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.cateringapp.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author bongani
 */
@Entity
public class OrderLine implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int orderId;
    private String quantity;
    private float price;
    
    
    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<Order> order;
    
    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "food_id")
    private List<Food> food;
    
    
     private OrderLine(Builder builder) {
        id= builder.id;
        orderId = builder.OrderId;
        quantity = builder.quantity;
        price = builder.price;
        order = builder.order;
        food = builder.food;
      
       }

    private OrderLine() {
    }
    

    public static class Builder {

        private Long id;
        private int OrderId;
        private String quantity;
        private float price;
        List<Food> food;
        List<Order> order;

        public Builder(String bonganiklaasgmailcom) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     
        public Builder id(Long value) {
            id = value;
            return this;
        }

        public Builder OrderId(int OrderId) {
            this.OrderId = OrderId;
            return this;
        }

        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder Price(float value) {
            this.price = value;
            return this;
        }

        public Builder food(List<Food> food) {
            this.food = food;
            return this;
        }

        public Builder order(List<Order> order) {
            this.order = order;
            return this;
        }
        public Builder Line(OrderLine orderline){
            id = orderline.getId();
            OrderId = orderline.getOrderId();
            quantity = orderline.getQuantity();
            price = orderline.getPrice();
            food = orderline.getFood();
            order = orderline.getOrder();
           
            return this;
            
        }
        
        public OrderLine build(){
            return new OrderLine(this);
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public List<Food> getFood() {
        return food;
    }

    public void setFood(List<Food> food) {
        this.food = food;
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderLine)) {
            return false;
        }
        OrderLine other = (OrderLine) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.cput.cateringapp.domain.OrderLine[ id=" + id + " ]";
    }
    
}
