public class Surtidor
{
   private int Capacidad;
   private int CantidadActual;
   
   public Surtidor()
   {
      Capacidad=10000;
      CantidadActual=10000;
   }
   
   public void sacarCombustible(int n)
   {
      CantidadActual=CantidadActual-n;
   }
   
   public void cargarCombustible(int n)
   {
      CantidadActual=CantidadActual+n;
   }
   
   public int getCantidadActual()
   {
      return CantidadActual;
   }
}