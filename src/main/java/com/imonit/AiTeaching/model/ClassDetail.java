package com.imonit.AiTeaching.model;

/**
 * @author bin
 * 2019/5/19
 */
public class ClassDetail {
    private String model;
    private String first_category;
    private String second_category;
    private String class_name;
    private String difficulty;
    private String chapter;
    private String period;
    private String knowledge_no;
    private String knowledge_block;
    private String state;
    private String intent;
    private String user_answer;
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void setFirst_category(String first_category) {
        this.first_category = first_category;
    }
    public String getFirst_category() {
        return first_category;
    }

    public void setSecond_category(String second_category) {
        this.second_category = second_category;
    }
    public String getSecond_category() {
        return second_category;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }
    public String getClass_name() {
        return class_name;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public String getDifficulty() {
        return difficulty;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }
    public String getChapter() {
        return chapter;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
    public String getPeriod() {
        return period;
    }

    public void setKnowledge_no(String knowledge_no) {
        this.knowledge_no = knowledge_no;
    }
    public String getKnowledge_no() {
        return knowledge_no;
    }

    public void setKnowledge_block(String knowledge_block) {
        this.knowledge_block = knowledge_block;
    }
    public String getKnowledge_block() {
        return knowledge_block;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }
    public String getIntent() {
        return intent;
    }

    public void setUser_answer(String user_answer) {
        this.user_answer = user_answer;
    }
    public String getUser_answer() {
        return user_answer;
    }
}
