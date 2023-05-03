import java.util.ArrayList;

//criação da classe Proprietário

public class Proprietario {

    //atributos da classe
    private String nome,cpf,identidade;
    private Enderecos endereco;
    private ArrayList<Imovel> imovel;

    //implementação do método construtor
    public Proprietario(String nome,String cpf,String identidade,String rua,String numero,String cidade,String estado,String cep){
        this.nome = nome;
        this.cpf = cpf;
        this.identidade = identidade;
        this.endereco = new Enderecos(rua,numero,cidade,estado,cep);
        this.imovel = new ArrayList<Imovel>();
    }

    //consultar o nome
    public String getNome(){
        return this.nome;
    }
    
    //atribuir valor ao nome
    public void setNome(String nome){
        this.nome = nome;
    }

    //consultar o CPF
    public String getCpf(){
        return this.cpf;
    }
    
    //atribuir valor ao CPF
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    //consultar a identidade
    public String getIdentidade(){
        return this.identidade;
    }
    
    //atribuir valor à identidade
    public void setIdentidade(String identidade){
        this.identidade = identidade;
    }

    public String getEndereco(){
        return(this.endereco.getEndereco());
    }

    //método que atualiza o endereço do proprietário
    public void atualizaEndereco(String rua, String numero, String cep, String estado, String cidade){
        this.endereco.atualizaEndereco(rua,numero,cep,estado,cidade);
    }
    
    //método sobrecarregado para atualizar o endereço sem mexer na cidade e no estado
    public void atualizaEndereco(String rua,String numero,String cep){
        this.endereco.atualizaEndereco(rua,numero,cep);
    }

    //adiciona um imóvel a um proprietário
    public void setImovel(Imovel imovel){
        this.imovel.add(imovel);
    }
    
    //retorna a lista de todos os imóveis (junto com o tipo) do proprietário
    public String getImovel(){
        String aux = "";
        for (int i=0;i<this.imovel.size();i++){
            aux += this.imovel.get(i)+" "+"Tipo: "+this.imovel.get(i).getTipo()+"; ";
        }
        return("Imóveis: "+aux);
    }
}