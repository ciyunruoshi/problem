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
		//��дʱ��̬���䣬�ֱ�����Ǹ�����ʱ���ݾ�̬�������������Ϊ�ڱ����ڼ��д�õĲ������ͣ���������
		//ʵ�ʱ��������Ϊ����ʱnew�Ķ�������ͣ�
	}

}
