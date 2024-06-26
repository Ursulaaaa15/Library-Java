package org.example.libraryjava.entity;

public class Genre {
    private Long id;
    private String title;

    public Genre(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "entity.Genre{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
