package org.login;

public class A {

	private void m2() {

		String str = "java";

		String str1 = "java";

		int identityHashCode1 = System.identityHashCode(str);

		System.out.println(identityHashCode1);

		System.out.println();
		str = "application";
		boolean contains = str.contains("application");

		System.out.println(contains);
		int identityHashCode = System.identityHashCode(str);

		System.out.println(identityHashCode);
	}
	


	public static void main(String[] args) {
		A a = new A();
		a.m2();
	}

}
