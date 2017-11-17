package ro.sci.homework;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /**
         * Created a SortReps object
         */

        SortReps sr = new SortReps();

        /**
         * Created an object SalesRepresentative array for sorting representatives using bubble sort algorithm
         */

        SalesRepresentative[] reps = new SalesRepresentative[3];
        reps[0] = new SalesRepresentative("Jane", "Elle", 50, 3);
        reps[1] = new SalesRepresentative("Lucas", "Mike", 40, 6);
        reps[2] = new SalesRepresentative("Nancy", "Jordan", 45, 20);

        /**
         * Sorting the representatives array using bubble sort algorithm in a descending order
         */

        SalesRepresentative[] sortedReps = sr.sort(reps);

        /**
         * Printing the array in descending order after using the bubble sort algorithm
         */

        System.out.println("Sales representatives array in descending order: ");
        for (SalesRepresentative sortedRepresentatives : reps) {
            System.out.println(sortedRepresentatives);
        }

    }
}

