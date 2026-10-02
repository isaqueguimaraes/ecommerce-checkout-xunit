package com.ecommerce;

public class PedidoService {

  // 1. Gerar Código de Rastreio (Ex: SUDESTE-0042)
  public String gerarCodigoRastreio(String regiao, int numeroPedido) {
    String regiaoMaiuscula = regiao.toUpperCase();
    String numeroFormatado = String.format("%04d", numeroPedido);
    return regiaoMaiuscula + "-" + numeroFormatado;
  }

  // 2. Pontos de Fidelidade (R$ 10 = 2 pontos)
  public int calcularPontosFidelidade(int valorTotal) {
    return (valorTotal / 10) * 2;
  }

  // 3. Elegibilidade para Frete Grátis (>= 200 OU VIP)
  public boolean temDireitoAFreteGratis(int valorTotal, boolean eClienteVIP) {
    return valorTotal >= 200 || eClienteVIP;
  }
}