package br.kenor.inpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import br.kenor.inpe.dto.CitiesDTO;
import reactor.core.publisher.Mono;

@Service
public class RequestCitiesService {
	
	@Autowired
	private WebClient webClient;

	/*public RequestCitiesService(WebClient.Builder webClientBuilder) {
		this.webClient = webClientBuilder.baseUrl(baseInpeUrl).build();
	}*/
	
	private Mono<ClientResponse> doRequestCitiesList() {

		String target = "/listaCidades";
		
		return webClient.get().uri(target).header(HttpHeaders.ACCEPT, MediaType.APPLICATION_XML_VALUE).exchange();
	}
	
	
	public CitiesDTO getCitiesList() {
		Mono<ClientResponse> clientResponse = doRequestCitiesList();
		
		return clientResponse.flatMap(res -> res.bodyToMono(CitiesDTO.class)).block();

	}

	
}
