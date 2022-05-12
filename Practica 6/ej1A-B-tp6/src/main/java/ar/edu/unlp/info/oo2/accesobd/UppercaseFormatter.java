package ar.edu.unlp.info.oo2.accesobd;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class UppercaseFormatter extends SimpleFormatter{
	public String format(LogRecord record) {
		return super.format(record).toUpperCase();
	}
}
