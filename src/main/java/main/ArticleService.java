package main;
/*
 * Created by Arimateia Pontes on 17/04/2020
 */

import model.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ArticleService {
    List<Article> articleList = new ArrayList<Article>(Arrays.asList(
            new Article(id: "1", name: "Article 01", description: "Description 01"),
            new Article(id: "2", name: "Article 02", description: "Description 02"),
            new Article(id: "3", name: "Article 03", description: "Description 03")
    ));

    public List<Article> getArticleList() {
        return articleList;
    }
}
