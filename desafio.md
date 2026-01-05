# Desafio de Projeto - Abstraindo Formações da DIO Usando Orientação a Objetos com Kotlin

## Como Abstrair e Entregar este Lab Usando GitHub e Kotlin

1. Acesso e Configuração do Repositório Para iniciar, acesse o repositório template da DIO no GitHub, intitulado "Aprenda Kotlin com Exemplos Lab". 
A recomendação técnica fundamental é utilizar a opção de fork, que cria uma cópia exata desse template no seu próprio usuário. 
Isso permite que você faça alterações livremente em seu perfil pessoal, mantendo o vínculo com o projeto original, sendo esta a URL que deverá ser entregue na plataforma da DIO.

2. Abstração do Domínio O objetivo é exercitar a capacidade de abstração e orientação a objetos. O domínio proposto envolve o ecossistema da DIO:

* Entidades: Identifique classes como Usuario, ConteudoEducacional e a classe principal Formacao.

* Atributos: As formações devem conter nome, nível (básico, intermediário ou difícil) e uma lista de conteúdos educacionais.

* Comportamentos: A principal funcionalidade a ser implementada é o método matricular, que deve ser capaz de adicionar um ou mais alunos à lista de inscritos de uma formação.

3. Desenvolvimento e Refatoração O arquivo desafio.kt serve como um código base que possui falhas intencionais para que você as corrija e evolua. Algumas sugestões de melhoria incluem:

* Transformar classes simples em data classes para facilitar o transporte de dados.

* Utilizar enums para definir os níveis das formações.

* Utilizar recursos específicos do Kotlin, como vararg, para permitir a matrícula de múltiplos usuários simultaneamente.

* Criar cenários de teste na função main, instanciando objetos e relacionando-os para validar a solução.

4. Ferramentas de Trabalho Você pode editar o código diretamente no navegador através do editor web do GitHub (acionado pela tecla "." no teclado) ou utilizar o link para o Kotlin Playground 
presente nos comentários do arquivo de desafio. O Playground é especialmente útil por permitir a execução e validação do código sem necessidade de instalação local.

5. Entrega Final Após concluir a implementação e os testes, realize o commit e o push das alterações para o seu repositório pessoal no GitHub. Na plataforma da DIO, utilize o 
botão "Entregar Projetos", cole a URL do seu repositório e adicione uma descrição relevante sobre a sua solução. Lembre-se de que esses projetos compõem seu portfólio pessoal e 
são visíveis para empresas parceiras.

Analogia: Pense neste lab como a construção de uma maquete de uma escola. O template do GitHub é o terreno e a planta básica. O fork é a sua cópia dessa planta para você construir 
sua própria versão. A abstração é o ato de decidir que a "escola" (Formação) precisa de "salas" (Conteúdos) e de uma "secretaria" (Matrícula) para funcionar. O Kotlin Playground 
é o laboratório de testes onde você verifica se as luzes da maquete acendem antes de fixá-las definitivamente no terreno final (GitHub).

## Entendendo o Desafio
 
Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório aprenda-kotlin-com-exemplos. 

Nesse contexto, iremos abstrair o seguinte domínio de aplicação:
 
A DIO possui Formacoes incríveis que têm como objetivo oferecer um conjunto de ConteudosEducacionais voltados para uma stack tecnológica específica, 
preparando profissionais de TI para o mercado de trabalho. Formacoes possuem algumas características importantes, como nome, nivel e seus respectivos conteudosEducacionais. 

Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de matricular um ou mais Alunos.
 
### Repositório Git
 
O Git é um conceito essencial no mercado de trabalho atualmente, por isso sempre reforçamos sua importância em nossa metodologia educacional. 

Por isso, o código-fonte desenvolvido para este desafio foi versionado no seguinte endereço:
 
https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos-lab
 
TODO("Crie uma solução em Koltin abstraindo esse domínio. O arquivo [desafio.kt] te ajudará 😉")
 
Bons estudos 😉


## Link do Projeto

https://github.com/ubiratantavares/aprenda-kotlin-com-exemplos-lab

Este repositório foi cariado para registrar a implementação do desafio de projeto do curso "Abstraindo Formações da DIO usando Orientação a Objetos com Kotlin relativo ao 
Bootcamp Desenvolvimento Backend com Kotlin.
