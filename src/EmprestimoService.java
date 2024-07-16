public class EmprestimoService {
    public void registrarEmprestimo(String nomeMembro, String tituloLivro) {
        System.out.println("Empréstimo registrado: Membro - " + nomeMembro + ", Livro - " + tituloLivro);
    }

    public void registrarDevolucao(String nomeMembro, String tituloLivro) {
        System.out.println("Devolução registrada: Membro - " + nomeMembro + ", Livro - " + tituloLivro);
    }
}
