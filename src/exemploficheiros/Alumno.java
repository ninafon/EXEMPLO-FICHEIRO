package exemploficheiros;


public class Alumno {
    private String nome;
    private String telefono;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nome, String telefono, int nota) {
        this.nome = nome;
        this.telefono = telefono;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefono() {
        return telefono;
    }    
    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", telefono=" + telefono + ", nota=" + nota + '}';
    }
    
}
