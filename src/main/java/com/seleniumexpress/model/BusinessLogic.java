package com.seleniumexpress.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import com.seleniumexpress.controller.ClientControl;

@Component
public class BusinessLogic {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(BusinessLogic.class);

	
	public RestTemplate customRestTemplate()
    {
       System.out.println("customRestTemplate");
       
       LOGGER.debug("customRestTemplate withn HttpComponentsClientHttpRequestFactory");
		
		HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        httpRequestFactory.setConnectionRequestTimeout(500);
        httpRequestFactory.setConnectTimeout(500);
        httpRequestFactory.setReadTimeout(500);
        

        return new RestTemplate(httpRequestFactory);
    }
}
