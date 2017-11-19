
package projeto;

/**
 *
 * @author italo
 */
public class DadosDaCompra {
    
    private String origem;
    private String destino;
    private String dataCompra;
    private String nome;
    private String RG;
    private String dataNascimento;
    private String poltrona;
    
    public DadosDaCompra(String origem, String destino, String dataCompra, String nome, String RG, String dataNascimento, String poltrona){
        
        this.origem = origem;
        this.destino = destino;
        this.dataCompra = dataCompra;
        this.nome = nome;
        this.RG = RG;
        this.dataNascimento = dataNascimento;
        this.poltrona = poltrona;
        
    }
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }
    
}
