/* Try this 1-1
   This program converts gallons to liters
   Call this program GaltoLit.java
*/

class GaltoLit{
    public static void main(String args[]){
	   double gallons; // holds the number of gallons
	   double liters; // holds the number of liters
	   
	   gallons = 10.0; // start with 10 gallons
	   liters = gallons * 3.7854; // convert to liters
	   
	   System.out.println(gallons + " gallons is " + liters + " liters");
	}
}