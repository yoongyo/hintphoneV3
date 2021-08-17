package bizchool.hintphone.Repository;


import bizchool.hintphone.domain.RoomEscape;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class RoomEscapeRepository {
    public final EntityManager em;


    public void save(RoomEscape roomEscape) {
        em.persist(roomEscape);
    }

//    public RoomEscape findRoomEscape() {
//        return em.createQuery("select r from RoomEscape r", )
//    }
}
