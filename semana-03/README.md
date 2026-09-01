# Semana 3 — Collections: List e Set

## Resultado esperado

Escolher collections por contrato, ordem, unicidade, concorrência e custo, aplicando-as ao catálogo sem depender da implementação concreta nas interfaces públicas.

## Aulas

1. [Generics, ArrayList e LinkedList](aula-01-list-generics.md)
2. [HashSet, LinkedHashSet e TreeSet](aula-02-sets-e-igualdade.md)
3. [EnumSet e sets concorrentes](aula-03-sets-especializados.md)
4. [Decisão de collections no catálogo](aula-04-catalogo.md)

## Entrega

- Comparação mensurada entre listas, sem conclusão baseada em um único número.
- Produtos com igualdade e ordenação coerentes.
- Categorias, tags e favoritos com semântica explícita.
- Experimentos com `EnumSet`, `CopyOnWriteArraySet` e `ConcurrentSkipListSet`.
- Tabela de decisão e rubrica preenchidas.

## Validação

```bash
./scripts/test.sh
./scripts/test.sh --solution
./scripts/labs.sh
```
