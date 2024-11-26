import com.projeto.adapter.AdapterValidadorEmailClasse;
import com.projeto.adapter.AdapterValidadorEmailFuncao;
import com.projeto.adapter.ValidadorEmailFuncaoProtocolo;
import com.projeto.adapter.ValidadorEmailProtocolo;

public class Main {
    public static void validarEmailClasse(ValidadorEmailProtocolo validadorEmail, String email) {
        if (validadorEmail.isEmail(email)) {
            System.out.println("Email é válido (CLASSE)");
        } else {
            System.out.println("Email é inválido (CLASSE)");
        }
    }

    public static void validarEmailFuncao(ValidadorEmailFuncaoProtocolo validadorEmail, String email) {
        if (validadorEmail.validar(email)) {
            System.out.println("Email é válido (FUNÇÃO)");
        } else {
            System.out.println("Email é inválido (FUNÇÃO)");
        }
    }

    public static void main(String[] args) {
        String emailValido = "luizomf@gmail.com";
        String emailInvalido = "luizomf@";

        // Testa um email válido
        System.out.println("Testando email válido:");
        validarEmailClasse(new AdapterValidadorEmailClasse(), emailValido);
        validarEmailFuncao(AdapterValidadorEmailFuncao.INSTANCIA, emailValido);

        System.out.println();

        // Testa email inválido
        System.out.println("Testando email inválido:");
        validarEmailClasse(new AdapterValidadorEmailClasse(), emailInvalido);
        validarEmailFuncao(AdapterValidadorEmailFuncao.INSTANCIA, emailInvalido);
    }
}
