package Patterns.Builder;

public class Main {
    public static void main(String[] args) {
        Computador basico = new ComputadorBuilder()
            .processador("Intel Core i5")
            .memoriaRam(8)
            .armazenamento("256GB SSD")
            .build();

        Computador gamer = new ComputadorBuilder()
            .processador("Intel Core i9")
            .memoriaRam(32)
            .armazenamento("1TB SSD")
            .placaDeVideo("NVIDIA RTX 4070")
            .build();

        System.out.println("=== Computador Básico ===");
        System.out.println(basico);
        System.out.println();
        System.out.println("=== Computador Gamer ===");
        System.out.println(gamer);
    }
}
