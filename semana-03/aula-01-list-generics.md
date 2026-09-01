# Aula 1 — Generics, ArrayList e LinkedList

## Objetivos

- Usar generics para segurança de tipos.
- Relacionar operações à complexidade e ao padrão de acesso.
- Medir sem transformar microbenchmark didático em verdade universal.

## Roteiro — 60 minutos

- **0–5:** estime os custos de acesso por índice e inserção no início das duas listas.
- **5–15:** revise invariância, wildcards `extends/super` e programe para `List`, não implementação.
- **15–35:** execute `ListExperiment`; aqueça a JVM, varie tamanho e repita medições.
- **35–45:** explique por que `LinkedList` pode perder mesmo em inserções aparentemente favoráveis.
- **45–52:** implemente método genérico que copia produtores para consumidores usando PECS.
- **52–60:** registre hipótese, números, ruídos e decisão para três cenários.

## Critério de conclusão

Você escolhe a lista com base nas operações dominantes e consegue explicar por que Big-O não prevê sozinho o tempo real.
