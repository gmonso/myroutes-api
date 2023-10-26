package cat.udl.eps.softarch.myroutes.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.ZonedDateTime;

@Entity
@Data
public class Route extends UriEntity<Long>{

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String title;

    private String descrition;

    private String type;

    @NotEmpty
    private ZonedDateTime creationDate;

    @NotNull
    @ManyToOne
    private User createdBy;

}
