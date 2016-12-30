package com.gg.transaction;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Stateless
public class Ejb {

	@PersistenceContext
	private EntityManager em;

	public <T> void setData(T entity) {
		em.persist(entity);
	}

	public <T> List<T> getEntities(Class<T> c) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(c);
		Root<T> from = cq.from(c);
		cq.select(from);
		TypedQuery<T> q = em.createQuery(cq);

		return q.getResultList();
	}

	public <T> T getEntityById(int id, Class<T> t) {
		return em.find(t, id);
	}
}
