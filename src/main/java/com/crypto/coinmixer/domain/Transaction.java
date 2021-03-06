package com.crypto.coinmixer.domain;

import com.crypto.coinmixer.entity.TransactionDestinationEntity;
import com.crypto.coinmixer.entity.UserEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Set;
@Component
public  class Transaction {
    private String depositAddress;
    private BigDecimal amount;
    private String status;
    private Instant approvedDate;
    private BigDecimal deniedAmount;
    @Value("${transaction.fee}")
    private BigDecimal fee;
    private Long approvedNumber;
    private BigDecimal verifiedAmount;
    private Set<TransactionDestination> transactionDestinationSet;
    private User user;
    private String srcAddress;

    public String getSrcAddress() {
        return srcAddress;
    }

    public void setSrcAddress(String srcAddress) {
        this.srcAddress = srcAddress;
    }

    public String getDepositAddress() {
        return depositAddress;
    }

    public void setDepositAddress(String depositAddress) {
        this.depositAddress = depositAddress;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Instant approvedDate) {
        this.approvedDate = approvedDate;
    }

    public BigDecimal getDeniedAmount() {
        return deniedAmount;
    }

    public void setDeniedAmount(BigDecimal deniedAmount) {
        this.deniedAmount = deniedAmount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Long getApprovedNumber() {
        return approvedNumber;
    }

    public void setApprovedNumber(Long approvedNumber) {
        this.approvedNumber = approvedNumber;
    }

    public BigDecimal getVerifiedAmount() {
        return verifiedAmount;
    }

    public void setVerifiedAmount(BigDecimal verifiedAmount) {
        this.verifiedAmount = verifiedAmount;
    }

    public Set<TransactionDestination> getTransactionDestinationSet() {
        return transactionDestinationSet;
    }

    public void setTransactionDestinationSet(Set<TransactionDestination> transactionDestinationSet) {
        this.transactionDestinationSet = transactionDestinationSet;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
