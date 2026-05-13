class Gateway{
	static  PaymentGateway modeofPayment(String type){
		if(type.equals("UPI")){
			return new UPI_impl();
		}else if(type.equals("NetBank_imp")){
			return new Netbank_imp();

		}else{
			return null;

		}
	}
}