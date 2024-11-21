

public class Main {
    public static void main(String[] args) {
        Matiere math = new Matiere("MATH101", "Mathématiques");
        Matiere physique = new Matiere("PHY101", "Physique");

        Etudiant alice = new Etudiant("Alice", 2023);
        Etudiant bob = new Etudiant("Bob", 2023);
        Etudiant claire = new Etudiant("Claire", 2023);

        alice.ajouterEvaluation(math, 15);
        alice.ajouterEvaluation(physique, 14);

        bob.ajouterEvaluation(math, 12);
        bob.ajouterEvaluation(physique, 13);

        claire.ajouterEvaluation(math, 18);
        claire.ajouterEvaluation(physique, 16);

        System.out.println("Moyenne en Mathématiques : " + math.calculerMoyenne());
        System.out.println("Moyenne en Physique : " + physique.calculerMoyenne());

        System.out.println("Moyenne générale de Alice : " + alice.calculerMoyenneGenerale());
        System.out.println("Moyenne générale de Bob : " + bob.calculerMoyenneGenerale());
        System.out.println("Moyenne générale de Claire : " + claire.calculerMoyenneGenerale());
    }
}
