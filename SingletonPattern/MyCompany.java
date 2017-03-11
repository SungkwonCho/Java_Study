public class MyCompany {
	
	private static MyCompany company = new MyCompany("SkCompany","Seoul");
	private String name;
	private String location;
	
	private MyCompany(String name, String location)
	{
		setName(name);
		setLocation(location);
	}
	
	public static MyCompany getCompany(){return company;}
	
	public String getName(){return name;}
	public String getLocation(){return location;}
	
	public void setName(String name){this.name = name;}
	public void setLocation(String location){this.location = location;}
}
