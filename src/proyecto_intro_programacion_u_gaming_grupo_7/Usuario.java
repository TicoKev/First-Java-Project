package proyecto_intro_programacion_u_gaming_grupo_7;

import javax.swing.JOptionPane;

public class Usuario {

    public static String Nombre, Apellidos, Ciudad,cedula, telefono;
    Persona miclase = new Persona();
    
   

    public void IngresarDatos()
            
    {
        boolean seguir = true;
        Estados estadoU = Estados.Inactivo;
        while(seguir)
        {
            JOptionPane.showMessageDialog(null, "¡Hola! Para accesar a nuestro sistema debe crear un usuario primero.\n"
                                                            + "En este momento su usuario se encuentra: "+ estadoU
                                                            + ". Por favor ingrese lo que se le solicita");
                                                            Nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                                                            Apellidos = JOptionPane.showInputDialog("Ingrese sus Apellidos");
                                                            cedula = JOptionPane.showInputDialog("Ingrese su cédula");
                                                            Ciudad = JOptionPane.showInputDialog("Ingrese la ciudad");
                                                            telefono = JOptionPane.showInputDialog("Ingrese su número de télefono");
            String Usuario = JOptionPane.showInputDialog("Cree su usuario");
            String Pass = JOptionPane.showInputDialog("Cree su contraseña");
            miclase.setTelefono(telefono);
            miclase.setCedula(cedula);
            
            
            JOptionPane.showMessageDialog(null, "Su información es:\n"
                + "Nombre: " + Nombre + "\nApellidos: " + Apellidos + "\nCédula: " + cedula + "\nCiudad: " + Ciudad + "\nTélefono: " + telefono+ 
                    "\nUsuario: "+Usuario+"\nPass: "+Pass);
            
            int Confirmacion =JOptionPane.showConfirmDialog(null, "¿Está la información correcta?");
            if (Confirmacion== 0)
            {
                estadoU=Estados.Activo;
                JOptionPane.showMessageDialog(null, "Usuario registrado, su usuario se encuentra: "+ estadoU);
                
                seguir = false;
            }
            
        }
    }
    

    
}
