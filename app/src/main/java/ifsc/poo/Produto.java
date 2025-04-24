package ifsc.poo;

class Produto {
    private String nome;
    private double preco;
    private double desconto;
    private String codigo;
    private static int totalProds = 0;
    private static final int MAX_REGISTROS = 50;
    private static Produto[] ultimosProds = new Produto[MAX_REGISTROS];
    private static int indiceUltimo = 0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = 0;
        this.codigo = gerarCodigo();

        ultimosProds[indiceUltimo % MAX_REGISTROS] = this;
        indiceUltimo++;
        totalProds++;
    }

    private String gerarCodigo() {
        return String.format("CD:%03d-%03d", totalProds / 1000, totalProds % 1000);
    }

    public static String[] getRegistroCSV() {
        int tamanho = Math.min(totalProds, MAX_REGISTROS);
        String[] csv = new String[tamanho + 1];
        csv[0] = "Código;Nome;Preço;Desconto";

        int inicio = indiceUltimo >= MAX_REGISTROS ? indiceUltimo % MAX_REGISTROS : 0;
        for (int i = 0; i < tamanho; i++) {
            Produto p = ultimosProds[(inicio + i) % MAX_REGISTROS];
            csv[i+1] = String.format("%s;%s;%.2f;%.0f",
                    p.getCodigo(), p.getNome(), p.getPreco(), p.getDesconto());
        }

        return csv;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public static int getTotalProdutos() {
        return totalProds;
    }
}
