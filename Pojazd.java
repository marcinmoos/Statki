package statki;

import javax.swing.ImageIcon;



public class Pojazd extends Jednostka{
    
    String imageFile = "icons/P.png";
    
    public Pojazd(int size)
    {
        super(size);
        icon = new ImageIcon(imageFile);
        type = 'p';
    }
    
    
    
}
