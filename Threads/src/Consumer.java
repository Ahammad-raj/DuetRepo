import java.util.Queue;


public class Consumer implements Runnable {
	
	
	private Queue<Integer> sharedQueu;
	
	public Consumer(Queue<Integer> queue){
		this.sharedQueu = queue;
	}
	@Override
	public void run() {
		
		while(true){
			consume();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			

	}
	private void consume() {
		
		synchronized (sharedQueu) {
			while(sharedQueu.isEmpty()){
				try {
					System.out.println("Consumer thread is waithing for producer to produce the items");
					sharedQueu.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}
		
		synchronized (sharedQueu) {
			
			if(!sharedQueu.isEmpty()){
				System.out.println("Consume:"+sharedQueu.poll());
				sharedQueu.notify();
			}
		}
	}

}
