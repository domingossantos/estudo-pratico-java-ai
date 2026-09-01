# Aula 2 — JDK, JVM, bytecode e JShell

## Objetivos

- Compilar e executar Java sem depender da IDE.
- Inspecionar bytecode em nível introdutório.
- Usar JShell para testar hipóteses pequenas.

## Roteiro de 60 minutos

### 0–5 min — Retomada

Desenhe de memória o fluxo fonte → bytecode → execução.

### 5–15 min — Anatomia das ferramentas

- `javac`: compilador.
- `java`: launcher da JVM.
- `javap`: inspetor de classes/bytecode.
- `jshell`: REPL para experimentos.

### 15–35 min — Laboratório guiado

Na raiz de `semana-01`:

```bash
mkdir -p build/aula-02
javac -d build/aula-02 labs/aula02/PriceSummary.java
java -cp build/aula-02 course.week1.PriceSummary
javap -classpath build/aula-02 -c -p course.week1.PriceSummary
```

Localize no resultado do `javap`:

- construtor;
- chamada de `println`;
- instrução de retorno;
- constantes carregadas.

Altere o código, execute somente `java` e observe que nada mudou. Depois recompile e explique por quê.

### 35–48 min — JShell

Execute `jshell` e experimente:

```java
var prices = java.util.List.of(19.90, 5.50, 10.00);
prices.stream().mapToDouble(Double::doubleValue).sum();
/vars
/methods
/exit
```

Escreva duas hipóteses próprias e valide-as no JShell.

### 48–55 min — Falhas propositais

Produza e explique uma falha de compilação, uma de classpath e uma exceção em execução. Guarde a mensagem e sua tradução em linguagem comum.

### 55–60 min — Fechamento

Execute `./scripts/test.sh`. Registre no diário qual ferramenta ajudaria em cada uma das três falhas.

## Critério de conclusão

Você consegue compilar, executar e inspecionar a classe sem usar botões da IDE e distingue erro de compilação, configuração e execução.
