public class Vector
{
   private int dim;
   private int []elementos;
   private int indice;
   
   public Vector()
   {
      dim=5;
      elementos=new int [dim];
      indice=0;
   }
   
   public void cargarElemento(int e)
   {
      elementos[indice]=e;
      indice=indice+1;
   }
   
      
   public int getDim()
   {
      return dim;
   }
   
   
   public int getElementoPos(int p)
   {
      return elementos [p];
   }
   
   public double calcularPromedio()
   {
      int suma=0;
      int i;
      for(i=0;i<dim;i=i+1)
      suma=elementos[i]+suma;
      
      return ((double)suma/(double)dim);  
   }
}