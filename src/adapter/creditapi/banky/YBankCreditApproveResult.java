package adapter.creditapi.banky;

import adapter.creditapi.adapter.impl.BankCreditRequest;
import adapter.creditapi.adapter.impl.BankCreditResponse;
import adapter.creditapi.adapter.impl.IBankAdapter;

public class YBankCreditApproveResult  {
   public String approved;

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }
}
