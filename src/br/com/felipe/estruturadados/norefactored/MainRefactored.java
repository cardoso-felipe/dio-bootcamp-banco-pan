package br.com.felipe.estruturadados.norefactored;

public class MainRefactored {
    public static void main(String[] args) {
        
        NoRefactored<String> no1 = new NoRefactored<>("Conteúdo no1");
        
        NoRefactored<String> no2 = new NoRefactored<>("Conteúdo no2");
        no1.setProximoNo(no2);

        NoRefactored<String> no3 = new NoRefactored<>("Conteúdo no3");
        no2.setProximoNo(no3);

        NoRefactored<String> no4 = new NoRefactored<>("Conteúdo no4");
        no3.setProximoNo(no4);
        
        //no1->no2->no3->no4->null

        System.out.println(no1);
        System.out.println(no2);
        System.out.println(no3);
        System.out.println(no4);
        
        System.out.println("---------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
        

    }
}
