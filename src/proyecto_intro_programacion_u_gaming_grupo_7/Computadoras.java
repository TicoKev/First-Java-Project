package proyecto_intro_programacion_u_gaming_grupo_7;

import javax.swing.JOptionPane;

public class Computadoras {

    public static boolean ValidarOpcion;
    public static String Compu;
    public static double Valor, SubTotal, Total;
    public static double IVA= 0.13;
    public static double Impuesto;
    public static int cant=0;
    public static double TotalV;
    public static double TotalI;
    public static double TotalC;
    public static int TotalCV;
    public static ArregloComputadoras Computadoras[] = new ArregloComputadoras[4];
    public static ArregloLaptops Laptops[] = new ArregloLaptops[6];
    Persona clase = new Persona();
    
    
    
    public static void Rellenar_ComputadorasE()
    {
        Computadoras [0]= new ArregloComputadoras("Computadora Gamer gama baja",1300,12, "GB202" );
        Computadoras [1]= new ArregloComputadoras("Computadora Gamer gama media",1700,20, "GM940" );
        Computadoras [2]= new ArregloComputadoras("Computadora Gamer gama alta",3200,5, "GA400" );
        Computadoras [3]= new ArregloComputadoras("Computadora Gamer gama ultra",5000,32, "GU515" );
        
    }
    public static void Rellenar_Laptops()
    {
        
        Laptops [0]= new ArregloLaptops("Laptop Gamer Acer",1400, 25, "LA124" );
        Laptops [1]= new ArregloLaptops("Laptop Gamer Asus",2000,33, "LS800" );
        Laptops [2]= new ArregloLaptops("Laptop Gamer Lenovo",2400,50, "LL741" );
        Laptops [3]= new ArregloLaptops("Laptop Gamer Alienware",3800,40, "LN258" );
        Laptops [4]= new ArregloLaptops("Laptop Gamer HP",1600,15, "LH963" );
        Laptops [5]= new ArregloLaptops("Laptop Gamer MSI",2350,10, "LM321" );
        
    }
    
   

    public static void Comprar_Computadoras() 
    {
        Rellenar_ComputadorasE();
        Rellenar_Laptops();
        boolean seguir = true;
        String opc = "";
        while (seguir) {
            ValidarOpcion = true;
            while (ValidarOpcion) {
                opc = JOptionPane.showInputDialog("Elija una opción.\n"
                        + "1. Computadora de escritorio\n"
                        + "2. Laptop\n"
                        + "3 Salir y volver al menú principal");

                Validar_Opciones(opc);
            }
            switch (opc) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Opciones de computadoras de escritorio");
                    Mostrar_Computadoras();
                    Comprar_Escritorio();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Opciones de laptops");
                    Mostrar_Laptops();
                    Comprar_Laptop();
                    break;
                case "3":
                    seguir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
                    break;
                    
                

            }
        }

    }

    
    public static void Mostrar_Computadoras()
    {
        
        for (int i = 0; i < Computadoras.length; i++) 
        {
            JOptionPane.showMessageDialog(null, Computadoras[i].Nombre+" Precio: "+Computadoras[i].Precio+" Cantidad disponible :"+Computadoras[i].Cantidad+" Código: "+Computadoras[i].Codigo);
        }
        
    }
    
    
    public static void Mostrar_Laptops()
    {
        for (int i = 0; i < Computadoras.length; i++) 
        {
            JOptionPane.showMessageDialog(null, Laptops[i].Nombre+" Precio: "+Laptops[i].Precio+" Cantidad disponible :"+Laptops[i].Cantidad+" Código: "+Laptops[i].Codigo);
        }
    }
    
    public static void Comprar_Escritorio()
    {
        boolean seguir = true;
        while(seguir)
        {
        int comprar = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción que desea comprar\n"
                + "1. Computadora Gamer gama baja\n"
                + "2. Computadora Gamer gama media\n"
                + "3. Computadora Gamer gama alta\n"
                + "4. Computadora Gamer gama ultra"));
        int Cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas desea comprar?"));
                    
                    
            switch (comprar)
        {
                case 1:
                    for (int i=0; i<Computadoras.length; i++)
                    {
                        if (Cantidad<=Computadoras[i].Cantidad){
                        Compu = Computadoras[i].Nombre;
                        cant=Computadoras[i].Cantidad-Cantidad;
                        Valor = Computadoras[i].Precio*Cantidad;
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
                case 2:
                for (int i=1; i<Computadoras.length; i++)
                    {
                        if (Cantidad<=Computadoras[i].Cantidad){
                        Compu = Computadoras[i].Nombre;
                        cant=Computadoras[i].Cantidad-Cantidad;
                        Valor = Computadoras[i].Precio*Cantidad;
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
                case 3:
                
                    for (int i=2; i<Computadoras.length; i++)
                    {
                        if (Cantidad<=Computadoras[i].Cantidad){
                        Compu = Computadoras[i].Nombre;
                        cant=Computadoras[i].Cantidad-Cantidad;
                        Valor = Computadoras[i].Precio*Cantidad;
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
                case 4:
                
                    for (int i=3; i<Computadoras.length; i++)
                    {
                        if (Cantidad<=Computadoras[i].Cantidad){
                        Compu = Computadoras[i].Nombre;
                        cant=Computadoras[i].Cantidad-Cantidad;
                        Valor = Computadoras[i].Precio*Cantidad;
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
                    for (int i=0; i<Computadoras.length; i++)
                    {
                        if (Cantidad<=Computadoras[i].Cantidad)
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
                            i=Computadoras.length;
                        }
                        else
                        {
                            i=Computadoras.length;
                            
                            JOptionPane.showMessageDialog(null,"Volviendo al menú anterior");
                            
                        }
                    }
                   
                    seguir = false;
                }
        }
    }
    public static void Comprar_Laptop()
    {
        boolean seguir = true;
        while(seguir)
        {
        int comprar = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción que desea comprar\n"
                + "1. Laptop Gamer Acer\n"
                + "2. Laptop Gamer Asus\n"
                + "3. Laptop Gamer Lenovo\n"
                + "4. Laptop Gamer Alienware\n"
                + "5. Laptop Gamer HP\n"
                + "6. Laptop Gamer MSI"));
        int Cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas desea comprar?"));
                    
                    
        
            switch (comprar)
        {
                case 1:
                    for (int i=0; i<Laptops.length; i++)
                    {
                        if (Cantidad<=Laptops[i].Cantidad){
                        Compu = Laptops[i].Nombre;
                        cant=Laptops[i].Cantidad-Cantidad;
                        Valor = Laptops[i].Precio*Cantidad;
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
                case 2:
               
                    for (int i=1; i<Laptops.length; i++)
                    {
                        if (Cantidad<=Laptops[i].Cantidad){
                        Compu = Laptops[i].Nombre;
                        cant=Laptops[i].Cantidad-Cantidad;
                        Valor = Laptops[i].Precio*Cantidad;
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
                    
                case 3:
                for (int i=2; i<Laptops.length; i++)
                    {
                        if (Cantidad<=Laptops[i].Cantidad){
                        Compu = Laptops[i].Nombre;
                        cant=Laptops[i].Cantidad-Cantidad;
                        Valor = Laptops[i].Precio*Cantidad;
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
                case 4:
                for (int i=3; i<Laptops.length; i++)
                    {
                        if (Cantidad<=Laptops[i].Cantidad){
                        Compu = Laptops[i].Nombre;
                        cant=Laptops[i].Cantidad-Cantidad;
                        Valor = Laptops[i].Precio*Cantidad;
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
                case 5:
                    for (int i=4; i<Laptops.length; i++)
                    {
                        if (Cantidad<=Laptops[i].Cantidad){
                        Compu = Laptops[i].Nombre;
                        cant=Laptops[i].Cantidad-Cantidad;
                        Valor = Laptops[i].Precio*Cantidad;
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
                case 6:
                    for (int i=5; i<Laptops.length; i++)
                    {
                        if (Cantidad<=Laptops[i].Cantidad){
                        Compu = Laptops[i].Nombre;
                        cant=Laptops[i].Cantidad-Cantidad;
                        Valor = Laptops[i].Precio*Cantidad;
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
                TotalCV+= Cantidad;
            }   
            
            else if(Otro == 1)
                {
                    for (int i=0; i<Computadoras.length; i++)
                    {
                        if (Cantidad<=Computadoras[i].Cantidad)
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
                            i=Computadoras.length;
                        }
                        else
                        {
                            i=Computadoras.length;
                            
                            JOptionPane.showMessageDialog(null,"Volviendo al menú anterior");
                            
                        }
                    }
                    seguir = false;
                }
            
        }
    }

    public static boolean Validar_Opciones(String Opcion) {
        if (Opcion.matches("[0-9]*")) {
            ValidarOpcion = false;
        } else {
            JOptionPane.showMessageDialog(null, "Digite un número para poder ingresar al menú.");
            ValidarOpcion = true;
        }
        return ValidarOpcion;
    }
    
    
}
