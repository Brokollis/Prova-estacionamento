import java.util.ArrayList;

public class Moto extends Veiculo {

    private String placaMoto;
    private int cilindrada;

    private static ArrayList<Moto> motos = new ArrayList<>();
    
    public Moto(
        String nome,
        Vaga vaga,      
        String placaMoto,
        int cilindrada
    ) {
        super(GetId.getNextId(motos), nome, vaga);
        this.placaMoto = placaMoto;
        this.cilindrada = cilindrada;

        motos.add(this);
    }
    
    public String getPlacaMoto() {
        return placaMoto;
    }
    
    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }

    public String getCilindrada() {
        return cilindrada;
    }
    
    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    public static ArrayList<Moto> getMotos() {
        return motos;
    }

    public static Moto getMoto(int id) throws Exception {
        for (Moto moto : motos) {
            if (moto.getId() == id) {
                return moto;
            }
        }
        throw new Exception("moto não encontrada");
    }

    public static void removeMoto(int id) throws Exception {
        Moto moto = getMoto(id);
        motos.remove(moto);
    }
    
    @Override
    public String toString() {
        return super.toString() + "Placa da moto =" + placaMoto + "\n";
    }
    public String toString() {
        return super.toString() + "Cilindrada da moto =" + cilindrada + "\n";
    }
}
