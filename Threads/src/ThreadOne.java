
public class ThreadOne extends Thread {
	
	CommonForThreads common =null;
	
	public ThreadOne(CommonForThreads common){
		this.common = common;
	}
	@Override
	public void run() {
		common.method1();
		System.out.println("hi");
		System.out.println("Fix version");
		
		System.out.println("local branch to merge");
		System.out.println("local Changes in master");
		System.out.println("something");
		System.out.println("local");
		System.out.println("here we go");
		System.out.println("Master");
	}
}
