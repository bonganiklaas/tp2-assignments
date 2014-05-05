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
import za.ac.cput.cateringapp.domain.Food;
import za.ac.cput.cateringapp.repository.EmployeeRepository;
import za.ac.cput.cateringapp.repository.FoodRepository;
import static za.ac.cput.cateringapp.tests.repository.EmployeeRepositoryTest.ctx;

/**
 *
 * @author bongani
 */
public class FoodRepositoryTest {
       
    public static ApplicationContext ctx;
    private Long id;
    private FoodRepository repo;
    private Object Food;
    
    public FoodRepositoryTest() {
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
      repo = ctx.getBean(FoodRepository.class);
         Food f;
           f = new Food.Builder("bonganiklaas@gmail.com")
                   .name("B")
                   .foodType("Your Address")
                  // .price("price")
                   .build();
         repo.save(f);
         id = f.getId();
         Assert.assertNotNull(f);
       
    }
}
