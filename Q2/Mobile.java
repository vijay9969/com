package com.Q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
	
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model) {
		
//		System.out.println(mobiles.get(company));
		
		ArrayList<String> models = mobiles.get(company);
		
		boolean f = false;
		
		if(models!=null) {
		
			f = models.add(model);

		mobiles.put(company,models);

		}else {
			ArrayList<String> mod = new ArrayList<>();
			f = mod.add(model);
			mobiles.put(company,mod);
		}
		if(f==true) {
			return "Mobile added successfully";
		}else {
			return "not added";
		}
	
	}
	
	public List<String> getModels(String company){
		
		List<String> list = mobiles.get(company);
		
		return list;
	}

	
	public static void main(String[] args) {
		
		Mobile mob = new Mobile();
		
		mob.addMobile("Apple","Iphone6");
		mob.addMobile("Apple","Iphone7");
		mob.addMobile("Nokia","1200");
		mob.addMobile("Samsung","Fold");
		
		System.out.println(mob.getModels("Apple"));
		System.out.println(mob.getModels("Nokia"));
		System.out.println(mob.getModels("Samsung"));
		
		
		
	}


}
