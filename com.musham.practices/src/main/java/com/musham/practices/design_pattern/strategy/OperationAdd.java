package com.musham.practices.design_pattern.strategy;

public class OperationAdd implements Strategy {

	@Override
	public int doOperation(int first, int second) {
		return first + second;
	}
}
