# Semana 2 — Java moderno e modelagem orientada a objetos

## Resultado esperado

Modernizar código legado sem alterar seu comportamento e modelar o núcleo do EliteCommerce com tipos imutáveis, hierarquias fechadas e polimorfismo.

## Pré-requisitos

- Semana 1 concluída ou domínio equivalente de compilação, testes e debugger.
- JDK 21+; JDK 25 LTS recomendado para acompanhar a evolução mais recente.
- Terminal aberto em `semana-02`.

## Aulas

1. [Sintaxe moderna](aula-01-sintaxe-moderna.md)
2. [Records e value objects](aula-02-records-value-objects.md)
3. [Sealed classes e pattern matching](aula-03-sealed-patterns.md)
4. [Polimorfismo e encapsulamento](aula-04-polimorfismo.md)

## Entrega

- `ProductId`, `Money` e `Product` imutáveis e validados.
- Hierarquia fechada de resultados de pagamento.
- Descontos implementados por polimorfismo, sem `if` por tipo.
- Exercício legado modernizado com comportamento preservado.
- Diário e rubrica preenchidos.

## Validação

O projeto inicial deve falhar até você implementar os contratos:

```bash
./scripts/test.sh
```

Confira a solução somente depois da tentativa:

```bash
./scripts/test.sh --solution
```
