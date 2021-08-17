package bizchool.hintphone.Repository;


import bizchool.hintphone.domain.Hint;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class HintRepository {
    private final EntityManager em;

    public void save(Hint hint) {
        em.persist(hint);
    }

    public Hint findById(Long id) {
        return em.createQuery("select h from Hint h where h.id = :id", Hint.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
