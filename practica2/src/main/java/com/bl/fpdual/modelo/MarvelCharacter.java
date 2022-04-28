package com.bl.fpdual.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Type;

@Entity(name = "marvel_character")
public class MarvelCharacter {
	
	@Id
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "FIRST_NAME")
	private String first_name;
	@Column(name = "LAST_NAME")
	private String last_name;
	// Ojo Type es anotación propia de Hibernate
	@Type( type="yes_no")
	@Column(name = "ES_CHUNGO")
	private boolean es_chungo;
	
	public MarvelCharacter() {
		
	}
	
	public MarvelCharacter(String string, String string2, String string3, boolean b) {
		this.name = string;
		this.first_name = string2;
		this.last_name = string3;
		this.es_chungo = b;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public boolean getEs_chungo() {
		return es_chungo;
	}
	public void setEs_chungo(boolean es_chungo) {
		this.es_chungo = es_chungo;
	}
	@Override
	public String toString() {
		return "MarvelCharacter [name=" + name + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", es_chungo=" + es_chungo + "]";
	}
	
}
