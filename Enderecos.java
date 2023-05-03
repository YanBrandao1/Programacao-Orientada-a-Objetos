
public class Enderecos {

    //atributos
    private String rua,numero,cidade,estado,cep;

    //método construtor
    public Enderecos(String rua,String numero,String cidade,String estado,String cep){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;

        //Array com todos os estados
        String[] todosEstados = {"AC","AL","AP","AM","BA","CE","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO","DF"};

        /*parte do código que verifica se a sigla do estado foi digitada corretamente, caso não tenha sido, é gerado um erro. Caso a sigla for digitada corretamente, o estado passado é setado para "this.estado" */
        for (int i=0; i<todosEstados.length ;i++){
            if(estado.toUpperCase().equals(todosEstados[i])){
                this.estado = estado;
            }
        }
        if (this.estado != estado){
            throw new RuntimeException("ERRO: VOCÊ DIGITOU UMA SIGLA INVALIDA PARA O ESTADO !");
        }
    }

    public String getEndereco(){
        return("Rua: "+this.rua+"\n"+"Número:"+this.numero+"\n"+"Cidade: "+this.cidade+"\n"+"Estado: "+this.estado+"\n"+"Cep: "+this.cep);
    }

    //método que atualiza o endereço do proprietário
    public void atualizaEndereco(String rua,String numero,String cidade,String estado,String cep){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    //método sobrecarregado para atualizar o endereço sem mexer na cidade e estado
    public void atualizaEndereco(String rua,String numero,String cep){
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }
}
