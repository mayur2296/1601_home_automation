
public class Fan {

	public String button;
	public Fan()
	{
		button="off";
	}
	public Fan(String str)
	{
		button=str;
	}
	public void switch_button(String str)
	{
		button=str;
	}
	
	public String status()
	{
		return button;
	}
}
