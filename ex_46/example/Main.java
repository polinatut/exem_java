package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем SessionFactory из hibernate.cfg.xml
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Добавление данных в базу
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            // Создаем объекты мобильных телефонов
            Phone phone1 = new Phone("Фирма 1", "Телефон 1", 2023, 6.8);
            Phone phone2 = new Phone("Фирма 2", "Телефон 2", 2022, 6.1);
            Phone phone3 = new Phone("Фирма 3", "Телефон 3", 2023, 6.5);
            Phone phone4 = new Phone("Фирма 4", "Телефон 4", 2022, 6.3);
            Phone phone5 = new Phone("Фирма 5", "Телефон 5", 2023, 6.7);
            Phone phone6 = new Phone("Фирма 6", "Телефон 6", 2022, 6.1);
            Phone phone7 = new Phone("Фирма 7", "Телефон 7", 2021, 6.6);
            Phone phone8 = new Phone("Фирма 8", "Телефон 8", 2023, 6.8);
            Phone phone9 = new Phone("Фирма 9", "Телефон 9", 2023, 6.7);
            Phone phone10 = new Phone("Фирма 10", "Телефон 10", 2022, 6.5);

            // Сохраняем данные в базу
            session.save(phone1);
            session.save(phone2);
            session.save(phone3);
            session.save(phone4);
            session.save(phone5);
            session.save(phone6);
            session.save(phone7);
            session.save(phone8);
            session.save(phone9);
            session.save(phone10);

            transaction.commit();
        }

        // Получение всех данных из базы
        try (Session session = sessionFactory.openSession()) {
            List<Phone> phones = session.createQuery("from Phone", Phone.class).list();
            phones.forEach(System.out::println);
        }

        // Закрытие фабрики сессий
        sessionFactory.close();
    }
}
