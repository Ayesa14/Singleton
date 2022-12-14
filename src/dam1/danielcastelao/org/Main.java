
package dam1.danielcastelao.org;

public class Main {

    public static void main(String[] args) {
        System.out.println("Proyecto para aprender a hacer un Singleton");

        // intento instanciar un objeto con el constructor privado
        // esto es un error
        // Singleton miUnicaInstancia = new Singleton();

        // creamos un objeto
        Singleton miUnicaInstancia = Singleton.getInstance();
        // rellenamos los atributos
        miUnicaInstancia.setToken("A93m");
        miUnicaInstancia.setNombre("Aye");

        // creamos otro objeto Singleton
        // como la única manera es con getInstance(), este método se encargará
        // de devolvernos el objeto creado anteriormente
        Singleton otraInstancia = Singleton.getInstance();
        // podemos cambiar la edad
        // comprobar con el debug que los dos objetos:
        // miUnicaInstancia y otraInstanciaSeraLaMisma son el mismo
        otraInstancia.setToken("B93m");

        // version 1.1 del programa con otra instancia
        Singleton versionInstancia = Singleton.getInstance();
        versionInstancia.setNombre("version 1.2");
    }
}