package compositeid;

import java.io.Serializable;

import com.example.cinema.entity.Auditorium;
import com.example.cinema.entity.Seat;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class SeatDetailId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Seat seat;
	private Auditorium auditorium;
}
