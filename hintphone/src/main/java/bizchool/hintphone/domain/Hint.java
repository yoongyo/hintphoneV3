package bizchool.hintphone.domain;
import lombok.Getter;
import javax.persistence.*;
import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class Hint {

    @Id @GeneratedValue
    @Column(name = "hint_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    private Theme theme;

    private String textHint;

    private String subTextHint;
}
