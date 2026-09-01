# Aula 2 — HashSet, LinkedHashSet, TreeSet e igualdade

## Objetivos

- Garantir unicidade com contratos corretos de igualdade.
- Escolher entre ausência de ordem, ordem de inserção e ordem natural.
- Manter `equals`, `hashCode` e `compareTo` coerentes.

## Roteiro — 60 minutos

- **0–5:** preveja o tamanho de um set com dois produtos de mesmo ID.
- **5–15:** revise hashing, colisões, ordem de inserção e árvores balanceadas.
- **15–30:** execute `SetExperiment` e observe as três ordens.
- **30–43:** quebre temporariamente `hashCode`/ordenação no laboratório e explique o sintoma.
- **43–52:** implemente tags únicas e ordenadas no contrato do catálogo.
- **52–60:** registre qual identidade do domínio sustenta igualdade de produto.

## Critério de conclusão

Duplicatas são removidas pela identidade escolhida, e a ordenação não contradiz igualdade.
