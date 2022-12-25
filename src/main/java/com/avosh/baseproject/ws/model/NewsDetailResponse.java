package com.avosh.baseproject.ws.model;

public class NewsDetailResponse extends Response{
   private Page page;
   private String detail;

   public Page getPage() {
      return page;
   }

   public void setPage(Page page) {
      this.page = page;
   }

   public String getDetail() {
      return detail;
   }

   public void setDetail(String detail) {
      this.detail = detail;
   }
}
