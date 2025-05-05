# Lista de Exercícios 02 — Programação Orientada a Objetos

## Questão 1: 

Utilizar getters e setters é uma boa prática em programação orientada a objetos porque promove o encapsulamento, um dos pilares fundamentais da POO.

### Vantagens:
- **Encapsulamento:** Oculta os atributos internos, expondo somente o necessário.
- **Validação:** Permite validar dados antes de alterar o estado de um objeto.
- **Manutenção:** Facilita futuras alterações sem impactar o código que usa a classe.
- **Segurança:** Garante consistência e integridade dos dados.

### Exemplo em Java:
```java
public class Pessoa {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
```
Se o atributo Idade fosse public, qualquer parte do sistema poderia colocar uma idade inválida. Com os métodos get e set, dá para controlar como os dados são usados, protegendo o objeto contra erros.

# Questão 2:

## a) Quais informações são relevantes para representar um livro?

Para representar um livro dentro de um sistema, é importante considerar atributos que descrevem suas principais características como:

- Título
- Autor
- Editora
- Ano de publicação
- Número de páginas
- Gênero
- Status (disponível ou emprestado)

Esses atributos ajudam a identificar, buscar e gerenciar livros no sistema.


## b) Por que a classe `Livro` é considerada uma abstração?

Porque ela representa um conceito do mundo real (livro) dentro de um programa, seleciona apenas os atributos e comportamentos relevantes para o sistema e oculta os detalhes desnecessários que não precisam ser manipulados no software.
Ou seja, abstração é focar no que importa para resolver o problema no contexto da aplicação, e a classe Livro faz isso ao modelar um livro de forma simplificada e funcional.


## c) Três métodos que poderiam existir na classe `Livro`

1. void exibirDetalhes()

Mostra todas as informações do livro.

3. void emprestar()

Altera o status do livro para “Emprestado”.

5. void devolver()

Altera o status do livro para “Disponível”.

---

