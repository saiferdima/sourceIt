package CW10;

public class Lesson10Sorting {
	
	public static void main(String[] args) {
		String s = args[0];
		
		StringBuilder  result = new StringBuilder();
		
		for(char c:s.toCharArray()){
			result.insert(0,c);
			
		}
		
		System.out.println(result);
				
		
		
	}

}
