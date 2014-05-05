/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.cateringapp.tests.repository;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.cateringapp.domain.Customer;
import za.ac.cput.cateringapp.repository.CustomerRepository;

/**
 *
 * @author bongani
 */
public class CustomerRepositoryTest {
      public static ApplicationContext ctx;
    private Long id;

    private CustomerRepository repo;
    
    public CustomerRepositoryTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
         ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
        
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
            repo = ctx.getBean(CustomerRepository.class);
            Customer cust = new Customer();
             cust.setCustomerName("Hello");
             repo.save(cust);
     
     
     
     
     }
}
