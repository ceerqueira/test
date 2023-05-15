# Índice 

* [Índice](#índice)
* [java Testes](#java-testes)
* [TDD e Java: testes automatizados com JUnit](#TDD-e-Java-testes-automatizados-com-JUnit)
* [Testes de Integração: testes de SQL e DAOs automatizados em Java](#Testes-de-Integração-testes-de-SQL-e-DAOs-automatizados-em-Java)
* [Mocks em Java: conhecendo o Mockito](#Mocks-em-Java-conhecendo-o-Mockito)
* [Certificação](#Certificação)


# Java Testes
  
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
   
   
# Testes de Integração: testes de SQL e DAOs automatizados em Java
   
   <a href="https://cursos.alura.com.br/course/teste-integracao-sql-daos-automatizados-java">Testes de Integração: testes de SQL e DAOs automatizados em Java<a>
  
 <a href="https://cursos.alura.com.br/certificate/c68445b4-1b7c-4f43-ab1a-a146387d91c4">(Certificação de Victor)
   
   
   ![pasted image 0](https://github.com/ceerqueira/test/assets/50030996/bf2527b8-76a6-4857-89ab-b05e0d8ee79d)
   
   
Aprendemos como fazer testes de integração em classes DAO, projetos tradicionais e legados. O objetivo foi escrever os testes automatizados para as classes DAO que já estavam desenvolvidas em um projeto com determinadas tecnologias. Inicialmente, foram encontrados problemas na criação de um teste automatizado, devido ao uso de framework para injeção de dependências e recebimento do EntityManager. A solução foi trocar a injeção de dependências e criar a classe JPAUtil para isolar a criação do EntityManager.

Em seguida, foram escritos os testes para as classes DAO, que incluíam a criação de entidades, objetos dessas entidades e a persistência no banco de dados. Foram utilizados recursos do JUnit para isolar a infraestrutura que cada teste precisava, incluindo a criação do EntityManager, da classe DAO, begin e rollback da transação. Também foi discutido sobre a testabilidade dos métodos de insert, update e delete.

Por fim, foi apresentado o conceito de testes Data Builder para isolar a criação dos objetos em classes que seguem o padrão builder, facilitando a escrita do teste e deixando-o mais legível. O treinamento foi realizado em um projeto feito com Spring Boot, que serviu para facilitar a execução da aplicação, mas sem o uso dos recursos do Spring Boot.
   
   
# Mocks em Java: conhecendo o Mockito
   
   <a href="https://cursos.alura.com.br/course/mocks-java-mockito">Mocks em Java: conhecendo o Mockito<a>
  
 <a href="https://cursos.alura.com.br/certificate/b3d8dd66-738b-42c0-adef-1c1e87590e4a">(Certificação de Victor)

   Mas o que são Mocks?
   
   O Mock é uma classe que simula os comportamentos de outra classe. Ele serve para cenários em que queremos testar as lógicas e os algoritmos de uma classe que tem dependência de outra classe, mas isolando essas dependências.

Com os Mocks, conseguimos escrever um teste de unidade em vez de ter que usar um teste de integração, ou seja, que vai se integrar às dependências.
   
   
   
# Certificações
   
     <a href="https://cursos.alura.com.br/course/tdd-java-testes-automatizados-junit">TDD e Java: testes automatizados com JUnit<a>
  
 <a href="https://cursos.alura.com.br/certificate/525520cc-7b49-458c-919c-c0ac895b03ed">(Certificação de Victor)
   
   <a href="https://cursos.alura.com.br/course/teste-integracao-sql-daos-automatizados-java">Testes de Integração: testes de SQL e DAOs automatizados em Java<a>
  
 <a href="https://cursos.alura.com.br/certificate/c68445b4-1b7c-4f43-ab1a-a146387d91c4">(Certificação de Victor)
   
   <a href="https://cursos.alura.com.br/course/mocks-java-mockito">Mocks em Java: conhecendo o Mockito<a>
  
 <a href="https://cursos.alura.com.br/certificate/b3d8dd66-738b-42c0-adef-1c1e87590e4a">(Certificação de Victor)
   

