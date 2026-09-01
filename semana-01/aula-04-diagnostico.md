# Aula 4 — Diagnóstico: catálogo em memória

## Objetivos

- Revelar lacunas reais de sintaxe e modelagem.
- Ler testes como contrato de comportamento.
- Entregar um incremento pequeno sem tutorial passo a passo.

## Roteiro de 60 minutos

### 0–10 min — Recuperação ativa

Sem abrir as aulas anteriores, explique JDK/JVM, compilação e o defeito de frete. Marque dúvidas, sem pesquisá-las ainda.

### 10–15 min — Contrato

Leia `CatalogTest.java`. Cada teste protege um comportamento:

- produto válido pode ser cadastrado e encontrado;
- IDs duplicados são rejeitados;
- produto inexistente não é confundido com produto presente;
- resultado de listagem não permite alterar o catálogo por fora.

Antes de codificar, escreva as assinaturas desejadas para `Product` e `Catalog`.

### 15–45 min — Desafio

Implemente apenas o necessário para os testes passarem. Restrições:

- não altere os testes;
- não use framework;
- não exponha a collection mutável interna;
- use nomes em inglês no código e explique escolhas em português no diário;
- registre cada consulta feita à documentação.

Execute frequentemente:

```bash
./scripts/test.sh
```

A solução de referência fica fora do projeto, em `solucoes/aula-04`, e só deve ser aberta depois da tentativa e do diagnóstico.

### 45–52 min — Refatoração

Com tudo verde, remova duplicação, melhore nomes e confirme os testes novamente. Não adicione estoque, preço ou banco de dados: essas necessidades virão depois.

### 52–60 min — Diagnóstico

Preencha `diagnostico.md`. Classifique cada lacuna por impacto e escolha apenas três prioridades para a Semana 2.

## Critério de conclusão

Os quatro comportamentos passam, você explica cada linha criada e o diagnóstico contém evidências concretas, não apenas “preciso revisar Java”.
