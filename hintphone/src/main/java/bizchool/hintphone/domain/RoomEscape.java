package bizchool.hintphone.domain;


import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class RoomEscape {

    @Id @GeneratedValue
    @Column(name = "roomEscape_id")
    private Long id;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "admin_id")
    private Account account;

    private String name;

    private String resetCode;

    @OneToMany
    private List<Theme> themes = new ArrayList<>();
}
