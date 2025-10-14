package org.jfrog.filespecs.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public class Aql {
    public String find;

    public String getFind() {
        return this.find;
    }

    @JsonProperty("items.find")
    public void setFind(LinkedHashMap<?, ?> linkedHashMap) throws JsonProcessingException {
        this.find = new ObjectMapper().writeValueAsString(linkedHashMap);
    }

    public void setFind(String str) {
        this.find = str;
    }
}
