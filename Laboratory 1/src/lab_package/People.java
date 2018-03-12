package lab_package;

public abstract class People {
String name;
public int age,group,course;
public int indicator=0;
public String oName = "people";
People(){
	this.name = "Default";
	this.age = 30;
}

People(String name,int age){
	this.name = name;
	this.age =age;
}
}
