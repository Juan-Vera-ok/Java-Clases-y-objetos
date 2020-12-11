public class Main3
{
   public static void main (String[]args)
   {
      Libro l1,l2;
      l1=new Libro();
      
      l1.setNombre("Nombre de libro");
      System.out.println(l1.getNombre());
      
      l1.setPaginasTotales(100);
      System.out.println(l1.getPaginasTotales());
      
      l1.setPaginaActual(1);
      System.out.println(l1.getPaginaActual());
   }
}