package org.apache.ivy.util.extendable;

import java.util.Map;

/* loaded from: classes5.dex */
public class DefaultExtendableItem extends UnmodifiableExtendableItem {
    public DefaultExtendableItem() {
        this(null, null);
    }

    public DefaultExtendableItem(Map<String, String> map, Map<String, String> map2) {
        super(map, map2);
    }

    @Override // org.apache.ivy.util.extendable.UnmodifiableExtendableItem
    public void setExtraAttribute(String str, String str2) {
        super.setExtraAttribute(str, str2);
    }
}
