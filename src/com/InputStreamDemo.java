package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InputStreamDemo {
	public static void main(String[] args) {
		byte b[]=new byte[1634518];
		try {
			FileInputStream fis=new FileInputStream("d://b.mp3");
			fis.read(b);
			System.out.println(b);
			fis.close();
			FileOutputStream fos=new FileOutputStream("D://mix.mp3",true);
			fos.write(b);
			System.out.println("Done...");
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
