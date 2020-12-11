public class Estacion
{
   private int cantidadSurtidores, can,i;
   private Surtidor Surt[];
   
   public Estacion(int cS)
   {
      can = cS;
      Surt = new Surtidor[can];
      cantidadSurtidores= cS;
      int i=0;
   }
   
   
   public void setSurtidores(Surtidor c)
   {
      Surt[i]=c;
      i=i+1;
      
   }
   
   public int getSurtidoresTotales()
   {
      return can;
   }
   
   public int getSurtidor(int pos)
   {
      return Surt[pos].getCantidadActual();
   }
} 