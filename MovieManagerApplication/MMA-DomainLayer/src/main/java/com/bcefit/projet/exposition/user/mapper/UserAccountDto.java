package com.bcefit.projet.exposition.user.mapper;

import com.bcefit.projet.domain.user.GenreMovie;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * A DTO for the {@link com.bcefit.projet.domain.user.UserAccount} entity
 */
public class UserAccountDto implements Serializable {
    private final Set<GenreMovie> genreMovieSet;

    public UserAccountDto(Set<GenreMovie> genreMovieSet) {
        this.genreMovieSet = genreMovieSet;
    }

    public Set<GenreMovie> getGenreMovieSet() {
        return genreMovieSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccountDto entity = (UserAccountDto) o;
        return Objects.equals(this.genreMovieSet, entity.genreMovieSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreMovieSet);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "genreMovieSet = " + genreMovieSet + ")";
    }
}