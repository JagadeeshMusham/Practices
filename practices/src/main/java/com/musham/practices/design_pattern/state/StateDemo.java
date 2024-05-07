package com.musham.practices.design_pattern.state;

public class StateDemo {

	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);
		
		System.out.println("The current state in context is: " + context.getState());

		StopState stopState = new StopState();
		stopState.doAction(context);
		
		System.out.println("The current state in context is: " + context.getState());
	}
}
