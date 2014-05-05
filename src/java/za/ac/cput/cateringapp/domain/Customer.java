/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.cateringapp.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author bongani
 */
@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String CustomerName;
    private String CustomerAddress;
    
 private Customer(Builder builder) {
       id = builder.id;
       CustomerName = builder. CustomerName;
       CustomerAddress = builder. CustomerAddress;
    
    }

    public Customer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      
        public static class Builder{
        private Long id;
        private String CustomerName;
        private String CustomerAddress;
                        
        public Builder id(Long value){
            this. id = value;
            return this;
        }
                
        public Builder CustomerName (String name) {
            this.CustomerName = name;
             return this;
        }
        
          public Builder CustomerAddress(String value) {
            this.CustomerAddress = value;
             return this;
        }
        
        public Customer build(){
            return new Customer(this);
        }
        
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
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
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.cput.cateringapp.domain.Customer[ id=" + id + " ]";
    }
    
}
