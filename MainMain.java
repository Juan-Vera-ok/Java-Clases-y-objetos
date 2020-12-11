public class MainMain
{
   public static void main (String[]args)
   {
      Estacion e1;
      Surtidor s;
      int surt;
      int i,n;
      
      surt=Console.readInt("Ingrese cantidad de surtidores");
      
      e1=new Estacion(surt);
      
      for(i=0;i<surt;i++)
      {
         s=new Surtidor();
         n=Console.readInt("Ingrese cantidad para sacar combustible");
         s.sacarCombustible(n);
         e1.setSurtidores(s);
      }
      
      //System.out.println(s1.getCantidadActual());
      //System.out.println(e1.getSurtidor(s1.getCantidadActual()));
      System.out.println(e1.getSurtidor(0));
      System.out.println(e1.getSurtidor(1));
      System.out.println(e1.getSurtidor(2));
   
   }
}