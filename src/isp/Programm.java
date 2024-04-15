package isp;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        // InternetPaymentService internetService = new InternetPaymentService();
        TerminalPaymentService terminalService = new TerminalPaymentService();
        ArrayList<PayService> payService = new ArrayList<>();
        payService.add(terminalService);

        for (PayService pay : payService){
            if (pay instanceof PhonePay)
            {
                ((PhonePay)pay).payPhoneNumber(2000);
                return;
            }
        }

    }
}
