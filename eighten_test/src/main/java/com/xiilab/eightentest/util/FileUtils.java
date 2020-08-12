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
			Iterator��  �÷���(�����͵��� ����ü)���κ��� ������ ���� �� �ִ� �������̽��Դϴ�.
			List�� �迭�� ���������� �������� ������ ����������, Map���� Ŭ�������� ���������� ������ ���� �����ϴ�.
			Iterator�� �̿��Ͽ� Map�� �ִ� �����͵��� while���� �̿��Ͽ� ���������� �����մϴ�.
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
		
		// Iterator�� �̿��� MAP ���ִ� �����͸� while���� ��뿡�� ���������� ����
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
	
	
	// 32������ ������ ���ڿ�(��������)�� ���� ��ȯ
	private static String getRandomString() {
		
		return UUID.randomUUID().toString().replaceAll("-","");
	}

}
 