package practice.test;

public class Amit {

	
	private String name = "Amit";
	
	
	
	private void setName(String name)
	{
		if(name.equals("Madarchod"))
			this.name = "Inavlid";
		else
		this.name = name;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	
	
	

}
