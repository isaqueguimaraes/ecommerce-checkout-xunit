# Ecommerce Checkout 🛒

**Aluno:** Isaque Gabriel da Silva Guimarães  
**RA:** 325131393  
**Disciplina:** Garantia e Gestão da Qualidade de Software  
**Professor:** Daniel Henrique Matos de Paiva  

---

## 📌 Descrição do Sistema
Sistema em **Java** para gerenciamento de checkout de e-commerce, contemplando regras de negócio para geração de código de rastreio, cálculo de pontos de fidelidade e elegibilidade de frete grátis[cite: 21, 22].

## 🧪 Testes Unitários (JUnit 5)
A cobertura de testes inclui[cite: 21, 23]:
- **`gerarCodigoRastreio`**: Valida a formatação com estado em maiúsculo e número preenchido com zeros (`assertEquals`)[cite: 22, 23].
- **`calcularPontosFidelidade`**: Valida a pontuação de 2 pontos para cada R$ 10 em compras (`assertEquals`)[cite: 22, 23].
- **`temDireitoAFreteGratis`**: Valida frete grátis para clientes VIP ou compras a partir de R$ 200 (`assertTrue` e `assertFalse`)[cite: 22, 23].