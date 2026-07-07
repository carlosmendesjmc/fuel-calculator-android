# ⛽ Fuel Calculator

Aplicativo Android nativo desenvolvido em **Kotlin** para calcular o custo estimado de combustível de uma viagem com base no **preço do combustível**, **consumo médio do veículo** e **distância percorrida**.

Este projeto foi desenvolvido como parte do meu processo de aprendizado em desenvolvimento Android, com foco na construção de interfaces utilizando XML, navegação entre Activities, implementação da lógica de negócio, versionamento com Git e aplicação de boas práticas de desenvolvimento.

---


---

# ⛽ Screenshots

## Welcome Screen

Tela inicial responsável por apresentar o aplicativo e iniciar o fluxo do cálculo.

<p align="center">
<img src="images/ActivityMain.png" width="250"/>
</p>

---

## Fuel Price Screen

Tela responsável por receber o preço do combustível informado pelo usuário.

<p align="center">
<img src="images/ActivityFuelPrice.png" width="250"/>
</p>

---

## Vehicle Consumption Screen

Tela utilizada para informar o consumo médio do veículo em quilômetros por litro.

<p align="center">
<img src="images/ActivityVehicleConsumption.png" width="250"/>
</p>

---

## Distance Screen

Tela responsável por receber a distância total da viagem.

<p align="center">
<img src="images/ActivityDistance.png" width="250"/>
</p>

---

## Result Screen

Tela responsável por apresentar o custo estimado da viagem juntamente com um resumo dos dados informados pelo usuário.

<p align="center">
<img src="images/ActivityResult.png" width="250"/>
</p>

---

# ⛽ Funcionalidades

- ✅ Cálculo do custo estimado da viagem.
- ✅ Entrada do preço do combustível.
- ✅ Entrada do consumo médio do veículo.
- ✅ Entrada da distância da viagem.
- ✅ Resumo completo dos dados informados.
- ✅ Navegação entre telas utilizando Intents.
- ✅ Validação dos campos obrigatórios.
- ✅ Tratamento de entradas inválidas utilizando `toIntOrNull()` e `toDoubleOrNull()`.
- ✅ Formatação do resultado em moeda brasileira.
- ✅ Navegação utilizando MaterialToolbar.

---

# ⛽ Tecnologias utilizadas

- Kotlin
- Android Studio
- XML Layout
- ConstraintLayout
- LinearLayout
- Material Design Components
- MaterialButton
- MaterialToolbar
- Git
- GitHub

---

# ⛽ Arquitetura do Projeto

```text
FuelCalculator
│
├── Activities
│   ├── MainActivity
│   ├── FuelPriceActivity
│   ├── VehicleConsumptionActivity
│   ├── DistanceActivity
│   └── ResultActivity
│
├── drawable
├── layout
├── values
└── AndroidManifest.xml
```

---

# ⛽ Fluxo da Aplicação

```text
Welcome Screen
        │
        ▼
Fuel Price
        │
        ▼
Vehicle Consumption
        │
        ▼
Distance
        │
        ▼
Result
```

---

# ⛽ Principais conceitos aprendidos

## Desenvolvimento Android

- Criação de múltiplas Activities.
- Navegação entre telas utilizando Intents.
- Envio e recuperação de dados utilizando Intent Extras.
- Ciclo de vida das Activities.
- Manipulação de EditText e TextView.
- Tratamento de eventos utilizando `setOnClickListener`.
- Validação de entrada do usuário.
- Conversão segura utilizando `toIntOrNull()` e `toDoubleOrNull()`.
- Implementação da lógica de cálculo da viagem.
- Formatação de valores monetários.
- Configuração da MaterialToolbar.

---

## Construção de Layouts

- ConstraintLayout.
- LinearLayout.
- Posicionamento utilizando Constraints.
- Organização visual dos componentes.
- Responsividade básica.
- Drawables personalizados.
- Vector Drawables.
- Organização dos recursos (`drawable`, `layout` e `values`).

---

## Material Design

- MaterialButton.
- MaterialToolbar.
- Backgrounds personalizados.
- BackgroundTint.
- Ícones vetoriais.
- Tipografia.
- Organização visual da interface.

---

## Kotlin

- Variáveis.
- Null Safety.
- Conversão de tipos.
- Estruturas condicionais.
- Operações matemáticas.
- Organização do código.

---

## Git e GitHub

Durante o desenvolvimento foi adotado um fluxo semelhante ao utilizado em equipes profissionais.

Conceitos praticados:

- Branch por funcionalidade.
- Branch de refatoração.
- Commits semânticos.
- Merge entre branches.
- Fast-forward Merge.
- Merge utilizando `--no-ff`.
- Resolução de conflitos.
- Organização incremental do projeto.

---

# ⛽ Principais decisões técnicas

### MaterialButton

Foi utilizado no lugar do `Button` padrão por oferecer suporte nativo ao Material Design, ícones, temas e maior flexibilidade de personalização.

### MaterialToolbar

Foi utilizada para padronizar a navegação entre as telas e substituir os botões de retorno espalhados pela interface, seguindo o padrão recomendado para aplicações Android.

### ConstraintLayout

Escolhido como layout principal por oferecer maior flexibilidade de posicionamento e reduzir a quantidade de layouts aninhados.

### Uma Activity para cada etapa

Cada tela possui uma única responsabilidade, facilitando a organização do fluxo da aplicação e permitindo praticar navegação utilizando Intents.

### Git Flow

Cada funcionalidade foi desenvolvida em uma branch específica para simular um fluxo de trabalho semelhante ao utilizado em equipes de desenvolvimento.

---

# ⛽ Desafios encontrados

Durante o desenvolvimento foram encontrados diversos desafios que exigiram pesquisa e entendimento da plataforma Android.

- Correção de incompatibilidade entre versões do Core KTX.
- Personalização do MaterialButton utilizando Drawables.
- Configuração correta do `backgroundTint`.
- Diferença entre divisão inteira (`Int`) e divisão decimal (`Double`) na lógica de cálculo.
- Tratamento de exceções utilizando `toIntOrNull()` e `toDoubleOrNull()`.
- Recuperação de dados entre Activities utilizando Intents.
- Organização do fluxo de desenvolvimento utilizando Git Flow.
- Padronização da navegação utilizando MaterialToolbar.

---

# ⛽ Boas práticas aplicadas

- Desenvolvimento incremental.
- Branch para cada funcionalidade.
- Branch específica para refatoração.
- Commits pequenos e descritivos.
- Organização dos recursos do projeto.
- Separação entre interface e lógica de negócio.
- Componentes reutilizáveis.
- Validação dos dados antes do processamento.
- Navegação padronizada utilizando MaterialToolbar.
- Código organizado e documentado.

---

# ⛽ O que este projeto demonstra

Este projeto representa minha evolução prática no desenvolvimento Android e demonstra conhecimentos em:

- Desenvolvimento Android Nativo.
- Kotlin.
- Android Studio.
- XML Layout.
- ConstraintLayout.
- Material Design.
- Navegação entre Activities.
- Intents.
- Tratamento de entrada do usuário.
- Lógica de programação.
- Versionamento com Git.
- GitHub.
- Organização de projeto.
- Documentação técnica.

---

# ⛽ Considerações finais

O **Fuel Calculator** marcou minha transição dos estudos teóricos para a construção de uma aplicação Android completa.

Além da implementação da interface e da lógica de cálculo, este projeto permitiu consolidar conceitos fundamentais como navegação entre Activities, comunicação utilizando Intents, validação de dados, organização de código, Material Design e versionamento com Git.

Mais do que desenvolver uma calculadora de combustível, este projeto representou uma oportunidade de praticar uma metodologia de desenvolvimento semelhante à utilizada em equipes profissionais, utilizando branches por funcionalidade, commits semânticos, refatorações e documentação contínua.

Esse projeto serviu como base para consolidar os fundamentos do desenvolvimento Android e preparar o caminho para projetos mais complexos utilizando arquiteturas modernas e boas práticas de engenharia de software.
