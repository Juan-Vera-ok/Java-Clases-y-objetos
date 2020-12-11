public class Clase
{
   private Alumno Al[];
   private int edadPromedio,recursantes;
   private int i=0;
   
   public Clase(int dim)
   {
      Al=new Alumno[dim];
      edadPromedio=0;
      recursantes=0;
   }
   public void setAlumno(Alumno a)
   {
      Al[i]=a;
      i=i+1;
   }
   
   public Alumno getObjetoAlumno()
   {
      return Al[0];
   }
   
   
   
   public int dniMenor(Alumno Al[],int j,int i,int dim,int menor)
   {
      
      
         if(Al[i].getEdad()<Al[j].getEdad())
         {
         menor=Al[i].getEdad();
         return dniMenor(Al,j+1,i+1,dim,menor);
         }
         else
            return menor;
      
   }
   
}