<h1>Soluções Problemas URI </h1> 

<p align="center">
  <img src="http://img.shields.io/static/v1?label=License&message=MIT&color=green&style=for-the-badge"/>
  <img src="http://img.shields.io/static/v1?label=STATUS&message=CONCLUIDO&color=GREEN&style=for-the-badge"/>
</p>

> Atenção: :warning: Não utilize os conteúdos desse repositório para se beneficiar em alguma disciplina ou curso.  
> Os códigos compartilhados possuem objetivo exclusivamente didático.

### Tópicos 

:small_blue_diamond: [Descrição do Projeto](#descrição-do-projeto)

:small_blue_diamond: [Programação Dinâmica](#programação-Dinâmica)

:small_blue_diamond: [Algoritmos Gulosos](#algoritmos_gulosos)

:small_blue_diamond: [Backtracking](#backtrack)

:small_blue_diamond: [Grafos](#grafos)

:small_blue_diamond: [Codigos](https://github.com/igoromero/urialgoritimos)


## Descrição do projeto 

<p align="justify">
    
Objetivo deste repositório é compartilhar os códigos desenvolvidos durante as disciplinas de Algoritmos e Grafos 2018.1 do Programa de POS-GRADUAÇÃO [PGCOMP UFBA](http://wiki.dcc.ufba.br/PGComp/).
Os problemas apresentados foram extraídos da plataforma de maratona de programação [URI](https://www.urionlinejudge.com.br/judge/pt) .

Para resolução dos problemas foram utilizadas estruturas de dados (pilha, fila, grafos...) além de técnicas avançadas de programação para atender os critérios da plataforma como: tratamento de entradas e saídas de dados e tempo de execução.
</p>

## Técnicas:

:heavy_check_mark: Programação Dinâmica

:heavy_check_mark: Algoritmos Gulosos

:heavy_check_mark: Backtracking 

:heavy_check_mark: Algoritimos para Grafos

## Programação Dinâmica


[URI Radares](https://www.urionlinejudge.com.br/judge/pt/problems/view/1689) || [Codigo Solução](https://github.com/igoromero/urialgoritimos/blob/main/programacaodinamica/radares.cpp)

Antonio, prefeito de Rio Pequeno, está querendo implantar radares na estrada principal da cidade.

Para isso, ele tem uma lista de possíveis pontos onde os radares podem ser instalados. Cada radar tem um lucro associado. Sabe-se que a distância entre dois radares não pode ser inferior a K, de acordo com a legislação de trânsito.

Dada a lista de pontos e os seus lucros, a sua tarefa é ajudar Antonio a escolher os pontos para instalar os radares de modo que o lucro seja maximizado. Printe o lucro máximo!

Por exemplo, imagine radares nas posições 1, 2 and 3, com lucro 2, 5 e 3, respectivamente. Se K for igual a 2, uma solução ótima seria escolher os radares nas posições 1 e 3, somando 5 de lucro.
Entrada

A primeira linha conterá um número T (1 ≤ T ≤ 100), indicando a quantidade de casos de teste.

Para cada caso de teste, a primeira linha conterá um inteiro N (1 ≤ N ≤ 106) e K (1 ≤ K ≤ 106), o número de radares e a menor distância entre 2 radares, respectivamente. A próxima linha conterá N inteiros separados por espaços, indo de 1 até 106, indicando a posição dos radares, em ordem crescente. A última linha conterá N inteiros positivos separados por espaços, indo de 1 a 103, indicando o lucro de cada radar.
Saída

Para cada caso de teste imprima um único número, a resposta para o problema.

...

[URI Ajude Vânia](https://www.urionlinejudge.com.br/judge/pt/problems/view/2498) || [Codigo Solução](https://github.com/igoromero/urialgoritimos/blob/main/programacaodinamica/ajudevania.java)

Rangel é um estudante de engenharia de computação que nas horas vagas (quando não está cheio de coisas da faculdade) gosta de estudar para competições de programação e ler livros. Além de gostar de ler os livros Cormen e dos Halim, ele é muito fã de ficção. Sabendo disso, sua amiga, Vânia decidiu emprestar alguns livros de sua coleção a Rangel para que ele possa ler durante as férias.

Cada i-ésimo livro de Vânia possui um peso wi e vi que representa o provável grau de interesse de Rangel pelo livro. Se dependesse dela, emprestaria todos os seus livros, mas isso é impossível pois sua bolsa não cabe todos os seus livros (que são muitos).

Dado o número de livros de sua estante a máxima carga suportada pela sua bolsa, o peso e o grau de interesse de cada um dos livros, Vânia pede sua ajuda para escrever um programa que ajude a escolher os livros de tal forma que maximize o possível grau de interesse de Rangel pelos livros. Ela poderia fazer isso, mas está muito ocupada com as provas finais.
Entrada

A entrada contém vários casos de teste. Cada caso de teste começa com dois valores N e C (1 ≤ N ≤ 1000) e (1 ≤ C ≤ 100) que representam o número de livros disponíveis na estante de Vânia e a capacidade de sua bolsa respetivamente. Cada uma das próximas N linhas haverá dois inteiros W (1 ≤ W ≤ C) e V (1 ≤ V ≤ 1000) que representam respectivamente o peso de cada livro e o grau de interesse de Rangel pelo livro. O final da entrada é determinado com N = C = 0.
Saída

Para cada caso de teste seu programa deverá imprimir uma linha com a seguinte formatação: Caso H: M onde H é um inteiro que indica numero do caso de teste e M é o máximo grau de interesse de Rangel pelos livros.




...

## Algoritmos Gulosos


[URI Apagando e Ganhando](https://www.urionlinejudge.com.br/judge/pt/problems/view/1084) || [Codigo Solução](https://github.com/igoromero/urialgoritimos/blob/main/alggulosos/apagaganha.java)

Juliano é fã do programa de auditório Apagando e Ganhando, um programa no qual os participantes são selecionados através de um sorteio e recebem prêmios em dinheiro por participarem.

No programa, o apresentador escreve um número de N dígitos em uma lousa. O participante então deve apagar exatamente D dígitos do número que está na lousa; o número formado pelos dígitos que restaram é então o prêmio do participante.

Juliano finalmente foi selecionado para participar do programa, e pediu que você escrevesse um programa que, dados o número que o apresentador escreveu na lousa, e quantos dígitos Juliano tem que apagar, determina o valor do maior prêmio que Juliano pode ganhar.
Entrada

A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém dois inteiros N e D (1 ≤ D < N ≤ 105), indicando a quantidade de dígitos do número que o apresentador escreveu na lousa e quantos dígitos devem ser apagados. A linha seguinte contém o número escrito pelo apresentador, que não contém zeros à esquerda.

O final da entrada é indicado por uma linha que contém apenas dois zeros, separados por um espaço em branco.
Saída

Para cada caso de teste da entrada seu programa deve imprimir uma única linha na saída, contendo o maior prêmio que Juliano pode ganhar.


...

## Backtracking 

[URI Policia e Ladrão](https://www.urionlinejudge.com.br/judge/pt/problems/view/1905) || [Codigo Solução](https://github.com/igoromero/urialgoritimos/blob/main/backtracking/policialadrao.java)

Mario adora convidar seus amigos para brincar em sua casa. Então decidiu convidar seus amigos para brincarem de Polícia e Ladrão. O jogo consiste em dois grupos, um grupo é a polícia e o outro é o grupo dos ladrões. Os ladrões devem se esconder e a polícia deve capturá-los. Caso a polícia consiga capturá-los e prendê-los os ladrões perdem o jogo e caso a polícia não consiga capturá-los os ladrões vencem o jogo.

Mario decidiu que seria do grupo da polícia e que teria que procurar seus amigos do grupo dos ladrões e capturá-los, porém algum de seus amigos sentiram-se em desvantagens por não possuírem lugares estratégicos para se esconder no seu quintal.

Portanto decidiram planejar uma forma em que poderiam deixar os policiais sem saída e terem chances de ganhar o jogo. Para isso montaram um labirinto usando caixas de papelão e marcaram como “0” todos os lugares no quintal aonde os policiais poderiam atravessar e como “1” aonde os policiais não poderiam atravessar.

Os ladrões irão se esconder sempre no último espaço do labirinto, Se os policiais ficarem encurralados no labirinto os ladrões vencem e poderão comemorar a fuga, mas se os policiais alcançarem o ultimo espaço do labirinto os policiais serão os vencedores. Os policiais poderão andar somente nos blocos marcados como 0. Sua tarefa é determinar a partir do labirinto quem vai ganhar o jogo.


<p align="center">
  <img src="https://www.urionlinejudge.com.br/gallery/images/contests/policia.jpg"/>
</p>

Entrada

A primeira entrada consiste de um inteiro T(1 ≤ T ≤ 400) indicando o número de casos de testes.

As próximas T entradas consistem de uma matriz 5x5, composta de valores inteiros, sendo 0 ou 1
Saída

Seu programa deverá imprimir "COPS" caso o grupo dos policiais ganhem, e "ROBBERS" caso o grupo dos ladrões ganhem.

...

## Algoritimos para Grafos


[URI Componentes Conexos](https://www.urionlinejudge.com.br/judge/pt/problems/view/1905) || [Codigo Solução](https://github.com/igoromero/urialgoritimos/blob/main/grafos/componentesconexos.java)


Com base nestas três definições:

Grafo conexo: Um grafo G(V,A) é conexo se para cada par de nodos u e v existe um caminho entre u e v. Um grafo com apenas um componente é um grafo conexo.

Grafo desconexo: Um grafo G(V,A) é desconexo se ele for formado por 2 ou mais componentes conexos.

Componente conexo: Componentes conexos de um grafo são os subgrafos conexos deste grafo.

O grafo a seguir possui 3 componentes conexos. O primeiro é formado pelos nodos a,b,c. O segundo é formado unicamente pelo nodo d e o terceiro componente é formado pelos nodos e,f.



<p align="center">
  <img src="https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1082.jpg"/>
</p>



Com base nestes conceitos, onde cada entrada fornecida que tem a identificação de cada um dos vértices, arestas e as ligações entre os vértices através destas arestas,  liste cada um dos componentes conexos que existem no grafo, segundo a entrada fornecida.
Entrada

A primeira linha do arquivo de entrada contém um valor inteiro N que representa a quantidade de casos de teste que vem a seguir. Cada caso de teste contém dois valores V e E que são, respectivamente, a quantidade de Vértices e arestas (Edges) do grafo. Seguem E linhas na sequência, cada uma delas representando uma das arestas que ligam tais vértices. Cada vértice é representado por uma letra minúscula do alfabeto ('a'-'z'), ou seja, cada grafo pode ter no máximo 26 vértices. Cada grafo tem no mínimo 1 componente conexo.

Obs: Os vértices de cada caso de teste sempre iniciam no 'a'. Isso significa que um caso de teste que tem 3 vértices, tem obrigatoriamente os vértices 'a', 'b' e 'c'.
Saída

Para cada caso de teste da entrada, deve ser apresentada uma mensagem Case #n:, onde n indica o número do caso de teste (conforme exemplo abaixo). Segue a listagem dos vértices de cada segmento, um segmento por linha, separados por vírgula (inclusive com uma virgula no final da linha). Finalizando o caso de teste, deve ser apresentada uma mensagem indicando a quantidade de componentes conexos do grafo (em inglês). Todo caso de teste deve ter uma linha em branco no final, inclusive o último caso de teste.

Obs: os nodos devem sempre ser apresentados em ordem crescente e se há caminho de a até b significa que há caminho de b até a.



...

[URI Inversão](https://www.urionlinejudge.com.br/judge/pt/problems/view/1550) || [Codigo Solução](https://github.com/igoromero/urialgoritimos/blob/main/grafos/inversao.java)

Pedro é um garoto curioso que gostava de eletrônica. Certo dia, o menino estava mexendo no laboratório de sua escola e encontrou uma caixa cheia de pequenos aparelhos eletrônicos feitos por outros alunos em anos anteriores.

Dentro dessa caixa havia um aparelho que possuía apenas um visor e dois botões. Esse visor apresentava um número inteiro. Mexendo nos botões, Pedro descobriu para que servia cada um deles. O primeiro botão adicionava uma unidade ao número no visor. O segundo botão invertia os dígitos do número, por exemplo, 123 invertido resulta em 321 e 150 invertido resulta em 51 (ignora-se os zeros a esquerda).

Inicialmente, o visor apresentava o número A. Após a descoberta da função dos botões, Pedro quer saber como fazer o número do visor mudar de A para um número maior igual a B. O seu trabalho nesse problema é ajudar Pedro a descobrir qual é o número mínimo de apertos de botão para que o número no visor passe a ser igual a B.
Entrada

A entrada é iniciada por um inteiro T, 0 < T ≤ 500, que indica a quantidade de casos de teste a ser processados. Segue-se T linhas cada uma contendo dois inteiros A e B, 0 < A < B < 10000, indicando respectivamente o número inicial no visor e o número que deve ser mostrado no visor depois de apertar os botões.
Saída

Para cada caso de teste, o programa deve imprimir um inteiro indicando o número mínimo de apertos de botão para que o número do visor passe de A para B.


## Como rodar os codigos :arrow_forward:

No terminal, clone o projeto:

Para cada questão crie arquivos de entrada e saida para testar as soluções. 

in: <- .txt arquivo com as entradas possiveis
out<- saida com as saidas 


```

Compilar arquivo em C++ 	g++ [-flags] file_name.cpp -o exe_name
Rodar executável 	./exe_name

```
```
Compilar arquivo em Java javac [-flags] file_name.java
Rodar .class (Java) 	java file_name

```

... 

The [MIT License]() (MIT)

Copyright :copyright: 2018 - uri algoritimos - Template documentação [csorlandi](https://gist.github.com/csorlandi)  
