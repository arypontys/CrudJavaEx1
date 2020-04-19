package main;

import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * Created by Arimateia Pontes on 17/04/2020
 */
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    public List<Article> getAllArticles()
    {
        return articleService.getAllArticles();
    }
}
