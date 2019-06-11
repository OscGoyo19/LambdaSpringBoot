package com.example.goyo;

import java.util.function.Function;
import org.springframework.stereotype.Component;

@Component
public class myHandler implements Function<Request,Response> {

	@Override
	public Response apply(Request req) {
		Response resp = new Response();
		resp.setResultado(req.getNumberOne() + req.getNumberTwo());
		return resp;
	}
	
}
