package com.mitocode.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name = "signos")
public class Signos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSigno;

	@ManyToOne
	@JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "signos_paciente"))
	private Paciente paciente;
	
	// ISODate 2019-10-01T05:00:00.000
	@JsonSerialize(using = ToStringSerializer.class) 
	private LocalDateTime fecha;	
	
	@Column(name = "temperatura", nullable = false, length = 50)
	private String temperatura;
	
	@Column(name = "pulso", nullable = false, length = 50)
	private String pulso;
	
	@Column(name = "ritmo_respiratorio", nullable = false, length = 50)
	private String ritmo_respiratorio;

	public int getIdSigno() {
		return idSigno;
	}

	public void setIdSigno(int idSigno) {
		this.idSigno = idSigno;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getPulso() {
		return pulso;
	}

	public void setPulso(String pulso) {
		this.pulso = pulso;
	}

	public String getRitmo_respiratorio() {
		return ritmo_respiratorio;
	}

	public void setRitmo_respiratorio(String ritmo_respiratorio) {
		this.ritmo_respiratorio = ritmo_respiratorio;
	}
	
}
