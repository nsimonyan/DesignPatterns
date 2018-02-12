package designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Departments implements Cloneable{


	private List<String> departmentsList;
	
	public Departments(){
		departmentsList = new ArrayList<String>();
	}
	
	public Departments(List<String> list){
		this.departmentsList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		departmentsList.add("Development");
		departmentsList.add("QA");
	}
	
	public List<String> getDepartmentsList() {
		return departmentsList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getDepartmentsList()){
				temp.add(s);
			}
			return new Departments(temp);
	}

}
