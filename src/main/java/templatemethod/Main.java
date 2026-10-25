package templatemethod;

public class Main {

    public static void main( String[] args ) {
        Bebida cafe = new Cafe();
        Bebida te = new Te();

        System.out.println( "--- Café ---" );
        System.out.println( cafe.prepararBebida() );

        System.out.println( "--- Té ---" );
        System.out.println( te.prepararBebida() );
    }
}
