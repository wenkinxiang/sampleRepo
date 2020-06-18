
/** 
 * 
 *
 * @author wenkin
 */

public class User {
	
	private String name;
	private int age;
	private int sex;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public static User valueOf(String name,int age,int sex){
		User result=new User();
		result.name=name;
		result.age=age;
		result.sex=sex;
		return result;
	}
}
