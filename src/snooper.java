import javax.swing.JOptionPane;

public class snooper {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "ATTENTION! Many bank accounts have been comprimised across the United States, and you may have fell victim!");
int like = JOptionPane.showConfirmDialog(null, "Would you like to see if you have been affected?");
if(like == 1) {
int sure = JOptionPane.showConfirmDialog(null, "Are you sure? You could be VULNERABLE!");
if(sure == 1) {

}
}


}
}
