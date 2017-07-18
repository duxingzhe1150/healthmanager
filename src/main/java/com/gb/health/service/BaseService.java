package com.gb.health.service;

import com.gb.health.init.ErrerCode.ServerErrer;

public interface BaseService {
	
	ServerErrer saveToCache(Object bean, String personID);

	Object getFromCache(String personID, Object cType);

}
