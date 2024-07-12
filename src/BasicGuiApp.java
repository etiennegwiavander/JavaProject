import javax.swing.JOptionPane;
// The importation above makes it possible for use to use the GUI
public class BasicGuiApp {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name? "); //the output of showInputDialog is a string
        JOptionPane.showMessageDialog(null, "Hello my name is " +name);
        System.out.println(name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are your now? "));
        // We used the parseInt() method to convert the String output of the showInputDialog() method into an integer if now, we'll get an error message.
        JOptionPane.showMessageDialog(null, "I'm " +age + " year old!");
        System.out.println(age);

        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "I'm " +height + "cm tall!");
        
    }
}
