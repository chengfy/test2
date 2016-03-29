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
	        //����һ����д������document�������   
	        RtfWriter2.getInstance(document, new FileOutputStream("E:/test/�ɼ���.doc"));   
	        document.open();   
	        //������������   
	        BaseFont bfChinese = BaseFont.createFont("STSongStd-Light","UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);   
	        //����������   
	        Font titleFont = new Font(bfChinese,16,Font.BOLD);   
	        //����������   
	        Font contextFont = new Font(bfChinese,10,Font.NORMAL);   
	        //System.out.println("WORD====="+fileName);
	        Paragraph title = new Paragraph("�ɼ���");   
	        //���ñ����ʽ���뷽ʽ   
	        title.setAlignment(Element.ALIGN_CENTER);   
	        title.setFont(titleFont);   
	        document.add(title);
	      //����Table���,����һ��7�еı��   
	        Table table = new Table(7);   
	        int width[] = {10,16,15,10,16,15,18};//����ÿ�п�ȱ���   
	        table.setWidths(width);   
	        table.setWidth(90);//ռҳ���ȱ���   
	        table.setAlignment(Element.ALIGN_CENTER);//����   
	        table.setAlignment(Element.ALIGN_MIDDLE);//��ֱ����   
	        table.setAutoFillEmptyCells(true);//�Զ�����   
	        table.setBorderWidth(1);//�߿���   
	        Cell cell = new Cell();
	        cell.setVerticalAlignment(Element.ALIGN_CENTER);   
	        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);   
	        table.addCell(new Cell("����"));
	        table.addCell(new Cell("�˶�Ա����"));
	        table.addCell(new Cell("�˶�Ա����"));
	        table.addCell(new Cell("�Ա�"));
	        table.addCell(new Cell("�˶�Ա�ɼ�"));
	        table.addCell(new Cell("�Ƽ�¼����"));
	        table.addCell(new Cell("��������"));
	        for (int i = 0; i< 2; i++){            
	            table.addCell(new Cell("��"+(i+1)+"��"));            
	            table.addCell(new Cell("1"));
	            table.addCell(new Cell("1"));
	            table.addCell(new Cell("3"));
	            table.addCell(new Cell("1"));
	            table.addCell(new Cell("1"));   
	            table.addCell(new Cell("6"));   
	            table.addCell(new Cell("1"));   
	        }
	        document.add(table);
	        Paragraph bottomName1 = new Paragraph("�ܼ�¼��ǩ�֣�_________________");   
	        bottomName1.setAlignment(Element.ALIGN_LEFT);   
	        document.add(bottomName1);
	        Paragraph bottomName2 = new Paragraph("�ܲ��г�ǩ�֣�_________________");   
	        bottomName1.setAlignment(Element.ALIGN_LEFT);     
	        document.add(bottomName2);
	        document.close();
	}
		
	private static void t1() {
			Document document = new Document();

		try {

			// ������Ϊ AsianTest.pdf ���ĵ�
			PdfWriter.getInstance(document, new FileOutputStream(
					"e:/test/AsianTest.pdf"));

			/**
			 * �½�һ������,iText�ķ��� STSongStd-Light �����壬��iTextAsian.jar ����propertyΪ��׺
			 * UniGB-UCS2-H �Ǳ��룬��iTextAsian.jar ����cmapΪ��׺ H �������ְ�ʽ�� ��棬 ��Ӧ�� V
			 * ��������
			 */
			BaseFont bfChinese = BaseFont.createFont("STSongStd-Light",
					"UniGB-UCS2-H", false);

			Font bold_fontChinese = new Font(bfChinese, 12, Font.BOLD,
					Color.BLACK);
			Font italic_fontChinese = new Font(bfChinese, 12, Font.ITALIC,
					Color.BLACK);
			Font impressFont = new Font(bfChinese, 16, Font.BOLDITALIC,
					Color.BLACK);
			// ���ĵ�����Ҫд������
			document.open();

			// ����һ������
			// Paragraph par = new Paragraph("����", fontChinese);

			// document.add(par);
			//
			document.add(new Paragraph(" ", bold_fontChinese));
			document.add(new Paragraph(" ", bold_fontChinese));
			document.add(new Paragraph(" ", bold_fontChinese));
			String[] Trainspotting1 = { "2016��2��16�ա������`ͨ�Ťˤ��ȡ����`�� ѡ��������ѡ������ѡ��ְҵ��ѡ���ͥ��",
					"ѡ��ɶ�Ĵ�ʵ�,ѡ��ϴ�»����������������,", "ѡ�񽡿����͵��̴�����ҽ����,ѡ��¥���,",
					"ѡ���������,ѡ����װ�����������,ѡ����ڸ������������װ,",
					"ѡ���տ����ĵ���Ϸ��Ŀ,�߿��߳���ʳ����ѡ�����δ��,ѡ����������", "̫��ѡ��,��ѡ��ʲô,��ѡ��ѡ��" };
			String[] Trainspotting2 = { "���ǵ�Ӱ���»𳵡���ͷ���԰ס�", "����һ�����ڡ�ѡ�񡱵Ĺ��¡�" };
			String[] Benjamin1 = { "��Щ�˾��ںӱ߳�������,", "��Щ�˱��������,",
					"��Щ�˶��������ŷǷ����츳,", "��Щ����������,", "���˻���Ӿ,", "���˶�����Ŧ��,",
					"���˻ᱳɯʿ����,", "����Щ�ˡ�������ĸ��,", "Ҳ��Щ��,�����������衣",
					"Goodnight  Daisy", "Goodnight  Benjamin" };
			String[] Benjamin2 = { "���ǵ�Ӱ�����������桷��β���԰ס�", "����һ�����ڡ�������Ĺ��¡�" };
			String[] text1 = { "����˵���ǣ�", "����ѡ��ͬʱ�����Ǵ����" };
			String[] text2 = { "��ȥ�޿�ѡ���ѡ���ֻ�ѡ���ѡ��",
					"����Ȥ��һ���£�������(̫���)ѡ�����ǻ����ѡ��", "ͬʱ�������ֻ���ο��������" };
			String[] text3 = { "�ڿ�ʼ�ͽ���֮�䣬ѡ����ʲô���ֻ���ʲô���һ���֪����" };
			String[] text4 = { "���֪��ô��" };
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
					"by the way, some people can write code.��", impressFont));

			// Chapter
			Paragraph title1 = new Paragraph("Chapter 1", italic_fontChinese);
			Chapter chapter1 = new Chapter(title1, 1);
			chapter1.setNumberDepth(0);
			Paragraph title11 = new Paragraph(
					"This is Section 1 in Chapter 1����", italic_fontChinese);
			Section section1 = chapter1.addSection(title11);
			Paragraph someSectionText = new Paragraph(
					"This text comes as part of section 1 of chapter 1.");
			section1.add(someSectionText);
			someSectionText = new Paragraph("Following is a 3 X 2 table.");
			section1.add(someSectionText);
			//
			document.add(chapter1);
			//
			// ����һ��ͼƬ

			Image jpeg = Image.getInstance("E:/test/01.jpg");

			// ͼƬ����
			jpeg.setAlignment(Image.ALIGN_CENTER);
			document.add(jpeg);
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}

		// �رմ򿪵��ĵ�
		document.close();
	}
}
