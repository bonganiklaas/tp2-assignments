/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.cateringapp.services.Crud.Impl;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import za.ac.cput.cateringapp.services.Custome;

/**
 *
 * @author bongani
 */
public class CustomerImplTest {
    
    public CustomerImplTest() {
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

    /**
     * Test of find method, of class CustomerImpl.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Long id = null;
        CustomerImpl instance = new CustomerImpl();
        Custome expResult = null;
        Custome result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persist method, of class CustomerImpl.
     */
    @Test
    public void testPersist() {
        System.out.println("persist");
        Custome entity = null;
        CustomerImpl instance = new CustomerImpl();
        Custome expResult = null;
        Custome result = instance.persist(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of merge method, of class CustomerImpl.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        Custome entity = null;
        CustomerImpl instance = new CustomerImpl();
        Custome expResult = null;
        Custome result = instance.merge(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class CustomerImpl.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Custome entity = null;
        CustomerImpl instance = new CustomerImpl();
        instance.remove(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class CustomerImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        CustomerImpl instance = new CustomerImpl();
        List<Custome> expResult = null;
        List<Custome> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
