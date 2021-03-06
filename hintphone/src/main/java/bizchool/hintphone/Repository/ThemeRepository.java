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

    public void save(Theme theme) {
        em.persist(theme);
    }

    public Theme findById(Long id) {
        return em.createQuery("select t from Theme t where t.id = :id", Theme.class)
                .setParameter("id", id)
                .getSingleResult();
    }


}
