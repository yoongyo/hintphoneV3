package bizchool.hintphone.Repository;


import bizchool.hintphone.domain.Theme;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ThemeRepository {

    private final EntityManager em;

    public List<Theme> findAll() {
        return em.createQuery("select m from Theme m", Theme.class).getResultList();
    }
}
