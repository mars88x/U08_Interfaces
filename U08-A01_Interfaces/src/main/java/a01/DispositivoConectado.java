
package a01;


public interface DispositivoConectado {
    // Atributo inmutable
    String TIPO_RED_POR_DEFECTO = "Wi-Fi 7";

    void encender();
    void apagar();

    // Método con comportamiento común, pero personalizable
    default void conectar(String red) {
        System.out.println("Conectando al sistema mediante: " + red);
    }

    // Método estático para información general (común a todos)
    default void mostrarInfoGeneral() {
        System.out.println("Dispositivo IoT compatible con el ecosistema inteligente. Red estándar: " + TIPO_RED_POR_DEFECTO);
    }
}
