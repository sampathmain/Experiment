package com.apple.explore.experiment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XMLFileRead {
	private Document document;

	@BeforeTest
	public void setup() {
		try {
			File inputFile = new File("NewFile.xml");
			SAXReader reader = new SAXReader();
			document = reader.read(inputFile);

		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void teardown() {
		document = null;
	}

	// This test traverses the sub nodes of the xml tree given by xpath
	// @Test
	public void readXML() {

		System.out.println("Root element :"
				+ document.getRootElement().getName());

		List<Node> nodes = document.selectNodes("/treeNode/Phone");
		System.out.println("----------------------------");
		for (Node node : nodes) {
			System.out.println("\nCurrent Element :" + node.getName());

			System.out.println("Company in Korea : "
					+ node.selectSingleNode("korea").getText());
			System.out.println("Review : "
					+ node.selectSingleNode("washington").valueOf("@review"));
			System.out.println("Company in Canada : "
					+ node.selectSingleNode("canada").getText());
			System.out.println("Review : "
					+ node.selectSingleNode("cupertino").valueOf("@review"));

		}

	}

	// This test iterates through the elements of the root node
	// @Test
	public void iterateRootChildren() {
		Element root = this.document.getRootElement();
		Iterator elementIterator = root.elementIterator();
		while (elementIterator.hasNext()) {
			Element element = (Element) elementIterator.next();
			System.out.println(element.getName());
		}
	}

	// //This test iterates through the attributes of the given element
	// @Test
	public void iteratePhoneChildren() {
		Element root = this.document.getRootElement();
		Element phoneElem = (Element) root.selectSingleNode("Phone");
		Iterator attributeIterator = phoneElem.attributeIterator();
		while (attributeIterator.hasNext()) {
			Attribute attribute = (Attribute) attributeIterator.next();
			System.out.println(attribute.getData());
		}
	}

	@Test
	public void HTMLTableCreation() throws IOException {

		StringBuilder html = new StringBuilder();
		html.append("<!doctype html>\n");
		html.append("<html lang='en'>\n");

		html.append("<head>\n");
		html.append("<meta charset='utf-8'>\n");
		html.append("<title>Report of Reports</title>\n");
		html.append("</head>\n\n");

		html.append("<body>\n");
		html.append("<h1>List of Reports</h1>\n");
		// html.append("<ul>\n");
		// for (String report : reports) {
		// html.append("<table>" + report + "</table>");
		// }
		// html.append("<table>" + reports + "</table>");
		html.append("<table>");
		html.append("<table style=\"width:100%\"><tr><td>Jill</td><td>Smith</td> <td>50</td></tr><tr><td>Eve</td><td>Jackson</td> <td>94</td></tr></table>");
		html.append("</table>");
		
		// html.append("</ul>\n");
		html.append("</body>\n\n");

		html.append("</html>");

		File file = new File("/Users/QE/Desktop/test.html");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(html.toString());
		bw.close();
	}

}
