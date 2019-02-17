/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.awt.Graphics2D;

/**
 *
 * @author bishalblue
 */
public class assemble {
    /**
     * 
     * @param g2 is the graphics component
     */
        public void drawcar(Graphics2D g2){
        
        body testcarbody=new body();
            testcarbody.getbody();
            testcarbody.drawbody(g2);
        wheels testcarwheels=new wheels();
            testcarwheels.getbodyinf(testcarbody);
            testcarwheels.drawwheels(g2);
        linesanddots remains=new linesanddots();
            remains.setremains(testcarbody);
            remains.drawremains(g2);
            
    }
}
