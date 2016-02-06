import java.util.Queue;


public class Producer implements Runnable {
	
	private Queue<Integer> sharedQueu;
	private int maxSixe = 2;
	
	public Producer(Queue<Integer> queue){
		this.sharedQueu = queue;
	}
	@Override
	public synchronized void run() {
		for (int i = 1; i <= 10; i++) {
			//produce(i);
			System.out.println(i);
		}

	}
	private void produce(int i) {
		
		synchronized (sharedQueu) {
			while(sharedQueu.size() == 2){
				try {
					System.out.println("Queue is full, producer is waiting for consumer to consume");
					sharedQueu.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}
		
		synchronized (sharedQueu) {
			
				sharedQueu.add(i);
				System.out.println("Produce"+i);
				sharedQueu.notify();
				System.out.println();
			
		}
		
	}

}
