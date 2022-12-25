package com.avosh.baseproject.ws.model;

import java.util.Date;

public class PostResponse extends Response{
   private Page page;
   private String title;
   private String brif;
   private String detail;
   private Date dateTime;

   public Page getPage() {
      return page;
   }

   public void setPage(Page page) {
      this.page = page;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getBrif() {
      return brif;
   }

   public void setBrif(String brif) {
      this.brif = brif;
   }

   public String getDetail() {
      return detail;
   }

   public void setDetail(String detail) {
      this.detail = detail;
   }

   public Date getDateTime() {
      return dateTime;
   }

   public void setDateTime(Date dateTime) {
      this.dateTime = dateTime;
   }
}
