package Patterns.Builder;

public class Computador {
    private final String processador;
    private final int memoriaRam;
    private final String armazenamento;
    private final String placaDeVideo;
    private final String sistemaOperacional;

    public Computador(String processador, int memoriaRam, String armazenamento,
                      String placaDeVideo, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Processador: " + processador
            + "\nRAM: " + memoriaRam + "GB"
            + "\nArmazenamento: " + armazenamento
            + "\nPlaca de vídeo: " + (placaDeVideo == null ? "N/A" : placaDeVideo)
            + "\nSistema operacional: " + (sistemaOperacional == null ? "N/A" : sistemaOperacional);
    }
}
