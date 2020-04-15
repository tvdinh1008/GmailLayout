package com.example.gmaillayout;

public class EmailModel {
    String fullname;
    String subject;
    String content;
    String time;
    boolean isSelected;
    int color;

    public EmailModel(String fullname,String subject, String content, String time) {
        this.fullname = fullname;
        this.subject=subject;
        this.content = content;
        this.time = time;
        this.isSelected=false;
        color=-1;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
