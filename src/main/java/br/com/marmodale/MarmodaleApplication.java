package br.com.marmodale;

import br.com.marmodale.model.Category;
import br.com.marmodale.model.DayOfWeek;
import br.com.marmodale.model.Ingredient;
import br.com.marmodale.repository.CategoryRepository;
import br.com.marmodale.repository.IngredientRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class MarmodaleApplication implements CommandLineRunner {

	@Autowired
	private IngredientRepository ingredientRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(MarmodaleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category categoria = Category.builder().name("Sobremesa").build();

		Ingredient frango = Ingredient.builder()
				.name("Sagui")
				.category(categoria)
				.dataValidade(LocalDate.now())
				.dayOfWeekAvailables(Lists.newArrayList(DayOfWeek.SEGUNDA, DayOfWeek.QUINTA))
				.build();
		categoryRepository.save(categoria);
		ingredientRepository.save(frango);
	}
}
