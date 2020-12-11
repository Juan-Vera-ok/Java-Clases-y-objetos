public class MainMainMain
{
   public static void main (String[]args)
   {
      Teatro t1;
      Obra o;
      int cantidad,i,b;
      String a;
      
      
      
      cantidad=Console.readInt("Ingrese cantidad de obras");
      t1=new Teatro(cantidad);
      for(i=0;i<cantidad;i++)
      {
         a=Console.readString("Ingrese nombre de obra");
         
         b=Console.readInt("Ingrese precio de obra");
         o=new Obra(a,b);
         t1.setObras(o);
         System.out.println(t1.getNombre(i));
         System.out.println(t1.getPrecioDeObra(i));

      }
      
      
   }
}