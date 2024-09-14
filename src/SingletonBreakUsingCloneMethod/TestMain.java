package SingletonBreakUsingCloneMethod;

public class TestMain 
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		System.out.println("Main Method!!!");
		LazySingleton instance1 = LazySingleton.getInstance();
		System.out.println(instance1.hashCode());
		
		LazySingleton instance2 = (LazySingleton) instance1.clone();
		System.out.println(instance2.hashCode());
	}

}
