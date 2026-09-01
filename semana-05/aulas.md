# Roteiros — Semana 5

## Aula 1 — Lambdas e interfaces padrão (60 min)

- **0–5:** escreva a assinatura de `Predicate`, `Function`, `Consumer` e `Supplier` de memória.
- **5–18:** estude alvo de lambda, captura, pureza e method reference.
- **18–43:** filtre produtos elegíveis e transforme preços usando funções; substitua lambdas triviais por referências legíveis.
- **43–52:** identifique captura mutável e efeitos colaterais em exemplos ruins.
- **52–60:** registre quando uma lambda piora o nome do domínio.

## Aula 2 — Composição (60 min)

- **0–5:** recupere `and`, `or`, `negate`, `compose` e `andThen`.
- **5–18:** compare interface padrão com interface funcional de domínio.
- **18–43:** componha validações de nome, preço e categoria sem acumular `if` no chamador.
- **43–52:** crie uma interface própria apenas quando o nome/contrato acrescentar significado.
- **52–60:** execute o contrato e registre trade-offs.

## Aula 3 — Optional (60 min)

- **0–8:** liste usos bons e ruins (`campo`, `parâmetro`, `collection`, `retorno`).
- **8–20:** estude `map`, `flatMap`, `filter`, `orElseGet` e `orElseThrow`.
- **20–43:** implemente busca de produto e encadeie promoção sem `isPresent/get`.
- **43–52:** demonstre a execução ansiosa de `orElse`.
- **52–60:** remova `Optional` onde uma lista vazia ou parâmetro obrigatório comunica melhor.

## Aula 4 — Motor de promoções (60 min)

- **0–10:** leia o contrato e nomeie a falha protegida por cada teste.
- **10–40:** implemente seleção por `Predicate<Product>` e alteração por `UnaryOperator<BigDecimal>`.
- **40–50:** componha promoções preservando a ordem declarada.
- **50–60:** refatore com testes verdes, preencha diário e rubrica.
