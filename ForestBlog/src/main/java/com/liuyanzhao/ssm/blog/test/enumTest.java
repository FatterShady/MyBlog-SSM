package com.liuyanzhao.ssm.blog.test;

import com.liuyanzhao.ssm.blog.entity.Article;
import com.liuyanzhao.ssm.blog.enums.ArticleStatus;

/**
 * @author FatterShadystart
 * @create 2022-02-08 15:24
 */
public class enumTest {
    public static void main(String[] args){
        System.out.println(ArticleStatus.PUBLISH.getValue()+1);

    }
}
