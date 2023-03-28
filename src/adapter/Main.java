package adapter;

import adapter.creditapi.adapter.impl.*;

public class Main {
    public static void main(String[] args) {
        //Request genérico para las dos API's
        BankCreditRequest request = new BankCreditRequest();
        request.setCustomer("Diego Gonzalez");
        request.setAmount(1000);

        IBankAdapter xBank = new XBankCreditAdaptee();
        BankCreditResponse xresponse = xBank.sendCreditRequest(request);
        System.out.println("xBank approved > " + xresponse.isApproved() + "\n");

        IBankAdapter yBank = new YBankCreditAdaptee();
        BankCreditResponse yresponse = yBank.sendCreditRequest(request);
        System.out.println("yBank approved > " + yresponse.isApproved() + "\n");

        if(xresponse.isApproved()){
            System.out.println("xBank aprobó su crédito, felicidades! " + yresponse.isApproved() + "\n");
        }else if(yresponse.isApproved()){
            System.out.println("yBank aprobó su crédito, felicidades! " + yresponse.isApproved() + "\n");
        }else {
            System.out.println("lo sentimos no ha sido aprobado");
        }

    }
}