# Aula 3 — EnumSet e sets concorrentes

## Objetivos

- Usar `EnumSet` para conjuntos de enum eficientes e expressivos.
- Comparar leitura dominante com escrita concorrente.
- Evitar escolher collection concorrente sem padrão de carga.

## Roteiro — 60 minutos

- **0–5:** liste diferenças entre thread-safe e atomicidade de uma operação composta.
- **5–15:** estude `EnumSet`, snapshot de `CopyOnWriteArraySet` e ordenação de `ConcurrentSkipListSet`.
- **15–35:** execute `SpecializedSetExperiment` e inspecione ordem, snapshot e duplicatas.
- **35–45:** varie leitores/escritores e descreva onde copy-on-write custa caro.
- **45–52:** modele permissões do catálogo com `EnumSet`.
- **52–60:** complete uma matriz de decisão com volume, ordem e razão leitura/escrita.

## Critério de conclusão

Cada set especializado está ligado a um requisito concreto e você distingue iteração segura de transação composta segura.
