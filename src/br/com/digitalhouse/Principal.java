package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {
        Filho filhoUm = new Filho("Maria", "Jorge", "Jose");
        Filho filhoDois = new Filho ("Maria","Fernando", "Ana");

        mesmaMae(filhoUm, filhoDois);
        mesmoPai(filhoUm, filhoDois);

        System.out.println();
    }

}




























    {//Filho: classe | filho: parametro
    //retornar o nome da mae dado o nome do filho
    public static String maeDe(Filho novoFilho) {
        return novoFilho.getMae();


    }

    //retornar o nome do pai dado o nome do filho
    public static String maeDe(Filho novoFilho) {
        return novoFilho.getPai();
    }

    //dizer se é mae
    public static boolean mesmaMae(Filho filhoUm, Filho filhoDois) {
        return maeDe(filhoUm) == maeDe(filhoDois);

    }

    public static boolean mesmoPai(Filho filhoUm, Filho filhoDois) {
        ( if paiDe(filhoUm) == paiDe(filhoDois)){
            return true;
        }else{
            return false;

        }
    }
    public static boolean saoMeioIrmaos(Filho filhoUm, Filho filhoDois ) {
        return mesmaMae(filhoUm, filhoDois) && !mesmoPai(filhoUm, filhoDois) ||
    }





}
