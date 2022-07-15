package default_package;

import java.awt.Color;
import javax.swing.JFrame;

public class LightColorTheme implements IThemeColor{

    @Override
    public void setBackgroundColor(JFrame jFrame) {
        jFrame.getContentPane().setBackground(Color.WHITE);
    }

    @Override
    public void setFont(JFrame jFrame) {
      jFrame.setForeground(Color.BLACK);
    }
    
}
