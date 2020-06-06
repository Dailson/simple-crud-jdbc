/**
 * 
 */
package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

/**
 * ProgramDepartment
 *
 * @author dailson
 *
 */
public class ProgramDepartment {
	public static void main(String[] args) {
		
		
		
		System.out.println("=== TEST 01: Department findById ===");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = departmentDao.findById(4);
		System.out.println(dep);
		
		
		System.out.println("\n=== TEST 02: Department findAll ===");
		List<Department>list = departmentDao.findAll();
		for(Department depOnList : list) {
			System.out.println(depOnList);
		}
	}
}
