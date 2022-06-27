import model.*;
public class test {
    public static void main(String[] args){

        Printer p1 = new Printer();
        Printer p2 = new ColorPrinter();
        Printer p3 = new BlackAndWhitePrinter();
        p1.printing();
        p2.printing();
        p3.printing();
    }

}
