package com.avosh.baseproject.ws.model;

import java.util.List;

public class TransactionResponse extends Response {
    private List<Transaction> transactionList;

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}
