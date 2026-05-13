class Harsh{
	public static void main(String[] args){
		Battery b = new Battery();
		b.bname = "Nokia's Battery";

		Mobile m = new Mobile();
		m.mname = "Nokia";
		m.b = b;
		m.switchOn();

	}
}