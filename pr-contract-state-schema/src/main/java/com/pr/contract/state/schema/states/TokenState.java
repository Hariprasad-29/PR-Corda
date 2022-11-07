package com.pr.contract.state.schema.states;

import net.corda.core.serialization.ConstructorForDeserialization;
import net.corda.core.serialization.CordaSerializable;


@CordaSerializable
public class TokenState {
    private String tokenId;

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
    @ConstructorForDeserialization
    public TokenState(String tokenId) {
        this.tokenId = tokenId;
    }

    public TokenState(TokenState other) {
        this.tokenId = other.getTokenId();
    }

    @Override
    public String toString() {
        return "TokenState{" +
                "tokenId='" + tokenId + '\'' +
                '}';
    }

}
