import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatiereTest {

    @Test
    public void testAjouterEvaluationEtCalculerMoyenne() {
        Matiere matiere = new Matiere("MAT101", "Mathématiques");

        assertEquals(0, matiere.calculerMoyenne());

        matiere.ajouterEvaluation(15.5f);
        assertEquals(15.5f, matiere.calculerMoyenne());

        matiere.ajouterEvaluation(10.0f);
        matiere.ajouterEvaluation(20.0f);

        float moyenneAttendue = (15.5f + 10.0f + 20.0f) / 3;
        System.out.println(moyenneAttendue);
        System.out.println(matiere.calculerMoyenne());
        assertEquals(moyenneAttendue, matiere.calculerMoyenne());
    }
}
