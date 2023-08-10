package atividade_1;

public class Main {

	public static void main(String[] args) {

        Smartphone smartphone_first = new Smartphone("Iphone 13 PRO MAX", "China", "IPHONE");
        Smartphone smartphone_second = new Smartphone("Galaxy A12", "China", "SAMSUNG");

        System.out.println("Informações do Smartphone 1:");
        smartphone_first.showInformation();

        System.out.println("\nInformações do Smartphone 2:");
        smartphone_second.showInformation();
	}

}
