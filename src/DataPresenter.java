public class DataPresenter {
    private DataModel model;
    private ConsoleView view;

    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void updateData() {
        String data1 = view.getDataInput("enter first data: ");
        model.setData1(data1);

        String data2 = view.getDataInput("enter second data: ");
        model.setData2(data2);

        view.msg("data updated: " + model.getData1() + ", " + model.getData2());
    }

    public void showData() {
        view.msg("current data: " + model.getData1() + ", " + model.getData2());
    }
}

//i set up methods to update data, show it, and get new data from the user