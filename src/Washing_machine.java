
public class Washing_machine {

	public String button;
	
	public Washing_machine()
	{
		button="off";
	}
	public Washing_machine(String str)
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
