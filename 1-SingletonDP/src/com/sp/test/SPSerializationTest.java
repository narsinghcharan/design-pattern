package com.sp.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.sp.pattern.DateUtil;

public class SPSerializationTest {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		DateUtil du1 = DateUtil.getInstance();
		System.out.println("hashcode : "+ du1.hashCode());
		/*
		 * 
		 * System.out.println("hashcode : " + du1.hashCode()); serialize(du1);
		 * DateUtil du2 = deserialize(); System.out.println("hashcode : " +
		 * du2.hashCode());
		 */

		/*Class classType = Class.forName("com.sp.pattern.DateUtil");
		Constructor constructor = classType.getDeclaredConstructors()[0];
		constructor.setAccessible(true);

		DateUtil du1 = (DateUtil) constructor.newInstance(null);
		DateUtil du2 = (DateUtil) constructor.newInstance(null);
		System.out.println(du1.hashCode());
		System.out.println(du2.hashCode());*/

	}

	private static void serialize(DateUtil du) throws FileNotFoundException,
			IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				new File("d:\\dateutil.ser")));
		oos.writeObject(du);
	}

	private static DateUtil deserialize() throws FileNotFoundException,
			IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				new File("d:\\dateutil.ser")));
		DateUtil du = (DateUtil) ois.readObject();
		return du;
	}

}
