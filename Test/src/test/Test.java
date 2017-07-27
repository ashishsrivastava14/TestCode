package test;

public abstract class Test {
	
	 public void m1();
	 
	public static void main(String args[]) {
		int i = 5;
		boolean t = true;
		float f = 2.3F;
		double d = 2.3;

	}

	void method() {}; 
}

public class Te {
	   public static void main(String args[]){
	      Java8Tester tester = new Java8Tester();
			
	      //with type declaration
	      MathOperation addition = (a, b) -> a + b;
	      
	     // System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      System.out.println("10 + 5 = " + addition.operation(10, 5));
	      
	   }
		
	   interface MathOperation {
	      int operation(int a, int b);
	   }
		
	}