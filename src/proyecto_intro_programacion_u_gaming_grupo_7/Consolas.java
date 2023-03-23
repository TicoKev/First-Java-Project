package proyecto_intro_programacion_u_gaming_grupo_7;

import javax.swing.JOptionPane;

class Consolas {

    public static String Consolas[] = new String[5];
    public static double Precio;
    public static double IVA=0.13;
    public static double Impuesto;
    public static double Total;
    public static double TotalP;
    public static double TotalI;
     public static double TotalC;
    

    public static void Rellanar_Consolas() {
        for (int f = 0; f < Consolas.length; f++) {
            Consolas[0] = "PlayStation 5 Digital";
            Consolas[1] = "PlayStation 5";
            Consolas[2] = "X box series X";
            Consolas[3] = "X box series S";
            Consolas[4] = "Nitendo Switch";
        }
    }

    public static void Mostrar_Consolas() {
        String cadena = "";

        for (int i = 0; i < Consolas.length; i++) {

            cadena += Consolas[i] + "\n";

        }

        JOptionPane.showMessageDialog(null, "Consolas disponibles:\n" + cadena);
    }
    public static void Comprar_Consolas()
    {
        Rellanar_Consolas();
        Mostrar_Consolas();
        boolean seguir = true;
        while(seguir)
        {
           int comprar = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción que desea comprar\n"
                                                                      + "1. PlayStation 5 Digital\n"
                                                                      + "2. PlayStation 5\n"
                                                                      + "3. Xbox series X\n"
                                                                      + "4. Xbox series S\n"
                                                                      + "5. Nitendo Switch"));
           int Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que desea comprar"));
           switch(comprar)
           {
               case 1:
                  Precio = 700*Cantidad;
                  Impuesto= Precio*IVA;
                  Total= Precio+Impuesto;
                  break;
               case 2:
                  Precio = 900*Cantidad;
                  Impuesto= Precio*IVA;
                  Total= Precio+Impuesto;
                  break;
                case 3:
                  Precio = 800*Cantidad;
                  Impuesto= Precio*IVA;
                  Total= Precio+Impuesto;
                  break;
                case 4:
                  Precio = 600*Cantidad;
                  Impuesto= Precio*IVA;
                  Total= Precio+Impuesto;
                  break;
                 case 5:
                  Precio = 450*Cantidad;
                  Impuesto= Precio*IVA;
                  Total= Precio+Impuesto;
                  break;
                 default:
                     JOptionPane.showMessageDialog(null, "Opción incorrecta");
                     
           }
           int OtroR = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra compra?");
            
            if(OtroR==0) 
            {
                TotalP+=Precio;
                TotalI+=Impuesto;
                TotalC+=Total;
            }   
            
            else if(OtroR == 1)
                {
                    TotalP+=Precio;
                    TotalI+=Impuesto;
                    TotalC+=Total;
                    JOptionPane.showMessageDialog(null, "Gracias por elegirnos\nDetalle de compra\n"
                                                                      + "Nombre: "+ Usuario.Nombre+ " "+ Usuario.Apellidos+"\n"
                                                                      + "Cédula: "+ Usuario.cedula+"\n"
                                                                      + "Número de teléfono: " + Usuario.telefono+"\n"
                                                                      + "Ciudad a entregar el producto: "+ Usuario.Ciudad+"\n"
                                                                      + "Valor: $ "+ TotalP +"\n"
                                                                      + "Total de impuestos: $"+TotalI+"\n"
                                                                      + "Cantidad de unidades compradas: "+Cantidad+"\n"
                                                                      + "Total a pagar: $"+TotalC );
                    seguir = false;
                }
           
        }
     
    
    }

   

}
