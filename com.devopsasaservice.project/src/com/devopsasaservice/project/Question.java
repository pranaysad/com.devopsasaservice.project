package com.devopsasaservice.project;

import javax.ws.rs.Consumes;

// Jersey - RESTful Web Services in Java

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

// Imports for HTTP GET call 
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.ws.Endpoint;



// Trees can be used to store relationships between UI objects
// For example the relationships - which button or graphic is part of which window

// Trie can be used for Natural Language processing

// Priority queues are used for handling incoming HTTP messages


// import javax.servlet.*;


// 	User interaction with Website
//	1. Website1 request question form com.devopsasaservice/project/question
//	2. RESTful Web Service Question sends the question back to the Website
//	3. Website displays the question for the user
//	4. User answers the question and presses the submit button
//	5. User answer is stored in the DB
//	6. Show the answer to the user


//	Post anything anonymously
//	Add a unique hashtag
//	Share a post
//	Find the post when you want by searching for the unique hashtag
//	Your own person journal on the internet
//	User can search the information easily using the #tag
//	Never loose any though that is in your head again!


@Path("/question")
public class Question {
	
	// This method is called if TEXT_PLAIN is request
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getPlainTextQuestion() {
		return "What is webservices?";
	}
	
	//This method is called if XML is request
	@GET
	@Produces(MediaType.TEXT_XML)
	public String getXMLQuestion() {
	
		return "<?xml version=\"1.0\"?>" + "<question> What is webservices? " + "</question>";
	}
	
	//This method is called  if HTML is request
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLQuestion() {
		
		return 	"<html> " + 
				"<title>" + "This is the question" + "</title>" + 
				"<body><h1>" + "Hello Jersey" + "</h1></body>" + 
				"</html> ";
	}
	
	//@ApiResponses	
	
	@POST
	@Consumes("application/x-msg-priority")
	@Path("/post")
	@Produces(MediaType.TEXT_PLAIN)
	public String postTextQuestion(String question) {	
		
		// Just have the question returned by a AI / machine learning engine
		
		//String strURL = 	"https://api.wit.ai/message?q="+ question;
		
		//Extract the message priority and 
		
		String strOutput = "strOutput";
		
		//int iHttpResult = javax.servlet.http.HttpServletResponse.SC_OK;
		
		//try {
		//URL objURL = new URL(strURL);
		
		//return Response.status(200).entity(output).build().toString();
		
		//	Accept the PDF file
		//	Convert he PDF file to table in AWS
		//	Store data in a table in AWS
		
		// In order to respond you will have to build a Trie
		//String token = "IIDXCJL2PAP5DMVYMFMM67IFORGVY3LM";
		
		//HttpURLConnection con = (HttpURLConnection) objURL.openConnection();
		//con.setDoInput(true);
		//con.setDoOutput(false);	//GET calls do not return output
		
		//con.setRequestProperty("Authorization", "Token " + token);
		//con.setRequestMethod("GET");
		
		//con.connect();
		
		//iHttpResult = con.getResponseCode();
				
		//strOutput = strOutput + ' ' + Integer.toString(iHttpResult);
		
		//System.out.println(HttpResult);
		//System.out.println(con.getResponseMessage());

		//}
		
		//catch (IOException e)
		//{	
			
			
			//e.printStackTrace();
			
			//strOutput = e.getMessage() 
			//			+ ' '
			//			+ System.err.toString() 
			//			+ ' ' 
			//			+ Integer.toString(iHttpResult);
			
		//}	
	
		
		
		return strOutput;
	}
	
	
	public boolean roundrotate(String strOne, String strTwo)
	{			
		int iRotate = 0;
		
		// 97 98 99
		// 98 99 97
		// 99 97 98
			
		// abc, bca, cab
		// 012  120  201
		// 012  012  012
		
		// 0 --> 2  =  2
		// 1 --> 0  = -1
		// 2 --> 1  = -1
		
		// 0 --> 1 =  1
		// 1 --> 2 =  1
		// 2 --> 0 = -2
				
		int i=0;
			
		for (i=0; i<strOne.length(); i++)
		{		
			iRotate = iRotate + i - strTwo.indexOf(strOne.charAt(i));
		}			
		return (iRotate==0);
	}
	
}

// http://psclientenv99.xpdjrkujme.us-west-2.elasticbeanstalk.com/sampleQuestionProxy/TestClient.jsp?endpoint=http://psenv100.xpdjrkujme.us-west-2.elasticbeanstalk.com/services/Question?
// http://psenv100.xpdjrkujme.us-west-2.elasticbeanstalk.com/services/Question?wsdl
// http://psapp-env.xpdjrkujme.us-west-2.elasticbeanstalk.com


/*
   class Solution {
    String strReverse = "";
    public int reverse(int x) {
        if ((x/10) < 1)
        {
           return  (x%10);
        }
        else
        {
            strReverse = strReverse + (x%10) + String.valueOf(reverse(x/10));
        }
        int result = Integer.parseInt(strReverse);	        
        return result;      
    }
}
 */



/*
 * 
 * 
package com.psServer.DeepLearning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.Endpoint;


// 	Remember this is a server code that you are writing and therefore the 
//	The HTTP calls are done from the client side. Don't get confused between server and client side.


public class DeepLearning {
	
	//String strURL = 	"https://api.wit.ai/message?q=hello";
	
	//URL objURL = new URL(strURL);
	
	//public DeepLearning() throws MalformedURLException {
		
		//try
		//{
				
			/*
				String token = "IIDXCJL2PAP5DMVYMFMM67IFORGVY3LM";
			
				HttpURLConnection con = (HttpURLConnection) objURL.openConnection();
				con.setDoInput(true);
				con.setDoOutput(false);	//GET calls do not return output
			
				con.setRequestProperty("Authorization", "Token " + token);
				con.setRequestMethod("GET");
			
				int HttpResult = con.getResponseCode();
			
				System.out.println(HttpResult);
				System.out.println(con.getResponseMessage());
			
			
		//}
		
		//catch (IOException e)
		//{	
			
		//}	
	

	//public DeepLearning() {
		//System.out.println("Web Service Started");
		
		//Endpoint.publish("http://localhost:8080/SayHello", new SayHello());
		
	}
	
	public String helloName(String name)
	{
		return "Hello there" + name;
	}
	
}

*/


//  7 debugging questions that you have 21 minutes to solve
//  I have heard people do 90 minute long assessment tests online but not 30 minute long.
//  Basically they have some code and it is supposed to have a certain output 
//  but it does not and you need to figure out why and correct the code. 

// 1000 words in a document
// Load all the words into a SQL DB
// Select * where COUNT(*) > n  (n going from 1 to 1000)




