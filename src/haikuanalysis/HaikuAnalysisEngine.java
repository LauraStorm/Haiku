package haikuanalysis;

public class HaikuAnalysisEngine {
    public static char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y','æ', 'Æ', 'ø', 'Ø', 'å', 'Å'};

    //Check if haikuPoem is valid
    public boolean analyseHaiku(HaikuPoem currentPoem){
        String firstLine = currentPoem.getFirstLine();
        String secondLine = currentPoem.getSecondLine();
        String thirdLine = currentPoem.getThirdLine();

        if(hasLine5Vowels(firstLine) && hasLine7Vowels(secondLine) && hasLine5Vowels(thirdLine)){
            System.out.println("Well done with your haiku poem!");
            System.out.println();
            System.out.println("Here is your haiku poem:");
            System.out.println(currentPoem);
            return true;
        } else {
            System.out.println("Sorry - that is not a haiku poem!");
            return false;
        }
    }

    public boolean hasLine5Vowels (String line) {
        char[] lineAsArray = line.toCharArray();
        int vowelsCounter = 0;

        for (int i = 0; i < lineAsArray.length; i++) {
            char character = lineAsArray[i];
            for (int j = 0; j < vowels.length; j++) {
                if (character == vowels[j]){
                    vowelsCounter ++;
                }
            }
        }
        if (vowelsCounter == 5){
            return true;
        } else {
            return false;
        }
    }

    public boolean hasLine7Vowels(String line){
        char[] lineAsArray = line.toCharArray();
        int vowelsCounter = 0;

        for (int i = 0; i < lineAsArray.length; i++) {
            char character = lineAsArray[i];
            for (int j = 0; j < vowels.length; j++) {
                if (character == vowels[j]){
                    vowelsCounter ++;
                }
            }
        }
        if (vowelsCounter == 7){
            return true;
        } else {
            return false;
        }
    }

}
