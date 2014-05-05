/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.cateringapp.services;

import za.ac.cput.cateringapp.domain.OrderLine;

/**
 *
 * @author bongani
 */
public interface OrderLineServices extends Custome <OrderLine,Long>
{

    public void save(OrderLine l);

    public static class Builder {

        public Builder(String bonganiklaasgmailcom) {
        }
    }

    
}
