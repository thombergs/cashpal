package nd.jar.springhexboot.adapter.out.persistence;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class EventEntity {
    @Id
    private Long id;

    private String name;

    private String description;

    @Column(name = "`from`")
    private String from;


}
