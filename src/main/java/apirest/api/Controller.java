package apirest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/conexao")
    public ResponseEntity conexao() {
        return ResponseEntity.ok().build();
    }
}
