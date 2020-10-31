package lab_assignment_5.q3;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;


class Producer implements Runnable {

	private BlockingQueue<Integer> sharedResource;
	
	public Producer(BlockingDeque<Integer> sharedResource) {
		this.sharedResource = sharedResource;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				System.out.println("produce: "+i);
				sharedResource.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

class Consumer implements Runnable {
	
	private BlockingQueue<Integer> sharedResource;

	public Consumer(BlockingQueue<Integer> sharedResource) {
		this.sharedResource = sharedResource;
	}

	@Override
	public void run() {
		while(true) {
			try {
				int item = sharedResource.take();
				System.out.println("consume: "+ item);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
public class ProducerConsumerTester {
	
	public static void main(String[] args) {
		
		BlockingDeque<Integer> sharedQueue = new LinkedBlockingDeque<>(20);
		
		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		
		Thread thread1 = new Thread(producer);
		Thread thread2 = new Thread(consumer);
		
		thread1.start();
		thread2.start();
		
	}

}
