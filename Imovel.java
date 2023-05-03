
//criação da classe imovel

public class Imovel {

    //atributos da classe
    private String iptu,tipo,utilizacao;
    private Enderecos endereco;

    //implementação do método construtor
    public Imovel (String iptu, String rua, String numero, String cep, String estado, String cidade, String tipo, String utilizacao){
        this.iptu = iptu;
        this.tipo = tipo;
        this.utilizacao = utilizacao;
        this.endereco = new Enderecos(rua,numero,cidade,estado,cep);
    }
 
    /*método construtor sobrecarregado para caso o estado e cidade não sejam informados. Nesse caso, consideraremos o estado como "Bahia" e a cidade como "Salvador" */
    public Imovel(String iptu, String rua, String numero, String cep, String tipo, String utilizacao){
        this(iptu,rua,numero,cep,"Bahia","Salvador",tipo,utilizacao);
    }

    //consultar iptu
    public String getIptu(){
        return this.iptu;
    }

    //atribuir valor ao iptu
    public void setIptu(String iptu){
        this.iptu = iptu;
    }

    //consultar tipo
    public String getTipo(){
        return this.tipo;
    }

    //atribuir valor ao tipo
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    //consultar utilizacao
    public String getUtilizacao(){
        return this.utilizacao;
    }

    //atribuir valor ao cep
    public void setUtilizacao(String utilizacao){
        this.utilizacao = utilizacao;
    }

    public String getEndereco(){
        return(this.endereco.getEndereco());
    }
}