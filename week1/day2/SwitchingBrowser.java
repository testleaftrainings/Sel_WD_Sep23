package week1.day2;

public class SwitchingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * break is a jump statement that used to terminate your
		 * flow of execution
		 * 
		 * 
		 * 
		 */
		String browser = "IE";
		
		switch(browser) {
		
		case "Edge":
			System.out.println("launch Edge browser");
			break;
		
		case "Firefox":
			System.out.println("Launch Firefox browser");
			break;
			
		case "Chrome":
			System.out.println("Launch Chrome browser");
			break;
			
		case "Safari":
			System.out.println("Launch Safari browser");
			break;
		
		default:
			 System.out.println("Launch the default browser");
		
		}
		//System.out.println("This is cross browser testing");

	}

}
