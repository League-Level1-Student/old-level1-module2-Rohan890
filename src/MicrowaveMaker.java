import javax.swing.JOptionPane;

public class MicrowaveMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("Enter a flavor")	;
		String time = JOptionPane.showInputDialog("Enter an a number");
		int t = Integer.parseInt(time);
		Popcorn pop = new Popcorn(flavor);
		Microwave mic = new Microwave();
		mic.putInMicrowave(pop);
		mic.setTime(t);
		mic.startMicrowave();
	}

}
