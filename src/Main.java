public class Main {
    public static void main(String[] args) {
        DataModel model = new DataModel();
        ConsoleView view = new ConsoleView();
        DataPresenter presenter = new DataPresenter(model, view);

        model.set("Initial Data");
        presenter.show();
        presenter.getNewData();

        view.msg("Performing more operations...");
        presenter.getNewData();
    }
}
//i set up everything to show data and ask the user for input using the other classes