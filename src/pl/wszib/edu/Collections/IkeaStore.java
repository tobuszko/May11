package pl.wszib.edu.Collections;

public class IkeaStore {


    public static void main(String[] args) {

        Chair ch1 = new Chair("ASAaa", "IKEA", 2016);
        Chair  ch2 = new Chair("dfdfd", "IKEA", 2016);
        Chair  ch3 = new Chair("dfdfd", "IKEA", 2015);
        Chair  ch4 = new Chair("ASAaa", "IKEA", 2016);

        System.out.println(" ch1.equals(ch2) " + ch1.equals(ch2));
        System.out.println(" ch1.equals(ch3) " + ch1.equals(ch3));
        System.out.println(" ch1.equals(ch4) " + ch1.equals(ch4));
        System.out.println(" ch1.equals(null) " + ch1.equals(null));


        System.out.println(ch1.hashCode());
        System.out.println(ch2.hashCode());
        System.out.println(ch3.hashCode());
        System.out.println(ch4.hashCode());
    }


}
