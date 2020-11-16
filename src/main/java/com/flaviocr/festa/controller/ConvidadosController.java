package com.flaviocr.festa.controller;

import com.flaviocr.festa.model.Convidado;
import com.flaviocr.festa.repository.Convidados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class ConvidadosController {

    @Autowired
    private Convidados convidados;

    // Método que receberá a requisição e retornará o nome da view.
    // Será responsável por listar os convidados pra mostrarmos na view ListaConvidados.
    //@GetMapping -> mapea para que a requisição /convidados caia nesse método. O Método irá responder a
    // requisição HTTP do tipo GET pra /convidados.
    @GetMapping("/convidados")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject("convidados", convidados.findAll());
        modelAndView.addObject(new Convidado());
        return modelAndView;

    }

    @PostMapping("/convidados")
    public String salvar(Convidado convidado) {
        this.convidados.save(convidado);
        return "redirect:/convidados";
    }

}

///**
// * ModelAndView
// * Ao invés de retornar uma String com o nome da view, podemos retornar um
// * objeto do tipo ModelAndView, que nos permite, além de informar o nome da view,
// * adicionar objetos para serem usados no HTML.
// *
// * @controller Essa classe recebe a requisição e dirá o nome da view ao framework, para então ser renderizada
// * ao browser do cliente. É o primeiro componente que recebe os dados enviados pelo usuário.
// * Spring Security
// * Esse projeto trata da segurança em nível da aplicação. Tem suporte pra autenticação e autorização.
// * Com algumas poucas configurações podemos ter uma autenticação via banco de dados ou por memória. Sem falar
// * nas integrações que ele suporta.
// * Quanto a autorização, ele é bem flexível também. Através das permissões que atribuímos aos usuários
// * autenticados, podemos proteger as requisições web (como telas dos nosso sistema, por exemplo), a simples
// * invocação de um método e até a instância de um objeto.
// * /*
// * <p>
// * /** Thymeleaf
// * O Thymeleaf não é um projeto Spring, mas uma biblioteca que foi criada para
// * facilitar a criação da camada de view, com uma forte integração com o Spring, e
// * uma boa alternativa ao JSP.
// * O principal objetivo do Thymeleaf é prover uma forma elegante e bem formatada para criarmos
// * nossas páginas.
// * Injeção de dependências - @Autowired
// * Injeção de dependências (ou Dependency Injection – DI) é um tipo de inversão
// * de controle (ou Inversion of Control – IoC) que dá nome ao processo de prover
// * instâncias de classes que um objeto precisa para funcionar.
// * Ao invés de eu instanciar manualmente um objeto, o Spring o faz por mim.
// * A grande vantagem desse conceito é que nós conseguimos programar voltados
// * para interfaces e, com isso, manter o baixo acoplamento entre as classes de um
// * mesmo projeto.
// */
//
///** @controller Essa classe recebe a requisição e dirá o nome da view ao framework, para então ser renderizada
// * ao browser do cliente. É o primeiro componente que recebe os dados enviados pelo usuário.
// */
//
///** Spring Security
// * Esse projeto trata da segurança em nível da aplicação. Tem suporte pra autenticação e autorização.
// * Com algumas poucas configurações podemos ter uma autenticação via banco de dados ou por memória. Sem falar
// * nas integrações que ele suporta.
// * Quanto a autorização, ele é bem flexível também. Através das permissões que atribuímos aos usuários
// * autenticados, podemos proteger as requisições web (como telas dos nosso sistema, por exemplo), a simples
// * invocação de um método e até a instância de um objeto.
// /*
//
// /** Thymeleaf
// * O Thymeleaf não é um projeto Spring, mas uma biblioteca que foi criada para
// * facilitar a criação da camada de view, com uma forte integração com o Spring, e
// * uma boa alternativa ao JSP.
// * O principal objetivo do Thymeleaf é prover uma forma elegante e bem formatada para criarmos
// * nossas páginas.
// */
//
///**Injeção de dependências - @Autowired
// * Injeção de dependências (ou Dependency Injection – DI) é um tipo de inversão
// * de controle (ou Inversion of Control – IoC) que dá nome ao processo de prover
// * instâncias de classes que um objeto precisa para funcionar.
// * Ao invés de eu instanciar manualmente um objeto, o Spring o faz por mim.
// * A grande vantagem desse conceito é que nós conseguimos programar voltados
// * para interfaces e, com isso, manter o baixo acoplamento entre as classes de um
// * mesmo projeto.
// */
//
// O Spring Boot analisa o projeto e o configura. Com ele densenvolvemos aplicações com menos esforço.
// Maven gerencia dependências e possui biblioteca disponível para o projeto.









