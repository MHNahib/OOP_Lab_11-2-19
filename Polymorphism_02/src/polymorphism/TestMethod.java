package polymorphism;

public class TestMethod {

	public static void main(String[] args) {
		BaseClass obj1 = new BaseClass();
		BaseClass obj2 = new DrivedClass(); 
		obj1.methodToOverride();
		obj2.methodToOverride();

	}

}
