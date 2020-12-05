package compositeid;

import java.io.Serializable;

import com.example.cinema.entity.Genre;
import com.example.cinema.entity.Movie;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class MovieGenreId implements Serializable{
	private static final long serialVersionUID = 1L;
	private Movie movie;
	private Genre genre;
}
