
package a01;

public class Bombilla implements DispositivoConectado {
    @Override
    public void encender() {
        System.out.println("Bombilla: Filamento calentado. Luz emitida.");
    }

    @Override
    public void apagar() {
        System.out.println("Bombilla: Corriente cortada. Luz apagada.");
    }
}
    
