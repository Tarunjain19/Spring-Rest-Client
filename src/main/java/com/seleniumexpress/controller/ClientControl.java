package com.seleniumexpress.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.seleniumexpress.SpringRestClientApplication;
import com.seleniumexpress.account.AccountClient;
import com.seleniumexpress.client.AccountClientProperties;
import com.seleniumexpress.model.BusinessLogic;

@RestController
public class ClientControl {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(ClientControl.class);
	
	@Autowired
	private AccountClient client;
	
	@Autowired
	private BusinessLogic bclient;
	
	@Autowired
	AccountClientProperties props;

		@RequestMapping("/Start")
		public String GetData(@RequestParam String cnt) {

			System.out.println("Country Name: "+cnt);
			LOGGER.info("In Controler", cnt);
			
			String url1=props.getAppUrl();
			//String accnt = client.GetAccountName();
			System.out.println("url1 Name: "+url1);
			LOGGER.info("url1 Name", url1);
			
			 
			
			RestTemplate res1=bclient.customRestTemplate();
			
			long startTime = System.currentTimeMillis();
			
			 System.out.println("startTime: "+startTime);
			
			String accnt=res1.getForObject(url1, String.class);
			
			 long endTime = System.currentTimeMillis();
			 
			  long timeConsumed = endTime - startTime;
			  
			  System.out.println("Duration: "+timeConsumed);

			return "0~0~"+accnt;
		}
		
		@RequestMapping("/StartBulid")
		public String StartBulid()
		{
			
			System.out.println("In StartBulid: ");
			
			long startTime = System.currentTimeMillis();
			
			 System.out.println("startTime: "+startTime);
			 
			String accnt = client.GetAccountName();
			
			 long endTime = System.currentTimeMillis();
			 
			  long timeConsumed = endTime - startTime;
			  
			  System.out.println("Duration: "+timeConsumed);
			  
			  return "0~0~"+accnt;
		}

}
