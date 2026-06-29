package com.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.bean.EmployeeBean;

public class FileDataExt_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			FileReader fr;
			
			BufferedReader br;
			
			String data;
			
			StringTokenizer st;
			
			ArrayList<EmployeeBean> al =new ArrayList<>();
			
			try {
			fr=new FileReader("emp.txt");
			
			br=new BufferedReader(fr);
			
			data=br.readLine();
			
			while(data != null) {
				
				st= new StringTokenizer(data,"#");
				
				while(st.hasMoreElements()) {
					
					String id = st.nextToken();
					
					String name=st.nextToken();
					
					String bsal=st.nextToken();
					
					EmployeeBean eb=new EmployeeBean();
					
					eb.setEmp_id(Integer.parseInt(id));
					
					eb.setEmp_name(name);
					eb.setEmp_bsal(Integer.parseInt(bsal));
					
					// adding the object into the collection
					
					al.add(eb);
					
				}
				
				data =br.readLine();
			} 
			
			//read collection data
			for(EmployeeBean e:al) {
				//process the sal
				int pf=(int)0.12f *e.getEmp_bsal();
				int sal=e.getEmp_bsal()-pf;
				System.out.println("sal for emp id"+ e.getEmp_id() +"\t"+sal);
			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			
	}

}