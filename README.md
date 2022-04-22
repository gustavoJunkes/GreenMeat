# GreenMeat

Primeiro projeto Java, desenvolvido como projeto final do curso de Java do programa [Entra21/Blusoft](https://www.entra21.com.br/). Consiste em um commerce de alimentos, que visa incentivar boas práticas ambientais.

## Funcionalidades

O sistema conta com as seguintes funcionalidades: 
- Cadastro e login de clientes 
- Cadastro e login de fornecedores
- Cadastro e login de funcionário
- Cadastro de produtos
- Execução de pedidos

<h2>Tecnologias/ferramentas usadas:</h2>
<ul>
  <li>Java</li>
  <li>Maven</li>
  <li>Hibernate</li>
  <li>MySQL</li>
  <li>Jsp</li>
</ul>
 
## Como rodar

### Requisitos

Para rodar o projeto localmente, você precisará ter instalado em sua máquina:
- JDK 11
- Maven 3.*.*
- [Apache Tomcat](https://tomcat.apache.org/download-90.cgi)
- MySQL

### Banco de dados

Crie uma base de dados local com o nome greenmeat. Em seguida, entre no arquivo hibernate.cfg.xml e faça as seguintes alterações.

Na linha 7, altere, caso necessário, o caminho de sua base de dados para o projeto. Por padrão está configurada a base greenmeat no caminho default.

`<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/sua-base-de-dados?useTimezone=true&amp;serverTimezone=UTC</property>`

Você deve alterar também seu usuário e senha para acessar seu banco:

`<property name="hibernate.connection.username">seu-user-banco-de-dados</property>`

`<property name="hibernate.connection.password">sua-senha</property>`

### Rodando o projeto

Após baixar o projeto, abra em sua ide de escolha. Em seguida, execute os lifecycles clean-install.

### Adicionando servidor tomcat ao Eclipse

Para rodar o projeto, é necessário que você adicione um servidor de aplicação.

Para executar o projeto pelo Eclipse, basta clicar com o botão direito na pasta raiz, em `Run As`, e escolha `Run On Server`.
Em seguida, selecione o servidor de aplicação que irá usar. No caso do Tomcat, selecione a pasta Tomcat e a versão instalada.

![image](https://user-images.githubusercontent.com/87446204/164795853-259193c6-5840-40e1-a393-77ae46462f55.png)

Clique em Next e selecione a pasta de instalação do Tomcat.
Uma nova aba deve abrir em seu navegador padrão e você poderá acessar o sistema.

> Você também pode rodar o servidor diretamente através de um terminal, sem a necessidade de uma IDE. Veja mais [aqui](https://pt.stackoverflow.com/questions/124435/rodar-uma-aplica%C3%A7%C3%A3o-sem-eclipse-mas-utilizando-o-tomcat-como-fa%C3%A7o)

> Este projeto foi desenvolvido de forma bastante antiquada por estudantes no inicio de seus estudos e em um curto prazo. Por esse motivo, você deve perceber que bugs e problemas durante a execução que deixaram de ser corrigido depois do projeto ser descontinuado.
