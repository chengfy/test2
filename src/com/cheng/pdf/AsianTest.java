package com.cheng.pdf;

/**
 * AsianTest.java
 */

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lowagie.text.Cell;
import com.lowagie.text.Chapter;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Section;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.rtf.RtfWriter2;

public class AsianTest {

	public static void main(String[] args) throws DocumentException, IOException {
		t2();
	}

	private static void t2() throws DocumentException, IOException {
		//chengfyqq
	        Document document = new Document(PageSize.A4);   
	        //建立一个书写器，与document对象关联   
	        RtfWriter2.getInstance(document, new FileOutputStream("E:/test/成绩单.doc"));   
	        document.open();   
	        //设置中文字体   
	        BaseFont bfChinese = BaseFont.createFont("STSongStd-Light","UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);   
	        //标题字体风格   
	        Font titleFont = new Font(bfChinese,16,Font.BOLD);   
	        //正文字体风格   
	        Font contextFont = new Font(bfChinese,10,Font.NORMAL);   
	        //System.out.println("WORD====="+fileName);
	        Paragraph title = new Paragraph("成绩单");   
	        //设置标题格式对齐方式   
	        title.setAlignment(Element.ALIGN_CENTER);   
	        title.setFont(titleFont);   
	        document.add(title);
	      //设置Table表格,创建一个7列的表格   
	        Table table = new Table(7);   
	        int width[] = {10,16,15,10,16,15,18};//设置每列宽度比例   
	        table.setWidths(width);   
	        table.setWidth(90);//占页面宽度比例   
	        table.setAlignment(Element.ALIGN_CENTER);//居中   
	        table.setAlignment(Element.ALIGN_MIDDLE);//垂直居中   
	        table.setAutoFillEmptyCells(true);//自动填满   
	        table.setBorderWidth(1);//边框宽度   
	        Cell cell = new Cell();
	        cell.setVerticalAlignment(Element.ALIGN_CENTER);   
	        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);   
	        table.addCell(new Cell("排名"));
	        table.addCell(new Cell("运动员号码"));
	        table.addCell(new Cell("运动员名称"));
	        table.addCell(new Cell("性别"));
	        table.addCell(new Cell("运动员成绩"));
	        table.addCell(new Cell("破纪录级别"));
	        table.addCell(new Cell("部门名称"));
	        for (int i = 0; i< 2; i++){            
	            table.addCell(new Cell("第"+(i+1)+"名"));            
	            table.addCell(new Cell("1"));
	            table.addCell(new Cell("1"));
	            table.addCell(new Cell("3"));
	            table.addCell(new Cell("1"));
	            table.addCell(new Cell("1"));   
	            table.addCell(new Cell("6"));   
	            table.addCell(new Cell("1"));   
	        }
	        document.add(table);
	        Paragraph bottomName1 = new Paragraph("总记录长签字：_________________");   
	        bottomName1.setAlignment(Element.ALIGN_LEFT);   
	        document.add(bottomName1);
	        Paragraph bottomName2 = new Paragraph("总裁判长签字：_________________");   
	        bottomName1.setAlignment(Element.ALIGN_LEFT);     
	        document.add(bottomName2);
	        document.close();
	}
		
	private static void t1() {
			Document document = new Document();

		try {

			// 生成名为 AsianTest.pdf 的文档
			PdfWriter.getInstance(document, new FileOutputStream(
					"e:/test/AsianTest.pdf"));

			/**
			 * 新建一个字体,iText的方法 STSongStd-Light 是字体，在iTextAsian.jar 中以property为后缀
			 * UniGB-UCS2-H 是编码，在iTextAsian.jar 中以cmap为后缀 H 代表文字版式是 横版， 相应的 V
			 * 代表竖版
			 */
			BaseFont bfChinese = BaseFont.createFont("STSongStd-Light",
					"UniGB-UCS2-H", false);

			Font bold_fontChinese = new Font(bfChinese, 12, Font.BOLD,
					Color.BLACK);
			Font italic_fontChinese = new Font(bfChinese, 12, Font.ITALIC,
					Color.BLACK);
			Font impressFont = new Font(bfChinese, 16, Font.BOLDITALIC,
					Color.BLACK);
			// 打开文档，将要写入内容
			document.open();

			// 插入一个段落
			// Paragraph par = new Paragraph("我们", fontChinese);

			// document.add(par);
			//
			document.add(new Paragraph(" ", bold_fontChinese));
			document.add(new Paragraph(" ", bold_fontChinese));
			document.add(new Paragraph(" ", bold_fontChinese));
			String[] Trainspotting1 = { "2016年2月16日、ロイター通信によると、オース 选择生命，选择工作，选择职业，选择家庭，",
					"选择可恶的大彩电,选择洗衣机、汽车、雷射碟机,", "选择健康、低胆固醇和牙医保险,选择楼宇按揭,",
					"选择你的朋友,选择套装、便服和行李,选择分期付款和三件套西装,",
					"选择收看无聊的游戏节目,边看边吃零食……选择你的未来,选择生命……", "太多选择,你选择什么,我选择不选择。" };
			String[] Trainspotting2 = { "这是电影《猜火车》开头的旁白。", "这是一个关于“选择”的故事。" };
			String[] Benjamin1 = { "有些人就在河边出生长大,", "有些人被闪电击中,",
					"有些人对音乐有着非凡的天赋,", "有些人是艺术家,", "有人会游泳,", "有人懂得做纽扣,",
					"有人会背莎士比亚,", "而有些人。。。是母亲,", "也有些人,可以翩翩起舞。",
					"Goodnight  Daisy", "Goodnight  Benjamin" };
			String[] Benjamin2 = { "这是电影《本杰明传奇》结尾的旁白。", "这是一个关于“错过”的故事。" };
			String[] text1 = { "我想说的是，", "我们选择，同时，我们错过。" };
			String[] text2 = { "抛去无可选择的选择，抑或不选择的选择，",
					"很有趣的一件事：当面临(太多的)选择，人们会如何选择；", "同时，人们又会如何看待错过。" };
			String[] text3 = { "在开始和结束之间，选择了什么，又会错过什么，我还不知道。" };
			String[] text4 = { "你会知道么？" };
			//
			for (String s : Trainspotting1) {
				document.add(new Paragraph(s, italic_fontChinese));
				document.add(new Paragraph(" ", italic_fontChinese));
			}
			for (String s : Trainspotting2) {
				document.add(new Paragraph(s, bold_fontChinese));
			}
			document.add(new Paragraph(" ", bold_fontChinese));
			document.add(new Paragraph(" ", bold_fontChinese));
			document.add(new Paragraph(" ", bold_fontChinese));
			for (String s : Benjamin1) {
				document.add(new Paragraph(s, italic_fontChinese));
				document.add(new Paragraph(" ", italic_fontChinese));
			}
			for (String s : Benjamin2) {
				document.add(new Paragraph(s, bold_fontChinese));
			}
			document.add(new Paragraph(" ", bold_fontChinese));
			document.add(new Paragraph(" ", bold_fontChinese));
			document.add(new Paragraph(" ", bold_fontChinese));
			for (String s : text1) {
				document.add(new Paragraph(s, bold_fontChinese));
			}
			document.add(new Paragraph(" ", bold_fontChinese));
			for (String s : text2) {
				document.add(new Paragraph(s, bold_fontChinese));
			}
			document.add(new Paragraph(" ", bold_fontChinese));
			for (String s : text3) {
				document.add(new Paragraph(s, bold_fontChinese));
			}
			document.add(new Paragraph(" ", bold_fontChinese));
			for (String s : text4) {
				document.add(new Paragraph(s, bold_fontChinese));
			}
			document.add(new Paragraph(" ", bold_fontChinese));
			//
			String[] end = { "Some people were born to sit by a river...",
					"Some get struck by light...",
					"Some have an ear for music...", "Some are artists...",
					"Some swim...", "Some know buttons...",
					"Some know Shakespeare...", "Some are mothers...",
					"And some people can dance..." };
			for (String s : end) {
				document.add(new Paragraph(s, bold_fontChinese));
			}
			document.add(new Paragraph(
					"by the way, some people can write code.你", impressFont));

			// Chapter
			Paragraph title1 = new Paragraph("Chapter 1", italic_fontChinese);
			Chapter chapter1 = new Chapter(title1, 1);
			chapter1.setNumberDepth(0);
			Paragraph title11 = new Paragraph(
					"This is Section 1 in Chapter 1中文", italic_fontChinese);
			Section section1 = chapter1.addSection(title11);
			Paragraph someSectionText = new Paragraph(
					"This text comes as part of section 1 of chapter 1.");
			section1.add(someSectionText);
			someSectionText = new Paragraph("Following is a 3 X 2 table.");
			section1.add(someSectionText);
			//
			document.add(chapter1);
			//
			// 定义一个图片

			Image jpeg = Image.getInstance("E:/test/01.jpg");

			// 图片居中
			jpeg.setAlignment(Image.ALIGN_CENTER);
			document.add(jpeg);
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}

		// 关闭打开的文档
		document.close();
	}
}
