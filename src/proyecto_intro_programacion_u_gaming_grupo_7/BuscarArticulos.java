
package proyecto_intro_programacion_u_gaming_grupo_7;

import javax.swing.JOptionPane;

public class BuscarArticulos {
    
    public static void Buscar_ComputadorasE()
    {
        
        boolean seguir = true;
        int contador =0;
        
        while(seguir)
        {
            String Consultar = JOptionPane.showInputDialog("Ingrese el tipo de computadora gamer que desea, por ejemplo 'Computadora Gamer gama baja'");
        
            
                for (int i=0; i<Computadoras.Computadoras.length; i++)
                {
                    if(Computadoras.Computadoras[i].Nombre.equals(Consultar))
                    {
                  
                        JOptionPane.showMessageDialog(null,Consultar + " Sí tenemos disponible: \n");
                    }
                else
                {
                    contador++;
                }
                
                }
           
            if(contador == (Computadoras.Computadoras.length)){
                JOptionPane.showMessageDialog(null, "No hay este artículo en stock");
            }
            int Otro = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra consulta?");
            
            if(Otro == 1)
            {
                seguir = false;
            }
            contador = 0;
        }   
    }
    public static void Buscar_Laptops()
    {
        
        boolean seguir = true;
        int contador =0;
        
        while(seguir)
        {
            String Consultar = JOptionPane.showInputDialog("Ingrese el tipo de computadora gamer que desea, por ejemplo 'Laptop Gamer Acer'");
        
            
                for (int i=0; i<Computadoras.Laptops.length; i++)
                {
                    if(Computadoras.Laptops[i].Nombre.equals(Consultar))
                    {
                  
                        JOptionPane.showMessageDialog(null,Consultar + " Sí tenemos disponible: \n");
                    }
                else
                {
                    contador++;
                }
                
                }
           
            if(contador == (Computadoras.Laptops.length)){
                JOptionPane.showMessageDialog(null, "No hay este artículo en stock");
            }
            int Otro = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra consulta?");
            
            if(Otro == 1)
            {
                seguir = false;
            }
            contador = 0;
        }   
    }
    public static void Buscar_Accesorio()
    {
        
        boolean seguir = true;
        int contador =0;
        
        while(seguir)
        {
            String Consultar = JOptionPane.showInputDialog("Ingrese el tipo de artículo, por ejemplo 'Silla gamer'");
        
            
                for (int i=0; i<Accesorios.Accesorio.length; i++)
                {
                    if(Accesorios.Accesorio[i].Nombre.equals(Consultar))
                    {
                  
                        JOptionPane.showMessageDialog(null,Consultar + " Sí tenemos disponible: \n");
                    }
                else
                {
                    contador++;
                }
                
                }
           
            if(contador == (Accesorios.Accesorio.length)){
                JOptionPane.showMessageDialog(null, "No hay este artículo en stock");
            }
            int Otro = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra consulta?");
            
            if(Otro == 1)
            {
                seguir = false;
            }
            contador = 0;
        }   
    }
    public static void Buscar_Consolas()
    {
        
        boolean seguir = true;
        int contador =0;
        
        while(seguir)
        {
            String Consultar = JOptionPane.showInputDialog("Ingrese consola, por ejemplo 'PlayStation 5'");
        
            
                for (int i=0; i<Consolas.Consolas.length; i++)
                {
                    if(Consolas.Consolas[i].equals(Consultar))
                    {
                  
                        JOptionPane.showMessageDialog(null,Consultar + " Sí tenemos disponible: \n");
                    }
                else
                {
                    contador++;
                }
                
                }
           
            if(contador == (Consolas.Consolas.length)){
                JOptionPane.showMessageDialog(null, "No hay este artículo en stock");
            }
            int Otro = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra consulta?");
            
            if(Otro == 1)
            {
                seguir = false;
            }
            contador = 0;
        }   
    }
    public static void Menu_Articulo()
    {
        boolean seguir=true;
        while(seguir)
        {
            int buscar = Integer.parseInt(JOptionPane.showInputDialog("Digite lo que desea buscar\n"
                    + "1. Buscar computadora gamer de escritorio\n"
                    + "2. Buscar laptops gamer\n"
                    + "3. Buscar Accesorios\n"
                    + "4. Buscar Consolas\n"
                    + "5. Salir"));
            switch(buscar)
            {
                case 1:
                    Buscar_ComputadorasE();
                    break;
                case 2:
                    Buscar_Laptops();
                    break;
                case 3:
                    Buscar_Accesorio();
                    break;
                case 4:
                    Buscar_Consolas();
                    break;
                case 5:
                    seguir = false;
                    break;
            }
        }
    
    }
    
    
}
