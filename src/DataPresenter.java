public class DataPresenter {
    private DataModel model;
    private ConsoleView view;

    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void upd(String d) {
        model.set(d);
        view.msg("data updated to: " + model.get());
    }

    public void show() {
        view.msg("current data: " + model.get());
    }

    public void getNewData() {
        view.msg("enter new data: ");
        String newData = view.in();
        upd(newData);
    }
}
//i set up methods to update data, show it, and get new data from the user