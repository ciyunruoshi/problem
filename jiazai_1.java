class Superclass {
	static{
		System.out.println("superclass init!");
	}
	//1.public static int value = 10;
	public static final int value = 10;
}

class subclass extends Superclass{
	static{
		System.out.println("subclass init！");
	}
}

public class jiazai_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		//System.out.println(Superclass.value);
	    //输出：superclass init!
		//      10
		//   即利用子类调用父类的静态变量时不是对子类初始化
		System.out.println(Superclass.value);
	    //输出：10
		//      没有super init!说明并未对包含final的常量
		//		的类实施初始化，而这个常量是保存在jiazai_1类的
		//		常量池中的
		//		即常量在编译阶段会存入调用类的常量池中
		
	}

}
