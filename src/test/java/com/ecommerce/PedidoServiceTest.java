package com.ecommerce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoServiceTest {

  private final PedidoService service = new PedidoService();

  @Test
  public void testGerarCodigoRastreio() {
    String resultado = service.gerarCodigoRastreio("sudeste", 42);
    assertEquals("SUDESTE-0042", resultado);
  }

  @Test
  public void testCalcularPontosFidelidade() {
    int resultado = service.calcularPontosFidelidade(150);
    assertEquals(30, resultado);
  }

  @Test
  public void testTemDireitoAFreteGratisVIPAbaixo200() {
    boolean resultado = service.temDireitoAFreteGratis(150, true);
    assertTrue(resultado);
  }

  @Test
  public void testTemDireitoAFreteGratisNaoVIPAbaixo200() {
    boolean resultado = service.temDireitoAFreteGratis(150, false);
    assertFalse(resultado);
  }
}