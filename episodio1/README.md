#  Semana Spring React - Episódio 1
>  *Crie um app completo para seu portfólio com as tecnologias mais demandadas do mercado*


## Objetivos do projeto para esta aula
- Criar projetos backend e frontend
- Salvar os projeto no Github em monorepo
- Montar o visual estático do front end

# Checklist

## Design Figma

https://www.figma.com/file/PehiT8Dw4Lv5ioTSULZeRI/DSMeta3

## Pré-requisito: Git instalado


## Ferramentas

- Nodejs 16 e Yarn (vídeo: https://youtu.be/x5tgFTS-CYA )
- STS (vídeo: https://youtu.be/TGQ0K9QsX88 )
- VS Code
  - `IntelliCode`
  - `ESLint`
  - `JSX HTML <tags/>`

## Passo: criar projeto ReactJS

![DevSuperior no Instagram](https://raw.githubusercontent.com/devsuperior/bds-assets/main/sds/pastas-dsmeta.png)

```
yarn create vite frontend --template react-ts
```


## Passo: criar projeto Spring Boot

- Criar projeto Spring Boot no `Spring Initializr` com as seguintes dependências:
  - Web
  - JPA
  - H2
  - Security

- Ajuste no arquivo pom.xml:

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version><!--$NO-MVN-MAN-VER$ -->
</plugin>
```

- Botão direito no projeto -> Maven -> Update project (force update)

## Passo: salvar primeira versão no Github



```bash
git init

git add .

git commit -m "Project created"

git branch -M main

git remote add origin git@github.com:seuusuario/seurepositorio.git

git push -u origin main
```

## Passo: "limpar" o projeto ReactJS

Vamos pegar o CSS que fizemos nas aulas de preparação:

https://github.com/acenelio/dsmeta-css


- **COMMIT: Project clean**

## Passo: Primeiro componente

- **COMMIT: First component**

## Passo: Outros componentes

- **COMMIT: Other components**

## Passo: Datepicker

Documentação: https://github.com/Hacker0x01/react-datepicker

```
yarn add react-datepicker@4.8.0 @types/react-datepicker@4.4.2
```

```javascript
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
```

```javascript
<DatePicker
    selected={new Date()}
    onChange={(date: Date) => {}}
    className="dsmeta-form-control"
    dateFormat="dd/MM/yyyy"
/>
```

- **COMMIT: Datepicker**

## Passo: React Hook useState para manter estado das datas

Macete para criar uma data de X dias atrás:

```javascript
const date = new Date(new Date().setDate(new Date().getDate() - 365));
```

- **COMMIT: useState**


## PARABÉNS!

![Parabéns!](https://raw.githubusercontent.com/devsuperior/bds-assets/main/img/trophy.png)


