
public class Fan {

	public FanData data = new FanData();
	public Fan()
	{
		data.button="off";
	}
	public Fan(String str)
	{
		data.button=str;
	}
	public void switch_button(String str)
	{
		data.button=str;
	}
	
	public String status()
	{
		return data.button;
	}
	
}
