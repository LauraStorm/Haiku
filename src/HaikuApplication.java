import data.HaikuWriter;
import haikuanalysis.HaikuAnalysisEngine;
import haikuanalysis.HaikuPoem;
import ui.Menu;

public class HaikuApplication {
    private final  Menu menu = new Menu();
    private final HaikuAnalysisEngine analysisEngine = new HaikuAnalysisEngine();
    private final HaikuWriter writer = new HaikuWriter();

    public static void main(String[] args) {
        HaikuApplication app = new HaikuApplication();

        //Welcome user
        app.menu.welcomeUser();

        //Use a loop - so you can create as many haiku as you want to
        while (true) {

            //Ask if user will create a haiku or quit the app
            int userChoice = app.menu.createHaikuOrQuit();

            if (userChoice == 1)  {

                //Ask for lines to create a Haiku Poem
                String firstLine = app.menu.askForFirstLine();
                String secondLine = app.menu.askForSecondLine();
                String thirdLine = app.menu.askForThirdLine();
                String author = app.menu.askForAuthor();
                HaikuPoem usersHaikuPoem = new HaikuPoem(author, firstLine, secondLine, thirdLine);

                //Check if haiku poem is valid
                boolean isHaikuValid = app.analysisEngine.analyseHaiku(usersHaikuPoem);

                //If haiku is valid add to txt file
                if (isHaikuValid == true) {
                    app.writer.saveHaikuPoemToFile(usersHaikuPoem);
                }
                System.out.println();

            } else if (userChoice == 2) {
                System.out.println("Bye - see you around");
                break;
            }
        }

    }
}
