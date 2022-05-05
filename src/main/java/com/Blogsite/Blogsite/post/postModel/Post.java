package com.Blogsite.Blogsite.post.postModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String headline;
    private String text;
    private String imgUrl;
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date dateCreated;
    private int likes;
    private int dislikes;

    public Post(String headline, String text, String imgUrl) {
        this.headline = headline;
        this.text = text;
        this.imgUrl = imgUrl;
        this.likes = 0;
        this.dislikes = 0;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", headline='" + headline + '\'' +
                ", text='" + text + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
