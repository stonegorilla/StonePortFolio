package aaaa;
import java.util.List;
import java.util.ArrayList;
public class PersonManager  {
	
	private List<Person> list = new ArrayList<Person>();
	
	private static PersonManager manager = new PersonManager();
	
	private PersonManager() {
		
	}
	public static PersonManager getInstance() {
		return manager;
	}
	
	
	
	// 등록
	public void regist(Person p) {
		list.add(p);
	}
	
	// 리스트 몽땅
	public List<Person> getList(){
		return list;
	}
}
