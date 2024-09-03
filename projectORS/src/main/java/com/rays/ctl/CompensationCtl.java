package com.rays.ctl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CompensationDTO;
import com.rays.form.CompensationForm;
import com.rays.service.CompensationServiceInt;

@RestController
@RequestMapping(value = "Compensation")
public class CompensationCtl extends BaseCtl<CompensationForm, CompensationDTO, CompensationServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		
		ORSResponse res = new ORSResponse(true);
		
		HashMap<Integer, String> staffMemberMap = new HashMap<>();
		staffMemberMap.put(1, "Amit Singh");
		staffMemberMap.put(2, "Raj Patel");
		staffMemberMap.put(3, "Vicky Malhotra");
		
		List<Map<String, Object>> staffMemberList = new ArrayList(); 
		staffMemberMap.forEach((key, value) -> {
			HashMap<String, Object> item = new HashMap<>();
			item.put("key", key);
			item.put("value", value);
			staffMemberList.add(item);	
		});
		return res;
	}
}
