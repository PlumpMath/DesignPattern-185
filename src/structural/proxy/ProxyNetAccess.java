package structural.proxy;
import java.util.*;
import java.util.logging.Logger;

public class ProxyNetAccess implements NetAccess {

	private int empGrade;
	private NetAccess real;
	Logger log = Logger.getLogger(this.getClass().getName());
	
	@Override
	public void grantPermission() {
		//Stimulating controlled access
		if(empGrade>5)
		{
			real = new RealNetAccess();
			real.grantPermission();
		}
		else
		{
			log.warning("Not Authorized to access");
		}

	}

	@Override
	public void setEmpGrade(int empGrade) {
	this.empGrade = empGrade;	

	}

}
