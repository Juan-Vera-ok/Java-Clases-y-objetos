public class Main2
{
   public static void main (String[]args)
   {
      Vector v1= new Vector();
      int i;
      for(i=0;i<v1.getDim();i++)
      {
      System.out.println("Ingrese un elemento");
      int e=Console.readInt();
      v1.cargarElemento(e);
      }
      
      for(i=0;i<v1.getDim();i++)
      {
      System.out.println(v1.getElementoPos(i));
      }   
      
      double prom=v1.calcularPromedio(); 
      System.out.println(prom);
   }
}