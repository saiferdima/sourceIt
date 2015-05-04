package CW10;

public class LattersCase {
	public static void main(String[] args) {
	
		StringBuilder  result = new StringBuilder();
		for(int i =0;i<args.length;i++){
		result=result.append(args[i]);
		}
		System.out.println(result);
		String sResult=result.toString().toLowerCase();
		
		System.out.println(sResult);
	}
}
