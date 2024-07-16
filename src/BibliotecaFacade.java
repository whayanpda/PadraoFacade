public class BibliotecaFacade {
    private LivroService livroService;
    private MembroService membroService;
    private EmprestimoService emprestimoService;

    public BibliotecaFacade() {
        livroService = new LivroService();
        membroService = new MembroService();
        emprestimoService = new EmprestimoService();
    }

    public void adicionarLivro(String titulo) {
        livroService.adicionarLivro(titulo);
    }

    public void buscarLivro(String titulo) {
        livroService.buscarLivro(titulo);
    }

    public void adicionarMembro(String nome) {
        membroService.adicionarMembro(nome);
    }

    public void buscarMembro(String nome) {
        membroService.buscarMembro(nome);
    }

    public void registrarEmprestimo(String nomeMembro, String tituloLivro) {
        emprestimoService.registrarEmprestimo(nomeMembro, tituloLivro);
    }

    public void registrarDevolucao(String nomeMembro, String tituloLivro) {
        emprestimoService.registrarDevolucao(nomeMembro, tituloLivro);
    }
}
