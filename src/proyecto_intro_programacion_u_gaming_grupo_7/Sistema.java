package proyecto_intro_programacion_u_gaming_grupo_7;

import javax.swing.JOptionPane;

public class Sistema 
{
    
    
    public static  int OpcionCompra, OpcionD;
    
    
    
    public static void Sistema_Tienda()
    {
        boolean seguir = true;
        while (seguir){
            OpcionCompra = Integer.parseInt(JOptionPane.showInputDialog("En nuestra tienda ofrecemos artículos de la más alta calidad.\n"+
                                                                      "Opciones de compra:\n"
                                                                    + "1. Comprar una computadora.\n"
                                                                    + "2. Comprar Consolas.\n"+
                                                                      "3. Comprar Accesorios.\n"
                                                                    + "4 Salir"));
            switch(OpcionCompra)
        {
                case 1:
                Computadoras.Comprar_Computadoras();
                    break;
                case 2:
                    Consolas.Comprar_Consolas();
                    break;
                case 3:
                    Accesorios.Comprar_Accesorios();
                    break;
                case 4:
                    
                    seguir= false;
                    break;
                
        }
        }
    
    
    }
    
    public static String  Contactar()
    {
        String Correo = "Correo eléctronico: InformacionTienda@tiendaugaming.com\n";
        String Telefono = "Números de teléfonoo 24313361 & 88668866";
        String informacion = Correo + Telefono;
        JOptionPane.showMessageDialog(null, informacion);
        return informacion;
    }
}
