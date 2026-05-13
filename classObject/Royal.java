class Royal{
	 // static long getPhoneNumber(){
	 // 	System.out.println("ha bhai h mare ps ");
	 // 	return 6565656584L;
	 // }

	 // static String getAd(){
	 // 	System.out.println("do you have address: ");
	 // 	return "Shanti Niketan";
	 // }

	 // static long[] getNumbers(){
	 // 	System.out.println(" Royal sharing numbers.... ");
	 // 	long[] numbers = {123456789l,2345678765l,567890987l,34567890l};
	 // 	return numbers;
	 // }

	 // static Girl getGirlObject(){
	 // 	System.out.println("Royal is sharing girls details as an object ");
	 // 	Girl g = new Girl() ;
	 // }

	 static void storeName(String name){
	 	System.out.println("Recieved name: "+name+"store it into database");
	 }

	 static void  storeGirlObject(Girl ref){
	 	System.out.println("Royal Recieved the girl object");
	 	ref.detail();

	 }

	 static void storePhones(long[] phones){
	 	System.out.println("Royal Recieved phone numbers");
	 	for(long e:phones){
	 		System.out.println(e);
	 	}
	 }
}