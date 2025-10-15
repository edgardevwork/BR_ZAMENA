package org.apache.commons.compress.harmony.pack200;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.objectweb.asm.Attribute;

/* loaded from: classes6.dex */
public class AttributeDefinitionBands extends BandSet {
    public static final int CONTEXT_CLASS = 0;
    public static final int CONTEXT_CODE = 3;
    public static final int CONTEXT_FIELD = 1;
    public static final int CONTEXT_METHOD = 2;
    public final List<AttributeDefinition> attributeDefinitions;
    public final List<AttributeDefinition> classAttributeLayouts;
    public final List<AttributeDefinition> codeAttributeLayouts;
    public final CpBands cpBands;
    public final List<AttributeDefinition> fieldAttributeLayouts;
    public final List<AttributeDefinition> methodAttributeLayouts;
    public final Segment segment;

    public AttributeDefinitionBands(Segment segment, int i, Attribute[] attributeArr) {
        super(i, segment.getSegmentHeader());
        this.classAttributeLayouts = new ArrayList();
        this.methodAttributeLayouts = new ArrayList();
        this.fieldAttributeLayouts = new ArrayList();
        this.codeAttributeLayouts = new ArrayList();
        this.attributeDefinitions = new ArrayList();
        this.cpBands = segment.getCpBands();
        this.segment = segment;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (Attribute attribute : attributeArr) {
            NewAttribute newAttribute = (NewAttribute) attribute;
            if (!(newAttribute instanceof NewAttribute.ErrorAttribute) && !(newAttribute instanceof NewAttribute.PassAttribute) && !(newAttribute instanceof NewAttribute.StripAttribute)) {
                if (newAttribute.isContextClass()) {
                    map.put(newAttribute.type, newAttribute.getLayout());
                }
                if (newAttribute.isContextMethod()) {
                    map2.put(newAttribute.type, newAttribute.getLayout());
                }
                if (newAttribute.isContextField()) {
                    map3.put(newAttribute.type, newAttribute.getLayout());
                }
                if (newAttribute.isContextCode()) {
                    map4.put(newAttribute.type, newAttribute.getLayout());
                }
            }
        }
        if (map.size() > 7) {
            this.segmentHeader.setHave_class_flags_hi(true);
        }
        if (map2.size() > 6) {
            this.segmentHeader.setHave_method_flags_hi(true);
        }
        if (map3.size() > 10) {
            this.segmentHeader.setHave_field_flags_hi(true);
        }
        if (map4.size() > 15) {
            this.segmentHeader.setHave_code_flags_hi(true);
        }
        int[] iArr = {25, 26, 27, 28, 29, 30, 31};
        addAttributeDefinitions(map, map.size() > 7 ? addHighIndices(iArr) : iArr, 0);
        int[] iArr2 = {26, 27, 28, 29, 30, 31};
        addAttributeDefinitions(map2, this.methodAttributeLayouts.size() > 6 ? addHighIndices(iArr2) : iArr2, 2);
        int[] iArr3 = {18, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        addAttributeDefinitions(map3, this.fieldAttributeLayouts.size() > 10 ? addHighIndices(iArr3) : iArr3, 1);
        int[] iArr4 = {17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        addAttributeDefinitions(map4, this.codeAttributeLayouts.size() > 15 ? addHighIndices(iArr4) : iArr4, 3);
    }

    public void finaliseBands() {
        addSyntheticDefinitions();
        this.segmentHeader.setAttribute_definition_count(this.attributeDefinitions.size());
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing attribute definition bands...");
        int size = this.attributeDefinitions.size();
        int[] iArr = new int[size];
        int size2 = this.attributeDefinitions.size();
        int[] iArr2 = new int[size2];
        int size3 = this.attributeDefinitions.size();
        int[] iArr3 = new int[size3];
        for (int i = 0; i < size3; i++) {
            AttributeDefinition attributeDefinition = this.attributeDefinitions.get(i);
            iArr[i] = attributeDefinition.contextType | ((attributeDefinition.index + 1) << 2);
            iArr2[i] = attributeDefinition.name.getIndex();
            iArr3[i] = attributeDefinition.layout.getIndex();
        }
        byte[] bArrEncodeBandInt = encodeBandInt("attributeDefinitionHeader", iArr, Codec.BYTE1);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from attributeDefinitionHeader[" + size + "]");
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        byte[] bArrEncodeBandInt2 = encodeBandInt("attributeDefinitionName", iArr2, bHSDCodec);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from attributeDefinitionName[" + size2 + "]");
        byte[] bArrEncodeBandInt3 = encodeBandInt("attributeDefinitionLayout", iArr3, bHSDCodec);
        outputStream.write(bArrEncodeBandInt3);
        PackingUtils.log("Wrote " + bArrEncodeBandInt3.length + " bytes from attributeDefinitionLayout[" + size3 + "]");
    }

    public final void addSyntheticDefinitions() {
        boolean zIsAnySyntheticClasses = this.segment.getClassBands().isAnySyntheticClasses();
        boolean zIsAnySyntheticMethods = this.segment.getClassBands().isAnySyntheticMethods();
        boolean zIsAnySyntheticFields = this.segment.getClassBands().isAnySyntheticFields();
        if (zIsAnySyntheticClasses || zIsAnySyntheticMethods || zIsAnySyntheticFields) {
            CPUTF8 cPUtf8 = this.cpBands.getCPUtf8("Synthetic");
            CPUTF8 cPUtf82 = this.cpBands.getCPUtf8("");
            if (zIsAnySyntheticClasses) {
                this.attributeDefinitions.add(new AttributeDefinition(12, 0, cPUtf8, cPUtf82));
            }
            if (zIsAnySyntheticMethods) {
                this.attributeDefinitions.add(new AttributeDefinition(12, 2, cPUtf8, cPUtf82));
            }
            if (zIsAnySyntheticFields) {
                this.attributeDefinitions.add(new AttributeDefinition(12, 1, cPUtf8, cPUtf82));
            }
        }
    }

    public final int[] addHighIndices(int[] iArr) {
        int i = 32;
        int length = iArr.length + 32;
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        for (int length2 = iArr.length; length2 < length; length2++) {
            iArr2[length2] = i;
            i++;
        }
        return iArr2;
    }

    public final void addAttributeDefinitions(Map<String, String> map, final int[] iArr, final int i) {
        map.forEach(new BiConsumer() { // from class: org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f$0.lambda$addAttributeDefinitions$0(iArr, i, (String) obj, (String) obj2);
            }
        });
    }

    public final /* synthetic */ void lambda$addAttributeDefinitions$0(int[] iArr, int i, String str, String str2) {
        AttributeDefinition attributeDefinition = new AttributeDefinition(iArr[0], i, this.cpBands.getCPUtf8(str), this.cpBands.getCPUtf8(str2));
        this.attributeDefinitions.add(attributeDefinition);
        if (i == 0) {
            this.classAttributeLayouts.add(attributeDefinition);
            return;
        }
        if (i == 1) {
            this.fieldAttributeLayouts.add(attributeDefinition);
        } else if (i == 2) {
            this.methodAttributeLayouts.add(attributeDefinition);
        } else {
            if (i != 3) {
                return;
            }
            this.codeAttributeLayouts.add(attributeDefinition);
        }
    }

    public List<AttributeDefinition> getClassAttributeLayouts() {
        return this.classAttributeLayouts;
    }

    public List<AttributeDefinition> getMethodAttributeLayouts() {
        return this.methodAttributeLayouts;
    }

    public List<AttributeDefinition> getFieldAttributeLayouts() {
        return this.fieldAttributeLayouts;
    }

    public List<AttributeDefinition> getCodeAttributeLayouts() {
        return this.codeAttributeLayouts;
    }

    public static class AttributeDefinition {
        public int contextType;
        public int index;
        public CPUTF8 layout;
        public CPUTF8 name;

        public AttributeDefinition(int i, int i2, CPUTF8 cputf8, CPUTF8 cputf82) {
            this.index = i;
            this.contextType = i2;
            this.name = cputf8;
            this.layout = cputf82;
        }
    }
}
