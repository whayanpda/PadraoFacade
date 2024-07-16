import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaFacadeTest {

    @Test
    public void testAdicionarLivro() {
        BibliotecaFacade biblioteca = new BibliotecaFacade();
        assertDoesNotThrow(() -> biblioteca.adicionarLivro("O Senhor dos Anéis"));
    }

    @Test
    public void testBuscarLivro() {
        BibliotecaFacade biblioteca = new BibliotecaFacade();
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        assertDoesNotThrow(() -> biblioteca.buscarLivro("O Senhor dos Anéis"));
    }

    @Test
    public void testAdicionarMembro() {
        BibliotecaFacade biblioteca = new BibliotecaFacade();
        assertDoesNotThrow(() -> biblioteca.adicionarMembro("João Silva"));
    }

    @Test
    public void testBuscarMembro() {
        BibliotecaFacade biblioteca = new BibliotecaFacade();
        biblioteca.adicionarMembro("João Silva");
        assertDoesNotThrow(() -> biblioteca.buscarMembro("João Silva"));
    }

    @Test
    public void testRegistrarEmprestimo() {
        BibliotecaFacade biblioteca = new BibliotecaFacade();
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarMembro("João Silva");
        assertDoesNotThrow(() -> biblioteca.registrarEmprestimo("João Silva", "O Senhor dos Anéis"));
    }

    @Test
    public void testRegistrarDevolucao() {
        BibliotecaFacade biblioteca = new BibliotecaFacade();
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarMembro("João Silva");
        biblioteca.registrarEmprestimo("João Silva", "O Senhor dos Anéis");
        assertDoesNotThrow(() -> biblioteca.registrarDevolucao("João Silva", "O Senhor dos Anéis"));
    }
}
