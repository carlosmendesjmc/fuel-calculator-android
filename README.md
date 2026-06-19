# Fuel Calculator

Aplicativo Android desenvolvido em Kotlin para calcular o gasto de combustível de uma viagem com base na distância, consumo do veículo e preço do combustível.

## Sobre o projeto

O objetivo deste projeto é praticar o desenvolvimento Android com Kotlin, criando um app com múltiplas telas, entrada de dados do usuário, navegação entre Activities e cálculo do custo final de uma viagem.

## Requisitos do app

* Cada informação do usuário será recebida em uma tela individual.
* O app deverá receber:

  * Preço do combustível
  * Consumo do veículo
  * Distância da viagem
* A tela final deverá exibir:

  * Valor total estimado da viagem
  * Resumo das informações digitadas anteriormente

## Tecnologias utilizadas

* Kotlin
* Android Studio
* XML Layout
* Gradle
* Git e GitHub

## Etapas realizadas até aqui

### 1. Criação do repositório no GitHub

Foi criado um repositório no GitHub com o nome:

```text
fuel-calculator-android
```

### 2. Clone do repositório para o computador

O repositório foi clonado para o computador local:

```bash
git clone URL_DO_REPOSITORIO
```

Depois, foi acessada a pasta do projeto:

```bash
cd fuel-calculator-android
```

### 3. Criação do projeto no Android Studio

No Android Studio, foi criado um novo projeto com as seguintes configurações:

```text
Template: Empty Views Activity
Name: FuelCalculator
Package name: com.example.fuelcalculator
Language: Kotlin
Minimum SDK: API 24 ("Nougat"; Android 7.0)
Build configuration language: Kotlin DSL (build.gradle.kts)
```

O projeto foi criado dentro da pasta do repositório clonado.

### 4. Verificação da estrutura do projeto

Após a criação, o projeto gerou a estrutura inicial:

```text
fuel-calculator-android
│
├── app/
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew
├── gradlew.bat
├── gradle.properties
└── .gitignore
```

### 5. Correção de dependência Core KTX

Durante a configuração inicial, foi identificado um erro relacionado à dependência:

```text
androidx.core:core-ktx:1.19.0
```

A versão exigia `compileSdk 37`, mas o projeto estava usando `compileSdk 36.1`.

Para corrigir, foi alterada a versão do `coreKtx` no arquivo:

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

Após a alteração, foi feita a sincronização do Gradle no Android Studio.

### 6. Primeiro commit do projeto

Após validar que o projeto foi criado corretamente, os arquivos foram adicionados ao Git:

```bash
git add .
```

Em seguida, foi criado o primeiro commit:

```bash
git commit -m "feat: create initial Android project"
```

Esse commit representa a criação da estrutura inicial do projeto Android.

### 7. Envio para o GitHub

Depois do primeiro commit, o projeto foi enviado para o GitHub:

```bash
git push -u origin main
```

## Próximas etapas

* Criar branch para a tela inicial.
* Desenvolver a Welcome Screen.
* Criar tela para inserir o preço do combustível.
* Criar tela para inserir o consumo do veículo.
* Criar tela para inserir a distância da viagem.
* Criar tela de resultado.
* Implementar validações dos campos.
* Melhorar o layout visual do app.

## Fluxo de branches planejado

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

### 8. Welcome Screen

**Activity**

WelcomeActivity

**Objetivo**

Tela inicial do aplicativo.

**Commit**

```bash
git commit -m "feat: create welcome screen"
```

**Screenshot**

Adicionar imagem da tela após conclusão.

---

## 9. Fuel Price Screen

**Activity**

FuelPriceActivity

**Objetivo**

Tela para informar o preço do combustível.

**Commit**

```bash
git commit -m "feat: create fuel price screen"
```

**Screenshot**

Adicionar imagem da tela após conclusão.

---

## 10. Vehicle Consumption Screen

**Activity**

VehicleConsumptionActivity

**Objetivo**

Tela para informar o consumo do veículo.

**Commit**

```bash
git commit -m "feat: create vehicle consumption screen"
```

**Screenshot**

Adicionar imagem da tela após conclusão.

---

## 11. Distance Screen

**Activity**

DistanceActivity

**Objetivo**

Tela para informar a distância da viagem.

**Commit**

```bash
git commit -m "feat: create distance screen"
```

**Screenshot**

Adicionar imagem da tela após conclusão.

---

## 12. Calculation Logic

**Objetivo**

Implementar a lógica de cálculo do custo da viagem.

**Commit**

```bash
git commit -m "feat: implement trip cost calculation"
```

---

## 13. Result Screen

**Activity**

ResultActivity

**Objetivo**

Tela para exibir o resultado do cálculo.

**Commit**

```bash
git commit -m "feat: create result screen"
```

**Screenshot**

Adicionar imagem da tela após conclusão.

---

## 14. Input Validation

**Objetivo**

Validar os dados informados pelo usuário.

**Commit**

```bash
git commit -m "feat: add input validation"
```

---

## 15. UI Improvements

**Objetivo**

Melhorar a aparência e experiência visual do aplicativo.

**Commit**

```bash
git commit -m "feat: improve user interface"
```

**Screenshot**

Adicionar imagens da versão final do aplicativo.

```

## Status do projeto

Projeto em desenvolvimento.
