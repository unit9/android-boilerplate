package com.unit9.boilerplate.network;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class HttpManager {
    private String HOST = "http://google.com/";
    private String URL_API = HOST;
    private String URL_SEARCH = "search?q=";
    private InputStream is = null;

    private  HttpContext localContext = new BasicHttpContext();
    private  CookieStore cookieStore = new BasicCookieStore();

    public HttpManager() {

    }

    public String doPost(String url, List<NameValuePair> values) {
        // Making HTTP request
        try {
            // defaultHttpClient
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(URL_API+url);
            httpPost.setEntity(new UrlEncodedFormEntity(values));


            localContext.setAttribute(ClientContext.COOKIE_STORE,
                    cookieStore);
            HttpResponse httpResponse = httpClient.execute(httpPost,localContext);
            HttpEntity httpEntity = httpResponse.getEntity();
            is = httpEntity.getContent();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, "iso-8859-1"), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            return sb.toString();
        } catch (Exception e) {
            //Log.e("Buffer Error", "Error converting result " + e.toString());
            return null;
        }
    }

    public  String doGet(String url) {
        // Making HTTP request
        try {
            // defaultHttpClient
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(URL_API+url);

            localContext.setAttribute(ClientContext.COOKIE_STORE,
                    cookieStore);
            HttpResponse httpResponse = httpClient.execute(httpGet,localContext);
            HttpEntity httpEntity = httpResponse.getEntity();
            is = httpEntity.getContent();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, "iso-8859-1"), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            return sb.toString();
        } catch (Exception e) {
            //Log.e("Buffer Error", "Error converting result " + e.toString());
            return null;
        }

    }

}
