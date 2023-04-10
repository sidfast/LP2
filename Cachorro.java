public class Cachorro extends Thread {
    public String nome;
    private String raca;
    private String dono;
    private String porte;
    private double peso;
    final String especie = "Canino";

    // Método Construtor
    public Cachorro(String nome, String raca, String dono, String porte, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.dono = dono;
        this.porte = porte;
        this.peso = peso;
    }

    public void run() {
        this.peso -= 0.01;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    // metodo Latir(som int quantidade_de_latidos)
    // valores padrao: Rosnar, Latir Baixo, Latir Alto
    public String Latir(int som, int quantidade) {
        String[] sons = { "rrrr ", "auau ", "AUAU " };
        String latir = "";

        for (int i = 0; i < quantidade; i++) {
            latir += sons[som];
            this.peso -= 0.02;
        }

        return latir;
    }

    // metodo Comer(int QuantasVezes) // x ao dia
    // a cada 100gr de racao o cachorro engorda 50gr
    // e perde 1gr por hora

    // metodo BeberAgua()

    // metodo Passear(int QuantasVezes)
    // o gasto calorico ao passear corresponde a 2x / hora (10gr)
    public void Passear() {
        this.peso -= 0.1;
    }

    // metodo Listar()

}
