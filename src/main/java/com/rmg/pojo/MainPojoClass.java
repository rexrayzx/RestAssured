package com.rmg.pojo;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(value= {
		"name",
		"phone",
		"adress"
})
public class MainPojoClass {
	String name;
	int[] phone;
	AdressClass adress;
	
	public MainPojoClass() {
		
	}

	public MainPojoClass(String name, int[] phone, AdressClass adress ) {
		this.name = name;
		this.phone = phone;
		this.adress = adress;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getPhone() {
		return phone;
	}

	public void setPhone(int[] phone) {
		this.phone = phone;
	}

	public AdressClass getAdress() {
		return adress;
	}

	public void setAdress(AdressClass adress) {
		this.adress = adress;
	}

	
}

