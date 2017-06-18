package com05.c_innerClass273serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveAndRead {
	public static void main(String[] args) {
		try {
			MyObject myObject = MyObject.getInstance();
			FileOutputStream fos = new FileOutputStream(new File("myobj.txt"));
			ObjectOutputStream objstr = new ObjectOutputStream(fos);
			objstr.writeObject(myObject);
			objstr.close();
			fos.close();
			System.out.println(myObject.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream(new File("myobj.txt"));
			ObjectInputStream objstr = new ObjectInputStream(fis);
			MyObject obj = (MyObject)objstr.readObject();
			objstr.close();
			fis.close();
			System.out.println(obj.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
