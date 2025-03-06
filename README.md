# Atividade 6

> Este projeto foi desenvolvido com o objetivo de praticar os conceitos aprendidos em sala de aula: encapsulamento; herença; Polimorfismo; Classes e Objetos "

## 📌 Sobre o Projeto

Este repositório contém exercícios resolvidos em Java, focando em conceitos essenciais da linguagem, como:

- Variáveis e tipos de dados
- Estruturas condicionais e de repetição
- Programação orientada a objetos (POO)
- Manipulação de arquivos


Os exercícios foram desenvolvidos para aprimorar os conceitos estudados em sala de aula.

---
## 🛠️ Tecnologias Utilizadas

- Java (JDK 17+ recomendado)
- IDE: [NetBeans  8.2]( https://netbeans.apache.org/front/main/download/) ou 
- Git/GitHub para versionament

---

## 🚀 Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
2. **Abra o projeto em sua IDE favorita**.
3. **Compile e execute** os arquivos `.java` conforme necessário.
   ```bash
   javac NomeDoArquivo.java
   java NomeDoArquivo
   ```
4. **(Opcional) Se usar Maven:**
   ```bash
   mvn clean install
   mvn exec:java -Dexec.mainClass="com.exemplo.Main"
   ```
---
## 📂 Estrutura do Repositório

```bash
📂 nome-do-repositorio
├── 📁 src/main/java
│   ├── 📁 com.exemplo.exercicios
│   │   ├── Exercicio01.java
│   │   ├── Exercicio02.java
│   │
├── 📄 README.md
└── 📄 .gitignore
```
---
## 📖 Exemplos de Código

public class Atividade6_10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Temperatura t = new Temperatura();
        
        System.out.println("Informe os graus celsius");
        t.setCelsius(teclado.nextDouble());
        
        t.exibir();
        
        
        
    }
    
}
```
---
## 🏆 Autor

👤 **Seu Nome**  
📧 Email: lorenzoclarindo456@gmail.com
🔗 [LinkedIn][(https://www.linkedin.com/in/seu-perfil/)  ](https://www.linkedin.com/in/lorenzo-clarindo-022a72324/)
🔗 [GitHub][(https://github.com/seu-usuario/)](https://github.com/xLorenzoSCx)

---



## 🎯 Objetivo do Repositório

Este repositório serve como um portfólio para demonstrar habilidades em Java, ajudando na busca de oportunidades de emprego na área de desenvolvimento.

---

## ⚖️ Licença

Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
