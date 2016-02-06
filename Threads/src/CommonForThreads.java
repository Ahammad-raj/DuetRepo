
public class CommonForThreads {
	
	public  final String s;
	CommonForThreads(String s){
		this.s =s;
	}
	
	public synchronized void method1() {
		final String nam;
		for (int i = 0; i < 10; i++) {
			System.out.println("in method1");
		}

	}
	

	public void method2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("in method2");
		}

	}
}
