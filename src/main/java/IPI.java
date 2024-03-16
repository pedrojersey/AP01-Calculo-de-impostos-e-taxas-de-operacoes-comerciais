public class IPI {
  public int produtoIpi;
  public void calculoIpi () {
    System.out.println("Preço original: " + produtoIpi + " Taxa ISS aplicada de 25%. " + "Valor final: " + ((produtoIpi * 0.25) + produtoIpi));
  }
}