public class Main {
    public static void main(String[] args) {
        DataModel model = new DataModel();
        ConsoleView view = new ConsoleView();
        DataPresenter presenter = new DataPresenter(model, view);

        model.setData1("Initial Data 1");
        model.setData2("Initial Data 2");
        presenter.showData();
        presenter.updateData();

        view.msg("Performing more operations...");
        presenter.updateData();
    }
}

//i set up everything to show data and ask the user for input using the other classes