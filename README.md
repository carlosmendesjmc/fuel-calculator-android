# Fuel Calculator

Aplicativo Android desenvolvido em **Kotlin** para calcular o custo estimado de combustível de uma viagem com base no preço do combustível, consumo médio do veículo e distância percorrida.

Este projeto está sendo desenvolvido como parte do meu processo de aprendizado em desenvolvimento Android, com foco em boas práticas, organização de código, versionamento com Git e documentação técnica.

---


## Sobre o projeto

O **Fuel Calculator** é um aplicativo Android criado para praticar o desenvolvimento mobile utilizando Kotlin e XML Layout.

O objetivo do aplicativo é permitir que o usuário informe dados básicos de uma viagem e receba uma estimativa do custo total com combustível.

Além da funcionalidade principal, este projeto também tem como objetivo demonstrar organização no desenvolvimento, uso de Git Flow, criação de branches por funcionalidade, documentação contínua e evolução incremental da interface e da lógica do aplicativo.

---

## Objetivos

- Desenvolver um aplicativo Android nativo utilizando Kotlin.
- Praticar criação de interfaces com XML.
- Utilizar `ConstraintLayout` e `LinearLayout`.
- Trabalhar com componentes do Material Design.
- Criar telas separadas para cada entrada de dados.
- Implementar lógica de cálculo de custo de viagem.
- Organizar o projeto utilizando Git e GitHub.
- Documentar o processo de aprendizado e as decisões técnicas.

---

## Funcionalidades previstas

O aplicativo deverá receber as seguintes informações do usuário:

- Preço do combustível.
- Consumo médio do veículo.
- Distância da viagem.

Ao final, o aplicativo deverá exibir:

- Quantidade estimada de litros necessários.
- Valor total estimado da viagem.
- Resumo das informações digitadas pelo usuário.

---

## Tecnologias utilizadas

- Kotlin
- Android Studio
- XML Layout
- Material Design Components
- Gradle
- Git
- GitHub

---

## Estrutura do projeto

```text
FuelCalculator
│
├── app
│   ├── Kotlin
│   │   └── com.example.fuelcalculator
│   │       └── MainActivity
│   │
│   └── res
│       ├── drawable
│       ├── layout
│       ├── mipmap
│       └── values
│
├── gradle
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

> A estrutura será atualizada conforme novas telas e funcionalidades forem implementadas.

---

## Como executar

Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO
```

Entre na pasta do projeto:

```bash
cd fuel-calculator-android
```

Abra o projeto no Android Studio.

Aguarde a sincronização do Gradle.

Execute o aplicativo em um emulador ou dispositivo Android.

---

## Metodologia de desenvolvimento

Este projeto está sendo desenvolvido seguindo uma organização semelhante à utilizada em equipes de desenvolvimento.

### Organização adotada

- Desenvolvimento incremental.
- Uma branch para cada funcionalidade.
- Commits pequenos e semânticos.
- Uso de Git e GitHub para versionamento.
- Organização das tarefas em um board.
- Documentação contínua durante a evolução do projeto.

### Fluxo de branches

```text
main
│
├── feature/welcome-screen
├── feature/fuel-price-screen
├── feature/vehicle-consumption-screen
├── feature/distance-screen
├── feature/calculation
├── feature/result-screen
└── feature/validation
```

Essa abordagem permite manter a branch `main` mais estável e desenvolver cada funcionalidade de forma isolada.

---

## Roadmap

- [x] Criar repositório no GitHub.
- [x] Clonar repositório localmente.
- [x] Criar projeto Android no Android Studio.
- [x] Configurar estrutura inicial do projeto.
- [x] Resolver incompatibilidade de dependência Core KTX.
- [x] Criar documentação inicial.
- [x] Criar board de desenvolvimento.
- [x] Desenvolver Welcome Screen.
- [ ] Criar tela de preço do combustível.
- [ ] Criar tela de consumo do veículo.
- [ ] Criar tela de distância da viagem.
- [ ] Implementar lógica de cálculo.
- [ ] Criar tela de resultado.
- [ ] Implementar validação dos campos.
- [ ] Realizar melhorias finais de interface.

---

## Diário de desenvolvimento

### 1. Configuração inicial

#### Objetivo

Preparar o ambiente inicial do projeto Android, configurar o repositório Git e criar a estrutura base da aplicação.

#### Atividades realizadas

- Criação do repositório no GitHub.
- Clone do repositório para o computador.
- Criação do projeto no Android Studio.
- Configuração do projeto com Kotlin.
- Organização inicial da estrutura do projeto.
- Primeiro versionamento na branch `main`.

#### Aprendizados

- Como criar e clonar um repositório GitHub.
- Como criar um projeto Android dentro de uma pasta versionada.
- Como verificar o estado do projeto com `git status`.
- Como criar o primeiro commit.
- Como enviar o projeto para o GitHub.
- Diferença entre branch `main` e branches de funcionalidade.

---

### 2. Correção da dependência Core KTX

#### Problema

Durante a criação do projeto, foi identificado um erro relacionado à dependência:

```text
androidx.core:core-ktx:1.19.0
```

Essa versão exigia `compileSdk 37`, enquanto o projeto estava configurado com `compileSdk 36`.

#### Solução

A versão do `coreKtx` foi alterada no arquivo:

```text
gradle/libs.versions.toml
```

De:

```toml
coreKtx = "1.19.0"
```

Para:

```toml
coreKtx = "1.16.0"
```

#### Aprendizados

- Como identificar erros de compatibilidade entre dependências e `compileSdk`.
- Diferença entre atualizar o SDK e alterar a versão de uma biblioteca.
- Importância da sincronização do Gradle.
- Como localizar dependências no arquivo `libs.versions.toml`.

---

### 3. Welcome Screen

#### Activity

```text
MainActivity
```

#### Objetivo

Criar uma tela inicial moderna para recepcionar o usuário antes do início do cálculo da viagem.

#### Solução implementada

Nesta etapa foi construída a tela inicial do aplicativo contendo:

- Background principal personalizado.
- Ilustração superior.
- Ícone principal de combustível.
- Título da aplicação.
- Linha decorativa abaixo do título.
- Texto descritivo.
- Seção de benefícios.
- Botão personalizado para iniciar o fluxo.
- Organização visual utilizando `ConstraintLayout` e `LinearLayout`.

#### Componentes utilizados

- `ConstraintLayout`
- `LinearLayout`
- `MaterialButton`
- `ImageView`
- `TextView`
- `View`
- Drawables personalizados
- Vector Drawables
- Arquivos de cores em `values/colors.xml`

#### Principais aprendizados

Durante o desenvolvimento da Welcome Screen foram estudados e aplicados os seguintes conceitos:

- Estrutura de layouts XML.
- Posicionamento com `ConstraintLayout`.
- Agrupamento de componentes com `LinearLayout`.
- Diferença entre orientação horizontal e vertical.
- Criação de botão moderno com `MaterialButton`.
- Personalização de botão com Drawable.
- Uso de gradiente em XML.
- Aplicação de cantos arredondados.
- Uso de `backgroundTint`.
- Utilização de `app:backgroundTint="@null"` para preservar o Drawable personalizado.
- Uso de ícones vetoriais.
- Alteração de cor de ícones com `tint`.
- Diferença entre `android:` e `app:`.
- Diferença entre `dp` e `sp`.
- Diferença entre Margin e Padding.
- Uso de linhas divisórias com `View`.
- Organização dos recursos em `drawable`, `layout` e `values`.

#### Decisões de implementação

- A `MainActivity` foi mantida como tela inicial do aplicativo, evitando criar uma Activity extra desnecessária.
- Foi utilizado `MaterialButton` em vez de `Button`, pois ele oferece suporte nativo a ícones e recursos do Material Design.
- A seção de benefícios foi reorganizada com `LinearLayout`, facilitando o agrupamento de ícone e texto.
- As cores foram centralizadas em arquivos de recurso, evitando valores soltos no layout.
- O background personalizado do botão foi separado em um arquivo Drawable, facilitando manutenção e reutilização.

#### Screenshot

Adicionar imagem da Welcome Screen.

---

### 4. Fuel Price Screen

#### Activity prevista

```text
FuelPriceActivity
```

#### Objetivo

Criar a tela responsável por receber o preço do combustível informado pelo usuário.

#### Status

Em desenvolvimento.

---

### 5. Vehicle Consumption Screen

#### Activity prevista

```text
VehicleConsumptionActivity
```

#### Objetivo

Criar a tela responsável por receber o consumo médio do veículo.

#### Status

Em desenvolvimento.

---

### 6. Distance Screen

#### Activity prevista

```text
DistanceActivity
```

#### Objetivo

Criar a tela responsável por receber a distância da viagem.

#### Status

Em desenvolvimento.

---

### 7. Calculation Logic

#### Objetivo

Implementar a lógica responsável por calcular a quantidade de litros necessários e o custo total estimado da viagem.

#### Fórmula base

```kotlin
val litrosNecessarios = distancia / consumo
val custoTotal = litrosNecessarios * precoCombustivel
```

#### Status

Em desenvolvimento.

---

### 8. Result Screen

#### Activity prevista

```text
ResultActivity
```

#### Objetivo

Criar a tela responsável por apresentar o resultado final do cálculo e o resumo das informações digitadas pelo usuário.

#### Status

Em desenvolvimento.

---

### 9. Input Validation

#### Objetivo

Validar os dados informados pelo usuário antes de avançar para as próximas telas ou realizar o cálculo.

#### Validações previstas

- Campo vazio.
- Valor zero.
- Valor negativo.
- Entrada inválida.

#### Status

Em desenvolvimento.

---

## Decisões técnicas

### Uso de MaterialButton

Foi utilizado `MaterialButton` no lugar do `Button` padrão para aproveitar recursos do Material Design, como suporte nativo a ícones, controle de tamanho, estilo visual mais moderno e melhor integração com temas.

### Uso de ConstraintLayout

O `ConstraintLayout` foi utilizado como layout principal por permitir posicionamento flexível dos componentes e evitar hierarquias muito profundas.

### Uso de LinearLayout

O `LinearLayout` foi utilizado para organizar a seção de benefícios, agrupando cada ícone com seu respectivo texto e deixando a estrutura mais legível.

### Uso de Drawables personalizados

Drawables foram utilizados para criar backgrounds, gradientes, bordas arredondadas e elementos visuais reutilizáveis.

### Organização por branches

Cada funcionalidade do app está sendo desenvolvida em uma branch própria, simulando um fluxo profissional de desenvolvimento.

---

## Desafios encontrados

### Incompatibilidade Core KTX

Foi necessário corrigir a versão da dependência `coreKtx` para evitar conflito com o `compileSdk`.

### Background do MaterialButton

O background personalizado do botão inicialmente não era exibido corretamente. A solução foi utilizar:

```xml
app:backgroundTint="@null"
```

Isso impediu que o `MaterialButton` aplicasse uma cor sobre o Drawable personalizado.

### Organização da seção de benefícios

Inicialmente os ícones e textos estavam posicionados individualmente no `ConstraintLayout`. Depois, a seção foi refatorada usando `LinearLayout`, deixando o código mais organizado e fácil de manter.

### Diferença entre dp e sp

Foi identificado que tamanhos de texto devem utilizar `sp`, enquanto tamanhos de componentes, margens e espaçamentos devem utilizar `dp`.

---

## Competências desenvolvidas

Durante o desenvolvimento deste projeto estão sendo desenvolvidas competências relacionadas a:

- Desenvolvimento Android com Kotlin.
- Criação de interfaces com XML.
- Organização de layouts.
- Uso de Material Design Components.
- Criação e aplicação de Drawables.
- Personalização de ícones.
- Versionamento com Git.
- Organização de branches.
- Escrita de commits semânticos.
- Documentação técnica.
- Resolução de problemas.
- Desenvolvimento incremental.

---

## Boas práticas adotadas

- Branch por funcionalidade.
- Commits semânticos.
- Organização de recursos.
- Separação de responsabilidades entre layout e recursos visuais.
- Uso de nomes descritivos para componentes.
- Documentação contínua do projeto.
- Desenvolvimento em etapas pequenas.
- Testes visuais frequentes durante a construção da interface.

---

## O que este projeto demonstra

Este projeto demonstra conhecimentos iniciais e evolução prática em:

- Kotlin
- Android Studio
- XML Layout
- ConstraintLayout
- LinearLayout
- MaterialButton
- Material Design
- Drawables personalizados
- Vector Drawables
- Git
- GitHub
- Git Flow
- Documentação
- Organização de projeto
- Resolução de problemas
- Boas práticas de desenvolvimento

---

## Screenshots

### Welcome Screen

Adicionar imagem da tela inicial.

### Fuel Price Screen

Em desenvolvimento.

### Vehicle Consumption Screen

Em desenvolvimento.

### Distance Screen

Em desenvolvimento.

### Result Screen

Em desenvolvimento.

---

## Status do projeto

🚧 Projeto em desenvolvimento.

A primeira tela do aplicativo, **Welcome Screen**, foi finalizada visualmente. As próximas etapas serão a criação das telas de entrada de dados e a implementação da lógica de cálculo.
