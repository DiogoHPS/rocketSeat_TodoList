package br.com.diogoh.todolist.user;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador:
 * public - qualquer um pode acessar a classe
 * private - somente alguns atributos podem acessar a classe
 * Protected - quando se encontra na mesma estrutura do pacote que tem acesso
 */

 /**
  * class - define o tipo de objeto com atributos e métodos +
  * interface - define um contrato que deve ser implementado por uma classe
  * enum - define um tipo de dado com um conjuno finito de valores
  */

@RestController
@RequestMapping("/users")
public class UserController {
    
    /**
     * String (texto)
     * Integer (int) numeros inteiros
     * Double (double) numeros com casas decimais
     * Float (float) numeros com casas decimais mas diferencia do Double pla quantidade de numeros suportados
     * char (A , C)
     * date (data)
     * void apenas execução de lógica
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }
}
