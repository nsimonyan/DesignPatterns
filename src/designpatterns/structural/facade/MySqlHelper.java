package designpatterns.structural.facade;

import java.sql.Connection;

public class MySqlHelper {
	
	public static Connection getMySqlDBConnection(){
		//TODO get MySql DB connection using connection parameters
		return null;
	}
	
	public void generateMySqlPDFReport(String tableName, Connection con){
		//TODO get data from table and generate pdf report
	}
	
	public void generateMySqlHTMLReport(String tableName, Connection con){
		//TODO get data from table and generate pdf report
	}
}