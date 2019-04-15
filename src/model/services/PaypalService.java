package model.services;

public class PaypalService implements OnlinePaymentService {

	private static final double  MONTHLY_INTEREST = 0.01;
	private static final double  PAYMENT_TAX = 0.02;

	@Override
	public Double paymentFee(Double amount) {
		return amount *  PAYMENT_TAX;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount * months * MONTHLY_INTEREST;
	}
}
