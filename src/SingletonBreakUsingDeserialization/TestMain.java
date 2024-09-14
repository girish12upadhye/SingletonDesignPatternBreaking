package SingletonBreakUsingDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestMain 
{

	public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException 
	{
		System.out.println("Main Method!!!");
		LazySingleton instance1 = LazySingleton.getInstance();
		System.out.println(instance1.hashCode());
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(instance1);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		LazySingleton instance2 = (LazySingleton)in.readObject();
		in.close();
		System.out.println(instance2.hashCode());
	}

}
