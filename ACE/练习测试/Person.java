package ��ϰ����;

public class Person {
private String name;
private int age;
private String sex;
	public Person() {
	}
	public Person(String name,int age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void ptint(){
		System.out.println(name+" "+age+" "+sex);
	}
	public static void main(String []args){
		Person p1 = new Person("����",30,"��");
		p1.ptint();
	}

}
