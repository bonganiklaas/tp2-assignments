/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.cateringapp.repository;
import za.ac.cput.cateringapp.domain.Order;


/**
 *
 * @author bongani
 */
public interface OrderRepository extends repository <Order, Long>
{

    public void save(Order o);
    
}
