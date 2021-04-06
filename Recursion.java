public class Recursividad{

	public static int sumaPares(int n){
		
		int primero = n%2 == 0?n:0;
		return n <= 2?primero:primero+sumaPares(n - 1);
	}

	public static void main(String[] args){
		System.out.println(sumaPares(7)); 
	
		}

}	 
