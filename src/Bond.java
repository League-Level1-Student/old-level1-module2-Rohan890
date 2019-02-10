public class Bond {
public static void main(String[] args) {
	Vault dude = new Vault();
	System.out.println(dude.tryCode(1));
}
int findCode(Vault v) {
	for (int i = 0; i < 999999; i++) {
		if(v.tryCode(i) == true) {
			return i;
		}
		
	}
return -1;
}
}
