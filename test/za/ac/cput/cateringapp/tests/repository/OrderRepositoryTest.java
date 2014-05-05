/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.cateringapp.tests.repository;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import za.ac.cput.cateringapp.domain.Food;
import za.ac.cput.cateringapp.domain.Order;
import za.ac.cput.cateringapp.repository.FoodRepository;
import za.ac.cput.cateringapp.repository.OrderRepository;
import static za.ac.cput.cateringapp.tests.repository.FoodRepositoryTest.ctx;

/**
 *
 * @author bongani
 */
public class OrderRepositoryTest {
        public static ApplicationContext ctx;
    private Long id;
    private OrderRepository repo;
  
    
    public OrderRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() 
    {
               repo = ctx.getBean(OrderRepository.class);
         Order o;
           o = new Order.Builder("bonganiklaas@gmail.com")
                  .orderDate("05.05.2014")
                  .Total("totalPrice")
                   .build();
         repo.save(o);
         id = o.getId();
         Assert.assertNotNull(o);
        
    }
}
