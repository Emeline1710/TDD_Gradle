package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EtudiantTest {

    @Test
    public void testAjouterEvaluationEtCalculerMoyenneGenerale() {
        Etudiant etudiant = new Etudiant("Alice", 2024);
        Matiere matiereMaths = new Matiere("MAT101", "Mathématiques");
        Matiere matierePhysique = new Matiere("PHY101", "Physique");

        assertEquals(0, etudiant.calculerMoyenneGenerale());

        etudiant.ajouterEvaluation(matiereMaths, 15.5f);
        etudiant.ajouterEvaluation(matiereMaths, 14.0f);

        float moyenneAttendueMaths = (15.5f + 14.0f) / 2;
        System.out.println(moyenneAttendueMaths);
        System.out.println(etudiant.calculerMoyenneGenerale());
        assertEquals(moyenneAttendueMaths, etudiant.calculerMoyenneMatiere(matiereMaths));

        etudiant.ajouterEvaluation(matierePhysique, 12.0f);
        etudiant.ajouterEvaluation(matierePhysique, 16.0f);

        float moyenneGeneraleAttendue = (15.5f + 14.0f + 12.0f + 16.0f) / 4;
        System.out.println(moyenneGeneraleAttendue);
        System.out.println(etudiant.calculerMoyenneGenerale());
        assertEquals(moyenneGeneraleAttendue, etudiant.calculerMoyenneGenerale());
    }
}
