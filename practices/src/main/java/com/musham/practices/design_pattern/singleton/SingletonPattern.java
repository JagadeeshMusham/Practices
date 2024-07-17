package com.musham.practices.design_pattern.singleton;

import java.io.Serializable;

public class SingletonPattern implements Serializable {
	private static SingletonPattern instance;

	private SingletonPattern() {

	}

	public static SingletonPattern getInstance() {
		// Thread Safe
		synchronized (SingletonPattern.class) {
			if (instance == null) {
				instance = new SingletonPattern();
			}
		}

		return instance;
	}

	public void display() {
		System.out.println("Single pattern demo");
	}

	/*
	 * SerializationSafeSingleton
	 * 
	 * The SerializationSafeSingleton class ensures that the singleton contract is
	 * maintained during serialization and de-serialization. The readResolve method
	 * is used to return the existing instance during de-serialization.
	 */

	// Have to resolve below errors
//	@Serial
	protected SingletonPattern readResolve() {
		return getInstance();
	}

	// Clone prevention
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
