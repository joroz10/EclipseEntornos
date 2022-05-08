package org.cuatrovientos.es;

import java.util.Random;

public class GeneradorIp {

	public GeneradorIp() {}
	public String genNum() {
		int num;
		String str = "";
		for (int i = 0;i<4;i++) {
			Random rnd = new Random();
			num = rnd.nextInt(255);
			if (i == 3) {
				str = str + num;
			} else {
				str = str + num + ".";
			}
			
		} 
		return str;
	}
}
