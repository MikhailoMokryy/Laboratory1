package lab_package;

public abstract class People {
String name;
int age;
People(){
	this.name = "Default";
	this.age = 30;
}

People(String name,int age){
	this.name = name;
	this.age =age;
}
}
