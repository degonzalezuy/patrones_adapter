package adapter.creditapi.adapter.impl;

import adapter.creditapi.bankx.XBankCreditAPI;
import adapter.creditapi.bankx.XBankCreditRequest;
import adapter.creditapi.bankx.XBankCreditResponse;

public class XBankCreditAdaptee implements IBankAdapter{


    @Override
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        XBankCreditRequest xrequest = new XBankCreditRequest();
        xrequest.setCustomerName(request.getCustomer());
        xrequest.setRequestAmount(request.getAmount());

        XBankCreditAPI api = new XBankCreditAPI();
        XBankCreditResponse xresponse= api.sendCreditRequest(xrequest);

        BankCreditResponse response = new BankCreditResponse();
        response.setApproved(xresponse.isAproval());
        return response;
    }
}
