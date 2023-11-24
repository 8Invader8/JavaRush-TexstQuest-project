package web;

public class AcceptService {

    public String call(String answer){

        String redirectURL;
        if("FirstPage".equals(answer)){
            redirectURL = "FirstPage.jsp";
        } else if ("SecondPage".equals(answer)) {
            redirectURL = "losePage.jsp";
        } else {
            redirectURL = "Main.jsp";
        }

        return redirectURL;
    }
}
