package base;

public class Learnthrow {
	
	public static void add(int a,int b)  {
		
		if(a>b) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {				
				System.out.println(e);
			}
			int z=a/b;
			System.out.println("The output is  " +z);
		}else {
			throw new ArithmeticException("The value of a should be greater b");
		}
		
	}	

	public static void main(String[] args)  {
		add(225,15);

	}

}
