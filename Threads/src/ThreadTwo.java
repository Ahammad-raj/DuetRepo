
public class ThreadTwo extends Thread {

	
CommonForThreads common =null;
	
	public ThreadTwo(CommonForThreads common){
		this.common = common;
	}
	@Override
	public void run() {
		common.method2();
		
	}
}
