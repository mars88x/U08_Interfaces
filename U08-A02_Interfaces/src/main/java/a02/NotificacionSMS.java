
package a02;

class NotificacionSMS implements Notificable {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[SMS] Enviando mensaje de texto al móvil: " + mensaje);
    }
}