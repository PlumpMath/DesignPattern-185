package structural.proxy.apps;
import structural.proxy.*;

public class ProxyClient {

	public static void print(NetAccess obj)
	{
		obj.grantPermission();
		
	}
	public static void main(String[] args) {
	
		NetAccess proxy = new  ProxyNetAccess();
		
		//proxy is used to represent the Real Subject
		
		proxy.setEmpGrade(3);
		
		print(proxy);
	}

}
