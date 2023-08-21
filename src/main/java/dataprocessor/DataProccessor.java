package dataprocessor;

import java.sql.ResultSet;
import java.util.*;

import datacollector.DataCollector;

public class DataProccessor {
	
	
	public static List<String> getCategories()
	{
		
		return DataCollector.getMainCategorys();
		
		
	}
	
	public static ResultSet getContent(String catname)
	{
		if(catname.equalsIgnoreCase("games"))
		{
			System.out.println("a..");
			return DataCollector.getGamesByCatname(catname);
		}
		
		System.out.println("b...");
		return DataCollector.getVideosByCatname(catname);
		
	}
	
	public static Map<String ,String > getVideo(String id)
	{

		System.out.println("c...");
		
		return DataCollector.getVideoById(id);
		
	}
	
	public static ResultSet getBanners()
	{

		System.out.println("d...");
		return DataCollector.getBannersUrl();
	}

}
