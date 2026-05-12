# PetShop-Manager - Sistema de Gestão Orientado a Objetos
## Sobre o Projeto
O Patinhas Felizes é um PetShop que atende cachorros, gatos e pássaros. O software foi construído seguindo rigorosos princípios de Programação Orientada a Objetos (POO) para garantir escalabilidade e manutenção eficiente.  

***Funcionalidades Principais***   
- Cadastro de Animais: Registro de Cachorros, Gatos e Pássaros com validação de atributos como nome e peso.
- Registro de Serviços: Seleção de animais cadastrados para a prestação de serviços de Banho ou Consulta.
- Cálculo Automatizado: Soma do custo de todos os serviços prestados no dia com base em regras de negócio específicas por porte e espécie.
- Relatório Geral: Listagem detalhada de todos os animais atendidos e respectivos serviços.

## Requisitos Técnicos Aplicados
O sistema foi desenvolvido seguindo os seguintes requisitos obrigatórios (RFs):
- Interface Gráfica (RF01): Toda a interação com o usuário ocorre via JOptionPane, sem entradas ou saídas pelo terminal.
- Encapsulamento (RF02): Atributos privados/protegidos e comunicação feita exclusivamente através de métodos públicos.
- Herança e Polimorfismo (RF03): Utilização de classes abstratas (Animal e Servico) e sobrescrita de métodos para lógicas de cálculo específicas.
- Interfaces (RF04): Implementação das interfaces Relatorio (método gerarResumo()) e Calculavel (método calcularTotal()).
- Coleções Dinâmicas (RF05): Uso de ArrayList<Animal> e ArrayList<Servico> para gerenciamento de dados e iteração polimórfica.

## Regras de Negócio e Cálculos
O sistema utiliza uma lógica de precificação dinâmica fundamentada em herança e polimorfismo. O custo final de um serviço é composto pelo **Preço Base** do modelo.animal somado à **Taxa Específica** do serviço prestado.

***1. Preço Base por Categoria***

O valor base é definido pela espécie e, em alguns casos, pelo porte ou pelagem do modelo.animal:

| Espécie | Critério de Diferenciação | Preço Base |
| :--- | :--- | :--- |
| **Cachorro** | Pequeno porte (≤ 10 kg) | R$ 40,00 |
| **Cachorro** | Médio porte (≤ 25 kg) | R$ 60,00 |
| **Cachorro** | Grande porte (> 25 kg) | R$ 85,00 |
| **Gato** | Pelo Curto | R$ 45,00 |
| **Gato** | Pelo Longo | R$ 65,00 |
| **Pássaro** | Taxa Fixa Única | R$ 30,00 |

***2. Composição de Custos dos Serviços***

Cada serviço possui sua própria fórmula de cálculo, implementada através do método `calcularCusto(Animal a)`:

| Serviço | Fórmula de Cálculo | Observações |
| :--- | :--- | :--- |
| **Banho** | $Preço Base + (Duração \times 0.50)$ | Indisponível para Pássaros |
| **Consulta** | $Preço Base + 35.00$ | Disponível para todas as espécies |

***3. Faturamento Total do Dia***

A conta total do PetShop é obtida através da soma de todos os serviços registrados no ArrayList, iterados polimorficamente:

$$Total = \sum_{i=1}^{n} Servico_i.calcularCusto(Animal)$$

#

**Instituição:** FIAP   
**Disciplina:** Object-Oriented Programming and Java Web Development   
**Professor:** Antônio Marcos Selmini
