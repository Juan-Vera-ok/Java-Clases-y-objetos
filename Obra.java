public class Obra
{
   private String NombreDeObra;
   private int Precio;
   
   public Obra()
   {
      NombreDeObra="Don Quijote";
      Precio=150;
   }
   
   public Obra(String a, int b)
   {
      NombreDeObra=a;
      Precio=b;
   }
   
   public void setNombreDeObra(String c)
   {
      NombreDeObra=c;
   }
   
   public void setPrecio(int c)
   {
      Precio=c;
   }
   
   public String getNombreDeObra()
   {
      return NombreDeObra;
   }
   
   public int getPrecio()
   {
      return Precio;
   }
   
   
}