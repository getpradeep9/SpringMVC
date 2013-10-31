package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Account{ //implements InitializingBean, DisposableBean{
	
	public Integer age=35,sal=50000;
	public String name="pradeep";
	
	List  addrList;
	Set addrSet;
	Map addrMap;
	
	public List getAddrList() {
		return addrList;
	}

	public void setAddrList(List addrList) {
		this.addrList = addrList;
	}

	public Set getAddrSet() {
		return addrSet;
	}

	public void setAddrSet(Set addrSet) {
		this.addrSet = addrSet;
	}

	public Map getAddrMap() {
		return addrMap;
	}

	public void setAddrMap(Map addrMap) {
		this.addrMap = addrMap;
	}

	private Integer doStuff(){
	 return	age*sal;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
		System.out.println("setAge called");
	}

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
		System.out.println("setSal called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setName called");
	}

	//@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" init method called ");
		
	}

	//@Override
	public void destroy() throws Exception {
		System.out.println("destroy method called");
		
	}
	
	
	

}
