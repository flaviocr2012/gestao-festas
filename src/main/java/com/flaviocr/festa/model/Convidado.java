package com.flaviocr.festa.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity // A anotação @Entity torna a nossa classe como uma entidade de banco de dados.
public class Convidado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    private String nome;
    private Integer quantidadeAcompanhantes;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeAcompanhantes() {
        return quantidadeAcompanhantes;
    }

    public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }
}

/**
 * As anotações @Id e @GeneratedValue são para marcar a propriedade id como
 * identificador da entidade (ou seja, a chave primária no banco de dados) e para
 * pedir que o Hibernate (nossa implementação por trás do JPA) gere o
 * identificador para nós, respectivamente.
 */

/** Model e View
 * Model é o local certo pra usar o JPA/Hibernate pra salvar ou consultar algo no banco de dados.
 * A View irá "desenhar", renderizar e transformar os dados em HTML, para que o usuário consiga
 * visualizar a informação.
 * A ideia do MVC é separar claramente a responsabilidade de cada componente dentro de uma aplicação para
 * facilitar a manutenção do código, temos baixo acomplamento, e isso é uma boa prática de programação.
 * Baixo acoplamento -> baixa dependência entre os componentes ou módulos.
 */

/** Spring MVC
 * Dentre os projetos Spring, o Spring MVC é o framework que te ajuda no
 * desenvolvimento de aplicações web robustas, flexíveis e com uma clara
 * separação de responsabilidades nos papéis do tratamento da requisição.
 *
 * Processo MVC - Model, View e Controller
 *
 * 1. Acessamos uma URL no browser, que envia a requisição HTTP para
 * o servidor que roda a aplicação web com Spring MVC. Esse servidor
 * pode ser o Apache Tomcat, por exemplo. Perceba que quem recebe a
 * requisição é o controlador do framework, o Spring MVC.
 * 2. O controlador do framework irá procurar qual classe é responsável por
 * tratar essa requisição, entregando a ela os dados enviados pelo browser.
 * Essa classe faz o papel do controller.
 * 3. O controller passa os dados para o model, que por sua vez executa todas as
 * regras de negócio, como cálculos, validações e acesso ao banco de dados.
 * 4. O resultado das operações realizadas pelo model é retornado ao
 * controller.
 * 5. O controller retorna o nome da view, junto com os dados que ela precisa
 * para renderizar a página.
 * 6. O framework encontra a view, que processa os dados, transformando o
 * resultado em um HTML.
 * 7. Finalmente, o HTML é retornado ao browser do usuário.
 */

/** Spring Data JPA
 * O Spring Data JPA é um dos projetos do Spring Data.
 * O Spring Data é um projeto que tem o objetivo de simplificar o acesso a
 * tecnologias de armazenamento de dados, sejam elas relacionais (MySQL,
 * PostgreSQL, etc) ou não (MongoDB, Redis, etc).
 *
 * O Spring Data JPA ajuda os desenvolvedores padronizando o uso de algumas funcionalidades.
 * Um exemplo disso seria a implementação padrão que ele já nos dá em
 * repositórios, incluindo métodos como save , delete , findOne , entre outros.
 */


