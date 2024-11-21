import java.util.*;

public class Etudiant {
    private String nom;
    private int annee;
    private Map<Matiere, List<Evaluation>> evaluationsParMatiere;

    public Etudiant(String nom, int annee) {
        this.nom = nom;
        this.annee = annee;
        this.evaluationsParMatiere = new HashMap<>();
    }

    public void ajouterEvaluation(Matiere matiere, float note) {
        List<Evaluation> evaluations = evaluationsParMatiere.get(matiere);
        if (evaluations == null) {
            evaluations = new ArrayList<>();
            evaluationsParMatiere.put(matiere, evaluations);
        }
        evaluations.add(new Evaluation(note));
    }

    public float calculerMoyenneGenerale() {
        if (evaluationsParMatiere.isEmpty()) {
            System.out.println("Aucune évaluation");
            return 0;
        }

        float somme = 0;
        int nombreEvaluations = 0;

        for (List<Evaluation> evaluations : evaluationsParMatiere.values()) {
            for (Evaluation eval : evaluations) {
                somme += eval.getNote();
                nombreEvaluations++;
            }
        }

        if (nombreEvaluations == 0) {
            System.out.println("Aucune évaluation");
            return 0;
        }

        float moyenne = somme / nombreEvaluations;

        return moyenne;
    }

    public float calculerMoyenneMatiere(Matiere matiere) {
        List<Evaluation> evaluations = evaluationsParMatiere.get(matiere);
        if (evaluations == null || evaluations.isEmpty()) {
            System.out.println("Aucune évaluation pour la matière " + matiere.getNom());
            return 0;
        }

        float somme = 0;
        for (Evaluation eval : evaluations) {
            somme += eval.getNote();
        }

        return somme / evaluations.size();
    }

    public List<Evaluation> getEvaluationsParMatiere(Matiere matiere) {
        return evaluationsParMatiere.get(matiere);
    }
}