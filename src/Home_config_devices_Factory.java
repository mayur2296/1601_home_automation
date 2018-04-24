
public class Home_config_devices_Factory {

	public Tv tv;
	public Ac ac;
	public Washing_machine washing_machine;
	public Fan fan;
	public Light light;
	public Home_config_devices_Factory(Tv t,Light l,Fan f,Washing_machine w,Ac a)
	{
		this.tv=t;
		this.ac=a;
		this.washing_machine=w;
		this.fan=f;
		this.light=l;
	}
}
