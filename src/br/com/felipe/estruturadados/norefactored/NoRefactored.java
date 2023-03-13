package br.com.felipe.estruturadados.norefactored;
//UTILIZANDO RECURSO GENERICS

public class NoRefactored<T> {

    
    private T conteudo;
    private NoRefactored<T> proximoNo;
    

    public NoRefactored(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoRefactored<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoRefactored<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

    

    
}
