import static org.junit.Assert.*;

import org.junit.Test;

public class junittestcase {

	@Test
	public void test() {
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
		
		System.out.println("tv is " +myhome.tv.status());
		System.out.println("ac is " +myhome.ac.status());
		System.out.println("fan is " +myhome.fan.status());
		
	}

}
