package ru.my.cinema.repository;

import org.springframework.stereotype.Repository;
import org.sql2o.Sql2o;
import ru.my.cinema.model.FilmSession;

import java.util.Collection;
import java.util.Optional;

/**
 * 3. Мидл
 * 3.2. Web
 * 3.2.9. Контрольные вопросы
 * 2. Сервис - Кинотеатр [#504869 #293473]
 * Sql2oFilmSessionRepository хранилище сеансов фильмов в базе данных.
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 15.02.2023
 */
@Repository
public class Sql2oFilmSessionRepository implements FilmSessionRepository {
    private final Sql2o sql2o;

    public Sql2oFilmSessionRepository(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    /**
     * Вернуть сеанс по Id
     *
     * @param sessionId Int
     * @return FilmSessions
     */
    @Override
    public Optional<FilmSession> getFilmSessionById(int sessionId) {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery("SELECT * FROM film_sessions WHERE id = :sessionId")
                    .addParameter("sessionId", sessionId);
            var filmSession = query.setColumnMappings(FilmSession.COLUMN_MAPPING)
                    .executeAndFetchFirst(FilmSession.class);
            return Optional.ofNullable(filmSession);
        }
    }

    /**
     * Вернуть все сеансы по ID фильма, сортировка по времени сеанса.
     *
     * @param filmId Int.
     * @return Collection<FilmSession>
     */
    @Override
    public Collection<FilmSession> getFilmSessionByFilmId(int filmId) {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery(
                            "SELECT * FROM film_sessions WHERE film_id = :filmId ORDER BY start_time")
                    .addParameter("filmId", filmId);
            return query.setColumnMappings(FilmSession.COLUMN_MAPPING)
                    .executeAndFetch(FilmSession.class);
        }
    }

    /**
     * Вернуть все сеансы, сортировка по времени начала сеанса.
     *
     * @return Collection<FilmSession>
     */
    @Override
    public Collection<FilmSession> getAllFilmSession() {
        try (var connection = sql2o.open()) {
            var query = connection.createQuery("SELECT * FROM film_sessions ORDER BY start_time");
            return query.setColumnMappings(FilmSession.COLUMN_MAPPING)
                    .executeAndFetch(FilmSession.class);
        }
    }
}
