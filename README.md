# Plano de Estudos Java AI — 48 semanas

## Visão geral

- **Perfil:** desenvolvedor pleno com defasagem na sintaxe e nas APIs do Java moderno.
- **Carga:** 4 aulas semanais de 1 hora (192 horas no total).
- **Objetivo:** percorrer toda o programa com prática progressiva, produzindo evidências para portfólio e entrevistas.
- **Java:** usar uma versão LTS atual disponível no ambiente, priorizando recursos modernos da linguagem e mantendo consciência de compatibilidade.
- **Projeto evolutivo:** **CommerceLab AI**, uma plataforma de comércio eletrônico com catálogo, estoque, pedidos, pagamentos simulados, notificações, painel React e assistente corporativo com RAG e agentes.

## Formato de cada aula (60 minutos)

1. **5 min — retomada:** explicar de memória o que foi feito e conferir a entrega anterior.
2. **15 min — conceito:** sintaxe, modelo mental, decisões e armadilhas.
3. **30 min — prática:** exercício executável, teste ou incremento do projeto.
4. **10 min — fechamento:** refatorar, registrar aprendizado e fazer commit.

Nas aulas de revisão: 10 minutos de recuperação ativa, 40 minutos de desafio sem consulta e 10 minutos de retrospectiva.

## Regras dos exercícios

- Todo exercício deve compilar, possuir exemplos automatizados quando aplicável e terminar em um commit pequeno.
- A partir da semana 5, funcionalidade nova começa por um teste que falha.
- Manter um `LEARNING_LOG.md` com decisões, erros, correções e uma pergunta ainda em aberto por semana.
- Não copiar a solução durante os primeiros 20 minutos de um desafio.
- A entrega semanal deve reutilizar pelo menos um conceito das semanas anteriores.

## Índice do curso

| Semanas | Conteúdo |
|---|---|
| 01–04 | [01](semana-01/README.md) · [02](semana-02/README.md) · [03](semana-03/README.md) · [04](semana-04/README.md) |
| 05–08 | [05](semana-05/README.md) · [06](semana-06/README.md) · [07](semana-07/README.md) · [08](semana-08/README.md) |
| 09–12 | [09](semana-09/README.md) · [10](semana-10/README.md) · [11](semana-11/README.md) · [12](semana-12/README.md) |
| 13–16 | [13](semana-13/README.md) · [14](semana-14/README.md) · [15](semana-15/README.md) · [16](semana-16/README.md) |
| 17–20 | [17](semana-17/README.md) · [18](semana-18/README.md) · [19](semana-19/README.md) · [20](semana-20/README.md) |
| 21–24 | [21](semana-21/README.md) · [22](semana-22/README.md) · [23](semana-23/README.md) · [24](semana-24/README.md) |
| 25–28 | [25](semana-25/README.md) · [26](semana-26/README.md) · [27](semana-27/README.md) · [28](semana-28/README.md) |
| 29–32 | [29](semana-29/README.md) · [30](semana-30/README.md) · [31](semana-31/README.md) · [32](semana-32/README.md) |
| 33–36 | [33](semana-33/README.md) · [34](semana-34/README.md) · [35](semana-35/README.md) · [36](semana-36/README.md) |
| 37–40 | [37](semana-37/README.md) · [38](semana-38/README.md) · [39](semana-39/README.md) · [40](semana-40/README.md) |
| 41–44 | [41](semana-41/README.md) · [42](semana-42/README.md) · [43](semana-43/README.md) · [44](semana-44/README.md) |
| 45–48 | [45](semana-45/README.md) · [46](semana-46/README.md) · [47](semana-47/README.md) · [48](semana-48/README.md) |

---

## Fase 1 — Java moderno e ferramentas (semanas 1–8)

### Semana 1 — Ambiente, evolução e diagnóstico

- **Aula 1:** história, evolução e ecossistema Java. **Prática:** montar uma linha do tempo das versões relevantes e justificar Java para três cenários corporativos.
- **Aula 2:** JDK, JVM, bytecode, JShell e ferramentas de linha de comando. **Prática:** compilar e inspecionar uma classe com `javac`, `java` e `javap`.
- **Aula 3:** IntelliJ IDEA/Eclipse, depuração e atalhos. **Prática:** criar o projeto `elitecommerce`, usar breakpoint condicional e corrigir um defeito guiado.
- **Aula 4:** diagnóstico de conhecimentos. **Desafio:** implementar um pequeno catálogo em memória, registrando lacunas de sintaxe no diário.
- **Entrega:** repositório configurado, README inicial e diagnóstico pessoal priorizado.

### Semana 2 — Sintaxe moderna e modelagem orientada a objetos

- **Aula 1:** inferência local com `var`, switch expressions, text blocks e melhorias de `instanceof`. **Prática:** modernizar código legado sem alterar comportamento.
- **Aula 2:** records, imutabilidade e value objects. **Prática:** criar `ProductId`, `Money` e `Product` com validações.
- **Aula 3:** sealed classes e pattern matching. **Prática:** modelar resultados de pagamento como hierarquia fechada.
- **Aula 4:** encapsulamento, abstração, herança e polimorfismo. **Desafio:** eliminar condicionais de cálculo de desconto usando polimorfismo.
- **Entrega:** núcleo de domínio imutável, com explicação de quando usar classe, record, enum ou sealed type.

### Semana 3 — Collections: List e Set

- **Aula 1:** generics, `List`, complexidade e diferenças entre `ArrayList` e `LinkedList`. **Prática:** medir inserção, acesso e remoção em cenários distintos.
- **Aula 2:** `HashSet`, `LinkedHashSet` e `TreeSet`; contratos de `equals`, `hashCode` e `Comparable`. **Prática:** remover duplicatas e ordenar produtos.
- **Aula 3:** `EnumSet`, `CopyOnWriteArraySet` e `ConcurrentSkipListSet`. **Prática:** escolher a implementação para permissões e assinantes concorrentes.
- **Aula 4:** decisão baseada em requisitos. **Desafio:** implementar categorias, tags e lista de favoritos, justificando cada collection.
- **Entrega:** módulo de catálogo com benchmarks simples e tabela de decisão de collections.

### Semana 4 — Collections: Map e casos especiais

- **Aula 1:** `HashMap`, `LinkedHashMap`, `TreeMap` e `Hashtable`. **Prática:** construir índices do catálogo e comparar ordenação e sincronização.
- **Aula 2:** `ConcurrentHashMap` e operações atômicas. **Prática:** contador concorrente de visualizações por produto.
- **Aula 3:** `WeakHashMap`, `IdentityHashMap` e `EnumMap`. **Prática:** criar pequenos experimentos que revelem identidade, coleta e chaves enum.
- **Aula 4:** combinação de estruturas. **Desafio:** criar cache LRU limitado e índice multicritério do catálogo.
- **Entrega:** catálogo consultável por ID, categoria e preço, sem estruturas escolhidas por hábito.

### Semana 5 — Lambdas, interfaces funcionais e Optional

- **Aula 1:** lambdas, method references e interfaces funcionais padrão. **Prática:** extrair regras de preço para `Predicate`, `Function` e `UnaryOperator`.
- **Aula 2:** criação e composição de interfaces funcionais. **Prática:** montar um pipeline de validação de produtos.
- **Aula 3:** `Optional` como retorno, operações e usos inadequados. **Prática:** remover `null` do fluxo de busca sem usar `Optional` em campos.
- **Aula 4:** programação declarativa. **Desafio:** implementar motor de promoções configurável com funções compostas.
- **Entrega:** regras de catálogo testadas, compostas e sem `NullPointerException` acidental.

### Semana 6 — Stream API

- **Aula 1:** pipeline, avaliação preguiçosa e operações intermediárias/terminais. **Prática:** consultas de catálogo com filtro, transformação e redução.
- **Aula 2:** collectors, agrupamento e particionamento. **Prática:** gerar relatório de produtos por categoria e faixa de preço.
- **Aula 3:** streams paralelos, spliterator e custos ocultos. **Prática:** comparar execução sequencial/paralela e explicar quando evitar paralelismo.
- **Aula 4:** desafio de dados. **Desafio:** processar arquivo de vendas e responder cinco perguntas usando streams legíveis.
- **Entrega:** gerador de relatórios com testes e uma análise de performance.

### Semana 7 — Exceções, datas, regex, logging e I18N

- **Aula 1:** exceções checked/unchecked, causa, propagação e tratamento na fronteira. **Prática:** definir erros de domínio e preservar stack trace.
- **Aula 2:** Date and Time API, fusos e relógio testável. **Prática:** calcular prazo de promoção usando `Clock` injetável.
- **Aula 3:** expressões regulares e validação responsável. **Prática:** validar SKU e extrair dados de um log sem regex excessiva.
- **Aula 4:** Logging API e internacionalização. **Desafio:** produzir logs estruturados e mensagens de erro em português e inglês.
- **Entrega:** fluxo de promoções temporal, observável, testável e internacionalizado.

### Semana 8 — NIO.2, Maven, Gradle e checkpoint

- **Aula 1:** `Path`, `Files`, channels e walking de diretórios. **Prática:** importar catálogo CSV de forma segura e atômica.
- **Aula 2:** Maven: ciclo de vida, dependências, plugins e módulos. **Prática:** organizar o projeto em módulos e gerar build reproduzível.
- **Aula 3:** introdução ao Gradle e comparação com Maven. **Prática:** reproduzir um módulo mínimo em Gradle e documentar trade-offs.
- **Aula 4:** checkpoint Java moderno. **Desafio:** importar, validar, indexar e relatar produtos sem consultar a solução anterior.
- **Entrega:** release `v0.1`, com build, testes e importador NIO.2.

---

## Fase 2 — APIs avançadas, concorrência e testes (semanas 9–14)

### Semana 9 — Reflection, annotations e annotation processing

- **Aula 1:** Reflection API, metadados e custos. **Prática:** inspecionar records e mapear propriedades para um formato tabular.
- **Aula 2:** criação e leitura de annotations. **Prática:** criar `@Sensitive` e impedir que campos marcados apareçam nos logs.
- **Aula 3:** annotation processors e geração em compilação. **Prática:** gerar metadados simples de entidades ou analisar um processor existente.
- **Aula 4:** reflexão versus alternativas. **Desafio:** implementar validador por annotation e depois listar limitações e riscos.
- **Entrega:** biblioteca pequena de validação/metadados com testes.

### Semana 10 — Networking, segurança e serialização

- **Aula 1:** HTTP Client e fundamentos de networking. **Prática:** consumir uma API simulada com timeout e tratamento de status.
- **Aula 2:** Security API: hashes, assinatura e geração segura de valores. **Prática:** assinar e verificar um payload de pedido.
- **Aula 3:** serialização Java e seus riscos; formatos interoperáveis. **Prática:** demonstrar versionamento frágil e migrar o exemplo para JSON.
- **Aula 4:** integração externa segura. **Desafio:** criar cliente de cotação com validação, timeout e logs sem dados sensíveis.
- **Entrega:** cliente HTTP resiliente básico e decisão arquitetural sobre serialização.

### Semana 11 — Threads, locks e synchronizers

- **Aula 1:** memória, criação de threads, race condition e visibilidade. **Prática:** reproduzir e corrigir perda de atualização no estoque.
- **Aula 2:** `synchronized`, locks e atomics. **Prática:** implementar três versões de reserva e comparar correção/complexidade.
- **Aula 3:** semáforos, latches, barriers e synchronizers. **Prática:** limitar pagamentos simultâneos e coordenar um lote.
- **Aula 4:** segurança concorrente. **Desafio:** executar 1.000 reservas concorrentes sem estoque negativo.
- **Entrega:** componente de estoque concorrente com testes repetíveis.

### Semana 12 — Executors, Fork/Join, CompletableFuture e virtual threads

- **Aula 1:** executors, pools, filas e backpressure. **Prática:** dimensionar pool para trabalho CPU-bound e I/O-bound.
- **Aula 2:** Fork/Join. **Prática:** agregar grande conjunto de vendas e comparar com abordagem sequencial.
- **Aula 3:** `CompletableFuture`, composição e tratamento de falhas. **Prática:** consultar preço, estoque e frete em paralelo.
- **Aula 4:** virtual threads e structured concurrency conceitual. **Desafio:** comparar milhares de tarefas bloqueantes em pool tradicional e virtual threads.
- **Entrega:** orquestrador concorrente de checkout com relatório de medições.

### Semana 13 — Testes unitários e TDD

- **Aula 1:** ciclo TDD e estrutura de bons testes com JUnit Jupiter. **Prática:** criar regra de cupom começando pelo teste.
- **Aula 2:** AssertJ, parametrização e test data driven. **Prática:** cobrir tabela de descontos sem duplicação.
- **Aula 3:** Mockito, doubles e limites de mocking. **Prática:** testar checkout isolando apenas serviços externos.
- **Aula 4:** kata TDD. **Desafio:** implementar cálculo de frete em ciclos vermelho-verde-refatora.
- **Entrega:** suíte unitária expressiva e retrospectiva sobre decisões influenciadas pelos testes.

### Semana 14 — Qualidade, arquitetura testável e performance

- **Aula 1:** SpotBugs, PMD e análise estática. **Prática:** integrar ferramentas e corrigir achados relevantes.
- **Aula 2:** métricas, cobertura e Sonar. **Prática:** interpretar qualidade sem perseguir cobertura cega.
- **Aula 3:** ArchUnit. **Prática:** proibir dependência do domínio para infraestrutura.
- **Aula 4:** testes de performance e benchmarking com JMH. **Desafio:** medir uma hipótese real sem benchmark ingênuo.
- **Entrega:** quality gate local, regras arquiteturais e benchmark documentado.

---

## Fase 3 — Bancos de dados e persistência (semanas 15–20)

### Semana 15 — Modelagem relacional e SQL

- **Aula 1:** entidades, relacionamentos, normalização e restrições. **Prática:** modelar catálogo, cliente, pedido e itens.
- **Aula 2:** SQL, joins, agregações e índices. **Prática:** responder consultas de negócio e analisar plano de execução.
- **Aula 3:** transações, isolamento e anomalias. **Prática:** simular concorrência na reserva de estoque.
- **Aula 4:** revisão do modelo. **Desafio:** evoluir o esquema para cupons e histórico de status sem inconsistência.
- **Entrega:** diagrama, DDL versionado e conjunto de consultas explicadas.

### Semana 16 — JDBC, JPA e Hibernate

- **Aula 1:** JDBC, prepared statements, pool e mapeamento manual. **Prática:** persistir e consultar produto com segurança.
- **Aula 2:** JPA/Hibernate: entidades, contexto de persistência e estados. **Prática:** mapear catálogo e pedidos.
- **Aula 3:** relacionamentos, cascades e fetch. **Prática:** localizar e corrigir N+1.
- **Aula 4:** escolha consciente. **Desafio:** implementar consulta com JDBC e JPA, comparando controle e produtividade.
- **Entrega:** persistência relacional funcional com testes de integração.

### Semana 17 — JPQL, consultas nativas e transações

- **Aula 1:** JPQL, projections e paginação. **Prática:** criar consultas de catálogo sem carregar entidades desnecessárias.
- **Aula 2:** SQL nativo e critérios de uso. **Prática:** implementar relatório que justifique consulta nativa.
- **Aula 3:** transações declarativas, locking otimista/pessimista. **Prática:** impedir atualização perdida no estoque.
- **Aula 4:** consistência. **Desafio:** processar pedido com rollback integral diante de falha simulada.
- **Entrega:** serviço transacional com concorrência testada.

### Semana 18 — Migrações e Jakarta Data

- **Aula 1:** Flyway. **Prática:** transformar o DDL em migrações incrementais e repetíveis.
- **Aula 2:** Liquibase e comparação. **Prática:** representar uma alteração equivalente e avaliar governança.
- **Aula 3:** Jakarta Data e abstrações de repositório. **Prática:** criar protótipo ou comparar interfaces com Spring Data.
- **Aula 4:** evolução segura. **Desafio:** adicionar campo obrigatório usando migração compatível em etapas.
- **Entrega:** pipeline de migração com rollback documentado e banco recriável do zero.

### Semana 19 — NoSQL, CAP e PACELC

- **Aula 1:** famílias SQL, NoSQL e NewSQL; CAP/PACELC. **Prática:** classificar necessidades do projeto por consistência e latência.
- **Aula 2:** MongoDB e Jakarta NoSQL. **Prática:** modelar visão desnormalizada do catálogo.
- **Aula 3:** Cassandra. **Prática:** desenhar tabelas a partir de consultas para histórico de eventos.
- **Aula 4:** Neo4j. **Desafio:** modelar recomendação “clientes que compraram também compraram”.
- **Entrega:** matriz de escolha de bancos e pequenos modelos orientados ao padrão de acesso.

### Semana 20 — Redis e persistência poliglota

- **Aula 1:** Redis, estruturas, TTL e invalidação. **Prática:** cachear produto com política explícita.
- **Aula 2:** cache-aside, write-through e riscos de consistência. **Prática:** reproduzir dado obsoleto e corrigi-lo.
- **Aula 3:** persistência poliglota. **Prática:** definir fonte de verdade e projeções para cada caso.
- **Aula 4:** checkpoint de dados. **Desafio:** entregar busca de catálogo com PostgreSQL, cache Redis e teste de integração.
- **Entrega:** release `v0.2`, com migrações e estratégia de persistência documentada.

---

## Fase 4 — Spring Boot e APIs de produção (semanas 21–27)

### Semana 21 — Spring e Spring Boot

- **Aula 1:** IoC, DI, beans e configuração. **Prática:** converter serviços do projeto para componentes sem esconder dependências.
- **Aula 2:** auto-configuração, profiles e configuração externa. **Prática:** criar perfis local/teste sem segredos no repositório.
- **Aula 3:** organização por funcionalidade e fronteiras. **Prática:** estruturar catálogo e pedidos em módulos claros.
- **Aula 4:** slice inicial. **Desafio:** subir aplicação com health check e caso de uso de catálogo.
- **Entrega:** aplicação Spring Boot organizada e configurável.

### Semana 22 — REST e validação

- **Aula 1:** recursos, verbos, status, idempotência e maturidade REST. **Prática:** desenhar contrato de catálogo.
- **Aula 2:** controllers, DTOs e Bean Validation. **Prática:** criar endpoints sem expor entidades JPA.
- **Aula 3:** tratamento global de erros e Problem Details. **Prática:** padronizar erros com correlação.
- **Aula 4:** API evolutiva. **Desafio:** implementar cadastro, busca e atualização com testes HTTP.
- **Entrega:** API REST de catálogo com contrato e erros consistentes.

### Semana 23 — Spring Data JPA e transações

- **Aula 1:** repositories, derived queries e specifications. **Prática:** implementar filtros combináveis.
- **Aula 2:** paginação, projections e auditoria. **Prática:** expor listagem eficiente e rastreável.
- **Aula 3:** limites transacionais e eventos internos. **Prática:** mover transação para o caso de uso correto.
- **Aula 4:** pedido completo. **Desafio:** persistir pedido, reservar estoque e verificar rollback.
- **Entrega:** fluxo de pedido com persistência e testes de integração.

### Semana 24 — OpenAPI e consumo de APIs

- **Aula 1:** OpenAPI/Swagger e contrato. **Prática:** documentar exemplos, erros e autenticação.
- **Aula 2:** geração/validação de clientes e compatibilidade. **Prática:** detectar breaking change no contrato.
- **Aula 3:** clientes HTTP declarativos ou programáticos. **Prática:** integrar serviço de pagamento simulado.
- **Aula 4:** integração robusta. **Desafio:** suportar timeout, erro remoto e idempotência do pagamento.
- **Entrega:** contrato navegável e integração externa testada.

### Semana 25 — OAuth2, JWT e segurança de APIs

- **Aula 1:** autenticação, autorização, OAuth2/OIDC e ameaças. **Prática:** desenhar fluxos para usuário e serviço.
- **Aula 2:** resource server JWT. **Prática:** proteger endpoints e validar claims.
- **Aula 3:** autorização por papel e objeto, CORS/CSRF e menor privilégio. **Prática:** restringir operações administrativas.
- **Aula 4:** testes de segurança. **Desafio:** cobrir token ausente, expirado, adulterado e permissão insuficiente.
- **Entrega:** API protegida com matriz de permissões.

### Semana 26 — WebFlux e programação reativa

- **Aula 1:** modelo reativo, Publisher e backpressure. **Prática:** visualizar fluxo com Reactor.
- **Aula 2:** `Mono`, `Flux`, composição e erros. **Prática:** agregar catálogo e recomendações simuladas.
- **Aula 3:** WebFlux versus MVC/virtual threads. **Prática:** comparar modelos para o caso do projeto.
- **Aula 4:** fluxo reativo. **Desafio:** criar endpoint streaming e provar que não há bloqueio acidental.
- **Entrega:** protótipo reativo e ADR justificando onde usá-lo ou não.

### Semana 27 — Integração, Testcontainers e release Spring

- **Aula 1:** testes de integração Spring e slices. **Prática:** escolher nível correto para controller, repository e fluxo completo.
- **Aula 2:** Testcontainers. **Prática:** subir PostgreSQL e Redis reais durante testes.
- **Aula 3:** testes de contrato e cenários de falha. **Prática:** testar incompatibilidade do provedor de pagamento.
- **Aula 4:** checkpoint. **Desafio:** executar jornada autenticada de compra ponta a ponta.
- **Entrega:** release `v0.3`, API Spring testada e documentada.

---

## Fase 5 — Quarkus, mensageria e observabilidade (semanas 28–33)

### Semana 28 — Quarkus e REST

- **Aula 1:** arquitetura, Dev Services, extensões e configuração. **Prática:** criar serviço Quarkus de notificações.
- **Aula 2:** REST com Quarkus. **Prática:** expor endpoints e validação.
- **Aula 3:** Panache. **Prática:** persistir notificações e comparar active record/repository.
- **Aula 4:** OpenAPI e testes. **Desafio:** entregar API documentada e testada em dev mode.
- **Entrega:** microsserviço Quarkus funcional.

### Semana 29 — Quarkus Security e integração

- **Aula 1:** JWT e Quarkus Security. **Prática:** validar tokens compatíveis com a API Spring.
- **Aula 2:** clientes REST e tolerância a falhas inicial. **Prática:** consumir dados de pedido.
- **Aula 3:** configuração e extensões. **Prática:** separar configuração por ambiente e proteger segredos.
- **Aula 4:** fronteira de serviço. **Desafio:** enviar notificação apenas para pedido autorizado e existente.
- **Entrega:** serviço seguro e integrado.

### Semana 30 — Kafka e RabbitMQ

- **Aula 1:** logs distribuídos, tópicos, partições e consumer groups no Kafka. **Prática:** publicar `OrderCreated`.
- **Aula 2:** entrega, offset, idempotência e outbox. **Prática:** impedir notificação duplicada.
- **Aula 3:** RabbitMQ, exchanges, filas e critérios de escolha. **Prática:** rotear comandos simulados por chave.
- **Aula 4:** fluxo assíncrono. **Desafio:** desacoplar pedido e notificação e testar reprocessamento.
- **Entrega:** comunicação assíncrona confiável e comparação Kafka/RabbitMQ.

### Semana 31 — Resiliência e cache

- **Aula 1:** timeout, retry, circuit breaker e bulkhead. **Prática:** aplicar Fault Tolerance API no cliente externo.
- **Aula 2:** fallback, jitter e retry storms. **Prática:** simular indisponibilidade sem amplificar falhas.
- **Aula 3:** cache e coerência entre serviços. **Prática:** definir chaves, TTL e métricas.
- **Aula 4:** caos controlado. **Desafio:** manter comportamento previsível com pagamento/notificação instáveis.
- **Entrega:** políticas de resiliência justificadas e testadas.

### Semana 32 — OpenTelemetry e observabilidade

- **Aula 1:** logs, métricas, traces e correlação. **Prática:** propagar correlation/trace ID.
- **Aula 2:** instrumentação OpenTelemetry. **Prática:** visualizar jornada entre Spring, Kafka e Quarkus.
- **Aula 3:** SLIs, SLOs e alertas acionáveis. **Prática:** definir indicadores para checkout.
- **Aula 4:** diagnóstico distribuído. **Desafio:** encontrar gargalo/falha usando somente telemetria.
- **Entrega:** dashboard mínimo, trace distribuído e runbook.

### Semana 33 — GraalVM, nativo e Kubernetes Native

- **Aula 1:** AOT, GraalVM, reflexão e limitações. **Prática:** preparar serviço para compilação nativa.
- **Aula 2:** build nativo e medição. **Prática:** comparar startup, memória e build com JVM.
- **Aula 3:** probes e configuração Kubernetes Native. **Prática:** gerar/ajustar manifests.
- **Aula 4:** checkpoint Quarkus. **Desafio:** iniciar serviço nativo, provar saúde e processar evento.
- **Entrega:** release `v0.4` com relatório JVM versus nativo.

---

## Fase 6 — Arquitetura, design e system design (semanas 34–39)

### Semana 34 — Design, arquitetura, acoplamento e refactoring

- **Aula 1:** software design versus arquitetura e atributos de qualidade. **Prática:** identificar decisões locais e sistêmicas do projeto.
- **Aula 2:** arquitetura em camadas e Clean Architecture. **Prática:** mapear dependências e corrigir uma violação.
- **Aula 3:** coupling/decoupling, coesão e interfaces. **Prática:** medir acoplamento conceitual de dois módulos.
- **Aula 4:** refactoring seguro. **Desafio:** melhorar uma fronteira preservando testes e contrato.
- **Entrega:** mapa arquitetural e ADR da refatoração.

### Semana 35 — Design Patterns

- **Aula 1:** Factory, Builder, Prototype e Singleton. **Prática:** aplicar somente os padrões que resolvam criação real no projeto.
- **Aula 2:** Strategy e Observer. **Prática:** estratégias de preço e eventos de domínio.
- **Aula 3:** Adapter, Decorator e Proxy. **Prática:** adaptar pagamento, decorar métricas e aplicar proxy de cache.
- **Aula 4:** padrões sem overengineering. **Desafio:** refatorar solução carregada de padrões para a menor estrutura útil.
- **Entrega:** catálogo de exemplos com problema, solução e contraindicação de cada padrão da ementa.

### Semana 36 — DDD estratégico

- **Aula 1:** domínio, subdomínios e linguagem ubíqua. **Prática:** conduzir event storming textual do comércio.
- **Aula 2:** bounded contexts. **Prática:** separar Catálogo, Pedidos, Pagamentos e Entregas.
- **Aula 3:** context mapping e padrões de integração. **Prática:** classificar relações e anticorruption layer.
- **Aula 4:** alinhamento código-negócio. **Desafio:** detectar termos ambíguos e revisar contratos.
- **Entrega:** mapa de contextos, glossário e decisões de integração.

### Semana 37 — DDD tático, CQRS e Event Sourcing

- **Aula 1:** entities, value objects, aggregates e invariantes. **Prática:** redesenhar agregado `Order`.
- **Aula 2:** repositories, domain services e eventos. **Prática:** implementar fronteira do agregado sem anemizar domínio.
- **Aula 3:** CQRS. **Prática:** separar escrita de pedido e leitura de painel.
- **Aula 4:** Event Sourcing. **Desafio:** reconstruir estado de pedido a partir de eventos e discutir custos.
- **Entrega:** protótipo CQRS/Event Sourcing e ADR sobre adoção seletiva.

### Semana 38 — Fundamentos de system design

- **Aula 1:** componentes, requisitos funcionais/não funcionais e estimativas. **Prática:** estimar tráfego e armazenamento do EliteCommerce.
- **Aula 2:** escalabilidade vertical/horizontal, latência e throughput. **Prática:** localizar gargalos e propor medições.
- **Aula 3:** disponibilidade, consistência, CAP e PACELC. **Prática:** escolher trade-offs por fluxo.
- **Aula 4:** comunicação REST, gRPC e assíncrona. **Desafio:** desenhar API robusta e evolução compatível.
- **Entrega:** desenho de alto nível com números e trade-offs explícitos.

### Semana 39 — Sistemas escaláveis e casos práticos

- **Aula 1:** load balancing, cache, sharding e replicação. **Prática:** evoluir o desenho para 100 vezes o tráfego.
- **Aula 2:** circuit breakers, failover e auto-healing. **Prática:** elaborar estratégia para falha regional.
- **Aula 3:** design de sistema de reservas e feed social. **Prática:** comparar contenção, ordenação e fan-out.
- **Aula 4:** design de e-commerce em alta escala. **Desafio:** apresentar solução em 40 minutos e responder trade-offs por 20.
- **Entrega:** pacote de três system designs e checklist reutilizável para entrevistas.

---

## Fase 7 — React, containers, Kubernetes, AWS e CI/CD (semanas 40–44)

### Semana 40 — React para backend developers

- **Aula 1:** JavaScript/TypeScript essencial, Vite e componentes funcionais. **Prática:** iniciar painel do catálogo (conhecer CRA apenas como legado).
- **Aula 2:** props, eventos e `useState`. **Prática:** criar busca e carrinho local.
- **Aula 3:** `useEffect`, ciclo de vida e efeitos seguros. **Prática:** carregar catálogo sem loop ou estado obsoleto.
- **Aula 4:** organização, ESLint e Prettier. **Desafio:** decompor tela grande em componentes coesos.
- **Entrega:** painel React navegável e padronizado.

### Semana 41 — Formulários, APIs e estado

- **Aula 1:** formulários e validação. **Prática:** cadastrar produto com mensagens acessíveis.
- **Aula 2:** Fetch e Axios. **Prática:** consumir API, tratar loading, erro e cancelamento.
- **Aula 3:** Context API. **Prática:** compartilhar autenticação/carrinho sem prop drilling.
- **Aula 4:** Redux básico e critérios de adoção. **Desafio:** prototipar estado global e decidir se o projeto precisa dele.
- **Entrega:** fluxo de compra conectado à API, com ADR Context versus Redux.

### Semana 42 — Docker e Podman

- **Aula 1:** imagens, camadas, build context e multi-stage. **Prática:** criar imagem otimizada da API.
- **Aula 2:** segurança, usuário não root e supply chain. **Prática:** reduzir superfície e verificar imagem.
- **Aula 3:** Podman e compatibilidade. **Prática:** executar a mesma aplicação e registrar diferenças.
- **Aula 4:** composição local. **Desafio:** iniciar front, APIs, PostgreSQL, Redis e broker com uma configuração reproduzível.
- **Entrega:** ambiente containerizado com health checks.

### Semana 43 — Kubernetes para desenvolvedores

- **Aula 1:** Pod, ReplicaSet e Deployment. **Prática:** implantar e fazer rolling update.
- **Aula 2:** Service, ConfigMap, Secret e probes. **Prática:** expor serviço e separar configuração.
- **Aula 3:** requests, limits, autoscaling e falhas. **Prática:** provocar restart e observar recuperação.
- **Aula 4:** operação. **Desafio:** diagnosticar rollout quebrado e restaurar disponibilidade.
- **Entrega:** manifests ou chart mínimo e runbook Kubernetes.

### Semana 44 — AWS, CI/CD e deploy front-end

- **Aula 1:** fundamentos AWS e S3. **Prática:** desenhar/implementar adaptador local compatível para armazenamento de imagens.
- **Aula 2:** Lambda e DynamoDB. **Prática:** prototipar função de processamento e modelar chave por acesso.
- **Aula 3:** Jenkins e GitHub Actions. **Prática:** pipeline com build, testes, análise e imagem.
- **Aula 4:** Netlify/Vercel e integração. **Desafio:** preparar deploy do React e configurar URL/CORS por ambiente.
- **Entrega:** release `v0.5`, pipeline reproduzível e arquitetura de deploy documentada.

---

## Fase 8 — IA corporativa com Java e LangChain4j (semanas 45–47)

### Semana 45 — Fundamentos, LLMs e RAG

- **Aula 1:** IA preditiva versus generativa, papel do Java e arquitetura de integração. **Prática:** desenhar fronteiras entre aplicação, modelo e dados.
- **Aula 2:** LangChain4j, prompts e saída estruturada. **Prática:** criar assistente de suporte com resposta tipada e testes semânticos básicos.
- **Aula 3:** embeddings, ingestão, chunking e busca semântica. **Prática:** ingerir documentação do catálogo em memória.
- **Aula 4:** RAG completo. **Desafio:** responder com evidências e recusar quando o contexto não sustentar a resposta.
- **Entrega:** assistente RAG em memória, dataset de avaliação e arquitetura de migração para banco vetorial.

### Semana 46 — Qualidade de RAG e agentes

- **Aula 1:** bancos vetoriais, filtros, transformação de consulta e reranking. **Prática:** comparar estratégias em perguntas difíceis.
- **Aula 2:** de chatbot a agente, ciclo de decisão e tools. **Prática:** expor consulta de pedido como ferramenta de menor privilégio.
- **Aula 3:** memória, estado e orquestração. **Prática:** executar atendimento em múltiplos passos sem misturar usuários.
- **Aula 4:** agente seguro. **Desafio:** coordenar catálogo, pedido e política de devolução com confirmação antes de ação.
- **Entrega:** agente com ferramentas, memória limitada e avaliação de sucesso/falha.

### Semana 47 — MCP, segurança, produção e observabilidade de IA

- **Aula 1:** MCP, descoberta e desacoplamento de ferramentas. **Prática:** desenhar e implementar/prototipar servidor e cliente MCP para catálogo.
- **Aula 2:** prompt injection, vazamento, guardrails e moderação. **Prática:** criar suíte adversarial e separar conteúdo de instruções.
- **Aula 3:** cache, timeout, retry e falhas de tools. **Prática:** controlar custo e degradação sem repetir ações não idempotentes.
- **Aula 4:** observabilidade não determinística. **Desafio:** instrumentar tokens, latência, traces, qualidade e falhas por etapa.
- **Entrega:** release `v0.6`, aplicação de IA governada com threat model e métricas.

---

## Fase 9 — Mercado, entrevistas e encerramento (semana 48)

### Semana 48 — Posicionamento e defesa técnica

- **Aula 1:** LinkedIn, SEO, SSI, networking e marca pessoal. **Prática:** reescrever headline/sobre e criar rotina de conexões com valor, sem spam.
- **Aula 2:** GitHub e expectativas por senioridade (júnior a manager). **Prática:** organizar o EliteCommerce como case, comparando evidências esperadas para pleno, sênior, tech lead, staff e principal.
- **Aula 3:** RH, STAR, pontos fracos, salário e negociação. **Prática:** preparar seis histórias STAR e uma faixa salarial sustentada por valor.
- **Aula 4:** entrevista técnica final. **Desafio:** live coding Java, explicação de arquitetura e system design sob tempo, seguida de retrospectiva.
- **Entrega:** release `v1.0`, portfólio público ou publicável, currículo/LinkedIn revisados e plano de evolução de 90 dias.

---

## Checkpoints e critérios de aprovação

| Marco | Semana | Evidência mínima |
|---|---:|---|
| Java moderno | 8 | Importador NIO, collections justificadas, streams, build e testes |
| Concorrência e qualidade | 14 | Estoque thread-safe, TDD, análise estática, ArchUnit e benchmark |
| Dados | 20 | PostgreSQL migrável, JPA/JDBC, Redis e decisão NoSQL |
| Spring | 27 | Jornada REST autenticada com OpenAPI e Testcontainers |
| Quarkus/distribuído | 33 | Kafka, resiliência, OpenTelemetry e comparação nativa/JVM |
| Arquitetura | 39 | DDD, CQRS/Event Sourcing seletivo e três system designs |
| Entrega | 44 | React, containers, Kubernetes, AWS e CI/CD |
| IA corporativa | 47 | RAG, agente, MCP, guardrails e observabilidade |
| Portfólio | 48 | Release final defendida em simulação de entrevista |

Para avançar em cada marco:

- executar build e testes do zero;
- demonstrar o incremento sem roteiro detalhado;
- explicar três decisões e seus trade-offs;
- corrigir ao menos um defeito descoberto na revisão;
- registrar lacunas que irão para a revisão espaçada.

## Revisão espaçada

- **Semanal:** 15 perguntas próprias no diário; responder cinco sem consulta.
- **A cada 4 semanas:** refazer um exercício antigo com uma restrição nova.
- **A cada checkpoint:** demonstração de 10 minutos e retrospectiva escrita.
- **Após 48 semanas:** ciclos mensais alternando Java/concorrência, arquitetura/system design, cloud e IA.

## Como adaptar sem perder a sequência

- Se uma semana atrasar, mova a entrega; não comprima quatro aulas em duas.
- Se o assunto já estiver dominado, mantenha o desafio e reduza apenas a explicação.
- Serviços pagos ou credenciais externas podem ser substituídos por emuladores, containers ou adapters locais.
- Recursos experimentais da linguagem devem ser estudados conceitualmente e isolados do núcleo do projeto.
- Deploy público é opcional; a evidência obrigatória é um processo reproduzível e documentado.
