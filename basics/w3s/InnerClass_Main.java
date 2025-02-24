package w3s;

import w3s.InnerClass_Outer.InnerClass_Inner_c;

public class InnerClass_Main {

	public static void main(String[] args) {
		InnerClass_Outer.InnerClass_Inner myInner = new InnerClass_Outer.InnerClass_Inner();
		System.out.println(myInner.y);
		
		
		InnerClass_Outer myOuter = new InnerClass_Outer();
		InnerClass_Outer.InnerClass_Inner_c myInner2 = myOuter.new InnerClass_Inner_c();
		System.out.println(myInner2.y);
		
//		InnerClass_Outer myOuter1 = new InnerClass_Outer();
//		InnerClass_Outer.InnerClass_Inner_p myInner2 = myOuter.new InnerClass_Inner_p();
//	    System.out.println(myInner.y + myOuter.x);
//		
		
	}
}
