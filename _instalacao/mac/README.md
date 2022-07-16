# SDS: Instalação das ferramentas no Mac

## ATENÇÃO:

**É MUITO IMPORTANTE que todos instalem as mesmas versões para evitar imprevistos durante a construção do projeto, e possibilitar que suas dúvidas sejam respondidas.**

## Ferramentas que você deverá instalar no seu computador:

- JDK 17
- STS
- Postman
- Heroku CLI
- NodeJS 16.x (https://nodejs.org/en/download/)
- VS Code
- Git

 ## Instalar o Homebrew
```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)"
```
1. Update HomeBrew.
``` 
$ brew update 
```
2. Add the casks tap.
```
$ brew tap homebrew/cask-versions
```

## Java 17 no MacOS
```
$ brew tap AdoptOpenJDK/openjdk
$ brew install --cask adoptopenjdk17
```

- Verificar a instalação: 
```
$ java —version
```

## STS on MacOS 
```
$ brew cask install springtoolsuite
```

## postman 
```
$ brew cask install postman
```

## Heroku CLI 
Criar uma conta no site do Heroku
https://devcenter.heroku.com/articles/heroku-cli#getting-started
- Instalar o heroku CLI
```
$ brew tap heroku/brew && brew install heroku
```
- Vincular a sua conta com a instalação no computador
```
$ heroku autocomplete
```
- Esse comando irá abrir o site de login, faça login com seu usuário e senha

## Node & NPM 
```
$ brew install node
```

## YARN (Caso queira usar o YARN ao invés do NPM)

```
$ brew install yarn
```

## VS Code

1. Download Visual Studio Code for macOS. https://go.microsoft.com/fwlink/?LinkID=534106
2. No Finder abrir a pasta de downloads e localizar o arquivo baixado. 
3. Arrastar o Visual Studio Code.app para a pasta Applications , para que ele fique disponível no macOS Launchpad.
5. Adicionar VS Code na Dock clicando com o botão direito no icone e no menu de contexto selecionar: Options, Keep in Dock.

## Git
```
$ brew install git
```
