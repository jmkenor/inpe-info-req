package br.kenor.inpe.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.kenor.inpe.dto.CitiesDTO;
import br.kenor.inpe.service.RequestCitiesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Component
public class RequestCitiesJob {
	
	private final RequestCitiesService requestCitiesService;
	private final ObjectMapper mapper;

	@Scheduled(fixedRate = 60000)
    //@Scheduled(fixedRate = 86400000)
    public void scheduleFixedRateTaskAsync() {
        log.info("Job request list of cities.");
        CitiesDTO cities = requestCitiesService.getCitiesList();
        
        try {
        	String ret = mapper.writeValueAsString(cities.getCities());
			log.info(ret);
		} catch (JsonProcessingException e) {
			log.error(e.getMessage());
		}
    }
}
