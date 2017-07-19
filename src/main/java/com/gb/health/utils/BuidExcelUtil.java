package com.gb.health.utils;

import net.sf.json.JSONObject;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;

import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @author cat
 *
 */
public final class BuidExcelUtil {
	
	/**
	 * 
	 * @param beanList 需要生成表格的对象的集合,不可为空集合。
	 * @param tableName  指定生成表格的表名，可以为空。
	 * @param f_out  文件输出流
	 */
	 
	public void write(List<LinkedHashMap<String,String>> beanList,String tableName,OutputStream f_out){
		
		//首先判断需要生成表格的集合是否为空，为空则抛出异常。
		if (beanList==null || beanList.size()<=0) {
			LinkedHashMap<String, String> err=new LinkedHashMap<String, String>();
			err.put("没有数据", "没有数据");
			beanList.add(err);
		}
		
		HSSFWorkbook wb=new HSSFWorkbook();
		
		//判断是否设置表名，若没有则给出默认值。
		if (tableName==null) {
			tableName="Excel表格";
		}
		
		HSSFSheet sheet=wb.createSheet(tableName);
		
		HSSFRow row=sheet.createRow(0);
		
        HSSFCellStyle style = wb.createCellStyle();  
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 默认设置单元格居中
        
        //获取传进集合中对象的所有属性名。
        Set<String> set=beanList.get(0).keySet();
        Object[] allFieldName=set.toArray();
        
        //根据其所有属性设置表头。
        setTableHeader(allFieldName, row, style);
        
        //由于此时已可以确定设置好了表头，则表格从第二行开始设定数据
        for (int i = 0; i < beanList.size(); i++) {
        	
        	HSSFRow row_temp=sheet.createRow(i+1);
        	
        	Map valueMap=beanList.get(i);
        		
    		for (int j = 0; j < allFieldName.length; j++) {
    			String s="";
    			Object obj=null;
    			try{
    				obj=allFieldName[j];
        		    s=valueMap.get(obj).toString();
        			row_temp.createCell(j).setCellValue(s);
    			}catch(NullPointerException e){
    				System.out.print(obj+"="+s+"...");
    				System.out.println(valueMap);
    			}
			}
				
        	row_temp=null;
        	
		}
        
        try {
			wb.write(f_out);
			
			f_out.close();
			
			wb.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Deprecated
	private String getCellValue(Cell cell) {
        if (cell.getCellType() == cell.CELL_TYPE_BOOLEAN) {
            
            return String.valueOf(cell.getBooleanCellValue());
        } else if (cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
            
            return String.valueOf(cell.getNumericCellValue());
        } else {
            
            return String.valueOf(cell.getStringCellValue());
        }
    }

	/**
	 * 设置第一行的表头
	 * @param tableHeader 表头列的数组
	 * @param row 工作组的行对象
	 * @param style 设置的格式对象
	 * @return 返回是否设置成功的标志
	 */
	private boolean setTableHeader(Object[] tableHeader,HSSFRow row,HSSFCellStyle style){
		
		if (tableHeader==null || tableHeader.length==0) {
			return false;
		}
		
		for (int i = 0; i < tableHeader.length; i++) {
        	HSSFCell cell=row.createCell(i);
            cell.setCellValue((String)tableHeader[i]);
            cell.setCellStyle(style);
            
            cell=null;
		}
		
		return true;
	}
	
	@Deprecated
	private Map<String, String> getFieldAndValue(JSONObject bean){
		
		Field[] fs=bean.getClass().getDeclaredFields();
		
		Method[] ms=bean.getClass().getDeclaredMethods();
		
		Map<String, String> valueMap=new HashMap<String, String>();
		/*if (ms==null || ms.length<=0) {
			return null;
		}
		for (int i = 0; i < fs.length; i++) {
			Field f = fs[i];
			
//			System. out .print( "fieldName:" +f.getName()+ "\t");
			valueMap.put(f.getName(), "");
			
			for (int j = 0; j < ms.length; j++) {
				if (ms[j].getName().startsWith("get") && ms[j].getName().endsWith(f.getName().substring(1))) {
					try {
//						System.out.println(ms[j].invoke(bean));
						
						if (ms[j].invoke(bean)==null) {
							valueMap.put(f.getName()," ");
						}else {
							valueMap.put(f.getName(), ms[j].invoke(bean)+"");
						}
						
						
					} catch (IllegalAccessException e) {
						
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						
						e.printStackTrace();
					} catch (InvocationTargetException e) {
//						System.out.println(" ");
						valueMap.put(f.getName(), " ");
					}
				}
			}
			

		}*/
		
		return valueMap;
	}

}
