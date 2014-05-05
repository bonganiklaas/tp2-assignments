/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.cateringapp.services;

import java.util.List;
import za.ac.cput.cateringapp.domain.Order;

/**
 *
 * @author bongani
 */
public interface OrderServices extends Custome <Order, Long>
{

    public void merge(OrderServices entity);

    public void remove(OrderServices entity);

    public List<OrderServices> getEntitiesByProperName(String propertyName, String propertyValue);

    public OrderServices getByPropertyName(String propertyName, String propertyValue);

    public long count();

    public List<OrderServices> findInRange(int firstResult, int maxResults);

    public void persist(OrderServices entity);
    
}
