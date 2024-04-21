package com.musham.practices.design_pattern.observer;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
