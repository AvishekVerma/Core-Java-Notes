package in.ineuron.service;

public class BankLoanService {
	public float calculateSimpleIntereset(float pAmount,float rate,float time) {
		return pAmount*rate*time/100.0f;
	}	
}
