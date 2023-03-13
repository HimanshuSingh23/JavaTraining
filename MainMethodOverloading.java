//Things to learn from this
1-Main method can be overloaded.
2-Non-static methods cannot be called by a static method without creating an instance for their class.Hence you see the OVERLOADED function is made static.



public class MainOverload {
	
	public static void  overloaded(String input)
	{
		System.out.println(input);
	}
	public static void main(int i)
	{
		System.out.println(i);
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		main(5);
		overloaded("successfully overloaded the main function");
	}
}
