package com.rmgTest;



import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.rmg.pojo.AdressClass;
import com.rmg.pojo.MainPojoClass;

public class AssignmentPojo {
	@Test
	public void assignment() throws Throwable{
		int[] phone= {5447,6876};
		MainPojoClass pojo=new MainPojoClass("Rajiv", phone, new AdressClass("24/3", "bengaluru"));
		ObjectMapper obm=new ObjectMapper();
		System.out.println(obm.writeValueAsString(pojo));
		
	}
}
