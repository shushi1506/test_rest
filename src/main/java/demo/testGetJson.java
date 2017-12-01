package demo;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * @author tuananh 11/22/2017
 * test_rest
 * demo
 */
public class testGetJson {
    String address="http://10.200.200.41:8888/newfeed2";
    InputStream is;
    String line=null;
    String reseult=null;
    String[] data;
    public static void main(String[] args) {
        testGetJson t =new testGetJson();
        t.getData();
    }
    public  ArrayList<ClassInfoTuyenSinh> getData(){

        ArrayList<ClassInfoTuyenSinh>list=new ArrayList<>();
        try {
            URL url=new URL(address);
            HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            is= new BufferedInputStream(httpURLConnection.getInputStream());

        }catch(Exception ex){
            ex.printStackTrace();
        }
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            StringBuilder sb=new StringBuilder();
            while ((line=br.readLine())!= null){
                sb.append(line+"\n");
            }
            is.close();
            reseult=sb.toString();

        }catch (Exception ex){
            ex.printStackTrace();
//            Toast.makeText(getContext(),"loi 2"+ex.toString(),Toast.LENGTH_LONG).show();

        }
        try {
            JSONArray ja=new JSONArray(reseult);
            JSONObject jo=null;
            data=new String[ja.length()];
            for(int i=0;i<ja.length();i++){
                ClassInfoTuyenSinh classInfoTuyenSinh=new ClassInfoTuyenSinh();
                jo=ja.getJSONObject(i);
                classInfoTuyenSinh.setHeader(jo.getString("Header"));
                classInfoTuyenSinh.setInfoMain(jo.getString("InfoMain"));
                classInfoTuyenSinh.setText(jo.getString("Text"));
                classInfoTuyenSinh.setTime(jo.getString("Time"));
                classInfoTuyenSinh.setUrl(jo.getString("Url"));
                list.add(classInfoTuyenSinh);
                // data[i]=jo.getString("Header");
            }
            // arrayAdapter.notifyDataSetChanged();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }
}
