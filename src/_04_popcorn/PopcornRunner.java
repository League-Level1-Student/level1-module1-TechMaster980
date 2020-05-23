package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	Popcorn pop = new Popcorn(null);
Microwave micro = new Microwave();
micro.putInMicrowave(pop);
String flavor = JOptionPane.showInputDialog("what flavor do you want");

}
}
