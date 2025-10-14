package org.apache.commons.compress.harmony.unpack200;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;

/* loaded from: classes7.dex */
public class AttributeLayoutMap {
    public final Map<Integer, AttributeLayout> classLayouts;
    public final Map<Integer, AttributeLayout> codeLayouts;
    public final Map<Integer, AttributeLayout> fieldLayouts;
    public final Map[] layouts;
    public final Map<AttributeLayout, NewAttributeBands> layoutsToBands;
    public final Map<Integer, AttributeLayout> methodLayouts;

    public static AttributeLayout[] getDefaultAttributeLayouts() throws Pack200Exception {
        return new AttributeLayout[]{new AttributeLayout(AttributeLayout.ACC_PUBLIC, 0, "", 0), new AttributeLayout(AttributeLayout.ACC_PUBLIC, 1, "", 0), new AttributeLayout(AttributeLayout.ACC_PUBLIC, 2, "", 0), new AttributeLayout(AttributeLayout.ACC_PRIVATE, 0, "", 1), new AttributeLayout(AttributeLayout.ACC_PRIVATE, 1, "", 1), new AttributeLayout(AttributeLayout.ACC_PRIVATE, 2, "", 1), new AttributeLayout(AttributeLayout.ATTRIBUTE_LINE_NUMBER_TABLE, 3, "NH[PHH]", 1), new AttributeLayout(AttributeLayout.ACC_PROTECTED, 0, "", 2), new AttributeLayout(AttributeLayout.ACC_PROTECTED, 1, "", 2), new AttributeLayout(AttributeLayout.ACC_PROTECTED, 2, "", 2), new AttributeLayout(AttributeLayout.ATTRIBUTE_LOCAL_VARIABLE_TABLE, 3, "NH[PHOHRUHRSHH]", 2), new AttributeLayout(AttributeLayout.ACC_STATIC, 0, "", 3), new AttributeLayout(AttributeLayout.ACC_STATIC, 1, "", 3), new AttributeLayout(AttributeLayout.ACC_STATIC, 2, "", 3), new AttributeLayout(AttributeLayout.ATTRIBUTE_LOCAL_VARIABLE_TYPE_TABLE, 3, "NH[PHOHRUHRSHH]", 3), new AttributeLayout(AttributeLayout.ACC_FINAL, 0, "", 4), new AttributeLayout(AttributeLayout.ACC_FINAL, 1, "", 4), new AttributeLayout(AttributeLayout.ACC_FINAL, 2, "", 4), new AttributeLayout(AttributeLayout.ACC_SYNCHRONIZED, 0, "", 5), new AttributeLayout(AttributeLayout.ACC_SYNCHRONIZED, 1, "", 5), new AttributeLayout(AttributeLayout.ACC_SYNCHRONIZED, 2, "", 5), new AttributeLayout(AttributeLayout.ACC_VOLATILE, 0, "", 6), new AttributeLayout(AttributeLayout.ACC_VOLATILE, 1, "", 6), new AttributeLayout(AttributeLayout.ACC_VOLATILE, 2, "", 6), new AttributeLayout(AttributeLayout.ACC_TRANSIENT, 0, "", 7), new AttributeLayout(AttributeLayout.ACC_TRANSIENT, 1, "", 7), new AttributeLayout(AttributeLayout.ACC_TRANSIENT, 2, "", 7), new AttributeLayout(AttributeLayout.ACC_NATIVE, 0, "", 8), new AttributeLayout(AttributeLayout.ACC_NATIVE, 1, "", 8), new AttributeLayout(AttributeLayout.ACC_NATIVE, 2, "", 8), new AttributeLayout(AttributeLayout.ACC_INTERFACE, 0, "", 9), new AttributeLayout(AttributeLayout.ACC_INTERFACE, 1, "", 9), new AttributeLayout(AttributeLayout.ACC_INTERFACE, 2, "", 9), new AttributeLayout(AttributeLayout.ACC_ABSTRACT, 0, "", 10), new AttributeLayout(AttributeLayout.ACC_ABSTRACT, 1, "", 10), new AttributeLayout(AttributeLayout.ACC_ABSTRACT, 2, "", 10), new AttributeLayout(AttributeLayout.ACC_STRICT, 0, "", 11), new AttributeLayout(AttributeLayout.ACC_STRICT, 1, "", 11), new AttributeLayout(AttributeLayout.ACC_STRICT, 2, "", 11), new AttributeLayout(AttributeLayout.ACC_SYNTHETIC, 0, "", 12), new AttributeLayout(AttributeLayout.ACC_SYNTHETIC, 1, "", 12), new AttributeLayout(AttributeLayout.ACC_SYNTHETIC, 2, "", 12), new AttributeLayout(AttributeLayout.ACC_ANNOTATION, 0, "", 13), new AttributeLayout(AttributeLayout.ACC_ANNOTATION, 1, "", 13), new AttributeLayout(AttributeLayout.ACC_ANNOTATION, 2, "", 13), new AttributeLayout(AttributeLayout.ACC_ENUM, 0, "", 14), new AttributeLayout(AttributeLayout.ACC_ENUM, 1, "", 14), new AttributeLayout(AttributeLayout.ACC_ENUM, 2, "", 14), new AttributeLayout(AttributeLayout.ATTRIBUTE_SOURCE_FILE, 0, "RUNH", 17), new AttributeLayout(AttributeLayout.ATTRIBUTE_CONSTANT_VALUE, 1, "KQH", 17), new AttributeLayout(AttributeLayout.ATTRIBUTE_CODE, 2, "", 17), new AttributeLayout(AttributeLayout.ATTRIBUTE_ENCLOSING_METHOD, 0, "RCHRDNH", 18), new AttributeLayout(AttributeLayout.ATTRIBUTE_EXCEPTIONS, 2, "NH[RCH]", 18), new AttributeLayout(AttributeLayout.ATTRIBUTE_SIGNATURE, 0, "RSH", 19), new AttributeLayout(AttributeLayout.ATTRIBUTE_SIGNATURE, 1, "RSH", 19), new AttributeLayout(AttributeLayout.ATTRIBUTE_SIGNATURE, 2, "RSH", 19), new AttributeLayout(AttributeLayout.ATTRIBUTE_DEPRECATED, 0, "", 20), new AttributeLayout(AttributeLayout.ATTRIBUTE_DEPRECATED, 1, "", 20), new AttributeLayout(AttributeLayout.ATTRIBUTE_DEPRECATED, 2, "", 20), new AttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_VISIBLE_ANNOTATIONS, 0, "*", 21), new AttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_VISIBLE_ANNOTATIONS, 1, "*", 21), new AttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_VISIBLE_ANNOTATIONS, 2, "*", 21), new AttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_INVISIBLE_ANNOTATIONS, 0, "*", 22), new AttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_INVISIBLE_ANNOTATIONS, 1, "*", 22), new AttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_INVISIBLE_ANNOTATIONS, 2, "*", 22), new AttributeLayout(AttributeLayout.ATTRIBUTE_INNER_CLASSES, 0, "", 23), new AttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS, 2, "*", 23), new AttributeLayout(AttributeLayout.ATTRIBUTE_CLASS_FILE_VERSION, 0, "", 24), new AttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS, 2, "*", 24), new AttributeLayout(AttributeLayout.ATTRIBUTE_ANNOTATION_DEFAULT, 2, "*", 25)};
    }

    public AttributeLayoutMap() throws Pack200Exception {
        HashMap map = new HashMap();
        this.classLayouts = map;
        HashMap map2 = new HashMap();
        this.fieldLayouts = map2;
        HashMap map3 = new HashMap();
        this.methodLayouts = map3;
        HashMap map4 = new HashMap();
        this.codeLayouts = map4;
        this.layouts = new Map[]{map, map2, map3, map4};
        this.layoutsToBands = new HashMap();
        for (AttributeLayout attributeLayout : getDefaultAttributeLayouts()) {
            add(attributeLayout);
        }
    }

    public void add(AttributeLayout attributeLayout) {
        getLayout(attributeLayout.getContext()).put(Integer.valueOf(attributeLayout.getIndex()), attributeLayout);
    }

    public void add(AttributeLayout attributeLayout, NewAttributeBands newAttributeBands) {
        add(attributeLayout);
        this.layoutsToBands.put(attributeLayout, newAttributeBands);
    }

    public void checkMap() throws Pack200Exception {
        for (Map map : this.layouts) {
            Collection collectionValues = map.values();
            if (!(collectionValues instanceof List)) {
                collectionValues = new ArrayList(collectionValues);
            }
            List list = (List) collectionValues;
            int i = 0;
            while (i < list.size()) {
                AttributeLayout attributeLayout = (AttributeLayout) list.get(i);
                i++;
                for (int i2 = i; i2 < list.size(); i2++) {
                    AttributeLayout attributeLayout2 = (AttributeLayout) list.get(i2);
                    if (attributeLayout.getName().equals(attributeLayout2.getName()) && attributeLayout.getLayout().equals(attributeLayout2.getLayout())) {
                        throw new Pack200Exception("Same layout/name combination: " + attributeLayout.getLayout() + "/" + attributeLayout.getName() + " exists twice for context: " + AttributeLayout.contextNames[attributeLayout.getContext()]);
                    }
                }
            }
        }
    }

    public NewAttributeBands getAttributeBands(AttributeLayout attributeLayout) {
        return this.layoutsToBands.get(attributeLayout);
    }

    public AttributeLayout getAttributeLayout(int i, int i2) {
        return getLayout(i2).get(Integer.valueOf(i));
    }

    public AttributeLayout getAttributeLayout(String str, int i) {
        for (AttributeLayout attributeLayout : getLayout(i).values()) {
            if (attributeLayout.getName().equals(str)) {
                return attributeLayout;
            }
        }
        return null;
    }

    public final Map<Integer, AttributeLayout> getLayout(int i) {
        return this.layouts[i];
    }
}
