package SingletonBreakUsingDeserialization;

import java.io.Serializable;

public class LazySingleton  implements Serializable
{
	private static LazySingleton instance;

	private LazySingleton() 
	{
		
		
	}
	public static synchronized LazySingleton getInstance()
	{
		if (instance == null)
		{
			instance = new LazySingleton(); 
		}
		return instance;
	}
//	Code For Avoiding Singleton Break
//	private Object readResolve() 
//	{
//		return instance ;
//	}
}
