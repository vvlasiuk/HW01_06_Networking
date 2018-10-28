package com.example.android.newsapp.data;


public class Section {

    String sectionId;
    String webTitle;

    public Section(String sectionId, String webTitle) {
        this.sectionId = sectionId;
        this.webTitle = webTitle;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public void setWebTitle(String webTitle) {
        this.webTitle = webTitle;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionId='" + sectionId + '\'' +
                ", webTitle='" + webTitle + '\'' +
                '}';
    }
}
