package cajaBlanca;
//@author alibymy

public class CajaBlanca
{
	 /**
     * @param args the command line arguments
     * El codigo imprime un mensaje e imprime un numero aleatorio.
     */
	 public static void main(String[] args) 
    {
        
        mensaje();
    
        System.out.println(funcion()); 
        
  
    }
	/*
	 * @return devuelve un numero entero aleatorio del 0 al 199.
	 */
	
    private static int funcion()
    {
        return (int) (Math.random()*200-1);
    }
    
    public static void mensaje()
    {
        System.out.println("Adivina el número del 1 al ... ");
    }
   
}
