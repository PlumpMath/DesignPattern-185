package creation.singleton.domains;

public class RequestHandler {

	private volatile static RequestHandler handler;
	private RequestHandler(){
		
	}
	
	public static RequestHandler getInstance(){
		
		System.out.println(Thread.currentThread().getName()+ ":=is checking");
		if(handler==null)
		{
			synchronized(RequestHandler.class){
				if(handler==null)
				{
				System.out.println(Thread.currentThread().getName()+ ":=created object");
				handler=new RequestHandler();
				}
			}
		}
		return handler;
	}
	
}
