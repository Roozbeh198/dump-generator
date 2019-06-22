package com.roozbehahmadi.dumpgenerator;

import com.roozbehahmadi.dumpgenerator.model.Raml;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import org.apache.poi.ss.usermodel.*;

import javax.xml.bind.JAXB;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Raml raml = JAXB.unmarshal(new File("C:\\Users\\Hi\\IdeaProjects\\dump-generator\\src\\main\\resources\\dump-sample-01.xml"), Raml.class);
        System.out.println(raml.getCmData().getType());
        try {
            InputStream inp = new FileInputStream("C:\\Users\\Hi\\IdeaProjects\\dump-generator\\src\\main\\resources\\dump-input.xlsx");
            Workbook wb = WorkbookFactory.create(inp);
            Sheet sheet = wb.getSheetAt(0);
            Row row = sheet.getRow(2);
            Cell cell = row.getCell(0);
            System.out.println(cell.getStringCellValue());
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
            cfg.setDirectoryForTemplateLoading(new File("C:\\Users\\Hi\\IdeaProjects\\dump-generator\\src\\main\\resources"));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            cfg.setLogTemplateExceptions(false);
            cfg.setWrapUncheckedExceptions(true);
            Map root = new HashMap();
            root.put("sectorName",cell.getStringCellValue());
            Template temp = cfg.getTemplate("dump-sample-01.xml");
            Writer out = new OutputStreamWriter(System.out);
            temp.process(root, out);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
