package com.seleniumexpress.account;

import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import com.seleniumexpress.client.AccountClientProperties;

@Component
public class AccountClient {

	private final RestOperations rest;
	private final String UrlString;

	public AccountClient(final RestTemplateBuilder bulider, final AccountClientProperties props) {
		this.rest = bulider.setConnectTimeout(Duration.ofMillis(props.getConnectTimeout())).setReadTimeout(Duration.ofMillis(props.getReadTimeout())).build();
		this.UrlString = props.getAppUrl();

	}

	
	  public String GetAccountName() 
	  { 
		  return rest.getForObject(UrlString, String.class); 
		  }
	  
	 

}
