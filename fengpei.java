	class chen{}
	
	class a1 extends chen{}
	
	class a2 extends chen{}
public class fengpei {
	

	
	public static void tell(chen t){System.out.println("a");}
	public static void tell(a1 t){System.out.println("a1");}
	public static void tell(a2 t){System.out.println("a2");}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chen txt = new chen();
		chen txt1 = new a1();
		chen txt2 = new a2();
		tell(txt);
		tell(txt1);
		tell(txt2);
		a1 newa1 = new a1();
		tell(newa1);
		//重写时静态分配，分辨调用那个方法时依据静态变量（可以理解为在编译期间就写好的参数类型），而不是
		//实际变量（理解为运行时new的对象的类型）
	}

}
