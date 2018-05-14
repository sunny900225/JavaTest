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
		// ����SaxReader����
		SAXReader saxReader = new SAXReader();
		// ��ȡһ���ļ�-->�ĵ�
		// .class�õ�����ֽ��룬ͨ����ȡ��Դ��Ϊ������������ĸ�·����ȥ������ļ�
		Document document = saxReader.read(XML.class.getResourceAsStream("/student.xml"));
		// ��ȡdocument����dom������Ϣ
		// ��ȡ��Ԫ��
		Element rootElement = document.getRootElement();
		// System.out.println(element.getName());
		// ��ȡ��Ԫ���µ���Ԫ��
		List<Element> subElement = rootElement.elements();
		// System.out.println(subElement.size());
		
		List<Student> students = new ArrayList<Student>();
		for (Element element : subElement) {
			// ��ȡ��Ԫ�ص�����-->id����
			Attribute idAttr = element.attribute("id");
			// ��ȡid����ֵ
			String id = idAttr.getValue();
			Student student = new Student();
			student.setId(id);
			// System.out.println(idAttr.getValue());
			// ��ȡ��Ԫ�ص���Ԫ��
			List<Element> studentInfoElements = element.elements();
			for (Element studentInfoElement : studentInfoElements) {
				String studentInfoTagName = studentInfoElement.getName();
				String studentInfoValue = studentInfoElement.getStringValue();
				System.out.print(studentInfoTagName + "-->" + studentInfoValue + ",");
				// ���浽map�������򵥣�Ҫ������������������һ��map��Ҫ���map����map.getkey����ȡĳ��ֵ
				// ���浽һ��ѧ������
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
