package tabaar;

import java.util.ArrayList;

/**
 *
 * @author tblyons
 */
public class Continent
{

   /**
    * mBonus sets the Continent's bonus.
    */
   final int mBonus;

   /**
    * mCountries contains the Countries that make up the Continent
    */
   ArrayList<Country> mCountries;

   /**
    * The default constructor should never be used.
    */
   public Continent()
   {
      mBonus = 0;
   }
}
