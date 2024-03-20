package cons.cons_14.view;

import cons.cons_14.model.UserModel;

public class UserView {
    private UserModel model;

    public UserView(UserModel model) {
        this.model = model;
    }

    public void showUser() {
        System.out.println("UUID: " + model.getId());
        System.out.println("Login: " + model.getLogin());
        System.out.println("Password: " + "*".repeat((model.getPassword().length())));
    }

    public UserModel getModel() {
        return model;
    }

    public void setModel(UserModel model) {
        this.model = model;
    }
}
