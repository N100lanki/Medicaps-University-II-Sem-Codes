interface In1 {
	
	final int a = 10;

	void display();
}

class Testclass implements In1 {

	public void display(){
	System.out.println("Geek");
	}


	public static void main(String[] args)
	{
		Testclass t = new Testclass();
		t.display();
		System.out.println(a);
	}
}
