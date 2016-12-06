package interlink.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @Column(name = "duration")
    Integer duration;

    @Column(name = "comm_id")
    Integer comm_id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tasksList")
    private List<Comments> comm = new ArrayList();
}
