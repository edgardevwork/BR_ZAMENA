package org.apache.commons.compress.harmony.pack200;

import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.p007ts.H262Reader;
import androidx.media3.extractor.p007ts.H263Reader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.objectweb.asm.Label;

/* loaded from: classes6.dex */
public class BcBands extends BandSet {
    public static final int ALOAD_0 = 42;
    public static final int IINC = 132;
    public static final int INVOKEINTERFACE = 185;
    public static final int LOOKUPSWITCH = 171;
    public static final int MULTIANEWARRAY = 197;
    public static final int TABLESWITCH = 170;
    public static final int WIDE = 196;
    public static final int endMarker = 255;
    public final IntList bcByte;
    public final IntList bcCaseCount;
    public final IntList bcCaseValue;
    public final List<CPClass> bcClassRef;
    public final IntList bcCodes;
    public final List<CPDouble> bcDoubleRef;
    public final List<CPMethodOrField> bcFieldRef;
    public final List<CPFloat> bcFloatRef;
    public final List<CPMethodOrField> bcIMethodRef;
    public List bcInitRef;
    public final List<CPInt> bcIntref;
    public final List bcLabel;
    public final IntList bcLabelRelativeOffsets;
    public final IntList bcLocal;
    public final List<CPLong> bcLongRef;
    public final List<CPMethodOrField> bcMethodRef;
    public final IntList bcShort;
    public final List<CPString> bcStringRef;
    public final List bcSuperField;
    public List bcSuperMethod;
    public List bcThisField;
    public List bcThisMethod;
    public final IntList bciRenumbering;
    public int byteCodeOffset;
    public final CpBands cpBands;
    public String currentClass;
    public String currentNewClass;
    public final Map<Label, Integer> labelsToOffsets;
    public int renumberedOffset;
    public final Segment segment;
    public String superClass;

    public BcBands(CpBands cpBands, Segment segment, int i) {
        super(i, segment.getSegmentHeader());
        this.bcCodes = new IntList();
        this.bcCaseCount = new IntList();
        this.bcCaseValue = new IntList();
        this.bcByte = new IntList();
        this.bcShort = new IntList();
        this.bcLocal = new IntList();
        this.bcLabel = new ArrayList();
        this.bcIntref = new ArrayList();
        this.bcFloatRef = new ArrayList();
        this.bcLongRef = new ArrayList();
        this.bcDoubleRef = new ArrayList();
        this.bcStringRef = new ArrayList();
        this.bcClassRef = new ArrayList();
        this.bcFieldRef = new ArrayList();
        this.bcMethodRef = new ArrayList();
        this.bcIMethodRef = new ArrayList();
        this.bcThisField = new ArrayList();
        this.bcSuperField = new ArrayList();
        this.bcThisMethod = new ArrayList();
        this.bcSuperMethod = new ArrayList();
        this.bcInitRef = new ArrayList();
        this.bciRenumbering = new IntList();
        this.labelsToOffsets = new HashMap();
        this.bcLabelRelativeOffsets = new IntList();
        this.cpBands = cpBands;
        this.segment = segment;
    }

    public void setCurrentClass(String str, String str2) {
        this.currentClass = str;
        this.superClass = str2;
    }

    public void finaliseBands() {
        this.bcThisField = getIndexInClass(this.bcThisField);
        this.bcThisMethod = getIndexInClass(this.bcThisMethod);
        this.bcSuperMethod = getIndexInClass(this.bcSuperMethod);
        this.bcInitRef = getIndexInClassForConstructor(this.bcInitRef);
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing byte code bands...");
        int[] array = this.bcCodes.toArray();
        BHSDCodec bHSDCodec = Codec.BYTE1;
        byte[] bArrEncodeBandInt = encodeBandInt("bcCodes", array, bHSDCodec);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from bcCodes[" + this.bcCodes.size() + "]");
        int[] array2 = this.bcCaseCount.toArray();
        BHSDCodec bHSDCodec2 = Codec.UNSIGNED5;
        byte[] bArrEncodeBandInt2 = encodeBandInt("bcCaseCount", array2, bHSDCodec2);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from bcCaseCount[" + this.bcCaseCount.size() + "]");
        int[] array3 = this.bcCaseValue.toArray();
        BHSDCodec bHSDCodec3 = Codec.DELTA5;
        byte[] bArrEncodeBandInt3 = encodeBandInt("bcCaseValue", array3, bHSDCodec3);
        outputStream.write(bArrEncodeBandInt3);
        PackingUtils.log("Wrote " + bArrEncodeBandInt3.length + " bytes from bcCaseValue[" + this.bcCaseValue.size() + "]");
        byte[] bArrEncodeBandInt4 = encodeBandInt("bcByte", this.bcByte.toArray(), bHSDCodec);
        outputStream.write(bArrEncodeBandInt4);
        PackingUtils.log("Wrote " + bArrEncodeBandInt4.length + " bytes from bcByte[" + this.bcByte.size() + "]");
        byte[] bArrEncodeBandInt5 = encodeBandInt("bcShort", this.bcShort.toArray(), bHSDCodec3);
        outputStream.write(bArrEncodeBandInt5);
        PackingUtils.log("Wrote " + bArrEncodeBandInt5.length + " bytes from bcShort[" + this.bcShort.size() + "]");
        byte[] bArrEncodeBandInt6 = encodeBandInt("bcLocal", this.bcLocal.toArray(), bHSDCodec2);
        outputStream.write(bArrEncodeBandInt6);
        PackingUtils.log("Wrote " + bArrEncodeBandInt6.length + " bytes from bcLocal[" + this.bcLocal.size() + "]");
        byte[] bArrEncodeBandInt7 = encodeBandInt("bcLabel", integerListToArray(this.bcLabel), Codec.BRANCH5);
        outputStream.write(bArrEncodeBandInt7);
        PackingUtils.log("Wrote " + bArrEncodeBandInt7.length + " bytes from bcLabel[" + this.bcLabel.size() + "]");
        byte[] bArrEncodeBandInt8 = encodeBandInt("bcIntref", cpEntryListToArray(this.bcIntref), bHSDCodec3);
        outputStream.write(bArrEncodeBandInt8);
        PackingUtils.log("Wrote " + bArrEncodeBandInt8.length + " bytes from bcIntref[" + this.bcIntref.size() + "]");
        byte[] bArrEncodeBandInt9 = encodeBandInt("bcFloatRef", cpEntryListToArray(this.bcFloatRef), bHSDCodec3);
        outputStream.write(bArrEncodeBandInt9);
        PackingUtils.log("Wrote " + bArrEncodeBandInt9.length + " bytes from bcFloatRef[" + this.bcFloatRef.size() + "]");
        byte[] bArrEncodeBandInt10 = encodeBandInt("bcLongRef", cpEntryListToArray(this.bcLongRef), bHSDCodec3);
        outputStream.write(bArrEncodeBandInt10);
        PackingUtils.log("Wrote " + bArrEncodeBandInt10.length + " bytes from bcLongRef[" + this.bcLongRef.size() + "]");
        byte[] bArrEncodeBandInt11 = encodeBandInt("bcDoubleRef", cpEntryListToArray(this.bcDoubleRef), bHSDCodec3);
        outputStream.write(bArrEncodeBandInt11);
        PackingUtils.log("Wrote " + bArrEncodeBandInt11.length + " bytes from bcDoubleRef[" + this.bcDoubleRef.size() + "]");
        byte[] bArrEncodeBandInt12 = encodeBandInt("bcStringRef", cpEntryListToArray(this.bcStringRef), bHSDCodec3);
        outputStream.write(bArrEncodeBandInt12);
        PackingUtils.log("Wrote " + bArrEncodeBandInt12.length + " bytes from bcStringRef[" + this.bcStringRef.size() + "]");
        byte[] bArrEncodeBandInt13 = encodeBandInt("bcClassRef", cpEntryOrNullListToArray(this.bcClassRef), bHSDCodec2);
        outputStream.write(bArrEncodeBandInt13);
        PackingUtils.log("Wrote " + bArrEncodeBandInt13.length + " bytes from bcClassRef[" + this.bcClassRef.size() + "]");
        byte[] bArrEncodeBandInt14 = encodeBandInt("bcFieldRef", cpEntryListToArray(this.bcFieldRef), bHSDCodec3);
        outputStream.write(bArrEncodeBandInt14);
        PackingUtils.log("Wrote " + bArrEncodeBandInt14.length + " bytes from bcFieldRef[" + this.bcFieldRef.size() + "]");
        byte[] bArrEncodeBandInt15 = encodeBandInt("bcMethodRef", cpEntryListToArray(this.bcMethodRef), bHSDCodec2);
        outputStream.write(bArrEncodeBandInt15);
        PackingUtils.log("Wrote " + bArrEncodeBandInt15.length + " bytes from bcMethodRef[" + this.bcMethodRef.size() + "]");
        byte[] bArrEncodeBandInt16 = encodeBandInt("bcIMethodRef", cpEntryListToArray(this.bcIMethodRef), bHSDCodec3);
        outputStream.write(bArrEncodeBandInt16);
        PackingUtils.log("Wrote " + bArrEncodeBandInt16.length + " bytes from bcIMethodRef[" + this.bcIMethodRef.size() + "]");
        byte[] bArrEncodeBandInt17 = encodeBandInt("bcThisField", integerListToArray(this.bcThisField), bHSDCodec2);
        outputStream.write(bArrEncodeBandInt17);
        PackingUtils.log("Wrote " + bArrEncodeBandInt17.length + " bytes from bcThisField[" + this.bcThisField.size() + "]");
        byte[] bArrEncodeBandInt18 = encodeBandInt("bcSuperField", integerListToArray(this.bcSuperField), bHSDCodec2);
        outputStream.write(bArrEncodeBandInt18);
        PackingUtils.log("Wrote " + bArrEncodeBandInt18.length + " bytes from bcSuperField[" + this.bcSuperField.size() + "]");
        byte[] bArrEncodeBandInt19 = encodeBandInt("bcThisMethod", integerListToArray(this.bcThisMethod), bHSDCodec2);
        outputStream.write(bArrEncodeBandInt19);
        PackingUtils.log("Wrote " + bArrEncodeBandInt19.length + " bytes from bcThisMethod[" + this.bcThisMethod.size() + "]");
        byte[] bArrEncodeBandInt20 = encodeBandInt("bcSuperMethod", integerListToArray(this.bcSuperMethod), bHSDCodec2);
        outputStream.write(bArrEncodeBandInt20);
        PackingUtils.log("Wrote " + bArrEncodeBandInt20.length + " bytes from bcSuperMethod[" + this.bcSuperMethod.size() + "]");
        byte[] bArrEncodeBandInt21 = encodeBandInt("bcInitRef", integerListToArray(this.bcInitRef), bHSDCodec2);
        outputStream.write(bArrEncodeBandInt21);
        PackingUtils.log("Wrote " + bArrEncodeBandInt21.length + " bytes from bcInitRef[" + this.bcInitRef.size() + "]");
    }

    public final List<Integer> getIndexInClass(List<CPMethodOrField> list) {
        return (List) list.stream().collect(Collectors.mapping(new Function() { // from class: org.apache.commons.compress.harmony.pack200.BcBands$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((CPMethodOrField) obj).getIndexInClass());
            }
        }, Collectors.toList()));
    }

    public final List<Integer> getIndexInClassForConstructor(List<CPMethodOrField> list) {
        return (List) list.stream().collect(Collectors.mapping(new Function() { // from class: org.apache.commons.compress.harmony.pack200.BcBands$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((CPMethodOrField) obj).getIndexInClassForConstructor());
            }
        }, Collectors.toList()));
    }

    public void visitEnd() {
        for (int i = 0; i < this.bciRenumbering.size(); i++) {
            if (this.bciRenumbering.get(i) == -1) {
                this.bciRenumbering.remove(i);
                IntList intList = this.bciRenumbering;
                int i2 = this.renumberedOffset + 1;
                this.renumberedOffset = i2;
                intList.add(i, i2);
            }
        }
        int i3 = this.renumberedOffset;
        if (i3 != 0) {
            if (i3 + 1 != this.bciRenumbering.size()) {
                throw new IllegalStateException("Mistake made with renumbering");
            }
            for (int size = this.bcLabel.size() - 1; size >= 0; size--) {
                Object obj = this.bcLabel.get(size);
                if (obj instanceof Integer) {
                    break;
                }
                if (obj instanceof Label) {
                    this.bcLabel.remove(size);
                    this.bcLabel.add(size, Integer.valueOf(this.bciRenumbering.get(this.labelsToOffsets.get(obj).intValue()) - this.bciRenumbering.get(this.bcLabelRelativeOffsets.get(size))));
                }
            }
            this.bcCodes.add(255);
            this.segment.getClassBands().doBciRenumbering(this.bciRenumbering, this.labelsToOffsets);
            this.bciRenumbering.clear();
            this.labelsToOffsets.clear();
            this.byteCodeOffset = 0;
            this.renumberedOffset = 0;
        }
    }

    public void visitLabel(Label label) {
        this.labelsToOffsets.put(label, Integer.valueOf(this.byteCodeOffset));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        boolean z;
        this.byteCodeOffset += 3;
        updateRenumbering();
        if (this.bcCodes.size() > 0) {
            IntList intList = this.bcCodes;
            z = true;
            if (intList.get(intList.size() - 1) == 42) {
                IntList intList2 = this.bcCodes;
                intList2.remove(intList2.size() - 1);
            } else {
                z = false;
            }
        }
        CPMethodOrField cPField = this.cpBands.getCPField(str, str2, str3);
        if (z) {
            i += 7;
        }
        if (str.equals(this.currentClass)) {
            i += 24;
            this.bcThisField.add(cPField);
        } else {
            if (z) {
                i -= 7;
                this.bcCodes.add(42);
            }
            this.bcFieldRef.add(cPField);
        }
        this.bcCodes.add(i);
    }

    public final void updateRenumbering() {
        if (this.bciRenumbering.isEmpty()) {
            this.bciRenumbering.add(0);
        }
        this.renumberedOffset++;
        for (int size = this.bciRenumbering.size(); size < this.byteCodeOffset; size++) {
            this.bciRenumbering.add(-1);
        }
        this.bciRenumbering.add(this.renumberedOffset);
    }

    public void visitIincInsn(int i, int i2) {
        if (i > 255 || i2 > 255) {
            this.byteCodeOffset += 6;
            this.bcCodes.add(WIDE);
            this.bcCodes.add(132);
            this.bcLocal.add(i);
            this.bcShort.add(i2);
        } else {
            this.byteCodeOffset += 3;
            this.bcCodes.add(132);
            this.bcLocal.add(i);
            this.bcByte.add(i2 & 255);
        }
        updateRenumbering();
    }

    public void visitInsn(int i) {
        if (i >= 202) {
            throw new IllegalArgumentException("Non-standard bytecode instructions not supported");
        }
        this.bcCodes.add(i);
        this.byteCodeOffset++;
        updateRenumbering();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void visitIntInsn(int i, int i2) {
        if (i == 16) {
            this.bcCodes.add(i);
            this.bcByte.add(i2 & 255);
            this.byteCodeOffset += 2;
        } else if (i == 17) {
            this.bcCodes.add(i);
            this.bcShort.add(i2);
            this.byteCodeOffset += 3;
        } else if (i == 188) {
        }
        updateRenumbering();
    }

    public void visitJumpInsn(int i, Label label) {
        this.bcCodes.add(i);
        this.bcLabel.add(label);
        this.bcLabelRelativeOffsets.add(this.byteCodeOffset);
        this.byteCodeOffset += 3;
        updateRenumbering();
    }

    public void visitLdcInsn(Object obj) {
        CPConstant<?> constant = this.cpBands.getConstant(obj);
        if (this.segment.lastConstantHadWideIndex() || (constant instanceof CPLong) || (constant instanceof CPDouble)) {
            this.byteCodeOffset += 3;
            if (constant instanceof CPInt) {
                this.bcCodes.add(237);
                this.bcIntref.add((CPInt) constant);
            } else if (constant instanceof CPFloat) {
                this.bcCodes.add(MatroskaExtractor.ID_BLOCK_ADD_ID);
                this.bcFloatRef.add((CPFloat) constant);
            } else if (constant instanceof CPLong) {
                this.bcCodes.add(20);
                this.bcLongRef.add((CPLong) constant);
            } else if (constant instanceof CPDouble) {
                this.bcCodes.add(239);
                this.bcDoubleRef.add((CPDouble) constant);
            } else if (constant instanceof CPString) {
                this.bcCodes.add(19);
                this.bcStringRef.add((CPString) constant);
            } else if (constant instanceof CPClass) {
                this.bcCodes.add(236);
                this.bcClassRef.add((CPClass) constant);
            } else {
                throw new IllegalArgumentException("Constant should not be null");
            }
        } else {
            this.byteCodeOffset += 2;
            if (constant instanceof CPInt) {
                this.bcCodes.add(ArjArchiveInputStream.ARJ_MAGIC_2);
                this.bcIntref.add((CPInt) constant);
            } else if (constant instanceof CPFloat) {
                this.bcCodes.add(235);
                this.bcFloatRef.add((CPFloat) constant);
            } else if (constant instanceof CPString) {
                this.bcCodes.add(18);
                this.bcStringRef.add((CPString) constant);
            } else if (constant instanceof CPClass) {
                this.bcCodes.add(233);
                this.bcClassRef.add((CPClass) constant);
            }
        }
        updateRenumbering();
    }

    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.bcCodes.add(LOOKUPSWITCH);
        this.bcLabel.add(label);
        this.bcLabelRelativeOffsets.add(this.byteCodeOffset);
        this.bcCaseCount.add(iArr.length);
        for (int i = 0; i < labelArr.length; i++) {
            this.bcCaseValue.add(iArr[i]);
            this.bcLabel.add(labelArr[i]);
            this.bcLabelRelativeOffsets.add(this.byteCodeOffset);
        }
        int i2 = this.byteCodeOffset;
        this.byteCodeOffset = i2 + ((i2 + 1) % 4 != 0 ? 4 - ((i2 + 1) % 4) : 0) + 9 + (iArr.length * 8);
        updateRenumbering();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void visitMethodInsn(int i, String str, String str2, String str3) {
        int i2 = this.byteCodeOffset;
        this.byteCodeOffset = i2 + 3;
        switch (i) {
            case H263Reader.START_CODE_VALUE_VOP /* 182 */:
            case MatroskaExtractor.ID_CUE_TRACK_POSITIONS /* 183 */:
            case H262Reader.START_GROUP /* 184 */:
                if (this.bcCodes.size() > 0) {
                    IntList intList = this.bcCodes;
                    boolean z = true;
                    if (intList.get(intList.size() - 1) == 42) {
                        IntList intList2 = this.bcCodes;
                        intList2.remove(intList2.size() - 1);
                        i += 7;
                    } else {
                        z = false;
                    }
                    if (str.equals(this.currentClass)) {
                        i += 24;
                        if (str2.equals(SegmentConstantPool.INITSTRING) && i == 207) {
                            this.bcInitRef.add(this.cpBands.getCPMethod(str, str2, str3));
                            i = 230;
                        } else {
                            this.bcThisMethod.add(this.cpBands.getCPMethod(str, str2, str3));
                        }
                    } else if (str.equals(this.superClass)) {
                        i += 38;
                        if (str2.equals(SegmentConstantPool.INITSTRING) && i == 221) {
                            this.bcInitRef.add(this.cpBands.getCPMethod(str, str2, str3));
                            i = MatroskaExtractor.ID_TIME_CODE;
                        } else {
                            this.bcSuperMethod.add(this.cpBands.getCPMethod(str, str2, str3));
                        }
                    } else {
                        if (z) {
                            i -= 7;
                            this.bcCodes.add(42);
                        }
                        if (str2.equals(SegmentConstantPool.INITSTRING) && i == 183 && str.equals(this.currentNewClass)) {
                            this.bcInitRef.add(this.cpBands.getCPMethod(str, str2, str3));
                            i = 232;
                        } else {
                            this.bcMethodRef.add(this.cpBands.getCPMethod(str, str2, str3));
                        }
                    }
                    this.bcCodes.add(i);
                    break;
                }
                break;
            case INVOKEINTERFACE /* 185 */:
                this.byteCodeOffset = i2 + 5;
                this.bcIMethodRef.add(this.cpBands.getCPIMethod(str, str2, str3));
                this.bcCodes.add(INVOKEINTERFACE);
                break;
        }
        updateRenumbering();
    }

    public void visitMultiANewArrayInsn(String str, int i) {
        this.byteCodeOffset += 4;
        updateRenumbering();
        this.bcCodes.add(MULTIANEWARRAY);
        this.bcClassRef.add(this.cpBands.getCPClass(str));
        this.bcByte.add(i & 255);
    }

    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        this.bcCodes.add(170);
        this.bcLabel.add(label);
        this.bcLabelRelativeOffsets.add(this.byteCodeOffset);
        this.bcCaseValue.add(i);
        this.bcCaseCount.add(labelArr.length);
        for (Label label2 : labelArr) {
            this.bcLabel.add(label2);
            this.bcLabelRelativeOffsets.add(this.byteCodeOffset);
        }
        int i3 = this.byteCodeOffset;
        this.byteCodeOffset = i3 + (i3 % 4 != 0 ? 4 - (i3 % 4) : 0) + 12 + (labelArr.length * 4);
        updateRenumbering();
    }

    public void visitTypeInsn(int i, String str) {
        this.byteCodeOffset += 3;
        updateRenumbering();
        this.bcCodes.add(i);
        this.bcClassRef.add(this.cpBands.getCPClass(str));
        if (i == 187) {
            this.currentNewClass = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void visitVarInsn(int i, int i2) {
        if (i2 > 255) {
            this.byteCodeOffset += 4;
            this.bcCodes.add(WIDE);
            this.bcCodes.add(i);
            this.bcLocal.add(i2);
        } else if (i2 > 3 || i == 169) {
            this.byteCodeOffset += 2;
            this.bcCodes.add(i);
            this.bcLocal.add(i2);
        } else {
            this.byteCodeOffset++;
            switch (i) {
                case 21:
                    this.bcCodes.add(i + 5 + i2);
                    break;
                case 22:
                    this.bcCodes.add(i + 8 + i2);
                    break;
                case 23:
                    this.bcCodes.add(i + 11 + i2);
                    break;
                case 24:
                    this.bcCodes.add(i + 14 + i2);
                    break;
                case 25:
                    this.bcCodes.add(i + 17 + i2);
                    break;
                default:
                    switch (i) {
                    }
            }
        }
        updateRenumbering();
    }
}
