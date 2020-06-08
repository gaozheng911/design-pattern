package com.gz.template;

/**
 * @author:gaozheng
 * @createTime:2020/5/28
 * @desc:
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
