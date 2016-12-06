package interlink.model;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comments {

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "like")
    Boolean like;

    @Column(name = "movie_id")
    Integer movie_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", insertable = false, updatable = false)
    private Movie movie;

    public Comments() {
    }

    public Comments(Boolean like) {
        this.like = like;
    }
}
