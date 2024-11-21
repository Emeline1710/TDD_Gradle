import java.util.ArrayList;
import java.util.List;

public class Matiere {
    private String code;
    private String nom;
    private List<Evaluation> evaluations;

    public Matiere(String code, String nom) {
        this.code = code;
        this.nom = nom;
        this.evaluations = new ArrayList<>();
    }

    public void ajouterEvaluation(float note) {
        evaluations.add(new Evaluation(note));
    }

    public float calculerMoyenne() {
        if (evaluations.isEmpty()) return 0;

        float somme = 0;
        for (Evaluation eval : evaluations) {
            somme += eval.getNote();
        }
        return somme / evaluations.size();
    }

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public String getNom() {
        return nom;
    }
}
