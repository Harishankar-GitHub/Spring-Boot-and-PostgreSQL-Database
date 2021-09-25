package com.springbootandpostgresql.repository;

import com.springbootandpostgresql.entity.Stud;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentRepository {

    @PersistenceContext
    private EntityManager em;

    public Stud findById(int id) {
        return em.find(Stud.class, id);
    }

    public List<Stud> findAllStudents() {
        TypedQuery<Stud> namedQuery = em.createNamedQuery("find_all_students", Stud.class);
        return namedQuery.getResultList();
    }
}
