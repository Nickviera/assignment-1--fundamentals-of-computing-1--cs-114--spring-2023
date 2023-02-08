    //**************************************************************************************
    //  Assignment1.java          Author: Nicolas Viera
    //***************************************************************************************

    import java.util.Random;
    import java.util.Scanner;

    public class Assignment1 {

    public static void main(String[] args) {
      //--------------------------------------------------------------------------------------
      // Code that dislays the my initials (NV)
      //
      //--------------------------------------------------------------------------------------


      System.out.println(" NN             NN  VV                      VV   ");
      System.out.println(" NN NN          NN   VV                    VV    ");
      System.out.println(" NN  NN         NN    VV                  VV     ");
      System.out.println(" NN   NN        NN     VV                VV      ");
      System.out.println(" NN     NN      NN      VV              VV       ");
      System.out.println(" NN      NN     NN       VV            VV        ");
      System.out.println(" NN       NN    NN        VV          VV         ");
      System.out.println(" NN        NN   NN         VV        VV          ");
      System.out.println(" NN         NN  NN           VV     VV           ");
      System.out.println(" NN          NN NN             VV  VV            ");
      System.out.println(" NN            NN                VVV             ");




      // ---------------------------------------------------------------------------------------
      //  Code to enter a number in Fahrenheit to convert the value to Celsius
      //
      //----------------------------------------------------------------------------------------

        double fahrenheitTemp;
        Scanner scan = new Scanner(System.in) ;

        System.out.println ("Enter your number in Fahrenheit, please: " ) ;
        fahrenheitTemp = scan.nextDouble();


        final int BASE = 32;
        final double CONVERSION = 5.0 / 9.0 ;

        double celsiusTemp ;


        celsiusTemp = (fahrenheitTemp - BASE) * CONVERSION ;

        System.out.println("Fahrenheit Temperature entered : " + fahrenheitTemp);
        System.out.println("Celsius Conversion: " + celsiusTemp);

      // ---------------------------------------------------------------------------------
      // Code takes in user input of a 5 charater string , saves in reverse without
      //  1st and last characters.
      //----------------------------------------------------------------------------------

        String Characters1, Character2, Character3;

        System.out.println ("Enter five Characters, please: " ) ;
        Characters1 = scan.next( );

        System.out.println( "Charters Entered : " +  Characters1 );

        Character2 = Characters1 . substring (1,4);
        Character3 = new StringBuilder (Character2).reverse().toString();

        System.out.println("Your new characters are: "+ Character3);
      //-----------------------------------------------------------------------------------
      // Generate and save a random number between 32-16,384
      //
      //-----------------------------------------------------------------------------------
        Random generator = new Random();
        int number;

        number = generator.nextInt(16384)+32;
        System.out.println("From 32 to 16,384 your random number is :" + number);
      //------------------------------------------------------------------------------------
      // Combining results from steps 2 - 4
      //
      //------------------------------------------------------------------------------------

      System.out.println("Now generating fianl results...");
      System.out.print("Combination of all results  are : " + celsiusTemp + Character3 + number);
    }
}
