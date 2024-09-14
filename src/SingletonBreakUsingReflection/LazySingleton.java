package SingletonBreakUsingReflection;

public class LazySingleton
{
	private static LazySingleton instance;

	private LazySingleton() 
	{
//		Code For Avoiding Singleton Break
		if(instance != null)
		{
			throw new IllegalStateException("*******object can't be created using reflection *******");
		}
		
	}
	public static synchronized LazySingleton getInstance()
	{
		if (instance == null)
		{
			instance = new LazySingleton(); 
		}
		return instance;
	}

}
