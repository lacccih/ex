package org.zero.web;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zero.domain.ProductVO;

@Controller
public class SampleController5 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController5.class);
	
	@RequestMapping("doJSON")
	public @ResponseBody List<ProductVO> doJSON() {
		
		List<ProductVO> list = new ArrayList<ProductVO>();
		
		for (int i = 0; i < 10; i++) {
			ProductVO vo = new ProductVO("샘플상품", 1500);
			list.add(vo);
		}
		
		return list;
	}
	
}
