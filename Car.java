/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 @author bishalblue
 ->machine learning enthusiast
 @editor zaheen
 ->coder
*/
class carcomponent extends JComponent{
    /**
     * 
     * @param g is the graphics object
     */
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        assemble testcar=new assemble();
        testcar.drawcar(g2);
    }
}
public class Car {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("i don");
        JFrame frame=new JFrame();
        frame.setTitle("Car Rendering");
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new carcomponent());
        frame.setVisible(true);
    }
    
}

