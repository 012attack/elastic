package com.example.elastic;

import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ElasticApplicationTests {

    @Autowired
    RestHighLevelClient highLevelClient;



    @Test
    void contextLoads() {
    }

    @Test
    void test11(){
        RestClient lowLevelClient = highLevelClient.getLowLevelClient();
        System.out.println("123");
    }

    @Test
    void indexAPI(){

    }



}
