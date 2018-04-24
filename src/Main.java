
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String on="on";
		String off="off";
		
		
		
		//creating devices
		Light light=new Light();
		Washing_machine washing_machine=new Washing_machine();
		Fan fan=new Fan();
		Tv tv =new Tv();
		Ac ac=new Ac();
		
		//configuring devices to home
		Home_config_devices_Factory myhome=null;
		
		myhome=new Home_config_devices_Factory(tv, light, fan, washing_machine, ac);
		
		
		//controling devices from from pannel
		myhome.light.switch_button(on);
		myhome.ac.switch_button(off);
		myhome.fan.switch_button(on);
		
		myhome.ac.temperatureup();
		
		myhome.tv.switch_button(on);
		myhome.tv.channel(610);
		myhome.tv.volumeup();
		
		

		//to track the status
		System.out.println("=====STATUS OF DEVICES======\n");
		System.out.println("\ttv is " +myhome.tv.status());
		System.out.println("\tac is " +myhome.ac.status());
		System.out.println("\tfan is " +myhome.fan.status());
		
		System.out.println("\ttv channel is " +myhome.tv.channel);
		System.out.println("\ttv volume is " +myhome.tv.volume);
		
		System.out.println("\twashing machine is "+myhome.washing_machine.status());
		
		
	}
	
}
