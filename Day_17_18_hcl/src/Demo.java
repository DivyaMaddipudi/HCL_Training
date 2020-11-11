import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Demo {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		
		//file loaded
		Document document = builder.parse("demo.xml");
		
		NodeList list = document.getElementsByTagName("person");
		
		for(int i=0;i<list.getLength();i++) {
			Node node = list.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				
				String id = element.getAttribute("id");

				NodeList nameList = element.getChildNodes();
				
				for(int j=0;j<nameList.getLength();j++) {
					Node node2 = nameList.item(j);
					if(node2.getNodeType() == Node.ELEMENT_NODE) {
						Element element2 = (Element) node2;
						
						System.out.println(element2.getTagName() + ":" + element2.getTextContent());
					}
				}
			}
			
		}
		
		
	}

}
