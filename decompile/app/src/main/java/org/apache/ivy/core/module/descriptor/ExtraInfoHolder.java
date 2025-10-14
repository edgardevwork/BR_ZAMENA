package org.apache.ivy.core.module.descriptor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class ExtraInfoHolder {
    public String content;
    public String name;
    public Map<String, String> attributes = new LinkedHashMap();
    public List<ExtraInfoHolder> nestedExtraInfoHolder = new ArrayList();

    public ExtraInfoHolder() {
    }

    public ExtraInfoHolder(String str, String str2) {
        this.name = str;
        this.content = str2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(Map<String, String> map) {
        this.attributes = map;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public List<ExtraInfoHolder> getNestedExtraInfoHolder() {
        return this.nestedExtraInfoHolder;
    }

    public void setNestedExtraInfoHolder(List<ExtraInfoHolder> list) {
        this.nestedExtraInfoHolder = list;
    }
}
