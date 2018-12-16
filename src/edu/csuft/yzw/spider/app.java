package edu.csuft.yzw.spider;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 程序的入口
 * 
 * @author dell
 *
 */

/**
 * 
 * 影片名称
 *
 */
String title;
/**
 * 
 * 相关信息
 *
 */
String info;
/**
 * 
 * 评分
 *
 */
double dating;
/*
 *评分人数 
 */
int num;
/**
 * 
 * 排名
 *
 */
int id；
/**
 * 
 * 海报
 *
 */
String poster；
/**
 * 
 * 短评
 *
 */
String quote；


public class app {
//alt+/
	public static void main(String[] args) {
		//目标URL
		String url ="http://movie.douban.com/top250";
		try{
		//使用jsoup抓取文档
	Document doc = Jsoup.connect(url).get();
	Elements es = doc.select(".grid_view .item");
	System.out.println(es.size());
	//创建一个存储影片的列表
	ArrayList<film>list = new ArrayList<>();
	for (Element e :es){
		//每一部影片
		Element t = e.select(".title").first();
		String num = e.select(".star span").last().text();
		System.out.println(t.text());
	}
	
	
//	String title = doc.title();
//	String data =doc.data();
//	
//	System.out.println(title);
//	System.out.println(data);
		}		catch (IOException e){
			//TODO Auut--generated catch block
			e.printStackTrace();
			
		}
	}
}
