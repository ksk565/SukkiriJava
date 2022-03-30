package com.example.sample;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Section10_6 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("rpgsave.xml");
        Document doc = DocumentBuilderFactory.newInstance().
                newDocumentBuilder().parse(is);//手順１
        Element hero = doc.getDocumentElement();//手順２
        Element weapon = findChildByTag(hero,"weapon");
        Element power = findChildByTag(weapon,"power");
        String value = power.getTextContent();

    }
    //指定された名前を持つタグの最初の子タグを返す
    static Element findChildByTag(Element self,String name) throws Exception{
            NodeList children = self.getChildNodes();
            for(int i = 0; i < children.getLength(); i++){
                if(children.item(i) instanceof Element){
                    Element e = (Element) children.item(i);
                    if(e.getTagName().equals(name)){//引数のタグ名と参照
                        return e;
                    }
                }
            }
            return null;
        }
    }



