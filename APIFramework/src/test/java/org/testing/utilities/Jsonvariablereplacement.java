package org.testing.utilities;

import java.util.regex.Pattern;

public class Jsonvariablereplacement {
public static String jsonvariable(String body,String variablename,String variablevalue)
{
	body=body.replaceAll(Pattern.quote("{{"+variablename+"}}"), variablevalue);
	return body;
}
}
