/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.util.Scanner;
import java.awt.Rectangle;
import java.awt.Graphics2D;


/**
 *
 * @author bishalblue
 */
public class body {
    /**
     * @param x is the x-coordinate of the top left corner of the body
     * @param y is the y-coordinate of the top left corner of the body
     * @param len is the length of the car
     * @param wid is the width of the car
     */
    int x, y, len, wid;
    
    public void getbody(){
        
        Scanner bodyinf = new Scanner(System.in);
        System.out.print("Enter X postion of car: ");
        x=bodyinf.nextInt();
        System.out.print("\nEnter Y postion of car: ");
        y=bodyinf.nextInt();
        System.out.print("\nEnter length of car: ");
        len=bodyinf.nextInt();
        System.out.print("\nEnter width of car: ");
        wid=bodyinf.nextInt();
    }

    public void drawbody(Graphics2D g2){
        
        Rectangle carbody=new Rectangle(x,y,len,wid);
        g2.draw(carbody); 
    }
}

