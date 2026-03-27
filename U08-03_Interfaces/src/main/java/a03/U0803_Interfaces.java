
package a03;

public class U0803_Interfaces {

    public static void main(String[] args) {
    ImpresoraBasica basica = new ImpresoraBasica();
        ImpresoraAvanzada avanzada = new ImpresoraAvanzada();

        basica.imprimir("Informe_Mensual.docx");
        
        avanzada.imprimir("Proyecto_Final.pdf");
        avanzada.escanear();

    }
}