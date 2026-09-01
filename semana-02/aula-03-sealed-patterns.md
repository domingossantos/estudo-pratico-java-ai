# Aula 3 — Sealed classes e pattern matching

## Objetivos

- Representar um conjunto fechado de resultados.
- Tornar o tratamento exaustivo visível ao compilador.
- Evitar booleanos e campos nulos representando estados incompatíveis.

## Roteiro — 60 minutos

- **0–5:** liste estados possíveis de um pagamento sem consultar o projeto.
- **5–15:** compare classe aberta, enum com dados e sealed interface com records.
- **15–25:** leia o contrato de `PaymentResult` e desenhe a hierarquia.
- **25–43:** implemente `Approved`, `Rejected` e `Pending`; produza uma mensagem com switch exaustivo.
- **43–52:** adicione temporariamente um quarto subtipo e observe onde o compilador exige decisão.
- **52–60:** reverta o experimento, execute testes e registre quando uma hierarquia não deveria ser fechada.

## Critério de conclusão

Cada estado carrega somente seus dados válidos e o formatador trata todos os casos sem `default` que esconda evolução.
