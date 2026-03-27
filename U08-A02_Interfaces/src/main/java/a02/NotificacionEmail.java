
package a02;

class NotificacionEmail implements Notificable {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[Email] Enviando a bandeja de entrada: " + mensaje);
    }
}
