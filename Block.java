public class Block{
	String vip;
	static{
		System.out.println("Hey I'm Block");
	}

	void setVip(String vip){
		this.vip = vip;
		System.out.println("this is Vip: "+vip);
	}
	
	Block(){
		System.out.println("i'm in constructor");
	}

	// Block(String vip){
	// 	System.out.println("this is Vip: "+vip);
	// }

}