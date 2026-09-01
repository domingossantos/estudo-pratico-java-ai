# Aula 3 — IDE e depuração

## Objetivos

- Importar um projeto Maven na IDE.
- Usar breakpoints, step over/into e inspeção de variáveis.
- Encontrar a causa de um defeito antes de alterar o código.

## Roteiro de 60 minutos

### 0–5 min — Retomada

Explique a diferença entre observar uma exceção e diagnosticar sua causa.

### 5–15 min — Importação e navegação

Abra `elitecommerce/pom.xml` como projeto. Localize produção, testes e classe principal. Pratique busca de classe, símbolo, usos e navegação até declaração.

### 15–25 min — Ferramentas de debug

Conheça breakpoint, breakpoint condicional, step over, step into, step out, watches, avaliação de expressão e call stack. Evite avançar linha a linha sem hipótese.

### 25–45 min — Defeito guiado

Abra `labs/aula03/ShippingCalculatorBuggy.java`. O frete deveria ser grátis somente para pedidos de pelo menos R$ 200,00, mas alguns pedidos menores recebem gratuidade.

1. Antes de executar, escreva duas hipóteses.
2. Coloque breakpoint condicional quando `subtotal < 200`.
3. Inspecione `subtotal`, `customerTier` e o valor retornado.
4. Registre causa, evidência e correção proposta.
5. Copie a classe para uma área temporária, aplique a correção e execute os três exemplos.

Não altere o arquivo defeituoso: ele é material de diagnóstico reutilizável.

### 45–53 min — Atalhos úteis

Configure e pratique: executar teste, depurar teste, renomear, extrair variável/método, formatar, otimizar imports e Git diff.

### 53–60 min — Fechamento

Preencha o relatório abaixo no diário:

```text
Sintoma:
Hipóteses:
Evidência observada:
Causa:
Correção:
Como um teste impediria regressão:
```

## Critério de conclusão

A correção deve nascer de uma evidência observada no debugger, não de tentativa e erro.
