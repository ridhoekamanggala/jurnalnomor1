/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_fibonacci;

import javax.swing.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0, b=1, c=0;
        String s = JOptionPane.showInputDialog(" Input");
        int x= Integer.parseInt(s);
        
        for(int i=1;i<=x;i++){
            a=b;
            b=c;            
            c=a+b;
            System.out.println(c+" ");
            

        }
    }
}
