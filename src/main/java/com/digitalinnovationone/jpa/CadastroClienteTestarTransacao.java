package com.digitalinnovationone.jpa;

import com.digitalinnovationone.jpa.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastroClienteTestarTransacao {

    public static void main(String... string) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Cliente cliente = new Cliente();
        cliente.setNome("Victor");
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}

