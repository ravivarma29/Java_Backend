package com.streams;

public class Department {
	
	
String dept;

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "Department [dept=" + dept + "]";
}

public Department(String dept) {
	super();
	this.dept = dept;
}


	
}
