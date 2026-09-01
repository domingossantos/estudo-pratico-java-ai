# Aula 1 — `var`, switch expressions, text blocks e pattern matching

## Objetivos

- Modernizar sintaxe sem confundir novidade com melhoria automática.
- Escolher `var` quando o tipo continuar evidente.
- Substituir controle de fluxo acidental por expressões claras.

## Roteiro — 60 minutos

- **0–5:** escreva de memória três mudanças relevantes desde Java 8.
- **5–15:** estude escopo de `var`, switch expression, text blocks e `instanceof` com variável de padrão.
- **15–35:** modernize `labs/aula01/LegacyOrderFormatter.java`; preserve exatamente as quatro saídas do `main`.
- **35–45:** compile, compare o diff e reverta qualquer mudança apenas cosmética que piore a leitura.
- **45–53:** escreva dois exemplos em que `var` ajuda e dois em que esconde informação importante.
- **53–60:** registre decisões e execute `./scripts/test.sh --solution` para confirmar o núcleo de referência.

## Restrições do laboratório

- Transforme o `switch` em expressão.
- Use text block no template JSON.
- Use pattern matching no tratamento do identificador.
- Não altere a saída nem crie abstrações sem necessidade.

## Critério de conclusão

O programa imprime o mesmo resultado antes e depois, e cada recurso moderno tem uma justificativa de legibilidade ou segurança.
