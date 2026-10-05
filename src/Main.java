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
        char categoria = A;
        float precio = 0.78;
        int stock = 3
        boolean rebaja = false;

            informacionProducto(id, categoria, precio, stock);
            hayRebaja(rebaja);
       
    }
        public static void informacionProducto(int id, char cat, float pr, int st) {
             System.out.print("ID: " + id + "\n");
            System.out.print("Categoria: " + cat + "\n");
            System.out.print("Precio: " + pr + "\n");
            System.out.print("Disponibles: " + st + "\n");
        }

        public static boolean hayRebaja(boolean rebaja){
            if(rebaja == false){
                System.out.println("No esta en rebaja");
            }else{
                System.out.println("Esta rebajado");
            }
        }
    
    public static void ejercicio2(){

    }

    public static void ejercicio3(){

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
