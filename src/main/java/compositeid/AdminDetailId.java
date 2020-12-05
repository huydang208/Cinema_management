package compositeid;

import java.io.Serializable;

import com.example.cinema.entity.Admin;
import com.example.cinema.entity.Facility;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class AdminDetailId implements Serializable {
	private static final long serialVersionUID = 1L;
	private Admin admin;
	private Facility facility;
}
