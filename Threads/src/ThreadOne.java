
public class ThreadOne extends Thread {
	
	CommonForThreads common =null;
	
	public ThreadOne(CommonForThreads common){
		this.common = common;
	}
	@Override
	public void run() {
		common.method1();
		System.out.println("Fix version");
	}
}
