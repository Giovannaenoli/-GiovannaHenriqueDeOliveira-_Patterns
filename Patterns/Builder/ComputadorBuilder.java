package Patterns.Builder;

public class ComputadorBuilder {
    private String processador;
    private int memoriaRam;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    public ComputadorBuilder processador(String processador) {
        this.processador = processador;
        return this;
    }

    public ComputadorBuilder memoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
        return this;
    }

    public ComputadorBuilder armazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder placaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public ComputadorBuilder sistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public Computador build() {
        return new Computador(processador, memoriaRam, armazenamento, placaDeVideo, sistemaOperacional);
    }
}
