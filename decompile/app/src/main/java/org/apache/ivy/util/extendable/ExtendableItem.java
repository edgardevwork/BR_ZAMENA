package org.apache.ivy.util.extendable;

import java.util.Map;

/* loaded from: classes8.dex */
public interface ExtendableItem {
    String getAttribute(String str);

    Map<String, String> getAttributes();

    String getExtraAttribute(String str);

    Map<String, String> getExtraAttributes();

    Map<String, String> getQualifiedExtraAttributes();
}
