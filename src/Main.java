public class Main {
    public static void main(String args[]) {
        ejercicio1("banana");
        ejercicio2("compra");
        ejercicio3("algo");
        ejercicio4("castep");
        ejercicio5("aura");
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }

    
    public static void ejercicio1(String producto){
        int id = 121;
        char categoria = 'A';
        double precio = 0.78;
        int stock = 3;
        boolean rebaja = false;

            informacionProducto(id, categoria, precio, stock);
            hayRebaja(rebaja);
       
    }
        public static void informacionProducto(int id, char cat, double pr, int st) {
             System.out.print("ID: " + id + "\n");
            System.out.print("Categoria: " + cat + "\n");
            System.out.print("Precio: " + pr + "\n");
            System.out.print("Disponibles: " + st + "\n");
        }

        public static void hayRebaja(boolean rebaja){
            if(rebaja == false){
                System.out.println("No esta en rebaja");
            }else{
                System.out.println("Esta rebajado");
            }
        }

    
    public static void ejercicio2(String compra){
        final double IVA = 0,21;
        final double DESCUENTO_PROMO = 5;
        int precioArticulo = 120;

            mostrarValores(IVA, DESCUENTO_PROMO, precioArticulo);


        
    }

    public static void mostrarValores(double IVA, double desc, int prec){
        System.out.println("precio con descuento: " + prec - desc);
        System.out.println("precio total con iva: " + (prec - desc)*(1+IVA));
    }
        


    
    public static void ejercicio3(){

        int primererNumero = 10;
        double precioFinal = 99.9;
        boolean esMaryorDeEdad = true;
        final float PI_VALOR = 3.1416f;
    }

    public static void ejercicio4(){
        double precioExacto = 49,99;
        int soloEntra = (int)precioExacto;
        char letra = 'A';
        //Casteo a int y se pasa a ASCI
        System.out.println((int)letra);
    }

    public static void ejercicio5(){
        int segundos = 3725;
        int horas = segundos/3600;
        int restanteHoras = segundos%3600;
        int minutos = restanteHoras/60;
        int restanteMinutos = restanteHoras%60;
        int Segundos = restanteMinutos
        
        
        
    }

    public static void ejercicio6(){
        int anio = 12346;

        boolean esBisiesto = (anio&400 == 0);

        //Con condicional
        //En este com¡ndicional hay 3 condiciones
        //La primera: si el año es divisible entre 4 (o lo que es lo mismo que cuando lo divido entre 4 el resto de 0)
        //La segunda: si al dividir el año entre 100 nos da un valor distinto a 0.
        //La tercera: Si el año al dividirlo entre 400 da resto 0
        //Ojo a los condicionales y las puertas logicas
        //((condicional && condicion2) || condicion 3)
        if((anio%4 == 0 && anio%100 != 0) || anio%400 == 0{
            System.out.println("El anyno es de siesta");
        }else {
            System.out.println("el anyo no es de siesta")
                }
System.out.println(esBisiesto ? "El anyo es de siesta" : "El anyo no es de siesta");

        
    }

    public static void ejercicio7(string[] args){
        System.out.printf("%-15s %5s %8s\n", "Nombre", "Unids", "Precio");
        System.out.printf("%-15s %5d %8.2d\n", "Pipsas", 12, 4.50);
        System.out.printf("%-15s %5d %8.2d\n", "Platanos", 3, 1.25);
        System.out.printf("%-15s %5d %8.2d\n", "Agua fuji", 120, 19.99);
        

    }

    public static void ejercicio8(string[] args){
        System.out.print("MENU DE OPCIONES:\n 1.\t Archivo \"Nuevo\"\n 2.\tRuta: C:\\\\Archivos\\\\Java\n2.\tSalir");

    }

    public static void ejercicio9(){

    }

    public static void ejercicio10(){
        
    }
}
