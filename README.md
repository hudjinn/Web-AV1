AP1 Desenvolvimento de Sistemas para Web 2024.1
Prazo de entrega: 07/04/2024 às 23:59
Criar um programa usando Servlet, HTML e CSS. O programa criado deve obedecer às seguintes
regras:
1) [1,0] Criar a classe Produto que deve possuir 3 variáveis, descricao (String), categoria (String)
e preco (Double) com seus respectivos gets e sets.
2) [1,0] Criar uma página inicial (index.html) que deve possuir dois links (<a>) organizados em
uma lista não ordenada (<ul>). O primeiro link (apresentar) deve chamar a página
apresentacao.html e o segundo link (cadastrar) deve chamar a página cadastro.
3) [2,0] Criar a página de apresentação (apresentacao.html) que deve possuir um título
utilizando a tag <h1> e uma tabela com duas colunas (nome e matrícula). Esta tabela deve
ser preenchida com as informações dos participantes da equipe. O cabeçalho deve estar
centralizado, os valores com os nomes alinhados à esquerda e os valores das matrículas
alinhados à direita. A página deve possuir um link para voltar para a página index.html.
4) [2,0] Criar a página de cadastro (cadastro.html) que contenha um formulário (<form>) com
as seguintes características:
a. 1 título utilizando a tag <h1>;
b. 3 campos de input com seus respectivos labels, referentes às três variáveis definidas
no item 1;
c. 1 botão;
d. 1 tabela, para organizar os elementos dos itens “4.b” e “4.c”;
e. A função dessa página é que ao clicar no botão do item “4.c” o Servlet
CadastroServlet (que será criado no item 5) seja acionado.
5) [3,0] Criar um Servlet (CadastroServlet.java) que será acionado pela página cadastro.html
feita no item 4. O Servlet deverá ter as seguintes funções:
a. Através do parâmetro HttpServletRequest do método doPost recuperar os valores
dos três campos do item 4.b, instanciar um objeto da classe Produto criado no item 1
e setar os valores recuperados nas referidas variáveis do objeto criado;
b. Através do parâmetro HttpServletResponse do método doPost e do PrintWriter
montar uma página dinâmica com uma lista não ordenada (<ul>), exibindo os valores
recuperados no item 5.a e informando que os dados foram cadastrados com sucesso.
Criar um link para voltar para a página index.html;
Obs.: a lista não ordenada não precisa guardar os valores informados em requisições
anteriores.
6) [1,0] Criar o arquivo style.css que deve ser vinculado a todas as páginas criadas (inclusive as
dinâmicas) e deve possuir as seguintes características:
a. Criar uma classe que deixe a fonte dos labels com a cor azul e negrito;
b. Todos os títulos <h1> devem ser de uma cor diferente de preto.
c. Criar uma classe que deixe os botões com as bordas arredondadas.
