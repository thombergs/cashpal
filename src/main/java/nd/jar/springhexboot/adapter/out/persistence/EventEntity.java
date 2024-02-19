package nd.jar.springhexboot.adapter.out.persistence;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class EventEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @Column(name = "`from`")
    private String from;


}
