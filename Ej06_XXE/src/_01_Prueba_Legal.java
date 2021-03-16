import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

public class _01_Prueba_Legal {

	public static void main(String[] args) {

		String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
					 "<cliente>"+
					 	"<nombre>aaa</nombre>"+
					 	"<direccion>bbb</direccion>"+
					 	"<telefono>ccc</telefono>"+
					 "</cliente>";
		
		StringEntity entity = new StringEntity(xml, ContentType.create("text/xml", Consts.UTF_8));
		entity.setChunked(true);
		HttpPost httpPost = new HttpPost("http://localhost:8080/Ej06_XXE/JAXPServlet");

		httpPost.setEntity(entity);

		HttpClient client = HttpClients.createDefault();
		try {
			HttpResponse response = client.execute(httpPost);
			System.out.println(response.toString());
			InputStream in = response.getEntity().getContent();
			String body = IOUtils.toString(in, Charset.defaultCharset());
			System.out.println(body);
		} catch (ClientProtocolException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}