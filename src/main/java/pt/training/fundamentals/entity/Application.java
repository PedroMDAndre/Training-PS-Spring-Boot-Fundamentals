package pt.training.fundamentals.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "application_id")
    private Long id;

    @Column(name = "app_name", nullable = false)
    private String name;

    @Column(length = 2000)
    private String description;

    private String owner;

    public Application(String name, String description, String owner) {
        this.name = name;
        this.description = description;
        this.owner = owner;
    }

}
