# Aprenda Kotlin com Exemplos: Desafio de Projeto (Refatorado)

Este repositório contém a solução para o desafio "Abstraindo Formações da DIO Usando Orientação a Objetos com Kotlin".
O projeto foi refatorado para seguir boas práticas de desenvolvimento, incluindo:

- **POO**: Uso de Classes, Enums e Data Classes.
- **SOLID**: Princípios de responsabilidade única e inversão de dependência.
- **Clean Architecture**: Separação em camadas (Domain, Data, Presentation).
- **MVVM**: Uso de ViewModel para gerenciar a lógica de apresentação.
- **Testes Unitários**: Testes para garantir a qualidade do código.

## Estrutura do Projeto

```
src/
├── main/
│   └── kotlin/
│       └── me/dio/lab/
│           ├── data/           # Implementações de dados (Repository)
│           ├── domain/         # Regras de negócio e Modelos
│           ├── presentation/   # ViewModel e Lógica de UI
│           └── Main.kt         # Ponto de entrada (View)
└── test/
    └── kotlin/
        └── me/dio/lab/         # Testes Unitários
```

## Como Executar

### Opção 1: Usando Gradle (Recomendado)

Certifique-se de ter o Gradle instalado em sua máquina.

Para executar a aplicação:

```bash
gradle run
```

Para rodar os testes:

```bash
gradle test
```

### Opção 2: Compilação Manual (Caso não tenha Gradle)

Você pode compilar e executar usando o compilador Kotlin (`kotlinc`):

1. Compile o código:

```bash
find src/main/kotlin -name "*.kt" | xargs kotlinc -include-runtime -d lab.jar
```

1. Execute o JAR gerado:

```bash
java -jar lab.jar
```

## Tecnologias

- Kotlin
- JUnit 5
- Gradle
