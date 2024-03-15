package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Lista {

    private Nodo primero;

    @Override
    public String toString() {
        return "=>" + primero;
    }

    /**
     * Constructor para inicializar una lista
     */
    public Lista() {
        primero = null;
    }

    /**
     * Devuelve el nodo inicial
     *
     * @return
     */
    public Nodo leerPrimero() {
        return primero;
    }

    /**
     * Inserta valores a la lista
     *
     * @param entrada
     */
    public void insertarCabezaLista(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;

    }

    /**
     * inserta un elemento a partir de anterior
     *
     * @param anterior
     * @param entrada
     */
    public void insertarLista(Nodo anterior, int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = anterior.enlace;
        anterior.enlace = nuevo;

    }

    /**
     * elimina el elemento entrada
     *
     * @param entrada
     */
    public void eliminar(int entrada) {
        Nodo actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        // Bucle de búsqueda
        while ((actual != null) && !(actual.dato == entrada)) {
            if (!(actual.dato == entrada)) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        if (actual != null) {
            // Se distingue entre que el nodo sea el cabecera
            // o del resto de la lista
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }

    /**
     * busca el elemento destino
     *
     * @param destino
     * @return
     */
    public Nodo buscarLista(int destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (indice.dato == destino) {
                return indice;
            }
        }
        return null;
    }

    public void InvertirLista() {
        Nodo actual, anterior, siguiente;
        actual = primero;
        anterior = null;
        while (actual != null) {
            siguiente = actual.enlace;
            actual.enlace = anterior;
            anterior = actual;
            actual = siguiente;
        }
        primero = anterior;
    }

    int ObtenerElementoPosicionN(int n) {
        Nodo actual;
        actual = primero;
        int contador = 0;
        while (actual != null) {
            contador++;
            if (contador == n) {
                return actual.dato;
            }
            actual = actual.enlace;
        }
        //System.out.println("No existe el elemento en la posicion " + n);
        return 0;

    }



    /**
     * recorre la lista y muestra cada dato
     */
    public void visualizar() {
        Nodo n;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
        }
    }

    public void EliminarDuplicados() {
        Nodo actual, recorrido, anterior;
        actual = primero;
        while (actual != null) {
            anterior = actual;
            recorrido = actual.enlace;
            while (recorrido != null) {
                if (actual.dato == recorrido.dato) {
                    anterior.enlace = recorrido.enlace;
                } else {
                    anterior = recorrido;
                }
                recorrido = recorrido.enlace;
            }
            actual = actual.enlace;
        }
    }

    public void ObtenerTamañoLista() {
        Nodo actual;
        actual = primero;
        int contador = 0;
        while (actual != null) {
            contador++;
            actual = actual.enlace;
        }
        System.out.println("Tamaño de la lista: " + contador);
    }


    /**
     * Tarea:
     * 1 - crear metodo para invertir lista enlazada 
     * 2 - crear metodo para obtener elemento de la posicion n desde el final de la lista
     * 3 - crear metodo para eliminar duplicados en una lista enlazada
     * 4 - crear metodo para obtener tamaño de lista enlazada
     */
    
}
