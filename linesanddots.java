/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
/**
 *
 * @author bishalblue
 */
public class linesanddots {

    Point2D LBWindshield, LTWindshield,RBWindshield, RTWindshield;
    public void setremains(body bget){
        LBWindshield=new Point2D.Double(bget.x, bget.y);
        LTWindshield=new Point2D.Double(bget.x+(bget.len/4), bget.y-(bget.wid/2));
        RTWindshield=new Point2D.Double(bget.x+(bget.len*3/4), bget.y-(bget.wid/2));
        RBWindshield=new Point2D.Double(bget.len+bget.x, bget.y);
    }
    public void drawremains(Graphics2D g2){
       Line2D.Double front=new Line2D.Double(LBWindshield,LTWindshield);
       Line2D.Double rear=new Line2D.Double(RTWindshield, RBWindshield);
       Line2D.Double roof=new Line2D.Double(LTWindshield, RTWindshield);
       g2.draw(roof);
       g2.draw(front);
       g2.draw(rear);
    }
}
