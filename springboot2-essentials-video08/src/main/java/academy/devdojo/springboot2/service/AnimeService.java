package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AnimeService {
    private List<Anime> animes = List.of(new Anime(1L, "Boku No Hero"), new Anime(2L, "Berserk"), new Anime(3L, "One Piece"), new Anime(4L, "Dragon Ball Z"));

    // private final AnimeRepository animeRepository;
    public List<Anime> listAll() {
        return animes;
    }

    public Anime findById(long id) {
        return animes.stream()   // Cria um stream a partir da lista de animes
                .filter(anime -> anime.getId().equals(id))   // Filtra os animes cujo ID é igual ao ID informado
                .findFirst()   // Retorna o primeiro anime encontrado que atende ao filtro
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));   // Se nenhum anime for encontrado, lança uma exceção indicando que o anime não foi encontrado
    }
}
