package se.lexicon.andreasm;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int nummer=1;
        System.out.println( "Hello World!" );
        System.out.println( "Goodbye World!" );
        System.out.println( "No World!" );
        // System.in.read(nummer);

        int siffra=2;
        int summa=nummer+siffra;
        System.out.println(summa++);

        String name = "Andreas";
        name = name + " Mångs";
        System.out.println(name);


    }
}
