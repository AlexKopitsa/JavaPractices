// Class work 8
// JavaLabs4 Task 6.1 

package org.Java_labs.lab8;
import java.util.*;
import java.util.concurrent.Flow;
import org.Java_labs.lab8.Flower;

public class Task6_1 {
    public static void main(String[] args) {
        List<Flower> flowers = new ArrayList<>();
        Accessories accessories = new Accessories(new String[]{"packaging", "bob", "paper"});
        flowers.add(new Flower(8, 1, accessories));
        flowers.add(new Flower(13, 5, accessories));
        flowers.add(new Flower(15, 3, accessories));
        flowers.add(new Flower(16, 2, accessories));
        flowers.add(new Flower(12, 3, accessories));
        Set<Integer> SetOfSpoils = new HashSet<>();
        for (Flower flower : flowers) {
            SetOfSpoils.add(flower.getLevelOfFreshness());
        }
        System.out.println(SetOfSpoils);
        List<Flower> sortedFlowerList = new ArrayList<>();
        for(int spoil : SetOfSpoils){
            List<Flower> currentStyle = new ArrayList<>();
            for(Flower flower:flowers){
                if (Objects.equals(flower.getLevelOfFreshness(), spoil)) {
                    currentStyle.add(flower);
                }
            }
            sortedFlowerList.addAll(currentStyle);
            currentStyle.clear();
        }
        System.out.println("Sorted by style Playlist");
        for (Flower flower : sortedFlowerList) {
            System.out.println(flower.toString());
        }
        System.out.println("\n\n\n" + "Flower with length from 13 to 16 \n\n\n");
        int min = 13, max = 16;
        for (Flower flower : sortedFlowerList) {
            if (flower.getLength() < max && flower.getLength() > min) {
                System.out.println(flower);
            }
        }
    }


}
