import javax.swing.JFrame;

public class ThemeColorManager {
    private IThemeColor iThemeColor;
    public ThemeColorManager(IThemeColor iThemeColor){
        this.iThemeColor = iThemeColor;
    }
    
    public void setBackgroundColor(JFrame jFrame){
        iThemeColor.setBackgroundColor(jFrame);
    }
    public void setFont(JFrame jFrame){
        iThemeColor.setFont(jFrame);
    }
}
