package person;

public class Person {

	private String name;
	private int age;
	private String gender;
	private String[] hobbies;
	
	public Person(String name, int age, String gender, String[] hobbies) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hobbies = hobbies;
	}
	public String getName() {
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	

}
