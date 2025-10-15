package org.apache.commons.compress.harmony.pack200;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;
import okhttp3.HttpUrl;
import org.apache.commons.compress.harmony.unpack200.AttributeLayout;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jfrog.filespecs.properties.PropertiesParser;
import org.objectweb.asm.Type;

/* loaded from: classes6.dex */
public class CpBands extends BandSet {
    public final Set<CPClass> cp_Class;
    public final Set<CPNameAndType> cp_Descr;
    public final Set<CPDouble> cp_Double;
    public final Set<CPMethodOrField> cp_Field;
    public final Set<CPFloat> cp_Float;
    public final Set<CPMethodOrField> cp_Imethod;
    public final Set<CPInt> cp_Int;
    public final Set<CPLong> cp_Long;
    public final Set<CPMethodOrField> cp_Method;
    public final Set<CPSignature> cp_Signature;
    public final Set<CPString> cp_String;
    public final Set<CPUTF8> cp_Utf8;
    public final Set<String> defaultAttributeNames;
    public final Map<Object, CPConstant<?>> objectsToCPConstant;
    public final Segment segment;
    public final Map<String, CPClass> stringsToCpClass;
    public final Map<String, CPMethodOrField> stringsToCpField;
    public final Map<String, CPMethodOrField> stringsToCpIMethod;
    public final Map<String, CPMethodOrField> stringsToCpMethod;
    public final Map<String, CPNameAndType> stringsToCpNameAndType;
    public final Map<String, CPSignature> stringsToCpSignature;
    public final Map<String, CPUTF8> stringsToCpUtf8;

    public CpBands(Segment segment, int i) {
        super(i, segment.getSegmentHeader());
        HashSet hashSet = new HashSet();
        this.defaultAttributeNames = hashSet;
        this.cp_Utf8 = new TreeSet();
        this.cp_Int = new TreeSet();
        this.cp_Float = new TreeSet();
        this.cp_Long = new TreeSet();
        this.cp_Double = new TreeSet();
        this.cp_String = new TreeSet();
        this.cp_Class = new TreeSet();
        this.cp_Signature = new TreeSet();
        this.cp_Descr = new TreeSet();
        this.cp_Field = new TreeSet();
        this.cp_Method = new TreeSet();
        this.cp_Imethod = new TreeSet();
        this.stringsToCpUtf8 = new HashMap();
        this.stringsToCpNameAndType = new HashMap();
        this.stringsToCpClass = new HashMap();
        this.stringsToCpSignature = new HashMap();
        this.stringsToCpMethod = new HashMap();
        this.stringsToCpField = new HashMap();
        this.stringsToCpIMethod = new HashMap();
        this.objectsToCPConstant = new HashMap();
        this.segment = segment;
        hashSet.add(AttributeLayout.ATTRIBUTE_ANNOTATION_DEFAULT);
        hashSet.add(AttributeLayout.ATTRIBUTE_RUNTIME_VISIBLE_ANNOTATIONS);
        hashSet.add(AttributeLayout.ATTRIBUTE_RUNTIME_INVISIBLE_ANNOTATIONS);
        hashSet.add(AttributeLayout.ATTRIBUTE_RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS);
        hashSet.add(AttributeLayout.ATTRIBUTE_RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS);
        hashSet.add(AttributeLayout.ATTRIBUTE_CODE);
        hashSet.add(AttributeLayout.ATTRIBUTE_LINE_NUMBER_TABLE);
        hashSet.add(AttributeLayout.ATTRIBUTE_LOCAL_VARIABLE_TABLE);
        hashSet.add(AttributeLayout.ATTRIBUTE_LOCAL_VARIABLE_TYPE_TABLE);
        hashSet.add(AttributeLayout.ATTRIBUTE_CONSTANT_VALUE);
        hashSet.add(AttributeLayout.ATTRIBUTE_DEPRECATED);
        hashSet.add(AttributeLayout.ATTRIBUTE_ENCLOSING_METHOD);
        hashSet.add(AttributeLayout.ATTRIBUTE_EXCEPTIONS);
        hashSet.add(AttributeLayout.ATTRIBUTE_INNER_CLASSES);
        hashSet.add(AttributeLayout.ATTRIBUTE_SIGNATURE);
        hashSet.add(AttributeLayout.ATTRIBUTE_SOURCE_FILE);
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing constant pool bands...");
        writeCpUtf8(outputStream);
        writeCpInt(outputStream);
        writeCpFloat(outputStream);
        writeCpLong(outputStream);
        writeCpDouble(outputStream);
        writeCpString(outputStream);
        writeCpClass(outputStream);
        writeCpSignature(outputStream);
        writeCpDescr(outputStream);
        writeCpMethodOrField(this.cp_Field, outputStream, "cp_Field");
        writeCpMethodOrField(this.cp_Method, outputStream, "cp_Method");
        writeCpMethodOrField(this.cp_Imethod, outputStream, "cp_Imethod");
    }

    public final void writeCpUtf8(OutputStream outputStream) throws Pack200Exception, IOException {
        int i;
        PackingUtils.log("Writing " + this.cp_Utf8.size() + " UTF8 entries...");
        int i2 = 2;
        int size = this.cp_Utf8.size() - 2;
        int[] iArr = new int[size];
        int size2 = this.cp_Utf8.size() - 1;
        int[] iArr2 = new int[size2];
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        Object[] array = this.cp_Utf8.toArray();
        String underlyingString = ((CPUTF8) array[1]).getUnderlyingString();
        int i3 = 0;
        iArr2[0] = underlyingString.length();
        addCharacters(arrayList, underlyingString.toCharArray());
        while (i2 < array.length) {
            int i4 = i2 - 1;
            char[] charArray = ((CPUTF8) array[i4]).getUnderlyingString().toCharArray();
            String underlyingString2 = ((CPUTF8) array[i2]).getUnderlyingString();
            char[] charArray2 = underlyingString2.toCharArray();
            int i5 = size2;
            Object[] objArr = array;
            int i6 = i3;
            while (i3 < charArray.length) {
                char[] cArr = charArray;
                if (charArray[i3] != charArray2[i3]) {
                    break;
                }
                i6++;
                i3++;
                charArray = cArr;
            }
            iArr[i2 - 2] = i6;
            char[] charArray3 = underlyingString2.substring(i6).toCharArray();
            if (charArray3.length > 1000) {
                i = 0;
                iArr2[i4] = 0;
                arrayList2.add(Integer.valueOf(charArray3.length));
                addCharacters(arrayList3, charArray3);
            } else {
                i = 0;
                iArr2[i4] = charArray3.length;
                addCharacters(arrayList, charArray3);
            }
            i2++;
            i3 = i;
            array = objArr;
            size2 = i5;
        }
        int i7 = size2;
        int i8 = i3;
        int size3 = arrayList.size();
        int[] iArr3 = new int[size3];
        int size4 = arrayList2.size();
        int[] iArr4 = new int[size4];
        int size5 = arrayList2.size();
        int[][] iArr5 = new int[size5][];
        Arrays.setAll(iArr3, new IntUnaryOperator() { // from class: org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda4
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i9) {
                return CpBands.lambda$writeCpUtf8$0(arrayList, i9);
            }
        });
        for (int i9 = i8; i9 < size4; i9++) {
            int iIntValue = ((Integer) arrayList2.get(i9)).intValue();
            iArr4[i9] = iIntValue;
            int[] iArr6 = new int[iIntValue];
            iArr5[i9] = iArr6;
            Arrays.setAll(iArr6, new IntUnaryOperator() { // from class: org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda5
                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i10) {
                    return CpBands.lambda$writeCpUtf8$1(arrayList3, i10);
                }
            });
        }
        BHSDCodec bHSDCodec = Codec.DELTA5;
        byte[] bArrEncodeBandInt = encodeBandInt("cpUtf8Prefix", iArr, bHSDCodec);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from cpUtf8Prefix[" + size + "]");
        byte[] bArrEncodeBandInt2 = encodeBandInt("cpUtf8Suffix", iArr2, Codec.UNSIGNED5);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from cpUtf8Suffix[" + i7 + "]");
        byte[] bArrEncodeBandInt3 = encodeBandInt("cpUtf8Chars", iArr3, Codec.CHAR3);
        outputStream.write(bArrEncodeBandInt3);
        PackingUtils.log("Wrote " + bArrEncodeBandInt3.length + " bytes from cpUtf8Chars[" + size3 + "]");
        byte[] bArrEncodeBandInt4 = encodeBandInt("cpUtf8BigSuffix", iArr4, bHSDCodec);
        outputStream.write(bArrEncodeBandInt4);
        PackingUtils.log("Wrote " + bArrEncodeBandInt4.length + " bytes from cpUtf8BigSuffix[" + size4 + "]");
        for (int i10 = 0; i10 < size5; i10++) {
            byte[] bArrEncodeBandInt5 = encodeBandInt("cpUtf8BigChars " + i10, iArr5[i10], Codec.DELTA5);
            outputStream.write(bArrEncodeBandInt5);
            PackingUtils.log("Wrote " + bArrEncodeBandInt5.length + " bytes from cpUtf8BigChars" + i10 + "[" + iArr5[i10].length + "]");
        }
    }

    public static /* synthetic */ int lambda$writeCpUtf8$0(List list, int i) {
        return ((Character) list.get(i)).charValue();
    }

    public static /* synthetic */ int lambda$writeCpUtf8$1(List list, int i) {
        return ((Character) list.remove(0)).charValue();
    }

    public final void addCharacters(List<Character> list, char[] cArr) {
        for (char c : cArr) {
            list.add(Character.valueOf(c));
        }
    }

    public final void writeCpInt(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing " + this.cp_Int.size() + " Integer entries...");
        int size = this.cp_Int.size();
        int[] iArr = new int[size];
        Iterator<CPInt> it = this.cp_Int.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().getInt();
            i++;
        }
        byte[] bArrEncodeBandInt = encodeBandInt("cp_Int", iArr, Codec.UDELTA5);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from cp_Int[" + size + "]");
    }

    public final void writeCpFloat(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing " + this.cp_Float.size() + " Float entries...");
        int size = this.cp_Float.size();
        int[] iArr = new int[size];
        Iterator<CPFloat> it = this.cp_Float.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = Float.floatToIntBits(it.next().getFloat());
            i++;
        }
        byte[] bArrEncodeBandInt = encodeBandInt("cp_Float", iArr, Codec.UDELTA5);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from cp_Float[" + size + "]");
    }

    public final void writeCpLong(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing " + this.cp_Long.size() + " Long entries...");
        int size = this.cp_Long.size();
        int[] iArr = new int[size];
        int size2 = this.cp_Long.size();
        int[] iArr2 = new int[size2];
        Iterator<CPLong> it = this.cp_Long.iterator();
        int i = 0;
        while (it.hasNext()) {
            long j = it.next().getLong();
            iArr[i] = (int) (j >> 32);
            iArr2[i] = (int) j;
            i++;
        }
        byte[] bArrEncodeBandInt = encodeBandInt("cp_Long_hi", iArr, Codec.UDELTA5);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from cp_Long_hi[" + size + "]");
        byte[] bArrEncodeBandInt2 = encodeBandInt("cp_Long_lo", iArr2, Codec.DELTA5);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from cp_Long_lo[" + size2 + "]");
    }

    public final void writeCpDouble(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing " + this.cp_Double.size() + " Double entries...");
        int size = this.cp_Double.size();
        int[] iArr = new int[size];
        int size2 = this.cp_Double.size();
        int[] iArr2 = new int[size2];
        Iterator<CPDouble> it = this.cp_Double.iterator();
        int i = 0;
        while (it.hasNext()) {
            long jDoubleToLongBits = Double.doubleToLongBits(it.next().getDouble());
            iArr[i] = (int) (jDoubleToLongBits >> 32);
            iArr2[i] = (int) jDoubleToLongBits;
            i++;
        }
        byte[] bArrEncodeBandInt = encodeBandInt("cp_Double_hi", iArr, Codec.UDELTA5);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from cp_Double_hi[" + size + "]");
        byte[] bArrEncodeBandInt2 = encodeBandInt("cp_Double_lo", iArr2, Codec.DELTA5);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from cp_Double_lo[" + size2 + "]");
    }

    public final void writeCpString(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing " + this.cp_String.size() + " String entries...");
        int size = this.cp_String.size();
        int[] iArr = new int[size];
        Iterator<CPString> it = this.cp_String.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().getIndexInCpUtf8();
            i++;
        }
        byte[] bArrEncodeBandInt = encodeBandInt("cpString", iArr, Codec.UDELTA5);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from cpString[" + size + "]");
    }

    public final void writeCpClass(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing " + this.cp_Class.size() + " Class entries...");
        int size = this.cp_Class.size();
        int[] iArr = new int[size];
        Iterator<CPClass> it = this.cp_Class.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().getIndexInCpUtf8();
            i++;
        }
        byte[] bArrEncodeBandInt = encodeBandInt("cpClass", iArr, Codec.UDELTA5);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from cpClass[" + size + "]");
    }

    public final void writeCpSignature(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing " + this.cp_Signature.size() + " Signature entries...");
        int size = this.cp_Signature.size();
        int[] iArr = new int[size];
        final ArrayList arrayList = new ArrayList();
        int i = 0;
        for (CPSignature cPSignature : this.cp_Signature) {
            arrayList.addAll(cPSignature.getClasses());
            iArr[i] = cPSignature.getIndexInCpUtf8();
            i++;
        }
        int size2 = arrayList.size();
        int[] iArr2 = new int[size2];
        Arrays.setAll(iArr2, new IntUnaryOperator() { // from class: org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda3
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                return CpBands.lambda$writeCpSignature$2(arrayList, i2);
            }
        });
        byte[] bArrEncodeBandInt = encodeBandInt("cpSignatureForm", iArr, Codec.DELTA5);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from cpSignatureForm[" + size + "]");
        byte[] bArrEncodeBandInt2 = encodeBandInt("cpSignatureClasses", iArr2, Codec.UDELTA5);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from cpSignatureClasses[" + size2 + "]");
    }

    public static /* synthetic */ int lambda$writeCpSignature$2(List list, int i) {
        return ((CPClass) list.get(i)).getIndex();
    }

    public final void writeCpDescr(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing " + this.cp_Descr.size() + " Descriptor entries...");
        int size = this.cp_Descr.size();
        int[] iArr = new int[size];
        int size2 = this.cp_Descr.size();
        int[] iArr2 = new int[size2];
        int i = 0;
        for (CPNameAndType cPNameAndType : this.cp_Descr) {
            iArr[i] = cPNameAndType.getNameIndex();
            iArr2[i] = cPNameAndType.getTypeIndex();
            i++;
        }
        byte[] bArrEncodeBandInt = encodeBandInt("cp_Descr_Name", iArr, Codec.DELTA5);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from cp_Descr_Name[" + size + "]");
        byte[] bArrEncodeBandInt2 = encodeBandInt("cp_Descr_Type", iArr2, Codec.UDELTA5);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from cp_Descr_Type[" + size2 + "]");
    }

    public final void writeCpMethodOrField(Set<CPMethodOrField> set, OutputStream outputStream, String str) throws Pack200Exception, IOException {
        PackingUtils.log("Writing " + set.size() + " Method and Field entries...");
        int size = set.size();
        int[] iArr = new int[size];
        int size2 = set.size();
        int[] iArr2 = new int[size2];
        int i = 0;
        for (CPMethodOrField cPMethodOrField : set) {
            iArr[i] = cPMethodOrField.getClassIndex();
            iArr2[i] = cPMethodOrField.getDescIndex();
            i++;
        }
        byte[] bArrEncodeBandInt = encodeBandInt(str + "_class", iArr, Codec.DELTA5);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from " + str + "_class[" + size + "]");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_desc");
        byte[] bArrEncodeBandInt2 = encodeBandInt(sb.toString(), iArr2, Codec.UDELTA5);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from " + str + "_desc[" + size2 + "]");
    }

    public void finaliseBands() {
        addCPUtf8("");
        removeSignaturesFromCpUTF8();
        addIndices();
        this.segmentHeader.setCp_Utf8_count(this.cp_Utf8.size());
        this.segmentHeader.setCp_Int_count(this.cp_Int.size());
        this.segmentHeader.setCp_Float_count(this.cp_Float.size());
        this.segmentHeader.setCp_Long_count(this.cp_Long.size());
        this.segmentHeader.setCp_Double_count(this.cp_Double.size());
        this.segmentHeader.setCp_String_count(this.cp_String.size());
        this.segmentHeader.setCp_Class_count(this.cp_Class.size());
        this.segmentHeader.setCp_Signature_count(this.cp_Signature.size());
        this.segmentHeader.setCp_Descr_count(this.cp_Descr.size());
        this.segmentHeader.setCp_Field_count(this.cp_Field.size());
        this.segmentHeader.setCp_Method_count(this.cp_Method.size());
        this.segmentHeader.setCp_Imethod_count(this.cp_Imethod.size());
    }

    public final void removeSignaturesFromCpUTF8() {
        this.cp_Signature.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.lambda$removeSignaturesFromCpUTF8$3((CPSignature) obj);
            }
        });
    }

    public final /* synthetic */ void lambda$removeSignaturesFromCpUTF8$3(CPSignature cPSignature) {
        String underlyingString = cPSignature.getUnderlyingString();
        if (underlyingString.equals(cPSignature.getSignatureForm().getUnderlyingString())) {
            return;
        }
        removeCpUtf8(underlyingString);
    }

    public final void addIndices() {
        Iterator it = Arrays.asList(this.cp_Utf8, this.cp_Int, this.cp_Float, this.cp_Long, this.cp_Double, this.cp_String, this.cp_Class, this.cp_Signature, this.cp_Descr, this.cp_Field, this.cp_Method, this.cp_Imethod).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Set) it.next()).iterator();
            int i = 0;
            while (it2.hasNext()) {
                ((ConstantPoolEntry) it2.next()).setIndex(i);
                i++;
            }
        }
        final HashMap map = new HashMap();
        this.cp_Field.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CpBands.lambda$addIndices$4(map, (CPMethodOrField) obj);
            }
        });
        map.clear();
        final HashMap map2 = new HashMap();
        this.cp_Method.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CpBands.lambda$addIndices$5(map, map2, (CPMethodOrField) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$addIndices$4(Map map, CPMethodOrField cPMethodOrField) {
        CPClass className = cPMethodOrField.getClassName();
        Integer num = (Integer) map.get(className);
        if (num == null) {
            map.put(className, 1);
            cPMethodOrField.setIndexInClass(0);
        } else {
            int iIntValue = num.intValue();
            cPMethodOrField.setIndexInClass(iIntValue);
            map.put(className, Integer.valueOf(iIntValue + 1));
        }
    }

    public static /* synthetic */ void lambda$addIndices$5(Map map, Map map2, CPMethodOrField cPMethodOrField) {
        CPClass className = cPMethodOrField.getClassName();
        Integer num = (Integer) map.get(className);
        if (num == null) {
            map.put(className, 1);
            cPMethodOrField.setIndexInClass(0);
        } else {
            int iIntValue = num.intValue();
            cPMethodOrField.setIndexInClass(iIntValue);
            map.put(className, Integer.valueOf(iIntValue + 1));
        }
        if (cPMethodOrField.getDesc().getName().equals(SegmentConstantPool.INITSTRING)) {
            Integer num2 = (Integer) map2.get(className);
            if (num2 == null) {
                map2.put(className, 1);
                cPMethodOrField.setIndexInClassForConstructor(0);
            } else {
                int iIntValue2 = num2.intValue();
                cPMethodOrField.setIndexInClassForConstructor(iIntValue2);
                map2.put(className, Integer.valueOf(iIntValue2 + 1));
            }
        }
    }

    public final void removeCpUtf8(String str) {
        CPUTF8 cputf8 = this.stringsToCpUtf8.get(str);
        if (cputf8 == null || this.stringsToCpClass.get(str) != null) {
            return;
        }
        this.stringsToCpUtf8.remove(str);
        this.cp_Utf8.remove(cputf8);
    }

    public void addCPUtf8(String str) {
        getCPUtf8(str);
    }

    public CPUTF8 getCPUtf8(String str) {
        if (str == null) {
            return null;
        }
        CPUTF8 cputf8 = this.stringsToCpUtf8.get(str);
        if (cputf8 != null) {
            return cputf8;
        }
        CPUTF8 cputf82 = new CPUTF8(str);
        this.cp_Utf8.add(cputf82);
        this.stringsToCpUtf8.put(str, cputf82);
        return cputf82;
    }

    public CPSignature getCPSignature(String str) {
        CPUTF8 cPUtf8;
        CPClass cPClass;
        if (str == null) {
            return null;
        }
        CPSignature cPSignature = this.stringsToCpSignature.get(str);
        if (cPSignature != null) {
            return cPSignature;
        }
        ArrayList arrayList = new ArrayList();
        if (str.length() > 1 && str.indexOf(76) != -1) {
            ArrayList<String> arrayList2 = new ArrayList();
            char[] charArray = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < charArray.length) {
                sb.append(charArray[i]);
                if (charArray[i] == 'L') {
                    StringBuilder sb2 = new StringBuilder();
                    int i2 = i + 1;
                    while (true) {
                        if (i2 < charArray.length) {
                            char c = charArray[i2];
                            if (!Character.isLetter(c) && !Character.isDigit(c) && c != '/' && c != '$' && c != '_') {
                                arrayList2.add(sb2.toString());
                                i = i2 - 1;
                                break;
                            }
                            sb2.append(c);
                            i2++;
                        }
                    }
                }
                i++;
            }
            removeCpUtf8(str);
            for (String str2 : arrayList2) {
                if (str2 != null) {
                    String strReplace = str2.replace('.', '/');
                    cPClass = this.stringsToCpClass.get(strReplace);
                    if (cPClass == null) {
                        CPClass cPClass2 = new CPClass(getCPUtf8(strReplace));
                        this.cp_Class.add(cPClass2);
                        this.stringsToCpClass.put(strReplace, cPClass2);
                        cPClass = cPClass2;
                    }
                } else {
                    cPClass = null;
                }
                arrayList.add(cPClass);
            }
            cPUtf8 = getCPUtf8(sb.toString());
        } else {
            cPUtf8 = getCPUtf8(str);
        }
        CPSignature cPSignature2 = new CPSignature(str, cPUtf8, arrayList);
        this.cp_Signature.add(cPSignature2);
        this.stringsToCpSignature.put(str, cPSignature2);
        return cPSignature2;
    }

    public CPClass getCPClass(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('.', '/');
        CPClass cPClass = this.stringsToCpClass.get(strReplace);
        if (cPClass == null) {
            CPClass cPClass2 = new CPClass(getCPUtf8(strReplace));
            this.cp_Class.add(cPClass2);
            this.stringsToCpClass.put(strReplace, cPClass2);
            cPClass = cPClass2;
        }
        if (cPClass.isInnerClass()) {
            this.segment.getClassBands().currentClassReferencesInnerClass(cPClass);
        }
        return cPClass;
    }

    public void addCPClass(String str) {
        getCPClass(str);
    }

    public CPNameAndType getCPNameAndType(String str, String str2) {
        String str3 = str + StringUtils.PROCESS_POSTFIX_DELIMITER + str2;
        CPNameAndType cPNameAndType = this.stringsToCpNameAndType.get(str3);
        if (cPNameAndType != null) {
            return cPNameAndType;
        }
        CPNameAndType cPNameAndType2 = new CPNameAndType(getCPUtf8(str), getCPSignature(str2));
        this.stringsToCpNameAndType.put(str3, cPNameAndType2);
        this.cp_Descr.add(cPNameAndType2);
        return cPNameAndType2;
    }

    public CPMethodOrField getCPField(CPClass cPClass, String str, String str2) {
        String str3 = cPClass.toString() + StringUtils.PROCESS_POSTFIX_DELIMITER + str + StringUtils.PROCESS_POSTFIX_DELIMITER + str2;
        CPMethodOrField cPMethodOrField = this.stringsToCpField.get(str3);
        if (cPMethodOrField != null) {
            return cPMethodOrField;
        }
        CPMethodOrField cPMethodOrField2 = new CPMethodOrField(cPClass, getCPNameAndType(str, str2));
        this.cp_Field.add(cPMethodOrField2);
        this.stringsToCpField.put(str3, cPMethodOrField2);
        return cPMethodOrField2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CPConstant<?> getConstant(Object obj) {
        CPConstant<?> cPClass = this.objectsToCPConstant.get(obj);
        if (cPClass == null) {
            if (obj instanceof Integer) {
                cPClass = new CPInt(((Integer) obj).intValue());
                this.cp_Int.add(cPClass);
            } else if (obj instanceof Long) {
                cPClass = new CPLong(((Long) obj).longValue());
                this.cp_Long.add(cPClass);
            } else if (obj instanceof Float) {
                cPClass = new CPFloat(((Float) obj).floatValue());
                this.cp_Float.add(cPClass);
            } else if (obj instanceof Double) {
                cPClass = new CPDouble(((Double) obj).doubleValue());
                this.cp_Double.add(cPClass);
            } else if (obj instanceof String) {
                cPClass = new CPString(getCPUtf8((String) obj));
                this.cp_String.add(cPClass);
            } else if (obj instanceof Type) {
                String className = ((Type) obj).getClassName();
                if (className.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                    String str = "[L" + className.substring(0, className.length() - 2);
                    while (str.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                        str = "[" + str.substring(0, str.length() - 2);
                    }
                    className = str + PropertiesParser.PROPS_SEPARATOR;
                }
                cPClass = getCPClass(className);
            }
            this.objectsToCPConstant.put(obj, cPClass);
        }
        return cPClass;
    }

    public CPMethodOrField getCPMethod(CPClass cPClass, String str, String str2) {
        String str3 = cPClass.toString() + StringUtils.PROCESS_POSTFIX_DELIMITER + str + StringUtils.PROCESS_POSTFIX_DELIMITER + str2;
        CPMethodOrField cPMethodOrField = this.stringsToCpMethod.get(str3);
        if (cPMethodOrField != null) {
            return cPMethodOrField;
        }
        CPMethodOrField cPMethodOrField2 = new CPMethodOrField(cPClass, getCPNameAndType(str, str2));
        this.cp_Method.add(cPMethodOrField2);
        this.stringsToCpMethod.put(str3, cPMethodOrField2);
        return cPMethodOrField2;
    }

    public CPMethodOrField getCPIMethod(CPClass cPClass, String str, String str2) {
        String str3 = cPClass.toString() + StringUtils.PROCESS_POSTFIX_DELIMITER + str + StringUtils.PROCESS_POSTFIX_DELIMITER + str2;
        CPMethodOrField cPMethodOrField = this.stringsToCpIMethod.get(str3);
        if (cPMethodOrField != null) {
            return cPMethodOrField;
        }
        CPMethodOrField cPMethodOrField2 = new CPMethodOrField(cPClass, getCPNameAndType(str, str2));
        this.cp_Imethod.add(cPMethodOrField2);
        this.stringsToCpIMethod.put(str3, cPMethodOrField2);
        return cPMethodOrField2;
    }

    public CPMethodOrField getCPField(String str, String str2, String str3) {
        return getCPField(getCPClass(str), str2, str3);
    }

    public CPMethodOrField getCPMethod(String str, String str2, String str3) {
        return getCPMethod(getCPClass(str), str2, str3);
    }

    public CPMethodOrField getCPIMethod(String str, String str2, String str3) {
        return getCPIMethod(getCPClass(str), str2, str3);
    }

    public boolean existsCpClass(String str) {
        return this.stringsToCpClass.get(str) != null;
    }
}
