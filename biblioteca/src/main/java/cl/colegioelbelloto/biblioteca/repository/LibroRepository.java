package cl.colegioelbelloto.biblioteca.repository;

import cl.colegioelbelloto.biblioteca.model.Libro;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    Optional<Libro> findById(Long aLong);
}