package parser;

import java.io.IOException;

// Jsoup JAR 파일은 반드시 ClassPath에 들어가야 한다.
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Parser {

	public static void main(String[] args) {
		
		try {
			Document doc = Jsoup.connect("https://chunithm-net-eng.com/").get();
			System.out.println("Title: " + doc.title());
			
			System.out.println(doc.wholeText());
			
			/*
			Elements records = doc.getElementsByClass("player_rating");
			
			System.out.println(records.size());
			
			for (Element record : records) {
				System.out.println("fuck");
				String title = record.getElementsByClass("music_title").text();
				String score = record.getElementsByClass("text_b").text();
				System.out.println(title + " - " + score);
			}*/
			
		} catch (IOException e) {
			System.out.println("로그인을못해서 사이트 접속못함");
			e.printStackTrace();
		}
		
	}

}
