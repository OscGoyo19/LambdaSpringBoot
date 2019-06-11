package com.example.goyo;

import java.io.Serializable;

public class Response implements Serializable {
	private int resultado;

	public Response() {
		super();
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

}
