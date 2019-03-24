package br.com.marmodale.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

/**
 * Class for represent an ingredient
 * @author - Gustavo Bezerra <gustavobz305@gmail.com>
*/
@Entity
@Data
@Builder
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(max = 250, min = 3, message = "The name of ingredient needs to be more than 3 and less than 250")
    private String name;
    @NotNull
    private LocalDate dataValidade;
    @OneToOne
    @NotNull
    private Category category;
    @ElementCollection(targetClass = DayOfWeek.class)
    @Enumerated(EnumType.STRING)
    private List<DayOfWeek> dayOfWeekAvailables;
}
