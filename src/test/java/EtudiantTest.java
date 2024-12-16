import org.example.Etudiant;
import org.example.Matiere;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EtudiantTest {

    @Test
    void testAjouterEvaluationEtCalculerMoyenneGenerale() {
        Etudiant etudiant = new Etudiant("Alice", 2024);
        Matiere matiereMaths = new Matiere("MAT101", "Mathématiques");
        Matiere matierePhysique = new Matiere("PHY101", "Physique");

        assertEquals(0, etudiant.calculerMoyenneGenerale(), "La moyenne générale initiale doit être 0");

        etudiant.ajouterEvaluation(matiereMaths, 15.5f);
        etudiant.ajouterEvaluation(matiereMaths, 14.0f);

        float moyenneAttendueMaths = (15.5f + 14.0f) / 2;

        assertEquals(moyenneAttendueMaths, etudiant.calculerMoyenneMatiere(matiereMaths), 0.01, "Moyenne des mathématiques incorrecte");

        etudiant.ajouterEvaluation(matierePhysique, 12.0f);
        etudiant.ajouterEvaluation(matierePhysique, 16.0f);

        float moyenneGeneraleAttendue = (15.5f + 14.0f + 12.0f + 16.0f) / 4;

        assertEquals(moyenneGeneraleAttendue, etudiant.calculerMoyenneGenerale(), 0.01, "Moyenne générale incorrecte");
    }
}
