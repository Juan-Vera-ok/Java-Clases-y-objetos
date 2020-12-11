public class Teatro
{
   private String NombreTeatro;
   private String Direccion;
   private Obra Ob[];
   private int i;
   
   public Teatro(int dim)
   {
      NombreTeatro="Obispado";
      Direccion="Velez Zarfiel";
      Ob=new Obra[dim];
      int i=0;
   }
   
   public void setObras(Obra O)
   {
      Ob[i]=O;
      i=i+1;
   }
   
   public int getPrecioDeObra(int pos)
   {
      return Ob[pos].getPrecio();
   }
   
   public String getNombre(int pos)
   {
      return Ob[pos].getNombreDeObra();
   }

   
   
   
   
   
   
}