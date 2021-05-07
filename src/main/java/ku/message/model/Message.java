package ku.message.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Message {

    @Id
    @GeneratedValue
    private UUID id;

    private String user;
    private String text;
    private Instant createdAt;
}
