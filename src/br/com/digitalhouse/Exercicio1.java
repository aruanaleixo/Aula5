package br.com.digitalhouse;

public class Filho {
    // criar mae e pai

    private String pai;
    private String mae;
    private String filho;

    //construtor
    public filho(String nomeMae, String nomePai, String nomeFilho) {
        mae = nomeMae;
        pai = nomePai;
        filho = nomeFilho;


    }


    //
    public String getFilho() {
        return filho;
    }

    public void setFilho(String filho) {
        this.filho = filho;
    }

    //alt + insert
    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }
}





}
