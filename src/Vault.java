import java.util.Random;

import javax.swing.JOptionPane;
public class Vault {
private  int  code = new Random().nextInt(999999);
boolean tryCode(int guess) {
	if(guess == code) {
		return true;
		}
	else {
		return false;
	}
}
}
