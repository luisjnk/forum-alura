package br.com.alura.forum.controller.forms;

import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.CursoRepository;

public class TopicoForm {
	private  String titulo;
	private  String mensagem;
	private  String cursoName;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getCursoName() {
		return cursoName;
	}

	public void setCursoName(String cursoName) {
		this.cursoName = cursoName;
	}

	public Topico converter(CursoRepository repository) {
		Curso curso = repository.findByNome(this.getCursoName());
		return  new Topico(titulo,mensagem, curso);
	}
}
