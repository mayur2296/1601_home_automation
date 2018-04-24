
public class Ac {

	public String button;
	public int temperature=0;
	public Ac()
	{
		button="off";
	}
	public Ac(String str)
	{
		button=str;
	}
	public void switch_button(String str)
	{
		button=str;
	}
	public void temperature(int str)
	{
		temperature=str;
	}
	public void temperatureup()
	{
		temperature=temperature+1;
	}
	public void temperaturedown()
	{
		temperature=temperature+1;
	}
	public String status()
	{
		return button;
	}
	
}
