public class ISS {
  public int servicoIss;
  public void calculoIss () {
    System.out.println("Preço original: " + servicoIss + " Taxa ISS aplicada de 4,6%. " + "Valor final: " + ((servicoIss * 0.046) + servicoIss) );
  }
}