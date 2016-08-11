/**
 * 
 */
package creation.singleton.apps;

import creation.singleton.domains.*;

/**
 * @author rnyati
 *
 */
public class SingletonClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*RequestHandler handler1 = RequestHandler.getInstance();
		System.out.println(handler1.hashCode());
		
		RequestHandler handler2 = RequestHandler.getInstance();
		System.out.println(handler2.hashCode());
		
		System.out.println(handler1.equals(handler2));
		*/
		
		Runnable runnable = new Runnable(){
			@Override
			public void run(){
				RequestHandler handler = RequestHandler.getInstance();
				System.out.println(Thread.currentThread().getName()+"  "+handler.hashCode());
			}
		};
		Thread th1 = new Thread(runnable,"Ash");
		Thread th2 = new Thread(runnable,"Bash");
		Thread th3 = new Thread(runnable,"Clash");
		th1.start();
		th2.start();
		th3.start();
	}

}
