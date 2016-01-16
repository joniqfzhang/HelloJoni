package mygit1;

public class HelloJoni {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name = "Joni";
	
	public void sayHelloWorld(){
		System.out.println("Hello World to " + this.name + "!!");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloJoni name = new HelloJoni();
		name.setName(args[0]);
		name.sayHelloWorld();
	}

	public HelloJoni() {
		// TODO Auto-generated constructor stub
	}


}
