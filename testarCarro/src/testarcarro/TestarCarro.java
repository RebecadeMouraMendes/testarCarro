package testarcarro;

public class TestarCarro {

    public static void main(String[] args) {
        //Atributos
      carro car = new carro();
      car.cor = "Amarelo";
      car.marca = "Nissan";
      car.modelo = "Esportivo";
      car.ano = 2020;
      
        //Saída dos atributos
      System.out.println("Cor do carro: " +car.cor);
      System.out.println("Marca do carro: " +car.marca);
      System.out.println("Modelo do carro: " +car.modelo);
      System.out.println("Ano do carro: " +car.ano);
      
        //Saida dos métodos
      car.ligar();
      car.acelerar();
      car.frear();
      car.parar();
    }
    
}
