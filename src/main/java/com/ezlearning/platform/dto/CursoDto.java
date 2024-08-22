package com.ezlearning.platform.dto;

import com.ezlearning.platform.model.Profesor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CursoDto {
    private String nomCurso;
    private String descCurso;
    private String dificultad;
    private String detalle;
    private String url;
    private String imgurl;
    private Profesor profesor;
	public String getNomCurso() {
		return nomCurso;
	}
	public void setNomCurso(String nomCurso) {
		this.nomCurso = nomCurso;
	}
	public String getDescCurso() {
		return descCurso;
	}
	public void setDescCurso(String descCurso) {
		this.descCurso = descCurso;
	}
	public String getDificultad() {
		return dificultad;
	}
	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public CursoDto(String nomCurso, String descCurso, String dificultad, String detalle, String url, String imgurl,
			Profesor profesor) {
		super();
		this.nomCurso = nomCurso;
		this.descCurso = descCurso;
		this.dificultad = dificultad;
		this.detalle = detalle;
		this.url = url;
		this.imgurl = imgurl;
		this.profesor = profesor;
	}
	public CursoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
