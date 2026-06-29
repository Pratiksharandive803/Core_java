package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//program to read the contents of the text file
		FileReader fr=null;//to point to the text
		BufferedReader br;
		String data=null;
		
		try {
			fr=new FileReader("D:\\new\\dummy.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//if file not existing,exception generated
		br=new BufferedReader(fr);//br is pointing to the fr for efficient reading of data
		try {
			data=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//reading the first line of data
		//reading the contents of the file until the end
		while(data!=null) {
			System.out.println(data);
			try {
				data=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//to increment or read the next
		}

	}

}
