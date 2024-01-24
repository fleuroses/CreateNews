package mynews;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CreateNews {
    public static void main(String[] args) {
        System.out.println("뉴스 API를 이용헤 News데이터를 데이터베이스에 입력하기");

        // 대문자 클래스 Class : 어떤 클래스의 정보를 가지고 있는 것

        Gson gson = new Gson();
        try {
            NewsConfig config = gson.fromJson(new FileReader("src/mynews/news_config.json"),
                    NewsConfig.class);
            System.out.println( config );
            String url = String.format("https://newsapi.org/v2/top-headlines?country=%s&category=%s&apiKey=%s",
                    config.country(), config.category(), config.key());

            NewsJasonParser newsClient = new NewsJasonParser();
            newsClient.loadFromUrl( url );


            //System.out.println( url );

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
