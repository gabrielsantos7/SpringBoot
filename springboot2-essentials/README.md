# springboot2-essentials

![1680216781191](image/README/1680216781191.png)

## ❓ O que é e para que serve

O Spring Boot é um framework para desenvolvimento de aplicativos em Java que visa tornar o processo mais rápido e fácil, fornecendo um conjunto de bibliotecas e ferramentas que ajudam a criar aplicativos em menos tempo. O Spring Boot é baseado no Spring Framework, um dos frameworks mais populares do mundo Java.

O Spring Boot tem uma estruturação simples que permite aos desenvolvedores criar rapidamente aplicativos web em Java com poucas configurações. O objetivo principal é tornar o desenvolvimento de aplicativos Java mais fácil e rápido, oferecendo um conjunto de convenções e padrões que podem ser seguidos para criar aplicativos web prontos para produção.

---

## 📁 Estruturação do Projeto

> Para todos os projetos em SpringBoot, é necessário que haja uma série de arquivos e pastas criados previamente. Como eles são criados de forma padrão e usados em todos os projetos, não há a necessidade de criar tudo do zero toda vez que começarmos a trabalhar no código. A estruturação padrão do Spring Boot é baseada em algumas pastas e arquivos importantes:

### Pastas src:

- `src/main/java:` Essa é a pasta principal do código-fonte do seu aplicativo, onde você colocará suas classes Java.
- `src/main/resources:` Aqui você armazenará todos os recursos não relacionados a código-fonte, como arquivos de propriedades, arquivos de configuração, arquivos de imagem, entre outros.
- `src/test:` Essa pasta é usada para armazenar os testes de unidade do seu aplicativo.

---

### Pastas de organização dos arquivos do projeto

> A pasta `src/main/java` é a pasta padrão onde são armazenados os arquivos-fonte Java da aplicação. É dentro dela que iremos trabalhar o código-fonte dos projetos. Dentro dela, é comum criar um pacote (package) raiz com o nome da aplicação. No nosso caso, a aplicação se chama "springboot2-essentials". Então daremos a este pacote raiz o nome "springboot2". Dentro dessa pasta, é comum criar três subpacotes para cada camada da aplicação, a fim de organizar diferentes tipos de classes do projeto.

* O pacote `controller` contém as classes responsáveis por receber as requisições HTTP e fornecer as respostas apropriadas. Essas classes geralmente contêm métodos anotados com as anotações @RequestMapping, @GetMapping, @PostMapping, entre outras, que indicam os endpoints HTTP e como processá-los.
* O pacote `domain` contém as classes que representam as entidades de negócio do sistema. Essas classes geralmente correspondem às tabelas de banco de dados ou aos objetos de negócio manipulados pelo sistema. Elas contêm os atributos e métodos necessários para representar essas entidades e implementam a lógica de negócio necessária para manipulá-las.
* O pacote `util` contém classes utilitárias que fornecem funcionalidades reutilizáveis para outras partes do sistema. Essas classes geralmente contêm métodos estáticos que realizam operações comuns, como manipulação de strings, cálculos matemáticos, formatação de datas, entre outras.

---

### Pastas target:

- `target/classes:` contém os arquivos de classe compilados do projeto.
- `target/generated-sources:` contém os arquivos gerados automaticamente pelo Maven ou pelo processo de compilação, como classes de proxies para classes anotadas com "AspectJ".
- `target/generated-test-sources:` contém os arquivos gerados automaticamente para testes unitários, como classes de testes e recursos.
- `target/test-classes:` contém os arquivos de classe compilados para testes unitários.

---

### Pasta .mvn

`mvn/wrapper:` contém o wrapper do Maven, que é um script de inicialização do Maven que pode ser usado para construir o projeto sem a necessidade de ter o Maven instalado globalmente no sistema.

---

### Observação

- _A pasta image não possui nenhuma conexão com o SpringBoot, é apenas uma pasta a mais criada pela IDE para colocar as imagens utilizadas neste documento MarkDown._

---

### Principais arquivos

- `pom.xml:` Este é um arquivo de configuração do Maven, que é uma ferramenta de gerenciamento de dependências usada para gerenciar as bibliotecas usadas pelo seu aplicativo.
- `application.properties:` Este arquivo contém as configurações do seu aplicativo, como as configurações do banco de dados, portas do servidor, etc.
- `mvnw` e `mvnw.cmd:` Os dois arquivos são a mesma coisa, a diferença é que o primeiro é um executável de sistemas unix e o segundo, do Windows. São scripts do wrapper do maven que permitem que o Maven seja executado sem a necessidade de instalação global do Maven no sistema operacional.

---

## 📌 Anotações de classes e métodos

> As anotações (ou annotations) em um projeto Spring são usadas para fornecer metadados adicionais sobre as classes e métodos da aplicação. Elas são linhas iniciadas com o símbolo "@" que são colocadas acima das definições de classes e métodos, e são usadas pelo Spring Framework para entender como as classes e métodos devem ser tratados dentro da aplicação. Assim, é possível entender o papel de uma classe ou método na aplicação simplesmente olhando para as anotações acima deles.

---

### Principais anotações em classes:

* `@Component:` indica que a classe é um componente gerenciado pelo Spring (ou seja, que pode ser injetado em outras classes).
* `@Service:` indica que a classe é um serviço da aplicação, geralmente utilizado para processar regras de negócio.
* `@Controller:` indica que a classe é um controlador da aplicação web, responsável por gerenciar requisições HTTP e retornar respostas.
* `@Repository:` indica que a classe é um repositório de dados, normalmente utilizado para realizar operações de persistência em bancos de dados.

---

### Principais anotações em métodos:

* `@Autowired:` indica que um objeto deve ser injetado automaticamente pelo Spring. É utilizado para realizar a injeção de dependências entre classes.
* `@GetMapping:` indica que o método deve responder a uma requisição HTTP GET em um determinado caminho de URL.
* `@PostMapping:` indica que o método deve responder a uma requisição HTTP POST em um determinado caminho de URL.
* `@PutMapping:` mapeia uma solicitação HTTP PUT para um método de manipulação de solicitação.
* `@DeleteMapping:` mapeia uma solicitação HTTP DELETE para um método de manipulação de solicitação.
* `@RequestBody:` indica que um parâmetro de método deve ser vinculado ao corpo da solicitação HTTP.
* `@RequestParam:` indica que um parâmetro de método deve ser vinculado a um parâmetro de consulta de solicitação HTTP.
* `@PathVariable:` indica que um parâmetro de método deve ser vinculado a uma variável de caminho de solicitação HTTP.

---

## 🔗 Outros complementos e funcionalidades

> O Spring Boot pode ser usado em conjunto com outras ferramentas do ecossistema Spring, como o Spring MVC para criar aplicativos web. Além disso, o Spring Boot vem com um servidor embutido (TomCat), o que significa que você não precisa configurar um servidor web externo para executar seu aplicativo. Isso facilita a execução e o teste do seu aplicativo em seu próprio ambiente de desenvolvimento.

> O TomCat é incluído como uma dependência do projeto. Ele é empacotado junto com o código do projeto em um arquivo JAR executável. Quando o projeto é executado, o servidor Tomcat é inicializado automaticamente e disponibiliza as aplicações web contidas no projeto. Por padrão, esse servidor atua na porta 8080, mas você pode configurar uma porta diferente no arquivo "application.properties" ou "application.yml" do projeto.

---

## 💻 Criando o projeto

Para criar projetos em Spring Boot, você pode usar o Spring Initializr, um site que permite que você gere automaticamente um projeto Spring Boot com as dependências e configurações necessárias. Você pode acessar o site em [https://start.spring.io/](https://start.spring.io/). Lá, você pode definir as opções de configuração do projeto, como a versão do Spring Boot, as dependências, etc.

---

## 📕 Descrição deste projeto

Atividade proposta em sala de aula como exemplo introdutório, o primeiro feito com o framework Spring. Nele, é criado um ArrayList de objetos Alunos que é exibido no navegador na url: [http://localhost:8080/nomes](http://localhost:8080/nomes).
