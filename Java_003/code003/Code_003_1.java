class Test{
	public static void main(String[] args){
		String a[]={"it's Test2"};
	    System.out.println("hello\nit's Test");
		Test2.main(a);
	}
}
class Test2{
	public static void main(String[] a){
		System.out.println(a[0]);
	}
}