// Importa as classes necessárias para os testes
import io.restassured.RestAssured; // Biblioteca para automação de testes REST
import org.junit.jupiter.api.Test; // Framework de testes JUnit 5
import static io.restassured.RestAssured.given;

// Classe que contém os testes de API
public class teste {

    // Define um método de teste
    @Test
    public void testGetBooking() {
        // Configura a URL base para as requisições da API
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        // Configura e executa a requisição GET para o endpoint "/booking/"
        given() // Define as configurações da requisição (headers, parâmetros, etc.)
            .header("Accept", "*/*") //adiciona o header accept
        .when() // Indica o início da execução da requisição
            .get("/booking/") // Especifica o endpoint a ser chamado
        .then() // Define as validações da resposta
            .statusCode(200) // Verifica se o status code da resposta é 200 (OK)
            .log().all();    // Loga no console todos os detalhes da resposta (body, headers, etc.)
    }
}
