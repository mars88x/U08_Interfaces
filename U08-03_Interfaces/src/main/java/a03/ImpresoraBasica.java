
package a03;

class ImpresoraBasica implements Imprimible {
    @Override
    public void imprimir(String documento) {
        System.out.println("Impresora Básica imprimiendo: " + documento);
    }
}
