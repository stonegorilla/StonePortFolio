package person;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
	List<Person> list = new ArrayList<>();
	static private PersonManager manager = new PersonManager(); 
	private PersonManager() {
		
	}
	
	static public PersonManager getInstance() {
		return manager;
	}
	
	public void regist(Person p) {
		list.add(p);
	}
	
	public List<Person> getList() {
		return list;
	}
	
}
