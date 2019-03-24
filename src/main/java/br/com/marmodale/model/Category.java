package br.com.marmodale.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Category is a group of ingredients.
 * @author - Gustavo Bezerra <gustavobz305@gmail.com>
*/
@Entity
@Data
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(max = 250, min = 3, message = "The name of ingredient needs to be more than 3 and less than 250")
    private String name;
}
