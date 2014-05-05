/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.cateringapp.repository;

import za.ac.cput.cateringapp.domain.Employee;
import za.ac.cput.cateringapp.domain.Food;


/**
 *
 * @author bongani
 */
public interface EmployeeRepository extends repository <Employee, Long>
{

    public void save(Employee e);

    
}
