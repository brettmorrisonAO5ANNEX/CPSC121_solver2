import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class Solve {
    private static final int JUMP = 2;
    private static int currInd;
    private static List<Integer> people = new ArrayList<>();

    public static void solve(int nComp, int posInit) {
        try {
            solver(nComp, posInit);
        } catch (Exception e) {
            System.out.println("position not possible: there are fewer people than the provided position");
        }
    }

    private static void solver(int nComp, int posInit) throws Exception {
        //create arrayList containing pos of people
        int numPeople = (int) pow(2, nComp);
        for (int i=1; i<=numPeople; i++) {
            people.add(i);
        }
        //check if given posInit is not possible given the number of people
        if (posInit > people.size()) {
            throw new Exception();
        } else {
            currInd = posInit - 1;
        }
        //iterate through people, removing numPeople-1 people and updating currIndex and currSum
        for (int r=1; r<numPeople; r++) {
            //max position in circle
//            int maxPos = Collections.max(people);
            //from current position, move by jump-1, if out of bounds, transfer to equivalent pos
            //from beginning from positions
            int maxInd = people.size()-1;
            int removeInd;
            if (currInd + (JUMP-1) > maxInd) {
                removeInd = currInd + (JUMP-1) - maxInd - 1;
            } else {
                removeInd = currInd + (JUMP-1);
            }
            //remove removePos from people
//            people.remove(removeInd);
            //update currPos
            if (removeInd + 1 > maxInd) {
                currInd = 0;
            } else {
                currInd = removeInd;
            }
            people.remove(removeInd);
        }
        System.out.println(people);
    }
}