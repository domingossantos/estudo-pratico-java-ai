# Aula 2 — Records, imutabilidade e value objects

## Objetivos

- Modelar conceitos do domínio em vez de transportar strings e números soltos.
- Validar invariantes na criação.
- Diferenciar record, classe, enum e entidade.

## Roteiro — 60 minutos

- **0–5:** explique a diferença entre “imutável” e “campo final”.
- **5–15:** estude semântica de records, construtor compacto, igualdade estrutural e cópias defensivas.
- **15–25:** leia os testes de `ProductId` e `Money`; nomeie o defeito que cada teste detecta.
- **25–45:** implemente os dois value objects e depois `Product`, executando o contrato a cada incremento.
- **45–52:** tente criar IDs vazios, moedas diferentes e valores negativos; explique quais estados devem ser impossíveis.
- **52–60:** preencha a tabela record/classe/enum e registre o que não deve ser modelado como record.

## Critério de conclusão

Não há identificador vazio, dinheiro negativo ou soma entre moedas diferentes; igualdade representa valor, não identidade de objeto.
