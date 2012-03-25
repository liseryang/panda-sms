package org.mm.proxy;

import static com.jeecms.common.web.Constants.UTF8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RepeatTest {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
//		Map<String, Object> root = new HashMap<String, Object>();
//
//		root.put("repeat", new RepeatDirective());
//		File file = new File("test/templates/ht.html");
//		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(file), UTF8);
//		//new OutputStreamWriter(System.out)
//		FreeMarkertUtil.processTemplate("test/templates", "repeat.html",
//				"UTF-8", root, new OutputStreamWriter(System.out));
		BigDecimal test = new BigDecimal(0);
		test = test.add(new BigDecimal(8/13*100).setScale(2,BigDecimal.ROUND_HALF_UP));
			System.out.println(test);	

	}

}
