package basics;



public class BasicsCalculator {
	int a;
	int b;
	
	BasicsCalculator(){
		a = 0;
		b = 0;
	}
	BasicsCalculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int Multipliziere(int a, int b){
		int c = a*b;
		return c;
	}
	public int Dividiere(int a, int b){
		
		if(a != 0 && b!=0) {
			int c = a/b;
			return c;
		}else {
			System.out.println("Division durch 0");
			return 0;
		}
	}
	public int Addiere(int a, int b){		int c = a+b;
		return c;
	}
	public int Subbstrahiere(int a, int b){		
	int c = a-b;
	return c;
}
}
