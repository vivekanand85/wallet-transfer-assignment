package com.videtech.wallet_transfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WalletTransferApplication {

	public static void main(String[] args) {
		
		System.out.println("Timezone before = " + java.util.TimeZone.getDefault().getID());

		java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("UTC"));

		System.out.println("Timezone after = " + java.util.TimeZone.getDefault().getID());
		
		SpringApplication.run(WalletTransferApplication.class, args);
		
		System.out.println("ok now running fine");
	}

}
