package com.example.chart.utils;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.RestHighLevelClientBuilder;

public class EsTest  {
public static void main(String args[]) throws Exception {
    RestHighLevelClient restHighLevelClient=new RestHighLevelClient(
            RestClient.builder(new HttpHost("localhost",9200,"http"))
    );

    restHighLevelClient.close();
}
}
