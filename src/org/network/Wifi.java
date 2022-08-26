package org.network;

import org.testng.annotations.Test;

public class Wifi {
	@Test
	private void wifiName() {
		System.out.println("Wifi Name is Hatchway");

//		Wifi w = new Wifi();
//		w.wifiName();

		MobileData md = new MobileData();
		md.dataName();

		Lan l = new Lan();
		l.lanName();

		Wireless wl = new Wireless();
		wl.modemName();
	}
}
