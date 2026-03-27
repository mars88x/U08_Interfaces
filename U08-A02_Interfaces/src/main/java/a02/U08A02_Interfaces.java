

package a02;

import java.util.ArrayList;
import java.util.List;

public class U08A02_Interfaces {

    public static void main(String[] args) {
   // Agrupamos los distintos canales en una única estructura
        List<Notificable> canales = new ArrayList<>();
        
        canales.add(new NotificacionEmail());
        canales.add(new NotificacionSMS());
        canales.add(new NotificacionPush());

        String avisoEmergencia = "Mantenimiento urgente del servidor a las 22:00h.";

        System.out.println("--- INICIANDO ENVIO MASIVO DE EMERGENCIA ---");
        
        // El bucle recorre la lista y llama al método común
        for (Notificable canal : canales) {
            canal.enviarNotificacion(avisoEmergencia);
        }
        
        System.out.println("--- PROCESO FINALIZADO ---");
    }
}