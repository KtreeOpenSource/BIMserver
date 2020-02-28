package org.bimserver.servlets;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class FetchAndStoreExpirationDate extends HttpServlet {
	public void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
		String message="unable ro register";
	    JsonObject jsonObject = new JsonObject();
		try
		{
		String urlParameters  = "license_number="+servletRequest.getParameter("licenseNumber");
		byte[] postData       = urlParameters.getBytes( StandardCharsets.UTF_8 );
		int    postDataLength = postData.length;
		String requestUrl        = "http://portal.bimfm.mu/api/v1/portallicense/data1";
		URL    url            = new URL( requestUrl );
		HttpURLConnection conn= (HttpURLConnection) url.openConnection();           
		conn.setDoOutput( true );
		conn.setInstanceFollowRedirects( false );
		conn.setRequestMethod( "POST" );
		conn.setRequestProperty( "Content-Type", "application/x-www-form-urlencoded"); 
		conn.setRequestProperty( "charset", "utf-8");
		conn.setRequestProperty( "Content-Length", Integer.toString( postDataLength ));
		conn.setUseCaches( false );
		DataOutputStream wr = new DataOutputStream( conn.getOutputStream());
		 wr.write( postData );
		 String tempPath=System.getProperty("java.io.tmpdir").replace("/temp", "/expiration");
		 File uploadDir = new File(tempPath);
         if (!uploadDir.exists()) {
             uploadDir.mkdir();
         }
	        String response = IOUtils.toString(conn.getInputStream());
	        JsonParser parser = new JsonParser();
	        JsonObject json = (JsonObject) parser.parse(response);
	        System.out.println(json.get("statuscode"));
	        String content="trial version";
	        if(json.get("statuscode").getAsInt()==200)
	        {
	        JsonObject resultObj = (JsonObject) json.get("result");
	        System.out.println(resultObj.get("valid_to"));
	        content=resultObj.get("valid_to").getAsString();
	        
	        /*byte[] bytesEncoded = Base64.encodeBase64(content.getBytes());
	        System.out.println("encoded value is " + new String(bytesEncoded));
	        content=new String(bytesEncoded);*/
	        message="Registered successfully";
	        }
	        File file = new File(tempPath+File.separator+"expiration.txt");
            try (FileWriter writer = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(writer)) {

                   bw.write(content);

               } catch (IOException e) {
                   System.err.format("IOException: %s%n", e);
               }
            
            PrintWriter  printWriter = servletResponse.getWriter();
    		jsonObject.addProperty("result", message);
    		printWriter.print(jsonObject);  
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

}
}
