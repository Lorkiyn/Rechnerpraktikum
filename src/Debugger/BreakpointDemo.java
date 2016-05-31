package Debugger;

public class BreakpointDemo {

	int test;

	public static void main(String[] args) {
		BreakpointDemo demo = new BreakpointDemo(3);
		demo.print();
	}

	public BreakpointDemo(int test) {
		this.test = test;
	}

	public void print() {
		System.out.println(test);
	}
}
