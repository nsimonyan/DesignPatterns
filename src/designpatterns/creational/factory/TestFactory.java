package designpatterns.creational.factory;

public class TestFactory {

	public static void main(String[] args) {
		Monitor tr = MonitorFactory.getMonitor("TRANSACTION", "testTransaction", "TR");
		Monitor fpl = MonitorFactory.getMonitor("FPL", "testFPL", "FPL");
		System.out.println("Factory Transaction Config::"+tr);
		System.out.println("Factory FPL Config::"+fpl);
	}
}
