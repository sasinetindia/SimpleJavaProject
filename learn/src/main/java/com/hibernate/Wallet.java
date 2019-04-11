package com.hibernate;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "wallet")
public class Wallet {
	
	@Id
	@Column(name="wallet_id")
	private String walletId;
	
	@Column(name="master_wallet_id")
	private String masterWalletId;
	
	@Column(name="customer_id")
	private String customerId;
	
	@Column(name="wallet_curr")
	private String walletCurr;
	
	@Column(name="ledger_balance")
	private BigDecimal ledgerBalance;
	
	@Column(name="available_balance")
	private BigDecimal availableBalance;

	@Override
	public String toString() {
		return "Wallet [walletId=" + walletId + ", masterWalletId=" + masterWalletId + ", customerId=" + customerId
				+ ", walletCurr=" + walletCurr + ", ledgerBalance=" + ledgerBalance + ", availableBalance="
				+ availableBalance + "]";
	}



}
