package SingletonBreakUsingCloneMethod;

public class LazySingleton extends MyClone
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
//	Method For Avoiding Singleton Break
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		System.out.println("CloneMethod Of LazySingleton");
//		throw new CloneNotSupportedException("************************************");
//	}
}
