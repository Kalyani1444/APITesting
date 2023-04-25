package org.getapi;

import Getters.PostInfo;

public class PayLoad {

		public static PostInfo createUser() {
			PostInfo info = new PostInfo();
			info.setName("bala");
			info.setJob("software engineer");
			return 	info;	  
			}
		
	
			
		public static String updateUser() {
			
			return "{\r\n" + 
					"    \"name\": \"morpheus\",\r\n" + 
					"    \"job\": \"zion resident\"\r\n" + 
					"}";
			
					}

		public static String createIssue() {
			return "{\r\n" + 
					"    \"fields\": {\r\n" + 
					"       \"project\":\r\n" + 
					"       {\r\n" + 
					"          \"key\": \"RI\"\r\n" + 
					"       },\r\n" + 
					"       \"summary\": \"Creating an issue while setting custom field values\",\r\n" + 
					"       \"description\": \"Creating an issue while setting custom field values\",\r\n" + 
					"       \"issuetype\": {\r\n" + 
					"          \"name\": \"Task\"\r\n" + 
					"       }\r\n" + 
					"   }\r\n" + 
					"}";
		}
		
		public static String  updateIssue() {
			return "			{\r\n" + 
					"			    \"fields\" : {\r\n" + 
					"			        \"summary\": \"Creating an issue while setting custom field values\",\r\n" + 
					"			        \"description\": \"Description\"}\r\n" + 
					"			}";
			

			    }
			

		}
