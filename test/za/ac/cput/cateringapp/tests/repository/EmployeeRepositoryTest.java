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
import za.ac.cput.cateringapp.domain.Employee;
import za.ac.cput.cateringapp.repository.EmployeeRepository;

/**
 *
 * @author bongani
 */
public class EmployeeRepositoryTest {
       public static ApplicationContext ctx;
       private Long id;

    private EmployeeRepository repo;
    
    public EmployeeRepositoryTest() {
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
     public void Employee() 
     {
         repo = ctx.getBean(EmployeeRepository.class);
         Employee e;
           e = new Employee.Builder("bonganiklaas@gmail.com")
                   .name("B")
                   .address("Your Address")
                   .tel("Tel")
                   .build();
         repo.save(e);
         id = e.getId();
         Assert.assertNotNull(e);
              
     }
}
