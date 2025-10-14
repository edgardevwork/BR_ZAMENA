package org.apache.commons.codec.language;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.util.date.GMTDateParser;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;

/* loaded from: classes5.dex */
public class DoubleMetaphone implements StringEncoder {
    public static final String VOWELS = "AEIOUY";
    public int maxCodeLen = 4;
    public static final String[] SILENT_START = {"GN", "KN", "PN", "WR", "PS"};
    public static final String[] L_R_N_M_B_H_F_V_W_SPACE = {"L", "R", "N", "M", "B", DurationFormatUtils.f9908H, "F", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, " "};
    public static final String[] ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER = {"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER"};
    public static final String[] L_T_K_S_N_M_B_Z = {"L", ExifInterface.GPS_DIRECTION_TRUE, "K", "S", "N", "M", "B", "Z"};

    public String doubleMetaphone(String str) {
        return doubleMetaphone(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.apache.commons.codec.language.DoubleMetaphone] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    public String doubleMetaphone(String str, boolean z) {
        int i;
        ?? CleanInput = cleanInput(str);
        if (CleanInput == 0) {
            return null;
        }
        boolean zIsSlavoGermanic = isSlavoGermanic(CleanInput);
        ?? IsSilentStart = isSilentStart(CleanInput);
        DoubleMetaphoneResult doubleMetaphoneResult = new DoubleMetaphoneResult(getMaxCodeLen());
        while (!doubleMetaphoneResult.isComplete() && IsSilentStart <= CleanInput.length() - 1) {
            char cCharAt = CleanInput.charAt(IsSilentStart);
            if (cCharAt == 199) {
                doubleMetaphoneResult.append('S');
            } else if (cCharAt != 209) {
                switch (cCharAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'Y':
                        IsSilentStart = handleAEIOUY(doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'B':
                        doubleMetaphoneResult.append('P');
                        i = IsSilentStart + 1;
                        if (charAt(CleanInput, i) != 'B') {
                            IsSilentStart = i;
                            break;
                        } else {
                            IsSilentStart += 2;
                            break;
                        }
                    case 'C':
                        IsSilentStart = handleC(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'D':
                        IsSilentStart = handleD(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'F':
                        doubleMetaphoneResult.append('F');
                        i = IsSilentStart + 1;
                        if (charAt(CleanInput, i) != 'F') {
                            IsSilentStart = i;
                            break;
                        } else {
                            IsSilentStart += 2;
                            break;
                        }
                    case 'G':
                        IsSilentStart = handleG(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'H':
                        IsSilentStart = handleH(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'J':
                        IsSilentStart = handleJ(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'K':
                        doubleMetaphoneResult.append('K');
                        i = IsSilentStart + 1;
                        if (charAt(CleanInput, i) != 'K') {
                            IsSilentStart = i;
                            break;
                        } else {
                            IsSilentStart += 2;
                            break;
                        }
                    case 'L':
                        IsSilentStart = handleL(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'M':
                        doubleMetaphoneResult.append(GMTDateParser.MONTH);
                        if (!conditionM0(CleanInput, IsSilentStart)) {
                            break;
                        } else {
                            IsSilentStart += 2;
                            break;
                        }
                    case 'N':
                        doubleMetaphoneResult.append('N');
                        i = IsSilentStart + 1;
                        if (charAt(CleanInput, i) != 'N') {
                            IsSilentStart = i;
                            break;
                        } else {
                            IsSilentStart += 2;
                            break;
                        }
                    case 'P':
                        IsSilentStart = handleP(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'Q':
                        doubleMetaphoneResult.append('K');
                        i = IsSilentStart + 1;
                        if (charAt(CleanInput, i) != 'Q') {
                            IsSilentStart = i;
                            break;
                        } else {
                            IsSilentStart += 2;
                            break;
                        }
                    case 'R':
                        IsSilentStart = handleR(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'S':
                        IsSilentStart = handleS(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'T':
                        IsSilentStart = handleT(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'V':
                        doubleMetaphoneResult.append('F');
                        i = IsSilentStart + 1;
                        if (charAt(CleanInput, i) != 'V') {
                            IsSilentStart = i;
                            break;
                        } else {
                            IsSilentStart += 2;
                            break;
                        }
                    case 'W':
                        IsSilentStart = handleW(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'X':
                        IsSilentStart = handleX(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'Z':
                        IsSilentStart = handleZ(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                }
            } else {
                doubleMetaphoneResult.append('N');
            }
            IsSilentStart++;
        }
        return z ? doubleMetaphoneResult.getAlternate() : doubleMetaphoneResult.getPrimary();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (!(obj instanceof String)) {
            throw new EncoderException("DoubleMetaphone encode parameter is not of type String");
        }
        return doubleMetaphone((String) obj);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return doubleMetaphone(str);
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2) {
        return isDoubleMetaphoneEqual(str, str2, false);
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2, boolean z) {
        return StringUtils.equals(doubleMetaphone(str, z), doubleMetaphone(str2, z));
    }

    public int getMaxCodeLen() {
        return this.maxCodeLen;
    }

    public void setMaxCodeLen(int i) {
        this.maxCodeLen = i;
    }

    public final int handleAEIOUY(DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i == 0) {
            doubleMetaphoneResult.append('A');
        }
        return i + 1;
    }

    public final int handleC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (conditionC0(str, i)) {
            doubleMetaphoneResult.append('K');
        } else if (i == 0 && contains(str, i, 6, "CAESAR")) {
            doubleMetaphoneResult.append('S');
        } else {
            if (contains(str, i, 2, "CH")) {
                return handleCH(str, doubleMetaphoneResult, i);
            }
            if (contains(str, i, 2, "CZ") && !contains(str, i - 2, 4, "WICZ")) {
                doubleMetaphoneResult.append('S', 'X');
            } else {
                int i2 = i + 1;
                if (contains(str, i2, 3, "CIA")) {
                    doubleMetaphoneResult.append('X');
                } else {
                    if (contains(str, i, 2, "CC") && (i != 1 || charAt(str, 0) != 'M')) {
                        return handleCC(str, doubleMetaphoneResult, i);
                    }
                    if (contains(str, i, 2, "CK", "CG", "CQ")) {
                        doubleMetaphoneResult.append('K');
                    } else if (contains(str, i, 2, "CI", "CE", "CY")) {
                        if (contains(str, i, 3, "CIO", "CIE", "CIA")) {
                            doubleMetaphoneResult.append('S', 'X');
                        } else {
                            doubleMetaphoneResult.append('S');
                        }
                    } else {
                        doubleMetaphoneResult.append('K');
                        if (!contains(str, i2, 2, " C", " Q", " G")) {
                            if (!contains(str, i2, 1, "C", "K", "Q") || contains(str, i2, 2, "CE", "CI")) {
                                return i2;
                            }
                        }
                    }
                }
                return i + 3;
            }
        }
        return i + 2;
    }

    public final int handleCC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 2;
        if (contains(str, i2, 1, "I", ExifInterface.LONGITUDE_EAST, DurationFormatUtils.f9908H) && !contains(str, i2, 2, "HU")) {
            if ((i == 1 && charAt(str, i - 1) == 'A') || contains(str, i - 1, 5, "UCCEE", "UCCES")) {
                doubleMetaphoneResult.append("KS");
            } else {
                doubleMetaphoneResult.append('X');
            }
            return i + 3;
        }
        doubleMetaphoneResult.append('K');
        return i2;
    }

    public final int handleCH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i > 0 && contains(str, i, 4, "CHAE")) {
            doubleMetaphoneResult.append('K', 'X');
        } else {
            if (!conditionCH0(str, i) && !conditionCH1(str, i)) {
                if (i > 0) {
                    if (contains(str, 0, 2, "MC")) {
                        doubleMetaphoneResult.append('K');
                    } else {
                        doubleMetaphoneResult.append('X', 'K');
                    }
                } else {
                    doubleMetaphoneResult.append('X');
                }
                return i + 2;
            }
            doubleMetaphoneResult.append('K');
        }
        return i + 2;
    }

    public final int handleD(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (contains(str, i, 2, "DG")) {
            int i2 = i + 2;
            if (contains(str, i2, 1, "I", ExifInterface.LONGITUDE_EAST, "Y")) {
                doubleMetaphoneResult.append('J');
                return i + 3;
            }
            doubleMetaphoneResult.append("TK");
            return i2;
        }
        if (contains(str, i, 2, "DT", "DD")) {
            doubleMetaphoneResult.append('T');
            return i + 2;
        }
        doubleMetaphoneResult.append('T');
        return i + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int handleG(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'H') {
            return handleGH(str, doubleMetaphoneResult, i);
        }
        if (charAt(str, i2) == 'N') {
            if (i == 1 && isVowel(charAt(str, 0)) && !z) {
                doubleMetaphoneResult.append("KN", "N");
            } else if (!contains(str, i + 2, 2, "EY") && charAt(str, i2) != 'Y' && !z) {
                doubleMetaphoneResult.append("N", "KN");
            } else {
                doubleMetaphoneResult.append("KN");
            }
        } else if (contains(str, i2, 2, "LI") && !z) {
            doubleMetaphoneResult.append("KL", "L");
        } else if (i == 0 && (charAt(str, i2) == 'Y' || contains(str, i2, 2, ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER))) {
            doubleMetaphoneResult.append('K', 'J');
        } else if ((contains(str, i2, 2, "ER") || charAt(str, i2) == 'Y') && !contains(str, 0, 6, "DANGER", "RANGER", "MANGER")) {
            int i3 = i - 1;
            if (!contains(str, i3, 1, ExifInterface.LONGITUDE_EAST, "I") && !contains(str, i3, 3, "RGY", "OGY")) {
                doubleMetaphoneResult.append('K', 'J');
            } else if (contains(str, i2, 1, ExifInterface.LONGITUDE_EAST, "I", "Y") || contains(str, i - 1, 4, "AGGI", "OGGI")) {
                if (contains(str, 0, 4, "VAN ", "VON ") || contains(str, 0, 3, "SCH") || contains(str, i2, 2, "ET")) {
                    doubleMetaphoneResult.append('K');
                } else if (contains(str, i2, 3, "IER")) {
                    doubleMetaphoneResult.append('J');
                } else {
                    doubleMetaphoneResult.append('J', 'K');
                }
            } else {
                if (charAt(str, i2) == 'G') {
                    int i4 = i + 2;
                    doubleMetaphoneResult.append('K');
                    return i4;
                }
                doubleMetaphoneResult.append('K');
                return i2;
            }
        }
        return i + 2;
    }

    public final int handleGH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i > 0 && !isVowel(charAt(str, i - 1))) {
            doubleMetaphoneResult.append('K');
        } else {
            if (i == 0) {
                int i2 = i + 2;
                if (charAt(str, i2) == 'I') {
                    doubleMetaphoneResult.append('J');
                    return i2;
                }
                doubleMetaphoneResult.append('K');
                return i2;
            }
            if ((i <= 1 || !contains(str, i - 2, 1, "B", DurationFormatUtils.f9908H, "D")) && ((i <= 2 || !contains(str, i - 3, 1, "B", DurationFormatUtils.f9908H, "D")) && (i <= 3 || !contains(str, i - 4, 1, "B", DurationFormatUtils.f9908H)))) {
                if (i > 2 && charAt(str, i - 1) == 'U' && contains(str, i - 3, 1, "C", "G", "L", "R", ExifInterface.GPS_DIRECTION_TRUE)) {
                    doubleMetaphoneResult.append('F');
                } else if (i > 0 && charAt(str, i - 1) != 'I') {
                    doubleMetaphoneResult.append('K');
                }
            }
        }
        return i + 2;
    }

    public final int handleH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if ((i != 0 && !isVowel(charAt(str, i - 1))) || !isVowel(charAt(str, i + 1))) {
            return i + 1;
        }
        doubleMetaphoneResult.append('H');
        return i + 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int handleJ(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        if (contains(str, i, 4, "JOSE") || contains(str, 0, 4, "SAN ")) {
            if ((i == 0 && charAt(str, i + 4) == ' ') || str.length() == 4 || contains(str, 0, 4, "SAN ")) {
                doubleMetaphoneResult.append('H');
            } else {
                doubleMetaphoneResult.append('J', 'H');
            }
            return i + 1;
        }
        if (i == 0 && !contains(str, i, 4, "JOSE")) {
            doubleMetaphoneResult.append('J', 'A');
        } else {
            int i2 = i - 1;
            if (isVowel(charAt(str, i2)) && !z) {
                int i3 = i + 1;
                if (charAt(str, i3) == 'A' || charAt(str, i3) == 'O') {
                    doubleMetaphoneResult.append('J', 'H');
                }
            } else if (i == str.length() - 1) {
                doubleMetaphoneResult.append('J', ' ');
            } else if (!contains(str, i + 1, 1, L_T_K_S_N_M_B_Z) && !contains(str, i2, 1, "S", "K", "L")) {
                doubleMetaphoneResult.append('J');
            }
        }
        int i4 = i + 1;
        return charAt(str, i4) == 'J' ? i + 2 : i4;
    }

    public final int handleL(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'L') {
            if (conditionL0(str, i)) {
                doubleMetaphoneResult.appendPrimary('L');
            } else {
                doubleMetaphoneResult.append('L');
            }
            return i + 2;
        }
        doubleMetaphoneResult.append('L');
        return i2;
    }

    public final int handleP(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'H') {
            doubleMetaphoneResult.append('F');
            return i + 2;
        }
        doubleMetaphoneResult.append('P');
        if (contains(str, i2, 1, "P", "B")) {
            i2 = i + 2;
        }
        return i2;
    }

    public final int handleR(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        if (i == str.length() - 1 && !z && contains(str, i - 2, 2, "IE") && !contains(str, i - 4, 2, "ME", "MA")) {
            doubleMetaphoneResult.appendAlternate('R');
        } else {
            doubleMetaphoneResult.append('R');
        }
        int i2 = i + 1;
        return charAt(str, i2) == 'R' ? i + 2 : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int handleS(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        if (!contains(str, i - 1, 3, "ISL", "YSL")) {
            if (i == 0 && contains(str, i, 5, "SUGAR")) {
                doubleMetaphoneResult.append('X', 'S');
            } else {
                if (contains(str, i, 2, "SH")) {
                    if (contains(str, i + 1, 4, "HEIM", "HOEK", "HOLM", "HOLZ")) {
                        doubleMetaphoneResult.append('S');
                    } else {
                        doubleMetaphoneResult.append('X');
                    }
                } else {
                    if (contains(str, i, 3, "SIO", "SIA") || contains(str, i, 4, "SIAN")) {
                        if (z) {
                            doubleMetaphoneResult.append('S');
                        } else {
                            doubleMetaphoneResult.append('S', 'X');
                        }
                        return i + 3;
                    }
                    if (i != 0 || !contains(str, i + 1, 1, "M", "N", "L", ExifInterface.LONGITUDE_WEST)) {
                        int i2 = i + 1;
                        if (contains(str, i2, 1, "Z")) {
                            doubleMetaphoneResult.append('S', 'X');
                            int i3 = i + 1;
                            if (!contains(str, i3, 1, "Z")) {
                                return i3;
                            }
                        } else {
                            if (contains(str, i, 2, "SC")) {
                                return handleSC(str, doubleMetaphoneResult, i);
                            }
                            if (i == str.length() - 1 && contains(str, i - 2, 2, "AI", "OI")) {
                                doubleMetaphoneResult.appendAlternate('S');
                            } else {
                                doubleMetaphoneResult.append('S');
                            }
                            if (!contains(str, i2, 1, "S", "Z")) {
                                return i2;
                            }
                        }
                    }
                }
                return i + 2;
            }
        }
        return i + 1;
    }

    public final int handleSC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 2;
        if (charAt(str, i2) == 'H') {
            int i3 = i + 3;
            if (contains(str, i3, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                if (contains(str, i3, 2, "ER", "EN")) {
                    doubleMetaphoneResult.append("X", "SK");
                } else {
                    doubleMetaphoneResult.append("SK");
                }
            } else if (i == 0 && !isVowel(charAt(str, 3)) && charAt(str, 3) != 'W') {
                doubleMetaphoneResult.append('X', 'S');
            } else {
                doubleMetaphoneResult.append('X');
            }
        } else if (contains(str, i2, 1, "I", ExifInterface.LONGITUDE_EAST, "Y")) {
            doubleMetaphoneResult.append('S');
        } else {
            doubleMetaphoneResult.append("SK");
        }
        return i + 3;
    }

    public final int handleT(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (contains(str, i, 4, "TION") || contains(str, i, 3, "TIA", "TCH")) {
            doubleMetaphoneResult.append('X');
            return i + 3;
        }
        if (contains(str, i, 2, "TH") || contains(str, i, 3, "TTH")) {
            int i2 = i + 2;
            if (contains(str, i2, 2, "OM", "AM") || contains(str, 0, 4, "VAN ", "VON ") || contains(str, 0, 3, "SCH")) {
                doubleMetaphoneResult.append('T');
                return i2;
            }
            doubleMetaphoneResult.append('0', 'T');
            return i2;
        }
        doubleMetaphoneResult.append('T');
        int i3 = i + 1;
        return contains(str, i3, 1, ExifInterface.GPS_DIRECTION_TRUE, "D") ? i + 2 : i3;
    }

    public final int handleW(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = 2;
        if (contains(str, i, 2, "WR")) {
            doubleMetaphoneResult.append('R');
        } else {
            if (i == 0) {
                int i3 = i + 1;
                if (isVowel(charAt(str, i3)) || contains(str, i, 2, "WH")) {
                    if (isVowel(charAt(str, i3))) {
                        doubleMetaphoneResult.append('A', 'F');
                    } else {
                        doubleMetaphoneResult.append('A');
                    }
                    return i3;
                }
            }
            if ((i == str.length() - 1 && isVowel(charAt(str, i - 1))) || contains(str, i - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") || contains(str, 0, 3, "SCH")) {
                doubleMetaphoneResult.appendAlternate('F');
            } else {
                i2 = 4;
                if (contains(str, i, 4, "WICZ", "WITZ")) {
                    doubleMetaphoneResult.append("TS", "FX");
                }
            }
            return i + 1;
        }
        return i + i2;
    }

    public final int handleX(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i == 0) {
            doubleMetaphoneResult.append('S');
            return i + 1;
        }
        if (i != str.length() - 1 || (!contains(str, i - 3, 3, "IAU", "EAU") && !contains(str, i - 2, 2, "AU", "OU"))) {
            doubleMetaphoneResult.append("KS");
        }
        int i2 = i + 1;
        return contains(str, i2, 1, "C", "X") ? i + 2 : i2;
    }

    public final int handleZ(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'H') {
            doubleMetaphoneResult.append('J');
            return i + 2;
        }
        if (contains(str, i2, 2, "ZO", "ZI", "ZA") || (z && i > 0 && charAt(str, i - 1) != 'T')) {
            doubleMetaphoneResult.append("S", "TS");
        } else {
            doubleMetaphoneResult.append('S');
        }
        if (charAt(str, i2) == 'Z') {
            i2 = i + 2;
        }
        return i2;
    }

    public final boolean conditionC0(String str, int i) {
        if (contains(str, i, 4, "CHIA")) {
            return true;
        }
        if (i <= 1) {
            return false;
        }
        int i2 = i - 2;
        if (isVowel(charAt(str, i2)) || !contains(str, i - 1, 3, "ACH")) {
            return false;
        }
        char cCharAt = charAt(str, i + 2);
        return !(cCharAt == 'I' || cCharAt == 'E') || contains(str, i2, 6, "BACHER", "MACHER");
    }

    public final boolean conditionCH0(String str, int i) {
        if (i != 0) {
            return false;
        }
        int i2 = i + 1;
        return (contains(str, i2, 5, "HARAC", "HARIS") || contains(str, i2, 3, "HOR", "HYM", "HIA", "HEM")) && !contains(str, 0, 5, "CHORE");
    }

    public final boolean conditionCH1(String str, int i) {
        if (!contains(str, 0, 4, "VAN ", "VON ") && !contains(str, 0, 3, "SCH") && !contains(str, i - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
            int i2 = i + 2;
            if (!contains(str, i2, 1, ExifInterface.GPS_DIRECTION_TRUE, "S")) {
                if (!contains(str, i - 1, 1, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "O", "U", ExifInterface.LONGITUDE_EAST) && i != 0) {
                    return false;
                }
                if (!contains(str, i2, 1, L_R_N_M_B_H_F_V_W_SPACE) && i + 1 != str.length() - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean conditionL0(String str, int i) {
        if (i == str.length() - 3 && contains(str, i - 1, 4, "ILLO", "ILLA", "ALLE")) {
            return true;
        }
        return (contains(str, str.length() - 2, 2, "AS", "OS") || contains(str, str.length() - 1, 1, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "O")) && contains(str, i - 1, 4, "ALLE");
    }

    public final boolean conditionM0(String str, int i) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'M') {
            return true;
        }
        return contains(str, i + (-1), 3, "UMB") && (i2 == str.length() - 1 || contains(str, i + 2, 2, "ER"));
    }

    public final boolean isSlavoGermanic(String str) {
        return str.indexOf(87) > -1 || str.indexOf(75) > -1 || str.indexOf("CZ") > -1 || str.indexOf("WITZ") > -1;
    }

    public final boolean isVowel(char c) {
        return VOWELS.indexOf(c) != -1;
    }

    public final boolean isSilentStart(String str) {
        for (String str2 : SILENT_START) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public final String cleanInput(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return null;
        }
        return strTrim.toUpperCase(Locale.ENGLISH);
    }

    public char charAt(String str, int i) {
        if (i < 0 || i >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i);
    }

    public static boolean contains(String str, int i, int i2, String... strArr) {
        int i3;
        if (i < 0 || (i3 = i2 + i) > str.length()) {
            return false;
        }
        String strSubstring = str.substring(i, i3);
        for (String str2 : strArr) {
            if (strSubstring.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public class DoubleMetaphoneResult {
        public final StringBuilder alternate;
        public final int maxLength;
        public final StringBuilder primary;

        public DoubleMetaphoneResult(int i) {
            this.primary = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.alternate = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.maxLength = i;
        }

        public void append(char c) {
            appendPrimary(c);
            appendAlternate(c);
        }

        public void append(char c, char c2) {
            appendPrimary(c);
            appendAlternate(c2);
        }

        public void appendPrimary(char c) {
            if (this.primary.length() < this.maxLength) {
                this.primary.append(c);
            }
        }

        public void appendAlternate(char c) {
            if (this.alternate.length() < this.maxLength) {
                this.alternate.append(c);
            }
        }

        public void append(String str) {
            appendPrimary(str);
            appendAlternate(str);
        }

        public void append(String str, String str2) {
            appendPrimary(str);
            appendAlternate(str2);
        }

        public void appendPrimary(String str) {
            int length = this.maxLength - this.primary.length();
            if (str.length() <= length) {
                this.primary.append(str);
            } else {
                this.primary.append(str.substring(0, length));
            }
        }

        public void appendAlternate(String str) {
            int length = this.maxLength - this.alternate.length();
            if (str.length() <= length) {
                this.alternate.append(str);
            } else {
                this.alternate.append(str.substring(0, length));
            }
        }

        public String getPrimary() {
            return this.primary.toString();
        }

        public String getAlternate() {
            return this.alternate.toString();
        }

        public boolean isComplete() {
            return this.primary.length() >= this.maxLength && this.alternate.length() >= this.maxLength;
        }
    }
}
