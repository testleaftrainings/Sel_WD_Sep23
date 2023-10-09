package week3.day1;

public class Execution {

	public static void main(String[] args) {
		
	//	RBI rb=new RBI();
		//cannot create object for an interface
		
		RBI rb=new SBI(); //abstraction
		rb.getKYDoc();
		
		
		SBI sb=new SBI();
		
		
		RBI r=new AXIS();
		r.getKYDoc();
		r.getROI();
		r.cibilScore();
		
		AXIS a=new AXIS();
		a.festiveOffers();
		a.getKYDoc();
		a.getROI();
		a.openTerrace();
		a.builtHouse();
	  
		
		//TopUpLoan ob=new TopUpLoan();
		
		
	}

}
