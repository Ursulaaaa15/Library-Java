package org.example.libraryjava.entity;

import java.time.LocalDate;

public class Book {
    private Long id;
    private Long authorIdFk;
    private LocalDate yearOfPublication;
    private Long genreIdFk;
    private Integer ageLimit;

    public Book(Long id, Long authorIdFk, LocalDate yearOfPublication, Long genreIdFk, Integer ageLimit) {
        this.id = id;
        this.authorIdFk = authorIdFk;
        this.yearOfPublication = yearOfPublication;
        this.genreIdFk = genreIdFk;
        this.ageLimit = ageLimit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuthorIdFk() {
        return authorIdFk;
    }

    public void setAuthorIdFk(Long authorIdFk) {
        this.authorIdFk = authorIdFk;
    }

    public LocalDate getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(LocalDate yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Long getGenreIdFk() {
        return genreIdFk;
    }

    public void setGenreIdFk(Long genreIdFk) {
        this.genreIdFk = genreIdFk;
    }

    public Integer getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }

    @Override
    public String toString() {
        return "entity.Book{" +
                "id=" + id +
                ", authorIdFk=" + authorIdFk +
                ", yearOfPublication=" + yearOfPublication +
                ", genreIdFk=" + genreIdFk +
                ", ageLimit=" + ageLimit +
                '}';
    }
}
