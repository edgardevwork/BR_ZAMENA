package org.apache.commons.compress.harmony.pack200;

import com.blackhub.bronline.launcher.LauncherConstants;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToIntFunction;

/* loaded from: classes6.dex */
public class MetadataBandGroup extends BandSet {
    public static final int CONTEXT_CLASS = 0;
    public static final int CONTEXT_FIELD = 1;
    public static final int CONTEXT_METHOD = 2;

    /* renamed from: T */
    public List<String> f9873T;
    public IntList anno_N;
    public List<CPConstant<?>> caseD_KD;
    public List<CPConstant<?>> caseF_KF;
    public List<CPConstant<?>> caseI_KI;
    public List<CPConstant<?>> caseJ_KJ;
    public IntList casearray_N;
    public List<CPSignature> casec_RS;
    public List<CPUTF8> caseec_RU;
    public List<CPSignature> caseet_RS;
    public List<CPUTF8> cases_RU;
    public final int context;
    public final CpBands cpBands;
    public List<CPUTF8> name_RU;
    public List<CPUTF8> nestname_RU;
    public IntList nestpair_N;
    public List<CPSignature> nesttype_RS;
    public int numBackwardsCalls;
    public IntList pair_N;
    public IntList param_NB;
    public final String type;
    public List<CPSignature> type_RS;

    public MetadataBandGroup(String str, int i, CpBands cpBands, SegmentHeader segmentHeader, int i2) {
        super(i2, segmentHeader);
        this.numBackwardsCalls = 0;
        this.param_NB = new IntList();
        this.anno_N = new IntList();
        this.type_RS = new ArrayList();
        this.pair_N = new IntList();
        this.name_RU = new ArrayList();
        this.f9873T = new ArrayList();
        this.caseI_KI = new ArrayList();
        this.caseD_KD = new ArrayList();
        this.caseF_KF = new ArrayList();
        this.caseJ_KJ = new ArrayList();
        this.casec_RS = new ArrayList();
        this.caseet_RS = new ArrayList();
        this.caseec_RU = new ArrayList();
        this.cases_RU = new ArrayList();
        this.casearray_N = new IntList();
        this.nesttype_RS = new ArrayList();
        this.nestpair_N = new IntList();
        this.nestname_RU = new ArrayList();
        this.type = str;
        this.cpBands = cpBands;
        this.context = i;
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(OutputStream outputStream) throws Pack200Exception, IOException {
        String str;
        PackingUtils.log("Writing metadata band group...");
        if (hasContent()) {
            int i = this.context;
            if (i == 0) {
                str = "Class";
            } else if (i == 1) {
                str = "Field";
            } else {
                str = "Method";
            }
            if (!this.type.equals("AD")) {
                if (this.type.indexOf(80) != -1) {
                    byte[] bArrEncodeBandInt = encodeBandInt(str + LauncherConstants.UNDERSCORE_STRING + this.type + " param_NB", this.param_NB.toArray(), Codec.BYTE1);
                    outputStream.write(bArrEncodeBandInt);
                    PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " anno_N[" + this.param_NB.size() + "]");
                }
                String str2 = str + LauncherConstants.UNDERSCORE_STRING + this.type + " anno_N";
                int[] array = this.anno_N.toArray();
                BHSDCodec bHSDCodec = Codec.UNSIGNED5;
                byte[] bArrEncodeBandInt2 = encodeBandInt(str2, array, bHSDCodec);
                outputStream.write(bArrEncodeBandInt2);
                PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " anno_N[" + this.anno_N.size() + "]");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(LauncherConstants.UNDERSCORE_STRING);
                sb.append(this.type);
                sb.append(" type_RS");
                byte[] bArrEncodeBandInt3 = encodeBandInt(sb.toString(), cpEntryListToArray(this.type_RS), bHSDCodec);
                outputStream.write(bArrEncodeBandInt3);
                PackingUtils.log("Wrote " + bArrEncodeBandInt3.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " type_RS[" + this.type_RS.size() + "]");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(LauncherConstants.UNDERSCORE_STRING);
                sb2.append(this.type);
                sb2.append(" pair_N");
                byte[] bArrEncodeBandInt4 = encodeBandInt(sb2.toString(), this.pair_N.toArray(), bHSDCodec);
                outputStream.write(bArrEncodeBandInt4);
                PackingUtils.log("Wrote " + bArrEncodeBandInt4.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " pair_N[" + this.pair_N.size() + "]");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(LauncherConstants.UNDERSCORE_STRING);
                sb3.append(this.type);
                sb3.append(" name_RU");
                byte[] bArrEncodeBandInt5 = encodeBandInt(sb3.toString(), cpEntryListToArray(this.name_RU), bHSDCodec);
                outputStream.write(bArrEncodeBandInt5);
                PackingUtils.log("Wrote " + bArrEncodeBandInt5.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " name_RU[" + this.name_RU.size() + "]");
            }
            byte[] bArrEncodeBandInt6 = encodeBandInt(str + LauncherConstants.UNDERSCORE_STRING + this.type + " T", tagListToArray(this.f9873T), Codec.BYTE1);
            outputStream.write(bArrEncodeBandInt6);
            PackingUtils.log("Wrote " + bArrEncodeBandInt6.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " T[" + this.f9873T.size() + "]");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(LauncherConstants.UNDERSCORE_STRING);
            sb4.append(this.type);
            sb4.append(" caseI_KI");
            String string = sb4.toString();
            int[] iArrCpEntryListToArray = cpEntryListToArray(this.caseI_KI);
            BHSDCodec bHSDCodec2 = Codec.UNSIGNED5;
            byte[] bArrEncodeBandInt7 = encodeBandInt(string, iArrCpEntryListToArray, bHSDCodec2);
            outputStream.write(bArrEncodeBandInt7);
            PackingUtils.log("Wrote " + bArrEncodeBandInt7.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " caseI_KI[" + this.caseI_KI.size() + "]");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(LauncherConstants.UNDERSCORE_STRING);
            sb5.append(this.type);
            sb5.append(" caseD_KD");
            byte[] bArrEncodeBandInt8 = encodeBandInt(sb5.toString(), cpEntryListToArray(this.caseD_KD), bHSDCodec2);
            outputStream.write(bArrEncodeBandInt8);
            PackingUtils.log("Wrote " + bArrEncodeBandInt8.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " caseD_KD[" + this.caseD_KD.size() + "]");
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append(LauncherConstants.UNDERSCORE_STRING);
            sb6.append(this.type);
            sb6.append(" caseF_KF");
            byte[] bArrEncodeBandInt9 = encodeBandInt(sb6.toString(), cpEntryListToArray(this.caseF_KF), bHSDCodec2);
            outputStream.write(bArrEncodeBandInt9);
            PackingUtils.log("Wrote " + bArrEncodeBandInt9.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " caseF_KF[" + this.caseF_KF.size() + "]");
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append(LauncherConstants.UNDERSCORE_STRING);
            sb7.append(this.type);
            sb7.append(" caseJ_KJ");
            byte[] bArrEncodeBandInt10 = encodeBandInt(sb7.toString(), cpEntryListToArray(this.caseJ_KJ), bHSDCodec2);
            outputStream.write(bArrEncodeBandInt10);
            PackingUtils.log("Wrote " + bArrEncodeBandInt10.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " caseJ_KJ[" + this.caseJ_KJ.size() + "]");
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str);
            sb8.append(LauncherConstants.UNDERSCORE_STRING);
            sb8.append(this.type);
            sb8.append(" casec_RS");
            byte[] bArrEncodeBandInt11 = encodeBandInt(sb8.toString(), cpEntryListToArray(this.casec_RS), bHSDCodec2);
            outputStream.write(bArrEncodeBandInt11);
            PackingUtils.log("Wrote " + bArrEncodeBandInt11.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " casec_RS[" + this.casec_RS.size() + "]");
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append(LauncherConstants.UNDERSCORE_STRING);
            sb9.append(this.type);
            sb9.append(" caseet_RS");
            byte[] bArrEncodeBandInt12 = encodeBandInt(sb9.toString(), cpEntryListToArray(this.caseet_RS), bHSDCodec2);
            outputStream.write(bArrEncodeBandInt12);
            PackingUtils.log("Wrote " + bArrEncodeBandInt12.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " caseet_RS[" + this.caseet_RS.size() + "]");
            StringBuilder sb10 = new StringBuilder();
            sb10.append(str);
            sb10.append(LauncherConstants.UNDERSCORE_STRING);
            sb10.append(this.type);
            sb10.append(" caseec_RU");
            byte[] bArrEncodeBandInt13 = encodeBandInt(sb10.toString(), cpEntryListToArray(this.caseec_RU), bHSDCodec2);
            outputStream.write(bArrEncodeBandInt13);
            PackingUtils.log("Wrote " + bArrEncodeBandInt13.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " caseec_RU[" + this.caseec_RU.size() + "]");
            StringBuilder sb11 = new StringBuilder();
            sb11.append(str);
            sb11.append(LauncherConstants.UNDERSCORE_STRING);
            sb11.append(this.type);
            sb11.append(" cases_RU");
            byte[] bArrEncodeBandInt14 = encodeBandInt(sb11.toString(), cpEntryListToArray(this.cases_RU), bHSDCodec2);
            outputStream.write(bArrEncodeBandInt14);
            PackingUtils.log("Wrote " + bArrEncodeBandInt14.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " cases_RU[" + this.cases_RU.size() + "]");
            StringBuilder sb12 = new StringBuilder();
            sb12.append(str);
            sb12.append(LauncherConstants.UNDERSCORE_STRING);
            sb12.append(this.type);
            sb12.append(" casearray_N");
            byte[] bArrEncodeBandInt15 = encodeBandInt(sb12.toString(), this.casearray_N.toArray(), bHSDCodec2);
            outputStream.write(bArrEncodeBandInt15);
            PackingUtils.log("Wrote " + bArrEncodeBandInt15.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " casearray_N[" + this.casearray_N.size() + "]");
            StringBuilder sb13 = new StringBuilder();
            sb13.append(str);
            sb13.append(LauncherConstants.UNDERSCORE_STRING);
            sb13.append(this.type);
            sb13.append(" nesttype_RS");
            byte[] bArrEncodeBandInt16 = encodeBandInt(sb13.toString(), cpEntryListToArray(this.nesttype_RS), bHSDCodec2);
            outputStream.write(bArrEncodeBandInt16);
            PackingUtils.log("Wrote " + bArrEncodeBandInt16.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " nesttype_RS[" + this.nesttype_RS.size() + "]");
            StringBuilder sb14 = new StringBuilder();
            sb14.append(str);
            sb14.append(LauncherConstants.UNDERSCORE_STRING);
            sb14.append(this.type);
            sb14.append(" nestpair_N");
            byte[] bArrEncodeBandInt17 = encodeBandInt(sb14.toString(), this.nestpair_N.toArray(), bHSDCodec2);
            outputStream.write(bArrEncodeBandInt17);
            PackingUtils.log("Wrote " + bArrEncodeBandInt17.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " nestpair_N[" + this.nestpair_N.size() + "]");
            StringBuilder sb15 = new StringBuilder();
            sb15.append(str);
            sb15.append(LauncherConstants.UNDERSCORE_STRING);
            sb15.append(this.type);
            sb15.append(" nestname_RU");
            byte[] bArrEncodeBandInt18 = encodeBandInt(sb15.toString(), cpEntryListToArray(this.nestname_RU), bHSDCodec2);
            outputStream.write(bArrEncodeBandInt18);
            PackingUtils.log("Wrote " + bArrEncodeBandInt18.length + " bytes from " + str + LauncherConstants.UNDERSCORE_STRING + this.type + " nestname_RU[" + this.nestname_RU.size() + "]");
        }
    }

    public static /* synthetic */ int lambda$tagListToArray$0(String str) {
        return str.charAt(0);
    }

    public final int[] tagListToArray(List<String> list) {
        return list.stream().mapToInt(new ToIntFunction() { // from class: org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda0
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return MetadataBandGroup.lambda$tagListToArray$0((String) obj);
            }
        }).toArray();
    }

    public void addParameterAnnotation(int i, int[] iArr, IntList intList, List<String> list, List<String> list2, List<String> list3, List<Object> list4, List<Integer> list5, List<String> list6, List<String> list7, List<Integer> list8) {
        this.param_NB.add(i);
        for (int i2 : iArr) {
            this.anno_N.add(i2);
        }
        this.pair_N.addAll(intList);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.type_RS.add(this.cpBands.getCPSignature(it.next()));
        }
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.name_RU.add(this.cpBands.getCPUtf8(it2.next()));
        }
        Iterator<Object> it3 = list4.iterator();
        for (String str : list3) {
            this.f9873T.add(str);
            if (str.equals("B") || str.equals("C") || str.equals("I") || str.equals("S") || str.equals("Z")) {
                this.caseI_KI.add(this.cpBands.getConstant((Integer) it3.next()));
            } else if (str.equals("D")) {
                this.caseD_KD.add(this.cpBands.getConstant((Double) it3.next()));
            } else if (str.equals("F")) {
                this.caseF_KF.add(this.cpBands.getConstant((Float) it3.next()));
            } else if (str.equals("J")) {
                this.caseJ_KJ.add(this.cpBands.getConstant((Long) it3.next()));
            } else if (str.equals("c")) {
                this.casec_RS.add(this.cpBands.getCPSignature((String) it3.next()));
            } else if (str.equals("e")) {
                String str2 = (String) it3.next();
                String str3 = (String) it3.next();
                this.caseet_RS.add(this.cpBands.getCPSignature(str2));
                this.caseec_RU.add(this.cpBands.getCPUtf8(str3));
            } else if (str.equals("s")) {
                this.cases_RU.add(this.cpBands.getCPUtf8((String) it3.next()));
            }
        }
        Iterator<Integer> it4 = list5.iterator();
        while (it4.hasNext()) {
            int iIntValue = it4.next().intValue();
            this.casearray_N.add(iIntValue);
            this.numBackwardsCalls += iIntValue;
        }
        Iterator<String> it5 = list6.iterator();
        while (it5.hasNext()) {
            this.nesttype_RS.add(this.cpBands.getCPSignature(it5.next()));
        }
        Iterator<String> it6 = list7.iterator();
        while (it6.hasNext()) {
            this.nestname_RU.add(this.cpBands.getCPUtf8(it6.next()));
        }
        for (Integer num : list8) {
            this.nestpair_N.add(num.intValue());
            this.numBackwardsCalls += num.intValue();
        }
    }

    public void addAnnotation(String str, List<String> list, List<String> list2, List<Object> list3, List<Integer> list4, List<String> list5, List<String> list6, List<Integer> list7) {
        this.type_RS.add(this.cpBands.getCPSignature(str));
        this.pair_N.add(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.name_RU.add(this.cpBands.getCPUtf8(it.next()));
        }
        Iterator<Object> it2 = list3.iterator();
        for (String str2 : list2) {
            this.f9873T.add(str2);
            if (str2.equals("B") || str2.equals("C") || str2.equals("I") || str2.equals("S") || str2.equals("Z")) {
                this.caseI_KI.add(this.cpBands.getConstant((Integer) it2.next()));
            } else if (str2.equals("D")) {
                this.caseD_KD.add(this.cpBands.getConstant((Double) it2.next()));
            } else if (str2.equals("F")) {
                this.caseF_KF.add(this.cpBands.getConstant((Float) it2.next()));
            } else if (str2.equals("J")) {
                this.caseJ_KJ.add(this.cpBands.getConstant((Long) it2.next()));
            } else if (str2.equals("c")) {
                this.casec_RS.add(this.cpBands.getCPSignature((String) it2.next()));
            } else if (str2.equals("e")) {
                String str3 = (String) it2.next();
                String str4 = (String) it2.next();
                this.caseet_RS.add(this.cpBands.getCPSignature(str3));
                this.caseec_RU.add(this.cpBands.getCPUtf8(str4));
            } else if (str2.equals("s")) {
                this.cases_RU.add(this.cpBands.getCPUtf8((String) it2.next()));
            }
        }
        Iterator<Integer> it3 = list4.iterator();
        while (it3.hasNext()) {
            int iIntValue = it3.next().intValue();
            this.casearray_N.add(iIntValue);
            this.numBackwardsCalls += iIntValue;
        }
        Iterator<String> it4 = list5.iterator();
        while (it4.hasNext()) {
            this.nesttype_RS.add(this.cpBands.getCPSignature(it4.next()));
        }
        Iterator<String> it5 = list6.iterator();
        while (it5.hasNext()) {
            this.nestname_RU.add(this.cpBands.getCPUtf8(it5.next()));
        }
        for (Integer num : list7) {
            this.nestpair_N.add(num.intValue());
            this.numBackwardsCalls += num.intValue();
        }
    }

    public boolean hasContent() {
        return this.type_RS.size() > 0;
    }

    public int numBackwardsCalls() {
        return this.numBackwardsCalls;
    }

    public void incrementAnnoN() {
        this.anno_N.increment(r0.size() - 1);
    }

    public void newEntryInAnnoN() {
        this.anno_N.add(1);
    }

    public void removeLatest() {
        int iRemove = this.anno_N.remove(r0.size() - 1);
        for (int i = 0; i < iRemove; i++) {
            this.type_RS.remove(r3.size() - 1);
            int iRemove2 = this.pair_N.remove(r3.size() - 1);
            for (int i2 = 0; i2 < iRemove2; i2++) {
                removeOnePair();
            }
        }
    }

    public final void removeOnePair() {
        String strRemove = this.f9873T.remove(r0.size() - 1);
        if (strRemove.equals("B") || strRemove.equals("C") || strRemove.equals("I") || strRemove.equals("S") || strRemove.equals("Z")) {
            this.caseI_KI.remove(r0.size() - 1);
            return;
        }
        if (strRemove.equals("D")) {
            this.caseD_KD.remove(r0.size() - 1);
            return;
        }
        if (strRemove.equals("F")) {
            this.caseF_KF.remove(r0.size() - 1);
            return;
        }
        if (strRemove.equals("J")) {
            this.caseJ_KJ.remove(r0.size() - 1);
            return;
        }
        if (strRemove.equals("C")) {
            this.casec_RS.remove(r0.size() - 1);
            return;
        }
        if (strRemove.equals("e")) {
            this.caseet_RS.remove(r0.size() - 1);
            this.caseec_RU.remove(this.caseet_RS.size() - 1);
            return;
        }
        if (strRemove.equals("s")) {
            this.cases_RU.remove(r0.size() - 1);
            return;
        }
        int i = 0;
        if (strRemove.equals("[")) {
            int iRemove = this.casearray_N.remove(r0.size() - 1);
            this.numBackwardsCalls -= iRemove;
            while (i < iRemove) {
                removeOnePair();
                i++;
            }
            return;
        }
        if (strRemove.equals("@")) {
            this.nesttype_RS.remove(r0.size() - 1);
            int iRemove2 = this.nestpair_N.remove(r0.size() - 1);
            this.numBackwardsCalls -= iRemove2;
            while (i < iRemove2) {
                removeOnePair();
                i++;
            }
        }
    }
}
