package com.acme.prime.eval.provider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.osgi.service.component.annotations.Component;

import com.acme.prime.eval.api.Eval;

import osgi.enroute.debug.api.Debug;
import parsii.eval.Parser;

/**
 * 
 */
@Component(name = "com.acme.prime.eval", property = { Debug.COMMAND_SCOPE + "=test", Debug.COMMAND_FUNCTION + "=eval" })
public class EvalImpl implements Eval {

	@Override
	public double eval(String expression) throws Exception {
		return Parser.parse(expression).evaluate();
	}

}
