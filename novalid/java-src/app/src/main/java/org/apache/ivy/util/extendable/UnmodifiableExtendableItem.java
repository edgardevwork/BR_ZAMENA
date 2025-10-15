package org.apache.ivy.util.extendable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class UnmodifiableExtendableItem implements ExtendableItem {
    public final Map<String, String> attributes;
    public final Map<String, String> extraAttributes;
    public final Map<String, String> qualifiedExtraAttributes;
    public final Map<String, String> unmodifiableAttributesView;
    public final Map<String, String> unmodifiableExtraAttributesView;
    public final Map<String, String> unmodifiableQualifiedExtraAttributesView;

    public UnmodifiableExtendableItem(Map<String, String> map, Map<String, String> map2) {
        HashMap map3 = new HashMap();
        this.attributes = map3;
        this.unmodifiableAttributesView = Collections.unmodifiableMap(map3);
        HashMap map4 = new HashMap();
        this.extraAttributes = map4;
        this.unmodifiableExtraAttributesView = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        this.qualifiedExtraAttributes = map5;
        this.unmodifiableQualifiedExtraAttributesView = Collections.unmodifiableMap(map5);
        if (map != null) {
            map3.putAll(map);
        }
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                setExtraAttribute(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public String getAttribute(String str) {
        return this.attributes.get(str);
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public String getExtraAttribute(String str) {
        String str2 = this.qualifiedExtraAttributes.get(str);
        return str2 == null ? this.extraAttributes.get(str) : str2;
    }

    public void setExtraAttribute(String str, String str2) {
        this.qualifiedExtraAttributes.put(str, str2);
        int iIndexOf = str.indexOf(58);
        if (iIndexOf != -1) {
            str = str.substring(iIndexOf + 1);
        }
        this.extraAttributes.put(str, str2);
        this.attributes.put(str, str2);
    }

    public void setStandardAttribute(String str, String str2) {
        this.attributes.put(str, str2);
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public Map<String, String> getAttributes() {
        return this.unmodifiableAttributesView;
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public Map<String, String> getExtraAttributes() {
        return this.unmodifiableExtraAttributesView;
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public Map<String, String> getQualifiedExtraAttributes() {
        return this.unmodifiableQualifiedExtraAttributesView;
    }
}
