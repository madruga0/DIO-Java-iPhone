# 📱 Diagrama UML - iPhone e Suas Funcionalidades

Este repositório contém um diagrama UML representando as funcionalidades de um iPhone, incluindo reprodução musical, chamadas telefônicas e navegação na internet.

## 📌 Descrição

O diagrama ilustra as relações entre as classes e interfaces principais:

### 📢 Reprodutor Musical  
```
+----------------------+
|  Reprodutor Musical  |
+----------------------+
| # tocar() : void     |
| # pausar() : void    |
| + selecionarMusica() |
|   : String musica    |
+----------------------+
```

### 📞 Aparelho Telefônico  
```
+----------------------+
|  Aparelho Telefônico |
+----------------------+
| + ligar(numero)      |
| # atender() : void   |
| - iniciarCorreioVoz()|
|   : void             |
+----------------------+
```

### 🌍 Navegador Internet  
```
+----------------------+
|  Navegador Internet  |
+----------------------+
| + exibirPaginas(url) |
| - adicionarNovaAba() |
| - atualizarPagina()  |
+----------------------+
```

### 📱 iPhone  
```
+----------------------+
|       iPhone        |
+----------------------+
| ReprodutorMusical   |
| AparelhoTelefonico  |
| NavegadorInternet   |
+----------------------+
```

## 📷 Diagrama UML

(![Screenshot From 2025-01-28 20-13-07](https://github.com/user-attachments/assets/373b17eb-6ca1-45f0-9205-3418a4160559)
)

## 🚀 Como Usar

Caso queira modificar o diagrama ou criar uma implementação em código, você pode utilizá-lo como base para desenvolver um sistema orientado a objetos.

---

📌 **Legenda:**
- `+` **(public)** → O método pode ser acessado por qualquer classe.
- `#` **(protected)** → O método pode ser acessado apenas dentro da classe ou por herança.
- `-` **(private)** → O método só pode ser acessado dentro da própria classe.
