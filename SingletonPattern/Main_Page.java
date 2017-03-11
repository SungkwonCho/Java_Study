public class Main_Page {
	
	public static void main(String[] args)
	{
		MyCompany company = MyCompany.getCompany();
		
		System.out.println("Company's Name: " + company.getName() + ", Location: "+company.getLocation());
		
		company.setName("JKCompany");
		company.setLocation("Busan");
		
		System.out.println("Company's Name: " + company.getName() + ", Location: "+company.getLocation());

	}
}
