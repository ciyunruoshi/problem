import java.util.Queue;
import java.util.concurrent.*;
public class completionservice extends Thread {
	
	static BlockingQueue<String> queue = new LinkedBlockingQueue<>();
	
	public static void main(String[] args) throws InterruptedException {
		completionservice newc = new completionservice();
		newc.start();
		String temp ;
		int j =0;
		while(j<=10){
			temp = queue.take();
			j++;
			System.out.println("这是take的： "+temp);
		}
		newc.interrupt();
		temp = queue.take();
		System.out.println("这是take的： "+temp);
	}

	@Override
	public void run() {
		int i=0;
		
			try {
				while(true){
				queue.put("第"+i+"个");
				
				System.out.println("这是put的： "+"第"+i+"个");
				i++;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				try {
					System.out.println("这是take的： "+queue.take());
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("put函数返回了中断异常");
			}
			
	}
//	这是take的： 第0个
//	这是put的： 第0个
//	这是put的： 第1个
//	这是take的： 第1个
//	这是put的： 第2个
//	这是take的： 第2个
//	这是put的： 第3个
//	这是take的： 第3个
//	这是put的： 第4个
//	这是take的： 第4个
//	这是put的： 第5个
//	这是take的： 第5个
//	这是put的： 第6个
//	这是take的： 第6个
//	这是put的： 第7个
//	这是take的： 第7个
//	这是put的： 第8个
//	这是take的： 第8个
//	这是put的： 第9个
//	这是take的： 第9个
//	这是put的： 第10个
//	这是put的： 第11个
//	这是put的： 第12个
//	这是take的： 第10个
//	这是put的： 第13个
//	这是take的： 第11个
//	java.lang.InterruptedException
//		at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireInterruptibly(AbstractQueuedSynchro
//	nizer.java:1220)
//		at java.util.concurrent.locks.ReentrantLock.lockInterruptibly(ReentrantLock.java:335)
//		at java.util.concurrent.LinkedBlockingQueue.put(LinkedBlockingQueue.java:339)
//		at completionservice.run(completionservice.java:28)
//	这是take的： 第12个
//	put函数返回了中断异常
	
	
	
	
	
	
}
