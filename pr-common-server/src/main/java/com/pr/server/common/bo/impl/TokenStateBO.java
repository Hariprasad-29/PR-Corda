package com.pr.server.common.bo.impl;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.pr.server.common.bo.BusinessObject;
import com.pr.server.common.deserializer.RequestBODeserializer;
import com.pr.server.common.deserializer.TokenStateBODeserializer;

import net.corda.core.serialization.CordaSerializable;

@CordaSerializable
@JsonDeserialize(using = TokenStateBODeserializer.class)
public class TokenStateBO implements BusinessObject {
    private String tokenId;

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
    public TokenStateBO() {
        // TODO Auto-generated constructor stub
    }
    public TokenStateBO(String tokenId) {
        this.tokenId = tokenId;
    }

    public TokenStateBO tokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }
}
