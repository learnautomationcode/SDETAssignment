package org.devlab.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.junit.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.jayway.jsonpath.JsonPath;

public class ReadTestData {

	public static String getTestDataFromXMLFile(String strXpath) {

		String env = System.getProperty("env");
		String valTobereturned = null;
		try {

			strXpath = "Automation/" + env + "/" + strXpath;
			File xmlfile = new File("src/test/resources/testdata/TestData.xml");

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(xmlfile);

			doc.getDocumentElement().normalize();

			XPath xPath = XPathFactory.newInstance().newXPath();

			NodeList nodelst = (NodeList) xPath.compile(strXpath).evaluate(doc, XPathConstants.NODESET);

			valTobereturned = nodelst.item(0).getTextContent();
		} catch (Exception e) {

			Assert.fail("exception occured while reading data from xml file: " + e.toString());
		}

		return valTobereturned;
	}

	public static String getTestdataFromJson(String jsonPath) {

		String valTobereturned = null;
		String env = System.getProperty("env");
		String jsn = getFileContent("src/test/resources/testdata/TestData.json");

		try {
			jsonPath = "$." + env + "." + jsonPath;
			valTobereturned = JsonPath.read(jsn, jsonPath);

		} catch (Exception e) {

			Assert.fail("Failed to read value from json file: " + e.toString());
		}

		return valTobereturned;
	}

	public static String getFileContent(String flepath) {
		String fleContent = "";
		try {

			File fle = new File(flepath);
			BufferedReader br = new BufferedReader(new FileReader(fle));
			String line = "";

			while (line != null) {
				line = br.readLine();
				fleContent = fleContent + "\n" + line;
			}

		} catch (Exception e) {
			Assert.fail("Failed to read the content of testdata file" + e.toString());
		}
		return fleContent;

	}

}
