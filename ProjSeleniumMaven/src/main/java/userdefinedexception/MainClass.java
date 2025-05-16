package userdefinedexception;

public class MainClass {

	public static void main(String[] args) throws JerryException  {
		// TODO Auto-generated method stub

		String a=null;
		
		if(a==null || a.isEmpty())
		{
			JerryException j=new JerryException();
			j.setMessage("this is user defined exception occured..");
			throw j;
		}
		
	}

}
