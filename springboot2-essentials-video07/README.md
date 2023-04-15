# Spring Boot 2 Vídeo 07

Em uma aplicação Java Spring REST, é comum encontrar cinco pacotes principais que organizam as diferentes camadas e funcionalidades da aplicação: controller, domain, util, repository e service. Os pacotes comunicam-se entre si para fornecer uma funcionalidade completa à aplicação.

## 📁Pacote Controller

* O pacote `controller` é responsável por gerenciar as requisições e respostas HTTP da aplicação. Ele contém as classes que recebem as solicitações dos clientes, manipulam os dados recebidos e respondem com as informações solicitadas. Essas classes são responsáveis por integrar as camadas inferiores, como a camada de serviço e a camada de domínio, para fornecer as respostas apropriadas.

## 📁Pacote Domain

* O pacote `domain` é responsável por conter as classes que representam os objetos de negócio da aplicação. Essas classes geralmente contêm as regras de negócio da aplicação e os dados que serão manipulados. O pacote domain também pode conter classes de validação, que verificam se os dados estão corretos antes de serem processados pela aplicação.

## 📁Pacote Util

* O pacote `util` contém classes utilitárias que podem ser utilizadas em toda a aplicação. Essas classes geralmente contêm métodos que podem ser reutilizados em diferentes partes da aplicação, como classes de formatação de datas, conversão de tipos, cálculo de valores e outros métodos genéricos.

## 📁Pacote Repository

* O pacote `repository` é responsável por gerenciar a persistência de dados da aplicação. Ele contém as classes que fazem a comunicação com o banco de dados, executando operações de CRUD (create, read, update, delete) e consultas personalizadas. Essas classes são responsáveis por mapear as entidades do domínio para as tabelas do banco de dados e fornecer acesso aos dados da aplicação.

## 📁Pacote Service

* Por fim, o pacote `service` é responsável por implementar a lógica de negócio da aplicação. Ele contém as classes que coordenam as operações entre as camadas inferiores e as classes do pacote controller. Essas classes podem fazer uso das classes do pacote repository para acessar os dados da aplicação e implementar a lógica de negócio necessária.

## ✍Analisando o código da Aula 7

* No vídeo 7, as prioridades foram dadas para a construção dos cinco pacotes principais. O pacote repository ainda não foi trabalhado de forma efetiva, pois em tese, nosso banco de dados, até o momento, é um ArrayList de objetos.
* A classe DateUtil foi utilizada para informar no log a data e hora atual do sistema formatada. O log é um registro de eventos que ocorrem durante a execução de um programa ou sistema. Em outras palavras, é um arquivo que contém informações sobre as atividades que aconteceram no sistema, como erros, avisos, informações e depuração.
