// Class work 8
// JavaLabs4 Task 6.1 

package org.Java_labs.lab8;
import java.util.Arrays;
import java.util.Objects;

class Flower extends  FlowerLength {
    Accessories accessories;
    Flower (int stemLength, int levelOfFreshness, Accessories accessories) {
        this.stemLength = stemLength;
        this.levelOfFreshness = levelOfFreshness;
        this.accessories = accessories;
    }
    @Override
    public String toString() {
        float summ = this.getPrice() + this.accessories.getPrice();
        return "Flower {" + '\n' +
				"stemLength: " + this.stemLength + '\n' +
                "levelOfFreshness: " + this.levelOfFreshness + '\n' +
                "price of Flower: " + this.getPrice() + '\n' +
                "price of Accessories: =" + this.accessories.getPrice() + '\n' +
                "Summary: " + summ + '\n' + '}';
    }
    public float getPrice() {
        return (this.stemLength * 3 ) * (1.0F/ this.levelOfFreshness) + 27;
    }
}
class FlowerLength extends  FlowerSpoil{
    int stemLength;
    public void setLength (int stemLength) {
        this.stemLength = stemLength;
    }
    public int getLength() {
        return this.stemLength;
    }
}
class FlowerSpoil {
    int levelOfFreshness;
    public void setLevelOfFreshness(int levelOfFreshness) {
        this.levelOfFreshness = levelOfFreshness;
    }
    public int getLevelOfFreshness() {
        return this.levelOfFreshness;
    }
}
class Accessories {
    String[] accessories;
    Accessories(String[] accessories) {
        this.accessories = accessories;
    }
    public void setAccessories(String[] accessories) {
        this.accessories = accessories;
    }
    public String[] getAccessories() {
        return accessories;
    }
    public float getPrice(){
        float summ = 0;
        for (String accesory: accessories) {
            if (Objects.equals(accesory, "packaging")) {
                summ += 50;
            }
            if (Objects.equals(accesory, "bob")) {
                summ += 20;
            }
            if (Objects.equals(accesory, "paper")) {
                summ += 30;
            }
        }
        return summ;
	}
}

