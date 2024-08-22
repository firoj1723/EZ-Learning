package com.ezlearning.platform.dto;

import com.ezlearning.platform.auth.User;
import com.ezlearning.platform.model.Curso;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MatriculaDto {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha;
    private User user;
    private Curso curso;
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public MatriculaDto(Date fecha, User user, Curso curso) {
		super();
		this.fecha = fecha;
		this.user = user;
		this.curso = curso;
	}
	public MatriculaDto() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
