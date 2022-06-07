package eu.mageintraining.scraper;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Scraper {

    public static void main(String[] args) {
        System.out.print("Hello World!");
        String baseUrl = "https://news.ycombinator.com/" ;
        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);
        try{
            HtmlPage page = client.getPage(baseUrl);
            System.out.println(page.asXml());
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
