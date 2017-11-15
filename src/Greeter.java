import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String name = JOptionPane.showInputDialog("hi welcome to chilis! what ur name?");
JOptionPane.showMessageDialog(null, "hi " + name);
String order = JOptionPane.showInputDialog("what would u like today?");
JOptionPane.showMessageDialog(null, "JOEY GET THE " + order.toUpperCase());

}
}