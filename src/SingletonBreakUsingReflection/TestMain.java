package SingletonBreakUsingReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestMain 
{

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		System.out.println("Main Method!!!");
		LazySingleton instance1 = LazySingleton.getInstance();
		System.out.println(instance1.hashCode());
		
		
		Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
//		for (Constructor constructor : constructors) 
//		{
//			constructor.setAccessible(true);
//			LazySingleton reflectionInstance = (LazySingleton) constructor.newInstance();
//		}
		
		Constructor constructor = constructors[0];
		constructor.setAccessible(true);
		
		LazySingleton reflectionInstance1 = (LazySingleton) constructor.newInstance();
		System.out.println(reflectionInstance1.hashCode());

	}

}
