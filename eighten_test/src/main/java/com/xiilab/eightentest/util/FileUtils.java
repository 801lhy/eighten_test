package com.xiilab.eightentest.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.xiilab.eightentest.VO.BoardVO;

@Component("fileUtils")
public class FileUtils {
	
// ${pageContext.request.contextPath}/resources/img/logo.png
	private static final String filePath = "/resources/img/gallery";
	
	public List<Map<String,Object>> parseInsertFileInfo(BoardVO boardVO, MultipartHttpServletRequest mpRequest) throws Exception{
		
		/*
			Iterator은  컬렉션(데이터들의 집합체)으로부터 정보를 얻어올 수 있는 인터페이스입니다.
			List나 배열은 순차적으로 데이터의 접근이 가능하지만, Map등의 클래스들은 순차적으로 접근할 수가 없습니다.
			Iterator을 이용하여 Map에 있는 데이터들을 while문을 이용하여 순차적으로 접근합니다.
		*/
		
		Iterator<String> iterator = mpRequest.getFileNames();
		
		MultipartFile multipartFile = null;
		String originalFileName = null;
		String originalFileExtension = null;
		String storedFileName = null;
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		Map<String,Object> listMap = null;
		
		int post_idx = boardVO.getPost_idx();
		
		
		File file = new File(filePath);
		if(file.exists() == false) {
			file.mkdir();
		}
		
		// Iterator를 이용해 MAP 에있는 데이터를 while문을 사용에서 순차적으로 접근
		while(iterator.hasNext()) {
			multipartFile = mpRequest.getFile(iterator.next());
			
			if(multipartFile.isEmpty() == false) {
				
				originalFileName = multipartFile.getOriginalFilename();
				originalFileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
				storedFileName = getRandomString() + originalFileExtension;
				
				file = new File(filePath + storedFileName);
				multipartFile.transferTo(file);
				listMap = new HashMap<String, Object>();
				listMap.put("post_idx", post_idx);
				listMap.put("org_file_name", originalFileName);
				listMap.put("stored_file_name", storedFileName);
				listMap.put("file_size", multipartFile.getSize());
				list.add(listMap);
				
			}
		}
		
		return list;
		
	}
	
	
	// 32글자의 랜덤한 문자열(숫자포함)을 만들어서 반환
	private static String getRandomString() {
		
		return UUID.randomUUID().toString().replaceAll("-","");
	}

}
 