package com.crypto.coinmixer.api;

import com.crypto.coinmixer.domain.DepositTransfer;
import com.crypto.coinmixer.domain.Transfer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


@Service
public class CoinAPI {
    private final String coinUri = "http://jobcoin.gemini.com/todo_my_instance/api/";

    private final Logger LOG = LoggerFactory.getLogger(CoinAPI.class);

    @Autowired
    private ObjectMapper mapper;


    public String transferToDeposit(Transfer transfer) {
        RestTemplate restTemplate = new RestTemplate();
        final String  createPersonUrl="http://jobcoin.gemini.com/exemplify-untagged/api/transactions";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        JSONObject personJsonObject = new JSONObject();
        personJsonObject.put("fromAddress", transfer.getSrcAddress());
        personJsonObject.put("toAddress", transfer.getDstAddress());
        personJsonObject.put("amount", transfer.getAmount());
        HttpEntity<String> request =
                new HttpEntity<String>(personJsonObject.toString(), headers);
        String res=  restTemplate.postForObject(createPersonUrl, request, String.class);
        return res;
    }

    private HttpEntity<String> getStringHttpEntity(Object object) throws JsonProcessingException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String jsonMeterData = mapper.writeValueAsString(object);
        return (HttpEntity<String>) new HttpEntity(jsonMeterData, headers);
    }



}
