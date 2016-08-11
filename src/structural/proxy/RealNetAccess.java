package structural.proxy;

import java.util.logging.Logger;

public class RealNetAccess implements NetAccess {

	private int empGrade;
	Logger log = Logger.getLogger(this.getClass().getName());
	
	@Override
	public void grantPermission() {
		
		log.info("Grant Permission");
		log.info("Open the Browser and start");
	}

	@Override
	public void setEmpGrade(int empGrade) {
		
		this.empGrade =  empGrade;

	}

}
