package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import bean.Student;

public class FileDemo {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<Student>();
		try {
			FileReader fr=new FileReader("D://new.txt");
			BufferedReader br=new BufferedReader(fr);
			String data=null;
			while((data=br.readLine())!=null) {
				String d[]=data.split("\t");
				students.add(new Student(d[0], d[1]));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Comparator<Student> c=(s,s1)->s.getName().compareTo(s1.getName());
		//Collections.sort(students,(s,s1)->s.getName().compareTo(s1.getName()));
		Collections.sort(students);
		students.forEach(System.out::println);
	}

}
