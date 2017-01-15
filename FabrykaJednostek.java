package statki;


public class FabrykaJednostek {
    
    Jednostka ProdukcjaJednostek(int rodzaj, int size){
    Jednostka unit = null;
        switch (rodzaj) {
            case 0:
                unit = new Statek(size);
                break;
            case 1:
                unit = new Pojazd(size);
                break;
            case 2:
                unit = new Samolot(size);
        }
        return unit;
    }
    
}
