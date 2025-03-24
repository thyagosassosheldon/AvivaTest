# Selenium/Appium/Java Project

Esse projeto contem testes automatizados usando Appium, junto do Selenium com Java.

## Table of Contents

- [Introdução](#introdução)
- [Pre-requisitos](#pre-requisitos)
- [Rodando os Testes](#rodando-os-testes)
- [Tests Reports](#test-reports)
- [O que vem depois?](#o-que-vem-depois?)

## Introdução

Esse repositorio foi criado para automtizar testes para a Avivatec. O código nesse repositorio possui:

- Estrutura em POM.
- Integração do Java com Selenium e Cucumber.
- Testes rodando automaticamente com o GitHub Actions em CI/CD a cada push/pull requests.
- DriverFactory preparado para também rodar testes de Web com Chromium.

## Pre-requisitos

Antes de começar, tenha certeza de ter instalado:

- Java JDK 24
- Java JRE Version 8
- Maven
- Appium v2.17.1
- Android Studio v24 ou superior
- Android Emulado em versão 16
- Instalar Apk da Kabum ( Visto que não foi possivel conseguir o arquivo .apk por conta da lei DMCA )
- UiAutomator2 driver para o Appium

## Rodando os Testes

O projeto foi criado com um sistema de DriveFactory mas ainda necessita de um emulador Android disponivel,  toda a iniciliazação do teste no arquivo TestRunner que se encontra em:

```bash
Src/Test/Java/Execute/TestRunner.java
```
E as capabilitys que para informações do Android se encontram em:
```bash
Src/Test/Java/Core/BrowserOptions.java
```

## Tests Reports

Reportes ainda não estão sendo gerados em unico arquivo, gerando apenas Screenshots dos sucessos e falhas que podem ser encontrados em:
```bash
Target/evidencias
```

## O que vem depois?

- Criação de sistema de reporte com graficos de todas a execução
