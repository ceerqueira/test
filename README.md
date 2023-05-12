# java-test
Código desenvolvido durante os curso de Java Testes do Alura

<a href="https://cursos.alura.com.br/course/java-collections">Java Collections: Dominando Listas, Sets e Mapas<a>
  
 <a href="https://cursos.alura.com.br/certificate/ea00b5f7-af32-42d8-be58-54323d9c2e82">(Certificação de Victor)
  
<a href="https://cursos.alura.com.br/course/java-util-lambdas">Java e java.util: Coleções, Wrappers e Lambda expressions<a>
  
<a href="https://cursos.alura.com.br/certificate/f6108291-e63d-4ec9-bb39-8289d8b27fb2">(Certificação de Victor)
# Testes
  
  Seguindo o cronograma de estudo do <a href="https://techguide.sh/pt-BR/path/java/">Tech Guide em Java<a>

Foi indicado para estudar os seguintes itens: 
  
  - O teste de software é o processo de avaliação e verificação de que um software realmente faz o que deveria fazer. Os benefícios dos testes incluem a prevenção de bugs, a redução dos custos de desenvolvimento e a melhoria do desempenho.
 - Usar testes unitários
 - Usar testes de integração
 - Usar testes de comportamento (behavior)
 - Usar mocks
  
  
  
# TDD e Java: testes automatizados com JUnit
  
  <a href="https://cursos.alura.com.br/course/tdd-java-testes-automatizados-junit">TDD e Java: testes automatizados com JUnit<a>
  
 <a href="https://cursos.alura.com.br/certificate/525520cc-7b49-458c-919c-c0ac895b03ed">(Certificação de Victor)
   

<img width="1440" alt="Captura de Tela 2023-05-12 às 15 05 48" src="https://github.com/ceerqueira/test/assets/50030996/fbb1da57-d59a-485a-be09-6e2322d1de01">


   De modo geral, podemos usar três abordagens nos testes:
   
   - Na primeira, vamos chamar um método que devolve um valor e testar se esse valor está correto. É o caso do BonusServiceTest, cujo método service.calcularBonus devolve um BigDecimal, que por sua vez é verificado pelo assertEquals. Nessa categoria de teste, chamamos um método, passamos um parâmetro, obtemos um retorno e o validamos.
   
   - A segunda abordagem envolve testar um objeto modificado pelo método. Um exemplo é a classe ReajusteService, na qual chamamos um método que não devolve nenhum valor (void), mas modifica um objeto. Nesse caso, fazemos o assert em cima do objeto que foi o nosso parâmetro para verificar se ele nos dá o valor esperado.
   - A terceira é a que fizemos agora: aquela que lança uma exceptione na qual simulamos se ela de fato acontece.

   

   ![TDD](https://github.com/ceerqueira/test/assets/50030996/d0a2ab8a-597c-4b04-8e51-46680f200cd3)
Também vimos que é possível começar o processo pela escrita do teste com a abordagem TDD (Desenvolvimento Guiado por Teste). Nela, percebemos que o teste serve de rascunho para modelarmos o design do nosso código e depois partir para a implementação. Nessa etapa, também aprendemos a lidar com as exceptions e verificá-las.

