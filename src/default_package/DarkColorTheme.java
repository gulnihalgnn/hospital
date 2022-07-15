package default_package;


import java.awt.Color;
import javax.swing.JFrame;

public class DarkColorTheme implements IThemeColor {

	@Override
	public void setBackgroundColor(JFrame jFrame) {
		jFrame.getContentPane().setBackground(Color.DARK_GRAY);
	}

	@Override
	public void setFont(JFrame jFrame) {
		jFrame.setForeground(Color.WHITE);
	}

}
