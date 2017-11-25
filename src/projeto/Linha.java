
package projeto;

/**
 *
 * @author italo
 */
public class Linha {
    
    private String[] linha = new String[2];
    private int[] vetPoltrona = new int[50];
    
    public Linha(String origem, String destino){
        this.linha[0] = origem;
        this.linha[1] = destino;
    }

    public String[] getLinha() {
        return linha;
    }

    public void setLinha(String[] linha) {
        this.linha = linha;
    }

    public int[] getVetPoltrona() {
        return vetPoltrona;
    }

    public void setVetPoltrona(int[] vetPoltrona) {
        this.vetPoltrona = vetPoltrona;
    } 
    
}
