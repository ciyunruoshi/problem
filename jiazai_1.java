class Superclass {
	static{
		System.out.println("superclass init!");
	}
	//1.public static int value = 10;
	public static final int value = 10;
}

class subclass extends Superclass{
	static{
		System.out.println("subclass init��");
	}
}

public class jiazai_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		//System.out.println(Superclass.value);
	    //�����superclass init!
		//      10
		//   ������������ø���ľ�̬����ʱ���Ƕ������ʼ��
		System.out.println(Superclass.value);
	    //�����10
		//      û��super init!˵����δ�԰���final�ĳ���
		//		����ʵʩ��ʼ��������������Ǳ�����jiazai_1���
		//		�������е�
		//		�������ڱ���׶λ���������ĳ�������
		
	}

}
