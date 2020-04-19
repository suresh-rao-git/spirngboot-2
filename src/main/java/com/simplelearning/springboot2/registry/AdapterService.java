package com.simplelearning.springboot2.registry;

public interface AdapterService<T> {
	
	public void process( T request);

}
