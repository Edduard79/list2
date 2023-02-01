import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tester {
    public Tester(){
    }
        public static void main(String[] args){

        List<Integer> divisorOf52 = Arrays.asList(1, 2, 4, 13, 26, 52);

        List<Integer> randomNumbers = new ArrayList<>(Arrays.asList(1, 60, 13, 12));

            System.out.println("First print of random numbers: " + randomNumbers);
            randomNumbers.addAll(divisorOf52);
            System.out.println("Second print: random + divisor " + randomNumbers + "\nLength of new random: " + randomNumbers.size());
            System.out.println("------------------------------------------------------------------------------");

         ListIterator<Integer> iterator =randomNumbers.listIterator();
         while(iterator.hasNext()) {
             int index = iterator.nextIndex();
             int value = iterator.next();
             for (int j = 0; j < index; j++) {
                 if (value == randomNumbers.get(j)) {
                     iterator.remove();
                 }
             }
         }
         System.out.println("Deduplicated list: " + randomNumbers + "\nLength of deduplicated list: " + randomNumbers.size());

          Collections.sort(randomNumbers, Collections.reverseOrder());

          System.out.println("Descending list: " + randomNumbers);





        }
}
