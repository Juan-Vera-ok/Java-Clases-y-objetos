public class Alumno
{
   private int dni,edad;
   private String Nombre;
   private boolean recursa;
   
   
   
   public Alumno(int a, int b, String c)
   {
      dni=a;
      edad=b;
      Nombre=c;
   }
   
   public void setDni(int d)
   {
      dni=d;
   }
   
   public void setEdad(int e)
   {
      edad=e;
   }
   public void setNombre(String f)
   {
      Nombre=f;
   }
   public int getDni()
   {
      return dni;
   }
   public int getEdad()
   {
      return edad;
   }
   public String getNombre()
   {
      return Nombre;
   }
   
   
   public void Recursante(boolean p)
   {
      recursa=p;
   }
   
   
   

}