package com.example.program_test;

import java.util.ArrayList;

public class test2 {

	public void calcMinPath(){
		int i_minPath=0;//minPathValue
		ArrayList<ArrayList<Integer>> ary_list=new ArrayList<ArrayList<Integer>>(); 
		ArrayList<Integer> ary_i_lv1=new ArrayList<Integer>();
		ArrayList<Integer> ary_i_lv2=new ArrayList<Integer>();
		ArrayList<Integer> ary_i_lv3=new ArrayList<Integer>();
		ArrayList<Integer> ary_i_lv4=new ArrayList<Integer>();
		
		//assign each value in arraylist
		ary_i_lv1.add(2);
		ary_list.add(ary_i_lv1);
		ary_i_lv2.add(3);
		ary_i_lv2.add(4);
		ary_list.add(ary_i_lv2);
		ary_i_lv3.add(6);
		ary_i_lv3.add(5);
		ary_i_lv3.add(7);
		ary_list.add(ary_i_lv3);
		ary_i_lv4.add(4);
		ary_i_lv4.add(1);
		ary_i_lv4.add(8);
		ary_i_lv4.add(3);
		ary_list.add(ary_i_lv4);
		// find minPathValue
		for(int i=0;i<ary_list.size();i++){
			i_minPath=i_minPath+findMinValue(ary_list.get(i));
		}
	}
	public int findMinValue(ArrayList<Integer> input){//find minvalue in ArrayList
		int i_minValue=0;
		for(int i=0;i<input.size();i++){
			if(i==0){//assign first value in  i_minValue
				i_minValue=input.get(i);
			}else{
				if(input.get(i)<i_minValue){//determinate which one is min
					i_minValue=input.get(i);
				}
			}
		}
		return i_minValue;
	}
}
