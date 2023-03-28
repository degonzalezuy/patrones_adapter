package adapter.creditapi.adapter.impl;

public interface IBankAdapter {
    public BankCreditResponse sendCreditRequest(BankCreditRequest request);
}
