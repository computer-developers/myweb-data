class Test{
	public static void main(String[] args){
		String a[]=new String[1];
		a[0]=new String("it's Test2.");
	    System.out.println("hello\nit's Test");
		Test2.main(a);
	}
}
class Test2{
	public static void main(String[] a){
		System.out.println(a[0]);
	}
}