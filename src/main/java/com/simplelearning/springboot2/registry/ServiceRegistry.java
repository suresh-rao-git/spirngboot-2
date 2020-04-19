package com.simplelearning.springboot2.registry;

public interface ServiceRegistry {

	public <T> AdapterService<T> getService( String serviceName);
}
