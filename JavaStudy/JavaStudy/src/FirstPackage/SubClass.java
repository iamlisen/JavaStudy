package FirstPackage;

public class SubClass extends BaseClass {
	public String book = "企业级Java EE企业应用实战";

	public void test() {
		System.out.println("子类覆盖了父类的方法");
	}
	
	public void sub(){
		System.out.println("子类的普通方法");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
