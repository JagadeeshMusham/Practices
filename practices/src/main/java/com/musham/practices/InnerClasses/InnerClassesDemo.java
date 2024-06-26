package com.musham.practices.InnerClasses;

public class InnerClassesDemo {
	public int x = 0;
	private int y = 15;
	static int a = 28;

	static class StaticNestedClass {
		public int y = 10;

		void methodInNestedClass(int z) {
			System.out.println("z = " + z);
			System.out.println("this.y = " + this.y);
			System.out.println("a = " + a);
			/*
			 * Following is an error (i.e., No enclosing instance of the type
			 * InnerClasses is accessible in scope)
			 */
			// System.out.println("InnerClasses.this.x = " +
			// InnerClasses.this.x);
		}

	}

	class InnerClass {

		public int y = 1;

		void methodInInnerClass(int z) {
			System.out.println("x = " + z);
			System.out.println("this.y = " + this.y);
			System.out.println("x = " + x);
			System.out.println("InnerClasses.this.y = " + InnerClassesDemo.this.y);
		}
	}

	public static void main(String... args) {
		InnerClassesDemo st = new InnerClassesDemo();
		InnerClassesDemo.InnerClass fl = st.new InnerClass();
		fl.methodInInnerClass(23);

		InnerClassesDemo.StaticNestedClass snc = new InnerClassesDemo.StaticNestedClass();
		snc.methodInNestedClass(23);
	}
}
