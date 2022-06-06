package com.bancstac.gateway.client;

import com.bancstac.gateway.client.config.ClientConfig;
import com.bancstac.gateway.client.facade.AmexWallet;
import com.bancstac.gateway.client.facade.DirectEntry;
import com.bancstac.gateway.client.facade.Onboard;
import com.bancstac.gateway.client.facade.Payment;
import com.bancstac.gateway.client.facade.Report;
import com.bancstac.gateway.client.facade.Vault;

public final class GatewayClient {

	private final Payment payment;
	private final Vault vault;
	private final Report report;
	private final DirectEntry directEntry;
	private final AmexWallet amexWallet;
	private final Onboard onboard;

	public GatewayClient(ClientConfig config) {
		this.payment = new Payment(config);
		this.vault = new Vault(config);
		this.report = new Report(config);
		this.amexWallet = new AmexWallet(config);
		this.directEntry = new DirectEntry(config);
		this.onboard = new Onboard(config);
	}

	public Payment payment() {
		return payment;
	}

	public Vault vault() {
		return vault;
	}

	public Report report() {
		return report;
	}

	public AmexWallet amexWallet() {
		return amexWallet;
	}

	public DirectEntry directEntry() {
		return directEntry;
	}

	public Onboard onboard() {
		return onboard;
	}
}