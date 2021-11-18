package haikuanalysis;

public class HaikuPoem {
    private String author;
    private int haikuID;
    private String firstLine;
    private String secondLine;
    private String thirdLine;
    private static int counter = 0;

    //Constructor - tells what a HaikuPoem is
    public HaikuPoem(String author, String firstLine, String secondLine, String thirdLine) {
        this.author = author;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
        counter++;
        haikuID = counter;
    }
    //Getters
    public String getFirstLine(){
        return this.firstLine;
    }
    public String getSecondLine(){
        return this.secondLine;
    }
    public String getThirdLine(){
        return this.thirdLine;
    }



    //Lav en toString
    @Override
    public String toString() {
        return "Haiku poem by: " + author + ", ID number: " + haikuID +
                "\n"+ "\""+ firstLine + '\n' + secondLine + '\n' + thirdLine + "\"";

    }
}
