package tabaar;

/**
 *
 * @author tblyons
 */
public class Card
{

   /**
    * mCountry holds a reference to the Country this card is tied to.
    */
   Country mCountry;

   /**
    * mType keeps track of what type this card is.
    */
   final int mType;

   /**
    * The default constructor should never be used.
    */
   public Card()
   {
      mType = 0;
   }
}
