package com.kinoz.controller;

import com.kinoz.domain.ResponseResult;
import com.kinoz.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kinoz
 * @Date 2023/2/27 9:45
 * @apiNote
 */
@RestController
@RequestMapping("/article")
@CrossOrigin    //解决与前端的跨域问题
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /*@GetMapping("/list")
    public List<Article> test(){
        return articleService.list();
    }*/

    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList(){
        ResponseResult result = articleService.hotArticleList();
        return  result;
    }

    @GetMapping("/articleList")
    public ResponseResult articleList(Integer pageNum,Integer pageSize,Long categoryId){
        ResponseResult result = articleService.articleList(pageNum,pageSize,categoryId);
        return result;
    }
}
