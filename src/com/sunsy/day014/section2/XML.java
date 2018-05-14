package com.sunsy.day014.section2;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XML {

	public static List<Student> ReadXml() throws DocumentException {
		// 创建SaxReader对象
		SAXReader saxReader = new SAXReader();
		// 读取一个文件-->文档
		// .class拿到类的字节码，通过获取资源作为输入流，从类的根路径下去找这个文件
		Document document = saxReader.read(XML.class.getResourceAsStream("/student.xml"));
		// 获取document对象，dom所有信息
		// 获取根元素
		Element rootElement = document.getRootElement();
		// System.out.println(element.getName());
		// 获取根元素下的子元素
		List<Element> subElement = rootElement.elements();
		// System.out.println(subElement.size());
		
		List<Student> students = new ArrayList<Student>();
		for (Element element : subElement) {
			// 获取子元素的属性-->id属性
			Attribute idAttr = element.attribute("id");
			// 获取id属性值
			String id = idAttr.getValue();
			Student student = new Student();
			student.setId(id);
			// System.out.println(idAttr.getValue());
			// 获取子元素的子元素
			List<Element> studentInfoElements = element.elements();
			for (Element studentInfoElement : studentInfoElements) {
				String studentInfoTagName = studentInfoElement.getName();
				String studentInfoValue = studentInfoElement.getStringValue();
				System.out.print(studentInfoTagName + "-->" + studentInfoValue + ",");
				// 保存到map操作不简单，要遍历，遍历出来又是一个map，要多个map进行map.getkey，获取某个值
				// 保存到一个学生对象
				if (studentInfoTagName == "name") {
					student.setName(studentInfoValue);
				}
				if (studentInfoTagName == "age") {
					student.setAge(studentInfoValue);
				}
				if (studentInfoTagName == "gender") {
					student.setGender(studentInfoValue);
				}
				if (studentInfoTagName == "class") {
					student.setClassName(studentInfoValue);
				}
			}
			students.add(student);
			System.out.println();
		}
		return students;
	}

	public static void main(String[] args) throws DocumentException {
		List<Student> students = ReadXml();
		for (Student student : students) {
			System.out.println(student);
		}
		
	}
}
