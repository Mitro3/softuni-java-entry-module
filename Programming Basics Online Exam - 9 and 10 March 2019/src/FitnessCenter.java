import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int visitorsCount = Integer.parseInt(scanner.nextLine());

        int trainingBack = 0;
        int trainingChest = 0;
        int trainingLegs = 0;
        int trainingAbs = 0;
        int boughtProteinShake = 0;
        int boughtProteinBar = 0;

        for (int i = 0; i < visitorsCount; i++) {
            String fitnessActivity = scanner.nextLine();

            switch (fitnessActivity) {
                case "Back":
                    trainingBack++;
                    break;
                case "Chest":
                    trainingChest++;
                    break;
                case "Legs":
                    trainingLegs++;
                    break;
                case "Abs":
                    trainingAbs++;
                    break;
                case "Protein shake":
                    boughtProteinShake++;
                    break;
                case "Protein bar":
                    boughtProteinBar++;
            }
        }

        double percentVisitorsTraining = 100.0 * (trainingBack + trainingChest + trainingLegs + trainingAbs) / visitorsCount ;
        double percentVisitorsProtein = 100.0 * (boughtProteinShake + boughtProteinBar) / visitorsCount;
//        Ред 1 -	"{брой хора трениращи гръб} - back"
//Ред 2 -	"{брой хора трениращи гърди} - chest"
//Ред 3 -	"{брой хора трениращи крака} - legs"
//Ред 4 -	"{брой хора трениращи коремни мускули} - abs"
//Ред 5 -	"{брой хора закупили протеинов шейк} - protein shake"
//Ред 6 -	"{брой хора закупили протеинов блок} - protein bar"
//Ред 7 -	"{процент на хората дошли да тренират}% - work out"
//Ред 8 -	"{процент на хората дошли да купят протеин}% - protein"
//Всички проценти трябва да са форматирани до втората цифра след десетичния знак.

        System.out.printf("%d - back%n", trainingBack);
        System.out.printf("%d - chest%n", trainingChest);
        System.out.printf("%d - legs%n", trainingLegs);
        System.out.printf("%d - abs%n", trainingAbs);
        System.out.printf("%d - protein shake%n", boughtProteinShake);
        System.out.printf("%d - protein bar%n", boughtProteinBar);
        System.out.printf("%.2f%% - work out%n", percentVisitorsTraining);
        System.out.printf("%.2f%% - protein", percentVisitorsProtein);
    }

}

