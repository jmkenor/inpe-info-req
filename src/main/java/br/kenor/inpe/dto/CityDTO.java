package br.kenor.inpe.dto;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter @Setter
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
public class CityDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 215314467556095482L;

	@XmlElement(name="nome")
	String name;
	
	@XmlElement(name="uf")
	String state;
	
	@XmlElement(name="id")
	int id;
	
}
