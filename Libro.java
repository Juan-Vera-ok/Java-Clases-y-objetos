public class Libro
{
   private String nombre;
   private int paginasTotales;
   private int paginaActual;
   
   public void setNombre(String a)
   {
      nombre=a;
   }
   
   public String getNombre()
   {
      return nombre;
   }
   
   public void setPaginasTotales(int b)
   {
      paginasTotales=b;
   }
   
   public int getPaginasTotales()
   {
      return paginasTotales;
   }
   
   
   public void setPaginaActual(int c)
   {
      paginaActual=c;
   }
   
   
   public int getPaginaActual()
   {
      return paginaActual;
   }
   
}