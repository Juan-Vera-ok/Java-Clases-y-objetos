public class Main
{
   public static void main (String[]args)
   {
      String cadena = "Sistema";
      
      boolean contiene=false;
      
      contiene = cadena.contains("S");
      System.out.println(contiene);
      
      if(contiene)
      System.out.println("El caracter esta");
      else
         System.out.println("No se encuentra el caracter");
         
     String nueva = cadena.replace('s','z');
     System.out.println("Cadena original "+nueva);
   }
}