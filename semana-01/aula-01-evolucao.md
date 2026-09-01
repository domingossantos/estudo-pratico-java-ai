# Aula 1 — História, evolução e ecossistema Java

## Objetivos

- Relacionar mudanças da linguagem a problemas que elas resolveram.
- Diferenciar Java, JVM, JDK e o ecossistema.
- Defender ou rejeitar Java usando requisitos, não preferência pessoal.

## Roteiro de 60 minutos

### 0–5 min — Recuperação ativa

Sem pesquisar, escreva definições de Java, JVM e JDK. Não corrija ainda.

### 5–20 min — Linha do tempo essencial

Pesquise na documentação oficial e complete `linha-do-tempo.md`. Priorize marcos, não todas as versões:

- Java 5: generics, annotations e enums;
- Java 8: lambdas, streams e nova API de datas;
- Java 9: módulos e JShell;
- Java 11: consolidação do ciclo de releases e LTS;
- Java 17: sealed classes e amadurecimento de records;
- Java 21: virtual threads e pattern matching;
- Java 25: LTS atual do percurso e evolução recente da linguagem.

Para cada marco, responda: **qual dor do desenvolvimento ele reduziu?**

### 20–35 min — Ecossistema

Desenhe o fluxo:

```text
Fonte .java -> javac -> bytecode .class -> JVM -> sistema operacional
```

Acrescente JIT, garbage collector, bibliotecas, build tool e framework. Volte às definições iniciais e corrija-as em outra cor.

### 35–50 min — Exercício de decisão

Avalie três cenários:

1. API bancária de longa duração, equipe de 40 pessoas e forte auditoria.
2. Função pequena executada raramente, com limite severo de cold start.
3. Serviço de processamento concorrente com muitas chamadas bloqueantes.

Para cada um, escreva quatro linhas: requisitos, argumentos a favor, riscos e decisão. Java pode ser rejeitado; a qualidade está na justificativa.

### 50–60 min — Fechamento

- Registre três conhecimentos confirmados e duas surpresas.
- Explique em voz alta por que “Java é lento” é uma afirmação insuficiente.
- Faça commit dos documentos da aula.

## Critério de conclusão

Você concluiu se consegue explicar o fluxo sem consultar e se cada decisão cita ao menos um requisito mensurável ou operacional.
