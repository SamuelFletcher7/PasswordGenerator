import java.util.Random;
//14chars, 1cap 1low 1num 1symbol
public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        //randomise minimum required components
        int cap = rand.nextInt(91-65)+65;
        int low = rand.nextInt(123-97)+97;
        int num = rand.nextInt(58-48)+48;
        int sym = rand.nextInt(33);
        if(sym>16 && sym<=23){sym += 10;}
        else if (sym>23 && sym<=29) {sym += 36;}
        else if (sym>30) {sym += 62;}
        sym += 32;
        //convert to character
        char charNum = (char)num;
        char charCap = (char)cap;
        char charLow = (char)low;
        char charSym = (char)sym;
        //creating unsorted list
        char[] unsorted;
        unsorted = new char[14];
        unsorted[0] = charNum;
        unsorted[1] = charCap;
        unsorted[2] = charLow;
        unsorted[3] = charSym;
        int i=4;
        while (i!=14){
            int randInt = rand.nextInt(126-33)+33;
            char randChar = (char)randInt;
            unsorted[i] = randChar;
            i += 1;
        }
        System.out.println(String.valueOf(unsorted));

        shuffleArray(unsorted);

        //output
        System.out.println(String.valueOf(unsorted));
    }
    // shuffle
    static void shuffleArray(char[] ar) {
        Random rand = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rand.nextInt(i + 1);
            char a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}