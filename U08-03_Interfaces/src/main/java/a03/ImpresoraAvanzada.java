
package a03;

class ImpresoraAvanzada implements Multifuncion {
   
    @Override
    public void imprimir(String documento) {
        System.out.println("Impresora Avanzada imprimiendo en alta calidad: " + documento);
      }

    @Override
    public void escanear() {
        System.out.println("Impresora Avanzada escaneando documento a PDF...");
    }
}