package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);
        
 /*       lista.visualizar();
        
        
        System.out.println("\n");
        System.out.println("lista: " + lista);

        lista.eliminar(3);
        System.out.println("lista: " + lista);
        
        System.out.println("\n");
        
        Nodo dato = lista.buscarLista(4);  
        System.out.println("dato: " + dato);
        
        *//*lista.insertarLista(dato, 10);
        System.out.println("lista " + lista);*//*
        
        dato = lista.buscarLista(5);        
        System.out.println("dato " + dato);
        lista.insertarLista(dato, 600);
        
        System.out.println("lista " + lista);*/
        
        lista.visualizar();
        System.out.println("\n");

        lista.InvertirLista();
        System.out.println("Lista invertida: " + lista);

        lista.ObtenerElementoPosicionN(6);
        System.out.println("Elemento en la posicion 6: " + lista);

        lista.EliminarDuplicados();
        System.out.println("Lista sin duplicados: " + lista);
        lista.ObtenerTamañoLista();



    }

}
