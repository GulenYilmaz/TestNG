package com.TestNG__class05__Asel__Maven;

import org.testng.annotations.Test;

public class Recap {

	@Test
	public void arrayRecap() {
		Object[][] data = new Object[2][3];

		data[0][0] = 12;
		data[0][1] = 13;
		data[0][2] = 14;

		data[1][0] = 122;
		System.out.println(data[1][1]);// -->null
	}
}
