package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/*

 * A anotação @Data cria os métodos getters e setters de todos os atributos da classe no momento de compilação.
 
 * A anotação @AllArgsConstructor cria um construtor com todos os atributos da classe no momento de compilação.
 
 */

@Data
@AllArgsConstructor
public class Anime {
    private Long id;
    private String name;

}
