package ro.sci;

import ro.sci.controller.CauciucController;
import ro.sci.controller.LoginController;
import ro.sci.domain.Cauciuc;
import ro.sci.domain.LoginRequest;
import ro.sci.domain.SearchCauciucRequest;
import ro.sci.domain.User;


public class Main {

    public static void main(String[] args) {

        LoginController loginController = new LoginController();

        LoginRequest loginRequest = new LoginRequest("gigi", "alegeoaia");

        User result = loginController.handleLoginRequest(loginRequest);

        CauciucController cauciucController = new CauciucController();

        SearchCauciucRequest searchCauciucRequest = new SearchCauciucRequest("de vara", 22f);

        Cauciuc answer = cauciucController.handleSearchCauciucRequest(searchCauciucRequest);

        if (result != null) {
            System.out.println("autentificare cu succes");
        } else {
            System.out.println("mai incearca " + loginRequest.loginName);

        }
        if (answer != null) {
            System.out.println("rezultatul cautarii este");
        } else {
            System.out.println("nu exista acest tip de cauciuc" + searchCauciucRequest.type);
        }
    }
}
