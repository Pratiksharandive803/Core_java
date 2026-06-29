package com.io1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class DemoFile {

	public static void main(String[] args) {
      
		FileReader fr;
		BufferedReader br;
		StringTokenizer st;
		String data;
		
		try {
		fr=new FileReader("emp.txt");
		br=new BufferedReader(fr);
		data=br.readLine();
		
		while(data!=null) {
			st=new StringTokenizer(data);
			while(st.hasMoreElements()) {
				String id=st.nextToken();
				String name=st.nextToken();
				String bsal=st.nextToken();
				System.out.println("emp data :"+id+"\t"+name+"\t"+bsal);
			}
			data=br.readLine();
			
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
