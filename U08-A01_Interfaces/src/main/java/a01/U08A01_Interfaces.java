
package a01;

public class U08A01_Interfaces {

    public static void main(String[] args) {
     
        DispositivoConectado miBombilla = new Bombilla();
        DispositivoConectado miTele = new Televisor();

        System.out.println("--- Probando Bombilla ---");
        miBombilla.mostrarInfoGeneral();
        miBombilla.encender();
        miBombilla.conectar(DispositivoConectado.TIPO_RED_POR_DEFECTO);
        miBombilla.apagar();

        System.out.println("\n--- Probando Televisor ---");
        miTele.mostrarInfoGeneral();
        miTele.encender();
        miTele.conectar(DispositivoConectado.TIPO_RED_POR_DEFECTO);
        miTele.apagar();
    }
}