
package a01;

public class Televisor implements DispositivoConectado {
    @Override
    public void encender() {
        System.out.println("Televisor: Mostrando logotipo del fabricante en pantalla...");
    }

    @Override
    public void apagar() {
        System.out.println("Televisor: Guardando estado y entrando en modo standby.");
    }

    @Override
    public void conectar(String red) {
        // Llamamos al comportamiento base y añadimos el extra
        System.out.println("Televisor: Conectando a " + red + "... Buscando actualizaciones de firmware");
    }
}