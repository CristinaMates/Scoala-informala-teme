package ro.sci.homework;

public class SortReps {

    private SalesRepresentative[] reps = new SalesRepresentative[3];

    /**
     * Created bubble sort method for sorting SalesRepresentatives array
     *
     * @param reps
     */
    public SalesRepresentative[] sort(SalesRepresentative[] reps) {

        for (int i = 0; i < reps.length - 1; i++) {
            for (int j = 0; j < reps.length - 1; j++) {
                if (reps[j].getRevenue() < reps[j + 1].getRevenue()) {
                    SalesRepresentative salerep = reps[j];
                    reps[j] = reps[j + 1];
                    reps[j + 1] = salerep;
                }
            }
        }
        return reps;
    }

}