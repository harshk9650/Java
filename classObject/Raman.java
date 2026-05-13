class Raman{
	public static void main(String[] args){
		// Long phone = Royal.getPhoneNumber();
		// System.out.println(" Raman says , ha bhai mil gya number: "+phone);

		// String adrs = Royal.getAd();
		// System.out.print("This is the address: "+adrs);


        // long[] phoneNumbers = Royal.getNumbers();
		// System.out.println("Recieved numbers: ");

		// for(long numbers: phoneNumbers){
		// 	System.out.println(numbers);
		// }

		Royal.storeName("Rishi");
		Girl g = new Girl();
		g.name = "Khushi";
		g.phones = 1434567890L;
		g.age = 21;
		g.address = "Delhi";
		Royal.storeGirlObject(g);

		long[] phones = {12345623L,34567890L};
		Royal.storePhones(phones);
	}

}