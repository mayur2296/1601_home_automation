
public class Light {

	public String button;
	public Light()
	{
		button="off";
	}
	public Light(String str)
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
