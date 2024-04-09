package org.example.libraryjava.entity;

import java.time.LocalDate;

public class Orders {
    private Long id;
    private Long bookIdFk;
    private Long userIdFk;
    private LocalDate orderDate;
    private LocalDate returnDate;

    public Orders(Long id, Long bookIdFk, Long userIdFk, LocalDate orderDate, LocalDate returnDate) {
        this.id = id;
        this.bookIdFk = bookIdFk;
        this.userIdFk = userIdFk;
        this.orderDate = orderDate;
        this.returnDate = returnDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookIdFk() {
        return bookIdFk;
    }

    public void setBookIdFk(Long bookIdFk) {
        this.bookIdFk = bookIdFk;
    }

    public Long getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(Long userIdFk) {
        this.userIdFk = userIdFk;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "entity.Orders{" +
                "id=" + id +
                ", bookIdFk=" + bookIdFk +
                ", userIdFk=" + userIdFk +
                ", orderDate=" + orderDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
