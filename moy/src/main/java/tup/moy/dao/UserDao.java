package tup.moy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tup.moy.models.User;

@Repository
@Transactional
public class UserDao implements UserDaoAble {

        @PersistenceContext
        private EntityManager entityManager;

        @Override
        public List<User> getAll() {
                String query = "from User FETCH ALL PROPERTIES";
                List<User> lista = null;
                try {
                        TypedQuery<User> typedQuery = entityManager.createQuery(query, User.class);
                        lista = typedQuery.getResultList();
                } catch (IllegalArgumentException e) {
                        System.out.println(e.toString());
                } catch (RuntimeException e) {
                        System.out.println(e.toString());
                }
                return lista;
        }

        @Override
        public User getById(Long id) {
                // TODO Auto-generated method stub
                return null;
        }

}
