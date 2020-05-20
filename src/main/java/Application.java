import controller.Converter;
import viewer.ConsoleView;

public class Application {

    public static void main(String[] args) {
        Converter converter = new Converter();
        ConsoleView consoleView = new ConsoleView();

        consoleView.listOfCompany(converter.getListOfCompany());

        consoleView.overdueSecurities(converter.getListOfCompany());

        consoleView.registAfter(converter.getListOfCompany());

        consoleView.getSecuritiesByCurrency(converter.getListOfCompany());

//c:/Users/JUVA/IdeaProjects/homework_java_3/src/main/java/test.json
    }
}
