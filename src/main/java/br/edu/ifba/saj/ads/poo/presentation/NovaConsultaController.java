package br.edu.ifba.saj.ads.poo.presentation;

import java.time.LocalDateTime;

import br.edu.ifba.saj.ads.poo.model.Animal;
import br.edu.ifba.saj.ads.poo.model.Consulta;
import br.edu.ifba.saj.ads.poo.model.StatusConsulta;
import br.edu.ifba.saj.ads.poo.model.Veterinario;
import br.edu.ifba.saj.ads.poo.service.ConsultaService;
import br.edu.ifba.saj.ads.poo.service.RegraDeNegocioException;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;

public class NovaConsultaController {
	@FXML ChoiceBox<Veterinario> cbVeterinario; // faltou generic
	@FXML ChoiceBox<Animal> cbAnimal; // faltou generic
	@FXML DatePicker dpHora; // @FXML DateTimePicker dpHora;
	private ConsultaService consultaService = new ConsultaService(); // faltou
	@FXML
	public void salvar() {
		try {
			Animal animal = cbAnimal.getValue();
			Veterinario vet = cbVeterinario.getValue();
			LocalDateTime hora = dpHora.getValue(); // está assim na prova, mas dá erro

			consultaService.salvar(new Consulta(animal, vet, hora, null, StatusConsulta.AGENDADA), usuarioLogado); // está assim na prova mas dá erro
		} catch (RegraDeNegocioException e) {
			// mostrar alerta de erro
		}s
		// mostrar alerta de sucesso
	}
}
