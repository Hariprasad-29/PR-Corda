package com.pr.server.common.deserializer;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.pr.server.common.bo.impl.ECAStateBO;
import com.pr.server.common.bo.impl.PRBO;
import com.pr.server.common.bo.impl.RequestFormBO;
import com.pr.server.common.bo.impl.TokenStateBO;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class TokenStateBODeserializer extends JsonDeserializer<TokenStateBO> {

    @Override
    public TokenStateBO deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JacksonException {
        ObjectCodec oc = jp.getCodec();
        JsonNode node = oc.readTree(jp);
        TokenStateBO tokenStateBO = new TokenStateBO();

        tokenStateBO.tokenId(node.get("tokenId") != null ? node.get("tokenId").asText() : null);
        

        return tokenStateBO;

    }
    
}
