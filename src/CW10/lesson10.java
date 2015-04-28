package CW10;

public class lesson10 {
	
	public static StringBuilder inputValue;

	public static void main(String[] args) {
		if (args.length<=1){
			
			System.out.println("error");
			return;
		}
		
		System.out.println(args);
		Integer a = 0;
		for (int i=0;i<args.length;i++){

			System.out.println(args[i]);
			a=a+Integer.parseInt(args[i]);

		}
		System.out.println(a);
	}
		
		
		


	




	}


