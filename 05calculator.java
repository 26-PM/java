// Calculator using inputs from command prompt:

public class calculator{
	public static void main(String[] args){
		int sum = Integer.parseInt(args[0])+Integer.parseInt(args[1]);
		int sub = Integer.parseInt(args[0])-Integer.parseInt(args[1]);
		int mul = Integer.parseInt(args[0])*Integer.parseInt(args[1]);
		int div = Integer.parseInt(args[0])/Integer.parseInt(args[1]);	
		System.out.println("Sum is -> "+sum);
		System.out.println("Subtraction -> "+sub);
		System.out.println("Multiplication -> "+mul);
		System.out.println("Division -> "+div);		
	}
}

