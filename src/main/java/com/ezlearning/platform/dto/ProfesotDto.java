package com.ezlearning.platform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfesotDto {
    private String nombre;
    private String apellido;
    private String correo;
    private String descripcion;
    private String imgurl;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public ProfesotDto(String nombre, String apellido, String correo, String descripcion, String imgurl) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.descripcion = descripcion;
		this.imgurl = imgurl;
	}
	public ProfesotDto() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
