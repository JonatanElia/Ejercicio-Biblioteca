public class Libro {
    private int ID;
    private String titulo;
    private String autor;
    private int candidadTotal;
    private int candidadDisponible;

    public Libro() {
    }

    public Libro(int candidadDisponible, int candidadTotal, String autor, String titulo, int ID) {
        this.candidadDisponible = candidadDisponible;
        this.candidadTotal = candidadTotal;
        this.autor = autor;
        this.titulo = titulo;
        this.ID = ID;
    }

    public int getCandidadDisponible() {
        return candidadDisponible;
    }

    public int getCandidadTotal() {
        return candidadTotal;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getID() {
        return ID;
    }

    public void setCandidadDisponible(int candidadDisponible) {
        this.candidadDisponible = candidadDisponible;
    }

    public void setCandidadTotal(int candidadTotal) {
        this.candidadTotal = candidadTotal;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ID=" + ID +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", candidadTotal=" + candidadTotal +
                ", candidadDisponible=" + candidadDisponible +
                '}';
    }
    public int prestarLibro(){
        if(this.candidadDisponible>0){
            return this.candidadDisponible-=1;
        }else {
            System.out.println("No tenemos " +this.titulo+" disponible en este momento");
            return this.candidadDisponible;
        }
    }
    public int devolverLibro() {
        if (this.candidadDisponible < this.candidadTotal) {
            return this.candidadDisponible += 1;
        }else {
            System.out.println("Ese libro no es de esta biblioteca");
            return this.candidadDisponible;
        }

    }
}
