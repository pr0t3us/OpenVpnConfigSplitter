package com.androidpositive.splitter;

import java.util.HashMap;

public class Const {
	
	public final static HashMap<String, String> defaultFileNames = new HashMap<String, String>();	
	static {
		defaultFileNames.put("caCert", "ca.crt");
		defaultFileNames.put("userCert", "user.crt");
		defaultFileNames.put("privateKey", "private.key");
		defaultFileNames.put("tlsAuth", "tls.key");
		defaultFileNames.put("config", "config.split.ovpn");
    }


	public final static HashMap<String, String> regexFileMatches = new HashMap<String, String>();	
	static {
		regexFileMatches.put("caCert", "<ca>([\\s\\S]*?)<\\/ca>");
		regexFileMatches.put("userCert", "<cert>([\\s\\S]*?)<\\/cert>");
		regexFileMatches.put("privateKey", "<key>([\\s\\S]*?)<\\/key>");
		regexFileMatches.put("tlsAuth", "<tls-auth>([\\s\\S]*?)<\\/tls-auth>");
    }	
}
