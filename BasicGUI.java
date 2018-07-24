/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author CSC102-105
 */
public class BasicGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personal person = new Personal();
        JFrame frame  = new JFrame();
        boolean isCheck=false;
        while(!isCheck) {
        String input = JOptionPane.showInputDialog(frame,"What is Your first name");
        person.setFirstName(input);
        input = JOptionPane.showInputDialog(frame,"What is Your last name");
        person.setLastName(input);
        int choice = JOptionPane.showOptionDialog(frame,"Your name is "+person.getFirstName()+" "+person.getLastName(),"check",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
        if(choice == JOptionPane.YES_OPTION) {
            isCheck = true;
        }
        }
        System.exit(0);
    }
}

