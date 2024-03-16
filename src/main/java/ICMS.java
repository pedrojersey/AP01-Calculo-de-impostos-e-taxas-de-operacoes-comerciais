public class ICMS {
  public int servicoIcms;
  public int produtoIcms;
  public void calculoIcms () {
    System.out.println("Preço original: " + (servicoIcms + produtoIcms) + " Taxa ICMS aplicada de 17%. " + "Valor final: " + ((servicoIcms + produtoIcms) * 0.17 + (servicoIcms + produtoIcms)));
  }
}