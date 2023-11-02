package cat.udl.eps.softarch.myroutes.domain;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class RouteFollowed extends UriEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private ZonedDateTime date = ZonedDateTime.now();

    @NotBlank
    private String duration;

    @NotBlank
    private String levelUp;

    @NotBlank
    private String levelDown;

    @Override
    public Long getId() {
        return this.id;
    }

}