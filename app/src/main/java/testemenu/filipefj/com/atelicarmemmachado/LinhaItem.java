package testemenu.filipefj.com.atelicarmemmachado;

public class LinhaItem {
    private String itemnome;
    private int foto;

    public LinhaItem(String n, int f){
        this.itemnome = n;
        this.foto = f;
    }

    public String getItemnome() {
        return itemnome;
    }

    public int getFoto() {
        return foto;
    }
}
