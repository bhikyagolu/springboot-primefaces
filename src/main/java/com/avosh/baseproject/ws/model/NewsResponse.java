package com.avosh.baseproject.ws.model;

import java.util.List;

public class NewsResponse extends Response {
    private Page page;
    private List<News> news;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
