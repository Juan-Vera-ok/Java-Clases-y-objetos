public class Main4
{
   public static void main (String[]args)
   {
      Clase c1;
      Alumno al;
      c1=new Clase(3);
      int i,a,b;
      String c;
      
      
        for(i=0;i<3;i++)
        {
        a=Console.readInt("Ingrese dni");
        
        b=Console.readInt("Ingrese edad");
        
        c=Console.readString("Ingrese nombre");
        
        al=new Alumno(a,b,c);
        c1.setAlumno(al);
        }
        c1.getObjetoAlumno();
        
      //System.out.println(c1.dniMenor(c1.getObjetoAlumno(0),1,0,3,0));  
        
      
   }
}