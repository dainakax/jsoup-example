package com.jsoupexample;

import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;

import java.io.IOException;

public class JSoupExample {

    public static void main(String[] args) {
        String webUrl = "https://www.google.com/";
        if (args.length > 0) {
            webUrl = args[0];
        }
        JSoupExample js = new JSoupExample();
        String webContent = js.getWebContent(webUrl);
        System.out.println("webContent=" + webContent);
    }

    public String getWebContent(String webUrl) {
        try {
            Document doc = Jsoup.connect(webUrl).get();
            return doc.title();
        }
        catch (IOException ioc) {
            ioc.printStackTrace();
        }
        return "";
    }
}
