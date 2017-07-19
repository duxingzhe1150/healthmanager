package com.gb.health.service;

import com.gb.health.dao.DiseaseMapper;
import com.gb.health.domain.Disease;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service(value="diseaseService")
public class DiseaseService {
	
	@Autowired
	private DiseaseMapper diseaseMapper;

	@Value("${solrHost}")
	private String solrHost;
	
	/*@SuppressWarnings("deprecation")
	@Autowired
	private SolrClient solrServer;*/
	
	public List<Map<String, String>> selectAll(String content ,int page){

		SolrClient solrServer=new HttpSolrClient(solrHost);
		
		List<Map<String, String>> result=new ArrayList<>();
		
		if (page <=0) {
			page=1;
		}
		
		SolrQuery  solrq = new SolrQuery();

		solrq.setStart((page-1)*20);
		solrq.setRows(20);

		solrq.setQuery("a_description"+content);
		solrq.setRequestHandler("browse");
		
		
		solrq.setHighlight(true);
		solrq.setHighlightSimplePre("<font color=\"red\">");
		solrq.setHighlightSimplePost("</font>");
		//solrq.addHighlightField("a_description");
		solrq.setParam("hl.fl", "a_description");
		
		
		
		 try {
			QueryResponse rsp = solrServer.query(solrq);
			 SolrDocumentList results = rsp.getResults();
			 
			 for(SolrDocument doc:results){  
			     System.out.println(doc);  
			     
			     Map<String, String> map=new HashMap<>();
			     
			     map.put("id", doc.get("a_number")+"");
			     map.put("description", doc.get("a_description")+"");
				 if (!(doc.get("a_description")+"").endsWith("。")){
					 result.add(map);
				 }

			 }
		} catch (SolrServerException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}  
		 
/*		Page<Map<String, String>> pageData=new Page<>();
			
		pageData.setCount(result.size());
		pageData.setNowPage(page);
		pageData.setSize(20);
		pageData.setDataList(result);*/
		
		
		return result;
	}
	
	public Disease selectOne(Integer id){
		
		return diseaseMapper.selectByPrimaryKey(id);
	}
	
public Disease selectByDisease_number(String  Disease_number){
		
		return diseaseMapper.selectByDisease_number(Disease_number);
	}
	
public int updateOne(Disease record){
		
		return diseaseMapper.updateByPrimaryKey(record);
	}

}
