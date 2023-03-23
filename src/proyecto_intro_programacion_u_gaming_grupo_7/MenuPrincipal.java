
package proyecto_intro_programacion_u_gaming_grupo_7;

import javax.swing.JOptionPane;

public class MenuPrincipal 
{
   Usuario claseUsuario = new Usuario();
    
    boolean ValidarOpcion;
    Sistema ClaseSistema = new Sistema ();
    
    public void Menu_Principal()
    {
        claseUsuario.IngresarDatos();
        Computadoras.Rellenar_ComputadorasE();
        Computadoras.Rellenar_Laptops();
        Consolas.Rellanar_Consolas();
        Accesorios.Rellenar_Accesorio();
        
        boolean seguir = true;
        String opc ="";
        while (seguir)
        {
            ValidarOpcion = true;
            while(ValidarOpcion)
            {
                opc = JOptionPane.showInputDialog("Bienvenido a la tienda U Gaming, por favor seleccione una opción.\n"
                        + "1. Tienda\n"
                        + "2. Buscar artículo\n"
                        + "3. Contactar con la tienda\n"
                        + "4. Salir del sistema");
                
                Validar_Opciones(opc);
            }
            switch (opc)
            {
                case "1":
                    ClaseSistema.Sistema_Tienda();
                    break;
                case "2":
                    BuscarArticulos.Menu_Articulo();
                    break;
                case "3":
                    ClaseSistema.Contactar();
                    break;
                case "4":
                    seguir = false;
                    break;
                 default:
                    JOptionPane.showMessageDialog(null,"Opcion ingresada es incorrecta. Intente de nuevo.");
                    break;
            }
        }
    }
    
    
    public boolean Validar_Opciones(String Opcion)
    {
       if (Opcion.matches("[0-9]*"))
       {
           ValidarOpcion = false;
       } 
       else
       {
           JOptionPane.showMessageDialog(null, "Digite un número para poder ingresar al menú.");
           ValidarOpcion = true;
       }
       return ValidarOpcion;
    }
    
    
}
