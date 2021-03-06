package com.crypto.coinmixer.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "")
public class TransactionDestinationEntity extends BaseEntity{
//    FK to transaction Table
    @ManyToOne
    @JoinColumn(name ="transaction_ID" )
    private TransactionEntity transactionEntity;

    private String destinationAddress;
    private BigDecimal amount;
    private String status;
    private BigDecimal fee;// fee is in percent
    @OneToMany(mappedBy = "transactionDestinationEntity", cascade = CascadeType.ALL)
    private Set<TransactionToDestinationDetailEntity> transactionToDestinationDetailEntitySet;


    // getters and setters
    public TransactionEntity getTransactionEntity() {
        return transactionEntity;
    }

    public void setTransactionEntity(TransactionEntity transactionEntity) {
        this.transactionEntity = transactionEntity;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Set<TransactionToDestinationDetailEntity> getTransactionToDestinationDetailEntitySet() {
        return transactionToDestinationDetailEntitySet;
    }

    public void setTransactionToDestinationDetailEntitySet(Set<TransactionToDestinationDetailEntity> transactionToDestinationDetailEntitySet) {
        this.transactionToDestinationDetailEntitySet = transactionToDestinationDetailEntitySet;
    }

    public Set<TransactionToDestinationDetailEntity> getTransactionToDestinationDetailSet() {
        return transactionToDestinationDetailEntitySet;
    }

    public void setTransactionToDestinationDetailSet(Set<TransactionToDestinationDetailEntity> transactionToDestinationDetailEntitySet) {
        this.transactionToDestinationDetailEntitySet = transactionToDestinationDetailEntitySet;
    }

    public TransactionEntity getTransaction() {
        return transactionEntity;
    }

    public void setTransaction(TransactionEntity transactionEntity) {
        this.transactionEntity = transactionEntity;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
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


}
