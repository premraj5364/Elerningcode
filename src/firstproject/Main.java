package firstproject;
// Java Program to check the size
// using the switch...case statement

class Main {
  public static void main(String[] args) {

    int number =11;
    switch (number) {

      case 1:
        System.out.println("this is yur year numbers January");
        break;

      case 2:
        System.out.println("February");
        break;

      case 3:
       System.out.println("Marh");
        break;

      case 4:
        System.out.println("Aprial");
        break;
      case 5:
    	  System.out.println("May");
    	  break;
      case 6:
    	  System.out.println("June");
      break;
      case 7:
    	  System.out.println("July");
    	  break;
      case 8:
    	  System.out.println("August");
    	 break;
      case 9:
    	  System.out.println("September");
    	break;
      case 10:
    	  System.out.println("Octomber");
    	  break;
      case 11:
    	  System.out.println("November");
    	  break;
      case 12:
    	  System.out.println("December");
    	  break;
      default:
        System.out.println("Invilade Data");
        break;

    }
   // System.out.println("it is year name " +number );
  }
}