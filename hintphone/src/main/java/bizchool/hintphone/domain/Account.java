package bizchool.hintphone.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Account {

    @Id @GeneratedValue
    @Column(name = "account_id")
    private Long id;

    private String username;

    private String password;

    @OneToOne(mappedBy = "account")
    private RoomEscape roomEscape;


}