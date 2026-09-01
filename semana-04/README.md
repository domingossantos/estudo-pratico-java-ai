# Semana 4 — Maps e casos especiais

## Resultado

Indexar o catálogo por requisitos de acesso, compreender ordem, concorrência, identidade e ciclo de vida das chaves e implementar um cache LRU limitado.

## Aula 1 — HashMap, LinkedHashMap, TreeMap e Hashtable (60 min)

- **0–5:** estime custo de busca em lista e mapa.
- **5–18:** hashing, colisões, ordem de inserção/acesso, árvore e sincronização legada.
- **18–40:** execute `MapLab` e compare iteração e lookup.
- **40–50:** explique por que `Hashtable` não é a escolha concorrente moderna.
- **50–60:** escolha mapas para catálogo, relatório ordenado e LRU.

## Aula 2 — ConcurrentHashMap (60 min)

- **0–8:** diferencie método thread-safe de operação composta atômica.
- **8–20:** `compute`, `merge`, `putIfAbsent` e weakly consistent iteration.
- **20–43:** implemente contador de visualizações com `merge`.
- **43–52:** execute atualizações concorrentes e confira o total.
- **52–60:** registre padrões que evitam check-then-act.

## Aula 3 — WeakHashMap, IdentityHashMap e EnumMap (60 min)

- **0–8:** igualdade, identidade e alcançabilidade.
- **8–22:** estude os três contratos e seus riscos.
- **22–42:** execute experimentos controlados sem depender de momento exato do GC.
- **42–52:** modele preços por região com `EnumMap`.
- **52–60:** escreva uma contraindicação por implementação.

## Aula 4 — Índices e cache LRU (60 min)

- **0–10:** leia o contrato e nomeie a mutação protegida.
- **10–40:** implemente índice por ID e cache com ordem de acesso/capacidade 2.
- **40–50:** confirme cópias imutáveis e expulsão do menos recente.
- **50–60:** refatore, preencha diário e rubrica.

## Validação

```bash
./scripts/test.sh
./scripts/test.sh --solution
./scripts/lab.sh
```
