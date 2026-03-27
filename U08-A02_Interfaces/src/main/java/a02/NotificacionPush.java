
package a02;

class NotificacionPush implements Notificable {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[App] Notificacion emergente enviada: " + mensaje);
    }
}