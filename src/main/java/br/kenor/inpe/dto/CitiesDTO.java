package br.kenor.inpe.dto;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter @Setter
@ToString
@XmlRootElement(name="cidades")
@XmlAccessorType(XmlAccessType.FIELD)
public class CitiesDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6824495871793045233L;
	
	@XmlElement(name="cidade")
	CityDTO[] cities;
}
