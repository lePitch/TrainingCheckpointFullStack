package com.fullcheckpoint.mrWhite.review;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fullcheckpoint.mrWhite.menu.Menu;
import com.fullcheckpoint.mrWhite.user.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="review_id")
    private Long id;

    @ManyToOne
    @JsonBackReference
    private User user;

    @ManyToMany(mappedBy = "reviews")
    private List<Menu> menu;

    private String description;
    private String score;

    public Review() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
