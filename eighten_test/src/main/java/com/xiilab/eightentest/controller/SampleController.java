//package com.xiilab.eightentest.controller;
//package com.xiilab.eightentest;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.xiilab.eightentest.VO.ProductVO;
//
//@Controller
//public class SampleController {
//	
//	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
//	
//	@RequestMapping("doA")
//	public void doA() {
//		logger.info("doA called =======================");
//	}
//	
//	@RequestMapping("doB")
//	public void doB() {
//		logger.info("doB called =======================");
//	}
//	
//	@RequestMapping("doC")
//	public void doC(@ModelAttribute("msg") String msg) {
//		logger.info("doC called =======================");
//	}
//	
//	@RequestMapping("doD")
//	public String doD(Model model) {
//		logger.info("doB called =======================");
//		ProductVO product = new ProductVO("young", 10000);
//		model.addAttribute(product);
//		return "productDetail";
//	}
//	
//}