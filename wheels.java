/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author bishalblue
 */
public class wheels {
    int radius,x,y;
    body bodyinfo=new body();
    
    public void getbodyinf(body getbodyinfo){
        bodyinfo=getbodyinfo;
    }
    void calcwheel(){
        radius=bodyinfo.wid*3/4;
        y=bodyinfo.y+bodyinfo.wid;
        
        if (wheeltype.equals("front")){
        x=bodyinfo.x+(bodyinfo.len/4)-(radius/2);
        }
        else if(wheeltype.equals("rear")){
        int fullbody=bodyinfo.len+bodyinfo.x;
        x=fullbody-(bodyinfo.len/4)-(radius/2);
        }
    }
    String wheeltype=new String();

    public void drawwheels(Graphics2D g2){
        wheeltype="front";
        calcwheel();
        Ellipse2D front=new Ellipse2D.Double(x,y,radius,radius);
        wheeltype="rear";
        calcwheel();
        Ellipse2D rear=new Ellipse2D.Double(x, y, radius, radius);
        g2.draw(front);
        g2.draw(rear);
    }
}
