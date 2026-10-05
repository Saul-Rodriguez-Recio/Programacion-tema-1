public class Main {
    public static void main(String args[]) {
        ejercicio1("banana");
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
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
        double IVA = 0,21;
        int DESCUENTO_PROMO = 5;
        int precioArticulo = 120;

            mostrarValores(IVA, DESCUENTO_PROMO, precioArticulo);


        
    }

    public static void mostrarValores(double IVA, int desc, int prec){
        System.out.println("precio con descuento: " + prec - desc);
        System.out.println("precio total con iva" + prec - desc + prec * IVA);
    }
        


    
    public static void ejercicio3(){

        int primererNumero = 10;
double PRECIO_FINAL = 99.9;
boolean ES_MAYOR_DE_EDAD = true;
final float piValor = 3.1416f;
    }

    public static void ejercicio4(){

    }

    public static void ejercicio5(){

    }

    public static void ejercicio6(){

    }

    public static void ejercicio7(){

    }

    public static void ejercicio8(){

    }

    public static void ejercicio9(){

    }

    public static void ejercicio10(){
        
    }
}
