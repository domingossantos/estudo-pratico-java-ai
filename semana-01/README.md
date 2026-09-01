# Semana 1 — Ambiente, evolução e diagnóstico

## Resultado esperado

Ao final das quatro aulas, você deverá conseguir explicar o caminho entre código-fonte e execução, operar as ferramentas essenciais do JDK, depurar um defeito e implementar um catálogo em memória sem seguir um tutorial linha a linha.

## Preparação

- JDK 25 LTS recomendado; os exemplos usam apenas recursos compatíveis com JDK 21+.
- IntelliJ IDEA ou Eclipse.
- Git.
- Maven 3.9+ recomendado. A Aula 2 também funciona somente com o JDK.
- Terminal aberto na pasta `semana-01`.

Confirme o ambiente:

```bash
java -version
javac -version
git --version
mvn -version
```

Se Maven não estiver instalado, registre isso no diário e use os comandos `javac` apresentados na Aula 2. Não interrompa a semana por esse motivo.

## Sequência

1. [Aula 1 — Evolução e ecossistema](aula-01-evolucao.md)
2. [Aula 2 — JDK, JVM, bytecode e JShell](aula-02-jdk-jvm.md)
3. [Aula 3 — IDE e depuração](aula-03-debug.md)
4. [Aula 4 — Diagnóstico pelo catálogo](aula-04-diagnostico.md)

## Entrega

- Projeto `elitecommerce` compilando.
- Testes do catálogo passando.
- Defeito da Aula 3 explicado e corrigido pelo aluno.
- `LEARNING_LOG.md` preenchido.
- Autoavaliação feita com a rubrica.

## Comandos de validação

Sem Maven:

```bash
./scripts/test.sh
```

Com Maven:

```bash
cd elitecommerce
mvn package
../scripts/test.sh
```

Para validar exclusivamente a solução de referência do instrutor:

```bash
./scripts/test.sh --solution
```
