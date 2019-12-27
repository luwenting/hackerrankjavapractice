package hackerrankJavaPractise;

import java.util.BitSet;
import java.util.Scanner;

public class SolutionBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        BitSet bitSet1 = new BitSet(size);
        BitSet bitSet2 = new BitSet(size);

        String type = "";
        int i,j;
        int options= scanner.nextInt();
        while(options-- >0) {
            type=scanner.next();
            i=scanner.nextInt();
            j=scanner.nextInt();

            switch(type){
                case("AND"):
                    if(i==1){
                        bitSet1.and(bitSet2);
                    }else {
                        bitSet2.and(bitSet1);
                    }
                    break;
                case("OR"):
                    if(i==1){
                        bitSet1.or(bitSet2);
                    }else {
                        bitSet2.or(bitSet1);
                    }
                    break;
                case("XOR"):
                    if(i==1){
                        bitSet1.xor(bitSet2);
                    }else {
                        bitSet2.xor(bitSet1);
                    }
                    break;
                case("FLIP"):
                    if(i==1){
                        bitSet1.flip(j);
                    }else {
                        bitSet2.flip(j);
                    }
                    break;
                case("SET"):
                    if(i==1){
                        bitSet1.set(j);
                    }else {
                        bitSet2.set(j);
                    }
                    break;
            }
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
    }
}
