package caveOfProgramming;

public class Frog {
	
	String name = "newFrog" ;
	int Age = 5 ;
	
	public void setName(String name){
		this.name = name ;
	}
	
	public void setAge(int Age){
		this.Age = Age ;
	}
	
	public void setInfo(String name, int Age){
		setName(name);
		setAge(Age);
	}
	
	public String getcolor(String colorname){
		return colorname ;
	}

}
