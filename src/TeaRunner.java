public class TeaRunner {
public static void main(String[] args) {
	TeaBag m = new TeaBag("mint");
	Kettle k = new Kettle();
	k.boil();
	Cup c = new Cup();
	c.makeTea(m, k.getWater());
	
	
}
}
