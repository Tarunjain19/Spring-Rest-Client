package com.seleniumexpress.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("account.client")
public class AccountClientProperties {
	
	private long readTimeout;
	private long connectTimeout;
	private String AppUrl;
	public long getReadTimeout() {
		return readTimeout;
	}
	public void setReadTimeout(long readTimeout) {
		this.readTimeout = readTimeout;
	}
	public long getConnectTimeout() {
		return connectTimeout;
	}
	public void setConnectTimeout(long connectTimeout) {
		this.connectTimeout = connectTimeout;
	}
	public String getAppUrl() {
		return AppUrl;
	}
	public void setAppUrl(String appUrl) {
		AppUrl = appUrl;
	}
	
}
