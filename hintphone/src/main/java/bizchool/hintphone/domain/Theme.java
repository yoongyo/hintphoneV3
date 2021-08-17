package bizchool.hintphone.domain;


import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class Theme {

    @Id @GeneratedValue
    @Column(name = "theme_id")
    private Long id;

    private String name;

    @ManyToOne(fetch = LAZY)
    private RoomEscape roomEscape;

    private int hintCount;

    private String enterKey;

    @OneToMany(mappedBy = "theme", cascade = CascadeType.ALL)
    private List<Hint> hints = new ArrayList<>();
}
