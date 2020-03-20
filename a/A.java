package a;

public class A {
	public void m1() {
		int a = 10;

		System.out.println(a);
	}

	public void m2() {
		Dog dog = new Dog() {
	    public void someDog ()
	      {
	      	int a = 10;
	      	System.out.println(a);
	        System.out.println("Anonymous Dog");
	      }			
	    };
	    dog.someDog();
	}
}