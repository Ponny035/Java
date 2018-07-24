import javax.swing.*;
import java.awt.*;
public class Cal extends JFrame {

    JButton zero, one, two, three, four, five, six, seven, eight, nine;
    JButton add, sub, mul, div, mod,equal;
    JTextField results;
    JPanel mainPanel, textPanel;

    public Cal(){
        this.setSize(400, 400);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setVisible(true);

        mainPanel = new JPanel();
        textPanel = new JPanel();

        results = new JTextField("RESULTS");

        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        equal = new JButton("=");
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        mod = new JButton("%");

        
        textPanel.add(results);
        mainPanel.add(one);
        mainPanel.add(two);
        mainPanel.add(three);
        mainPanel.add(four);
        mainPanel.add(five);
        mainPanel.add(six);
        mainPanel.add(seven);
        mainPanel.add(eight);
        mainPanel.add(nine);

        mainPanel.add(add);
        mainPanel.add(zero);
        mainPanel.add(equal);
        this.add(textPanel);
        this.add(mainPanel,BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        new Cal();
    }
}
