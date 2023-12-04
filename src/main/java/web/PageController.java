package web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;


public class PageController {

    private static ArrayList<String> pages = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(PageController.class);

    static {
        pages.add("FirstQuestion.jsp");
        pages.add("losePage.jsp");
        pages.add("SecondQuestion.jsp");
        pages.add("ThirdQuestion.jsp");


    }
    public String call(String answer){

           if(pages.contains(answer)){
               LOGGER.warn("Redirect on {} page", answer);
               return answer;
           }else {
               LOGGER.warn("Redirect on Main.jsp page");
               return "Main.jsp";
           }
    }

}
