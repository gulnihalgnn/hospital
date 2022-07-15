package default_package;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import javax.swing.JFrame;

public class OrangeColorTheme implements IThemeColor{

    @Override
    public void setBackgroundColor(JFrame jFrame) {
        jFrame.getContentPane().setBackground(Color.ORANGE);
    }

    @Override
    public void setFont(JFrame jFrame) {
      jFrame.setForeground(Color.WHITE);
    }
    
}
