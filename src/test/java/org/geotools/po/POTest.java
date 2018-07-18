package org.geotools.po;


import java.io.InputStream;

import org.geotools.po.PurchaseOrderType;
import org.geotools.po.bindings.POConfiguration;
import org.geotools.xml.Parser;

import junit.framework.TestCase;

public class POTest extends TestCase {
	public void test() throws Exception {
		String str = getClass().getName();
		InputStream input = getClass().getResourceAsStream("po.xml");
		POConfiguration configuration = new POConfiguration();

		Parser parser = new Parser(configuration);
		PurchaseOrderType po = (PurchaseOrderType) parser.parse(input);

		assertNotNull(po);
	}

}
