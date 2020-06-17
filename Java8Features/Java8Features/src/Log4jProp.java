import org.apache.log4j.Logger;

import java.io.*;

import java.util.*;

public class Log4jProp {

	static Logger log = Logger.getLogger(Log4jProp.class.getName());

	public static void main(String[] args){
		log.debug("Hello this is a debug message");
		log.info("Hello this is an info message");
	}
}
