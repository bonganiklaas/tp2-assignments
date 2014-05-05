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
import za.ac.cput.cateringapp.domain.OrderLine;
import za.ac.cput.cateringapp.repository.FoodRepository;
import za.ac.cput.cateringapp.services.OrderLineServices;
import static za.ac.cput.cateringapp.tests.repository.FoodRepositoryTest.ctx;

/**
 *
 * @author bongani
 */
public class OrderLineServicesTest {
      public static ApplicationContext ctx;
    private Long id;
    private OrderLineServices repo;

    
    public OrderLineServicesTest() {
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
        repo = ctx.getBean(OrderLineServices.class);
       OrderLine l;
           l = new OrderLine.Builder("bonganiklaas@gmail.com")
                   .quantity("quanity");
                   .build();
         repo.save(l);
         id = l.getId();
         Assert.assertNotNull(l);  
     }
}
