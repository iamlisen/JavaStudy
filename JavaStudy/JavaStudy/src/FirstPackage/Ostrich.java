package FirstPackage;

public class Ostrich extends Bird {

	public void fly() {
		super.fly();
		System.out.println("我在地上奔跑");
	}
	
	public void callOverridedMethod() {
		super.fly();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ostrich ostrich = new Ostrich();
		ostrich.fly();
		ostrich.callOverridedMethod();
	}

}
