# Aula 4 — Encapsulamento, abstração, herança e polimorfismo

## Objetivos

- Aplicar polimorfismo quando comportamentos variam por política.
- Proteger invariantes por encapsulamento.
- Evitar hierarquias usadas apenas para reutilizar código.

## Roteiro — 60 minutos

- **0–10:** recupere os quatro pilares de OO e associe cada um a uma decisão concreta do projeto.
- **10–18:** leia os contratos de desconto e identifique o `if` por tipo que uma estratégia evita.
- **18–40:** implemente `NoDiscount`, `PercentageDiscount` e `FixedDiscount` usando `DiscountPolicy`.
- **40–48:** componha cada política com `Money`, preservando moeda e impedindo total negativo.
- **48–55:** refatore nomes/duplicação somente com testes verdes.
- **55–60:** complete a rubrica e escolha três lacunas para a Semana 3.

## Critério de conclusão

Uma nova política pode ser adicionada sem alterar as existentes; o chamador depende da abstração e os value objects continuam válidos.
