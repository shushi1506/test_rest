package demo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import demo.entity.ChuContentEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import java.io.IOException;

import java.util.List;

/**
 * @author tuananh 12/5/2017
 * test_rest
 * demo
 */
public class jsonToObject {
    public static void main(String[] args) throws IOException {

//        Client client=Client.create();
//        WebResource webResource=client.resource("http://localhost:8888/newfeed/chuid").queryParam("start","69").queryParam("end","72");
//        List<ChuContentEntity> response=webResource.accept("application/json").type("application/json").get(new GenericType<List<ChuContentEntity>>(){});
//        System.out.println(response.size());
        RestTemplate restTemplate=new RestTemplate();
        ResponseEntity<ChuContentEntity[]> responseEntity=restTemplate.getForEntity("http://localhost:8888/newfeed/chuid?start=69&end=72",ChuContentEntity[].class);
        ChuContentEntity[] ob=responseEntity.getBody();
        System.out.println(ob.length);
        MediaType contentType = responseEntity.getHeaders().getContentType();
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println(contentType.getType()+"  "+ contentType.getQualityValue());
        System.out.println(statusCode.toString());
    }
    public void sendObjectToRestful(){
        ChuContentEntity chuContentEntity=new ChuContentEntity();
        ClientConfig clientConfig=new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
        Client client=Client.create(clientConfig);
        WebResource webResource=client.resource("http://localhost:8888/newfeed");
        ClientResponse response = webResource.accept("application/json")
                .type("application/json").post(ClientResponse.class, chuContentEntity);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        String output = response.getEntity(String.class);
        System.out.println("Server response .... \n");
        System.out.println(output);
    }

    /**
     *
     * @param path
     * @return
     * @throws IOException
     * use lib com.fasterxml.jackson.core
     */
    public List<ChuContentEntity> getObjectJSONFromRestful(String path) throws IOException {
        Client client=Client.create();
        WebResource webResource=client.resource("http://localhost:8888/newfeed/chuid").queryParam("start","69").queryParam("end","72");
        ClientResponse response=webResource.accept("application/json").get(ClientResponse.class);
        if(response.getStatus()!=200){
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }
        String out =response.getEntity(String.class);
        ObjectMapper mapper=new ObjectMapper();
        List<ChuContentEntity> list=mapper.readValue(out,new TypeReference<List<ChuContentEntity>>(){});
        System.out.println(list.size());
        return list;
    }
    public ChuContentEntity[] getObjectJSONFromRestful_version2()  {
        RestTemplate restTemplate=new RestTemplate();
        ResponseEntity<ChuContentEntity[]> responseEntity=restTemplate.getForEntity("http://localhost:8888/newfeed/chuid?start=69&end=72",ChuContentEntity[].class);
        ChuContentEntity[] ob=responseEntity.getBody();
        System.out.println(ob.length);
        MediaType contentType = responseEntity.getHeaders().getContentType();
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println(contentType.getType()+"  "+ contentType.getQualityValue());
        System.out.println(statusCode.toString());
        return ob;
    }
}
