package designpatterns.creational.prototype;

import java.util.List;

public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Departments departments = new Departments();
		departments.loadData();
		
		//Use the clone method to get the Departments object
		Departments departments2 = (Departments) departments.clone();
		Departments departments3 = (Departments) departments.clone();
		List<String> list = departments2.getDepartmentsList();
		list.add("PM");
		List<String> list1 = departments3.getDepartmentsList();
		list1.remove("QA");
		
		System.out.println("Departments list: "+departments.getDepartmentsList());
		System.out.println("New Departments list add new: "+list);
		System.out.println("New Departments list remove one: "+list1);
	}
}
