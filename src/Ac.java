
public class Ac {

	public AcData data = new AcData(0);
	public Ac()
	{
		data.button="off";
	}
	/**
	 * @deprecated Use {@link #Ac(String,Object)} instead
	 */
	public Ac(String str)
	{
		this(str, null);
	}
	public Ac(String str, Object newParam)
	{
		data.button=str;
	}
	public void switch_button(String str)
	{
			data.button=str;
	}
	public void temperature(int str)
	{
		data.temperature=str;
	}
	public void temperatureup()
	{
		data.temperature=data.temperature+1;
	}
	public void temperaturedown()
	{
		data.temperature=data.temperature+1;
	}
	public String status()
	{
		return data.button;
	}
	
}
