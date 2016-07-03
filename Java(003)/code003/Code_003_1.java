class Test{
	public static void main(String[] args){
		String a[]=new String[2];
		a[0]=new String("it's Test2.");
	    System.out.println("hello\nit's Test");
		Test2.main(a);
	}
}
class Test2{
	public static void main(String[] a){
		if(a==null)return;
		System.out.println(a[0]);
	}
}