package com.github.alonwang.design_pattern.factory;

public class HPComputer extends Computer {

	@Override
	public Brand getBrand() {
		// TODO Auto-generated method stub
		return new HPBrand();
	}

}
