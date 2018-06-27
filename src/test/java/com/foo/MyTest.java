package com.foo;

import org.junit.Test;

public class MyTest {
	@Test
	public void doTest() {
		System.out.println(String.format("A = %s", new A().getValue()));
		System.out.println(String.format("B = %s", new B().getValue()));
		System.out.println(String.format("C = %s", new C().getValue()));
		System.out.println(String.format("D = %s", new D().getValue()));
		System.out.println(String.format("E = %s", new E().getValue()));
		System.out.println(String.format("L1 = %s", new L1().getValue()));
		System.out.println(String.format("L2 = %s", new L2().getValue()));
		System.out.println(String.format("L3 = %s", new L3().getValue()));
	}
}
