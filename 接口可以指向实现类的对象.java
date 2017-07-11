

interface test{
	public void print();
	
}

class testtask implements test{
	public void print(){
		System.out.println("task publish!");
	}
}
public class interfacetest {

	public static void main(String[] args) {
		testtask temp = new testtask();
		test point = temp;
		point.print();
	}

}
