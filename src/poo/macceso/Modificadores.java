package src.poo.macceso;

public class Modificadores {
    private ModificadoresDivergentes md;
    public Modificadores() {
        md = new ModificadoresDivergentes();
        md.enumerador = 0.5;
    }

    public ModificadoresDivergentes getMd() {
        return md;
    }

    public void setMd(ModificadoresDivergentes md) {
        this.md = md;
    }
}
