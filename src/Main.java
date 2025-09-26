import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner teclado=new Scanner(System.in);
        String titulo,autor;
        int ID,cantidadTotal,opcion;
        boolean bandera=true,noHayLibro=true;
        List <Libro> listaLibros=new ArrayList();

        do {
            System.out.println("Menu");
            System.out.println("1.Agregar Libro");
            System.out.println("2.Listar Libros");
            System.out.println("3.Prestar Libro");
            System.out.println("4.Devolver Libro");
            System.out.println("5.Buscar Libro");
            System.out.println("6.Eliminar Libro");
            System.out.println("7.Salir");
            opcion= teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese titulo del libro");
                    titulo= teclado.next();
                    System.out.println("Ingrese el autor del libro");
                    autor= teclado.next();
                    System.out.println("Ingrese la ID del libro");
                    ID=teclado.nextInt();
                    System.out.println("Ingrese la Candidad de libros que hay");
                    cantidadTotal= teclado.nextInt();
                    if (cantidadTotal>0){
                        listaLibros.add(new Libro(cantidadTotal,cantidadTotal,autor,titulo,ID));
                    }else {
                        System.out.println("La cantidad de libros tiene que ser mayor a 0");
                    }

                    break;
                case 2:
                    for(Libro p:listaLibros){
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese nombre del libro que quiere pedir");
                    titulo= teclado.next();
                    for(Libro l:listaLibros){
                        if(l.getTitulo().equalsIgnoreCase(titulo)){
                            l.prestarLibro();
                            noHayLibro=false;
                        }
                    }
                    noHayLibro=hayLibro(noHayLibro);
                    break;
                case 4:
                    System.out.println("Ingrese nombre del libro que quiere devolver");
                    titulo= teclado.next();
                    for(Libro l:listaLibros){
                        if(l.getTitulo().equalsIgnoreCase(titulo)){
                            l.devolverLibro();
                            noHayLibro=false;
                        }
                    }
                    noHayLibro=hayLibro(noHayLibro);
                    break;
                case 5:
                    System.out.println("Ingrese nombre del libro que quiere buscar");
                    titulo= teclado.next();
                    for(Libro l:listaLibros){
                        if(l.getTitulo().equalsIgnoreCase(titulo)){
                            System.out.println(l);
                            noHayLibro=false;
                        }
                    }
                    noHayLibro=hayLibro(noHayLibro);
                    break;
                case 6:
                    System.out.println("Ingrese nombre del libro que quiere eliminar");
                    titulo= teclado.next();
                    for(Libro l:listaLibros){
                        if(l.getTitulo().equalsIgnoreCase(titulo)){
                            listaLibros.remove(l);
                            noHayLibro=false;
                        }
                    }
                    noHayLibro=hayLibro(noHayLibro);
                    break;
                case 7:
                    bandera=false;
                    break;
                default:
                    System.out.println("Error opcion no valida.");
                    break;
            }
        }while (bandera);

    }
    //Metodo que dice si el libro si existe o no segun la busqueda del Foreach
    public static boolean hayLibro(boolean noHayLibro){
        if (noHayLibro){
            System.out.println("No se encuentra el libro");
        }
        return (true);
    }
}