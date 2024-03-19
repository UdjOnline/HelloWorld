package l44_app_arch.mvc.views;

import l44_app_arch.mvc.controllers.FlatController;
import l44_app_arch.mvc.controllers.IFlatController;
import l44_app_arch.mvc.models.Flat;

import java.util.Scanner;

public class CLIView {
    private IFlatController flatController;

    public CLIView() {
        flatController = new FlatController();
    }

    public void startCommunication() {
        Scanner scanner= new Scanner(System.in);
        String cmd = scanner.nextLine();

        if (cmd.equals("add")) {
            //flatController.add(Flat flat);
        }
    }
}