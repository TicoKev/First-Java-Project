
package proyecto_intro_programacion_u_gaming_grupo_7;

import javax.swing.JOptionPane;

public class Accesorios
{
    public static boolean ValidarOpcion;
    public static String accesorio;
    public static int cant;
    public static double Valor;
    public static double IVA=0.13;
    public static double Impuesto;
    public static double Total;
    public static double TotalV;
    public static double TotalI;
    public static double TotalC;
    public static int Cantidad;
    public static int TotalCV;
    
    public static ArregloAccesorios Accesorio[] = new ArregloAccesorios[7];
    
    public static void Rellenar_Accesorio()
    {
        Accesorio [0]= new ArregloAccesorios("Control de PS5",85,33, "MM007" );
        Accesorio [1]= new ArregloAccesorios("Contro Xbox series x y seruies S",75,17, "SS107" );
        Accesorio [2]= new ArregloAccesorios("Teclado Gamer Mecánico",150,25, "TT025" );
        Accesorio [3]= new ArregloAccesorios("Headset de alta calidad",90,10, "HG377" );
        Accesorio [4]= new ArregloAccesorios("Pantalla 4k 20 pulgadas",200,100, "LG344" );
        Accesorio [5]= new ArregloAccesorios("Silla gamer",250,8, "SG400" );
        Accesorio [6]= new ArregloAccesorios("Tarjeta grafica 4090",1000,26, "ND785" );
        
    }
    
    
    public static void Mostrar_Accesorios()
    {
            
            for (int i = 0; i < Accesorio.length; i++) 
        {
            JOptionPane.showMessageDialog(null, Accesorio[i].Nombre+" Precio: "+Accesorio[i].Precio+" Cantidad disponible :"+Accesorio[i].Cantidad+" Código: "+Accesorio[i].Codigo);
        }
    }
   public static void Comprar_Accesorios() 
    {
        Rellenar_Accesorio();
        Mostrar_Accesorios();
        boolean seguir = true;
        String opc = "";
        while (seguir) 
        {
            ValidarOpcion = true;
            while (ValidarOpcion) {
                opc = JOptionPane.showInputDialog("¿Qué desea adquirir?:\n"
                        + "1. Control de PS5\n"
                        + "2. Contro Xbox series x y series S\n"
                        + "3. Teclado Gamer Mecánico\n"
                        + "4. Headset de alta calidad\n"
                        + "5. Pantalla 4k 20 pulgadas\n"
                        + "6. Silla gamer\n"
                        + "7. Tarjeta grafica RTX 4090\n"
                        + "8. Salir y volver al menú anterior");
                Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea comprar"));

                Validar_Opciones(opc);
                    
                    
            }
            switch (opc) 
            {
                case "1":
                    for (int i=0; i<Accesorio.length; i++)
                    {
                        if (Cantidad<=Accesorio[i].Cantidad){
                        accesorio = Accesorio[i].Nombre;
                        cant=Accesorio[i].Cantidad-Cantidad;
                        Valor = Accesorio[i].Precio*Cantidad;
                        Impuesto = Valor*IVA;
                        Total = Valor + Impuesto;
                        
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Cantidad ingresada excede nuestro stock");
                            Cantidad=0;
                        }
                        break;
                        }
                    break;
                case "2":
                    for (int i=1; i<Accesorio.length; i++)
                    {
                        if (Cantidad<=Accesorio[i].Cantidad){
                        accesorio = Accesorio[i].Nombre;
                        cant=Accesorio[i].Cantidad-Cantidad;
                        Valor = Accesorio[i].Precio*Cantidad;
                        Impuesto = Valor*IVA;
                        Total = Valor + Impuesto;
                        
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Cantidad ingresada excede nuestro stock");
                            Cantidad=0;
                        }
                        break;
                        }
                    break;
                case "3":
                    for (int i=2; i<Accesorio.length; i++)
                    {
                        if (Cantidad<=Accesorio[i].Cantidad){
                        accesorio = Accesorio[i].Nombre;
                        cant=Accesorio[i].Cantidad-Cantidad;
                        Valor = Accesorio[i].Precio*Cantidad;
                        Impuesto = Valor*IVA;
                        Total = Valor + Impuesto;
                        
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Cantidad ingresada excede nuestro stock");
                            Cantidad=0;
                        }
                        break;
                        }
                    break;
                case "4":
                    for (int i=3; i<Accesorio.length; i++)
                    {
                        if (Cantidad<=Accesorio[i].Cantidad){
                        accesorio = Accesorio[i].Nombre;
                        cant=Accesorio[i].Cantidad-Cantidad;
                        Valor = Accesorio[i].Precio*Cantidad;
                        Impuesto = Valor*IVA;
                        Total = Valor + Impuesto;
                        
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Cantidad ingresada excede nuestro stock");
                            Cantidad=0;
                        }
                        break;
                        }
                    break;
                case "5":
                    for (int i=4; i<Accesorio.length; i++)
                    {
                        if (Cantidad<=Accesorio[i].Cantidad){
                        accesorio = Accesorio[i].Nombre;
                        cant=Accesorio[i].Cantidad-Cantidad;
                        Valor = Accesorio[i].Precio*Cantidad;
                        Impuesto = Valor*IVA;
                        Total = Valor + Impuesto;
                        
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Cantidad ingresada excede nuestro stock");
                            Cantidad=0;
                        }
                        break;
                        }
                    break;
                case "6":
                    for (int i=5; i<Accesorio.length; i++)
                    {
                        if (Cantidad<=Accesorio[i].Cantidad){
                        accesorio = Accesorio[i].Nombre;
                        cant=Accesorio[i].Cantidad-Cantidad;
                        Valor = Accesorio[i].Precio*Cantidad;
                        Impuesto = Valor*IVA;
                        Total = Valor + Impuesto;
                        
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Cantidad ingresada excede nuestro stock");
                            Cantidad=0;
                        }
                        break;
                        }
                    break;
                case "7":
                   for (int i=6; i<Accesorio.length; i++)
                    {
                        if (Cantidad<=Accesorio[i].Cantidad){
                        accesorio = Accesorio[i].Nombre;
                        cant=Accesorio[i].Cantidad-Cantidad;
                        Valor = Accesorio[i].Precio*Cantidad;
                        Impuesto = Valor*IVA;
                        Total = Valor + Impuesto;
                        
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Cantidad ingresada excede nuestro stock");
                            Cantidad=0;
                        }
                        break;
                        }
                    break;
                case "8":
                    seguir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
                    break;
            }
            int Otro = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra compra?");
            
            if(Otro==0) 
            {
                TotalV+=Valor;
                TotalI+=Impuesto;
                TotalC+=Total;
                TotalCV+=Cantidad;
                
            }   
            
            else if(Otro == 1)
                {
                    for (int i=0; i<Accesorio.length; i++)
                    {
                        if (Cantidad<=Accesorio[i].Cantidad)
                        {
                            TotalV+=Valor;
                            TotalI+=Impuesto;
                            TotalC+=Total;
                            TotalCV+=Cantidad;
                            JOptionPane.showMessageDialog(null, "Gracias por elegirnos\nDetalle de compra\n"
                                                                      + "Nombre: "+ Usuario.Nombre+ " "+ Usuario.Apellidos+"\n"
                                                                      + "Cédula: "+ Usuario.cedula+"\n"
                                                                      + "Número de teléfono: " + Usuario.telefono+"\n"
                                                                      + "Ciudad a entregar el producto: "+ Usuario.Ciudad+"\n"
                                                                      + "Cantidad Comprada: "+ TotalCV+"\n"
                                                                      + "Valor: $ "+ TotalV +"\n"
                                                                      + "Total de impuestos: $"+TotalI+"\n"
                                                                      + "Total a pagar: $"+ TotalC );
                            i=Accesorio.length;
                        }
                        else
                        {
                            i=Accesorio.length;
                            
                            JOptionPane.showMessageDialog(null,"Volviendo al menú anterior");
                            
                        }
                    }
                    seguir = false;
                }
            
        }
    }
        public static boolean Validar_Opciones(String Opcion)
        {
        if (Opcion.matches("[0-9]*"))
        {
            ValidarOpcion = false;
        } else {
            JOptionPane.showMessageDialog(null, "Digite un número para poder ingresar al menú.");
            ValidarOpcion = true;
        }
        return ValidarOpcion;
    }

    }
    
    


