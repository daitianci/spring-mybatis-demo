package com.honor.mybatis.entity;

public class Order {
    private Integer id;

    private String orderName;

    private User user;

    private Student student;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderName() {

        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderName='" + orderName + '\'' +
                ", user=" + user +
                ", student=" + student +
                '}';
    }
}