package com.avosh.baseproject.ws.model;

public class Page {
    private Long count;
    private Long page;
    private Long perPage;
    private Long TotalPage;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPerPage() {
        return perPage;
    }

    public void setPerPage(Long perPage) {
        this.perPage = perPage;
    }

    public Long getTotalPage() {
        return TotalPage;
    }

    public void setTotalPage(Long totalPage) {
        TotalPage = totalPage;
    }
}
