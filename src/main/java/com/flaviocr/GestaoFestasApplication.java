package com.flaviocr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GestaoFestasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoFestasApplication.class, args);
	}

}

/** Spring Boot Application
 * Essa anotação diz que a classe faz parte da configuração do Spring.
 * O Spring Boot sugere o uso de um container embarcado (por
 * padrão é o Tomcat) para facilitar o desenvolvimento.
 * A anotação define o ponto de partida para a procura dos demais componentes da aplicação e se
 * algum componente Spring for encontrado, será gerenciado.
 *

 */