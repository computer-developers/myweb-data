class Test{
	public static void main(String arg[]){
		Test2 a2,b2,c2;
		Test3 a3,b3;
		a2=new Test2();
		b2=new Test2();
		a3=new Test3();
		b3=a3;
		System.out.println(a2==b2);			//false
		System.out.println(a2.equals(b2));	//false
	 	System.out.println(a2==c2);			//error
		System.out.println(a2.equals(c2));	//error
		System.out.println(c2.equals(a2));	//error
		System.out.println(a2==a3);			//error
		System.out.println(a2.equals(a3));	//false
		System.out.println(a3==b3);			//true
		System.out.println(a3.equals(b3));	//true
	}
}
class Test2{
	int a=45;
	double b=12;
}
class Test3{
	short c=63;
	char d='h';
}