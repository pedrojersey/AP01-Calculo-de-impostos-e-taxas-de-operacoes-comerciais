public class imposto {
  public void cIss() {
    ISS p = new ISS();
    p.servicoIss = 100;
    p.calculoIss();
  }

  public void cIcms(){
    ICMS l = new ICMS();
    l.servicoIcms = 130;
    l.produtoIcms = 120;
    l.calculoIcms();
  }

  public void cIpi() {
    IPI m = new IPI();
    m.produtoIpi = 230;
    m.calculoIpi();
  }
}

