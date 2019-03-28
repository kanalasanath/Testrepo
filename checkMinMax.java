public class checkMinMax(){

	public static void main(String args[]){

		int a=30;
		int b= 10;
		int c =minFunction(a,b);
		System.out.println("min value" + c);
	}
	

	public static int minFunction(int a, int b){

		int min;
		
		if(a>b){
			min =b;
		}
		else
			min =a;

	}
}	
