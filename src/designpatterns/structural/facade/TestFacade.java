package designpatterns.structural.facade;

public class TestFacade {

	public static void main(String[] args) {
		String tableName="user";
		
		//generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.HTML, tableName);
		HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, tableName);
	}
}
